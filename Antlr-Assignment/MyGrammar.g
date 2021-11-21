grammar MyGrammar;
@members{
	MyActionRoutines h= new MyActionRoutines();
}
prog:(stmt)+ 
	;
	
stmt: assignment |
	  print 
;

assignment: ID assignment_tail[$ID.text]
;

assignment_tail[String listID] : 
								{h.initList($listID);}'=' '[' value_list[$listID] ']' 
								
								| '[' INT ']' '=' value{h.update($listID,new Integer($INT.text).intValue(),$value.val);}
								
								| '=' v1=ID{h.Copy($v1.text,$listID);} ('+' v2=ID{h.concatenate($v2.text,$listID);})*
								
								| '=' n=ID '[' (v1=INT)? ':' (v2=INT)? ']'  { h.Slicing($listID,$n.text,$v1.text,$v2.text);}
						
								| {h.initList($listID);}'=' '[' 'for' name=ID 'in' v1=ID 'if' c1=condition[$v1.text,$name.text] ']'{ h.SetArray(c1,$v1.text,$listID);}
 
;
			
value_list[String listID]:
							v1=value{h.addToList($listID,$v1.val);} (',' v2=value {h.addToList($listID,$v2.val);})*
							|
;

value returns [Object val]:
							INT {$val=new Integer($INT.text);}
							| STRING {$val= new String($STRING.text);}
							| ID {$val = new String($ID.text);}
;

condition[String List2,String name] returns[ArrayList<Boolean> array]:
									'(' v1=(INT|ID) c1=COND v2=(INT|ID) ')' {$array=h.SingleCondition($name,$List2,$v1.text,$v2.text,$c1.text);}
									
									| 'not' '(' v1=(INT|ID) c1=COND v2=(INT|ID) ')' {$array=h.SingleCondition2($name,$List2,$v1.text,$v2.text,$c1.text);}
									
									|'(' c2=condition[$List2,name] v1=('or'|'and') c3=condition[$List2,name] ')' {$array=h.join(c2,c3,$v1.text);}
																
;									
print : 'print' '(' ID ')' { h.printList($ID.text);};


INT:('-')?('0'..'9')+;
ID:('a'..'z'|'A'..'Z'|'\_')('a'..'z'|'A'..'Z'|'0'..'9'|'\_')*;
STRING:'\''('a'..'z'|'A'..'Z'|'0'..'9')* '\'';
WS:(' '|'\t'|'\n'|'\r')+{skip();};
COND:('>'|'<'|'>='|'<='|'=='|'!=');
COMMENTS  :   ('//')~('\n'|'\r')* {skip();} ;
	
