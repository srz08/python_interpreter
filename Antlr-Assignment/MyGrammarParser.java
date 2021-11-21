// $ANTLR 3.5.2 MyGrammar.g 2020-03-22 21:45:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MyGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COND", "ID", "INT", "STRING", 
		"WS", "'('", "')'", "'+'", "','", "':'", "'='", "'['", "']'", "'and'", 
		"'for'", "'if'", "'in'", "'not'", "'or'", "'print'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int COND=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int STRING=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MyGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MyGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MyGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "MyGrammar.g"; }


		MyActionRoutines h= new MyActionRoutines();



	// $ANTLR start "prog"
	// MyGrammar.g:5:1: prog : ( stmt )+ ;
	public final void prog() throws RecognitionException {
		try {
			// MyGrammar.g:5:5: ( ( stmt )+ )
			// MyGrammar.g:5:6: ( stmt )+
			{
			// MyGrammar.g:5:6: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==23) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// MyGrammar.g:5:7: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog12);
					stmt();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// MyGrammar.g:8:1: stmt : ( assignment | print );
	public final void stmt() throws RecognitionException {
		try {
			// MyGrammar.g:8:5: ( assignment | print )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				alt2=1;
			}
			else if ( (LA2_0==23) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// MyGrammar.g:8:7: assignment
					{
					pushFollow(FOLLOW_assignment_in_stmt25);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// MyGrammar.g:9:4: print
					{
					pushFollow(FOLLOW_print_in_stmt32);
					print();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt"



	// $ANTLR start "assignment"
	// MyGrammar.g:12:1: assignment : ID assignment_tail[$ID.text] ;
	public final void assignment() throws RecognitionException {
		Token ID1=null;

		try {
			// MyGrammar.g:12:11: ( ID assignment_tail[$ID.text] )
			// MyGrammar.g:12:13: ID assignment_tail[$ID.text]
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_assignment41); 
			pushFollow(FOLLOW_assignment_tail_in_assignment43);
			assignment_tail((ID1!=null?ID1.getText():null));
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "assignment_tail"
	// MyGrammar.g:15:1: assignment_tail[String listID] : ( '=' '[' value_list[$listID] ']' | '[' INT ']' '=' value | '=' v1= ID ( '+' v2= ID )* | '=' n= ID '[' (v1= INT )? ':' (v2= INT )? ']' | '=' '[' 'for' name= ID 'in' v1= ID 'if' c1= condition[$v1.text,$name.text] ']' );
	public final void assignment_tail(String listID) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token n=null;
		Token name=null;
		Token INT2=null;
		ArrayList<Boolean> c1 =null;
		Object value3 =null;

		try {
			// MyGrammar.g:15:32: ( '=' '[' value_list[$listID] ']' | '[' INT ']' '=' value | '=' v1= ID ( '+' v2= ID )* | '=' n= ID '[' (v1= INT )? ':' (v2= INT )? ']' | '=' '[' 'for' name= ID 'in' v1= ID 'if' c1= condition[$v1.text,$name.text] ']' )
			int alt6=5;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==14) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==15) ) {
					int LA6_3 = input.LA(3);
					if ( (LA6_3==18) ) {
						alt6=5;
					}
					else if ( ((LA6_3 >= ID && LA6_3 <= STRING)||LA6_3==16) ) {
						alt6=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_1==ID) ) {
					int LA6_4 = input.LA(3);
					if ( (LA6_4==15) ) {
						alt6=4;
					}
					else if ( (LA6_4==EOF||LA6_4==ID||LA6_4==11||LA6_4==23) ) {
						alt6=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA6_0==15) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// MyGrammar.g:16:9: '=' '[' value_list[$listID] ']'
					{
					h.initList(listID);
					match(input,14,FOLLOW_14_in_assignment_tail64); 
					match(input,15,FOLLOW_15_in_assignment_tail66); 
					pushFollow(FOLLOW_value_list_in_assignment_tail68);
					value_list(listID);
					state._fsp--;

					match(input,16,FOLLOW_16_in_assignment_tail71); 
					}
					break;
				case 2 :
					// MyGrammar.g:18:11: '[' INT ']' '=' value
					{
					match(input,15,FOLLOW_15_in_assignment_tail93); 
					INT2=(Token)match(input,INT,FOLLOW_INT_in_assignment_tail95); 
					match(input,16,FOLLOW_16_in_assignment_tail97); 
					match(input,14,FOLLOW_14_in_assignment_tail99); 
					pushFollow(FOLLOW_value_in_assignment_tail101);
					value3=value();
					state._fsp--;

					h.update(listID,new Integer((INT2!=null?INT2.getText():null)).intValue(),value3);
					}
					break;
				case 3 :
					// MyGrammar.g:20:11: '=' v1= ID ( '+' v2= ID )*
					{
					match(input,14,FOLLOW_14_in_assignment_tail123); 
					v1=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail127); 
					h.Copy((v1!=null?v1.getText():null),listID);
					// MyGrammar.g:20:48: ( '+' v2= ID )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==11) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// MyGrammar.g:20:49: '+' v2= ID
							{
							match(input,11,FOLLOW_11_in_assignment_tail131); 
							v2=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail135); 
							h.concatenate((v2!=null?v2.getText():null),listID);
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 4 :
					// MyGrammar.g:22:11: '=' n= ID '[' (v1= INT )? ':' (v2= INT )? ']'
					{
					match(input,14,FOLLOW_14_in_assignment_tail159); 
					n=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail163); 
					match(input,15,FOLLOW_15_in_assignment_tail165); 
					// MyGrammar.g:22:24: (v1= INT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INT) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// MyGrammar.g:22:25: v1= INT
							{
							v1=(Token)match(input,INT,FOLLOW_INT_in_assignment_tail170); 
							}
							break;

					}

					match(input,13,FOLLOW_13_in_assignment_tail174); 
					// MyGrammar.g:22:38: (v2= INT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// MyGrammar.g:22:39: v2= INT
							{
							v2=(Token)match(input,INT,FOLLOW_INT_in_assignment_tail179); 
							}
							break;

					}

					match(input,16,FOLLOW_16_in_assignment_tail183); 
					 h.Slicing(listID,(n!=null?n.getText():null),(v1!=null?v1.getText():null),(v2!=null?v2.getText():null));
					}
					break;
				case 5 :
					// MyGrammar.g:24:11: '=' '[' 'for' name= ID 'in' v1= ID 'if' c1= condition[$v1.text,$name.text] ']'
					{
					h.initList(listID);
					match(input,14,FOLLOW_14_in_assignment_tail206); 
					match(input,15,FOLLOW_15_in_assignment_tail208); 
					match(input,18,FOLLOW_18_in_assignment_tail210); 
					name=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail214); 
					match(input,20,FOLLOW_20_in_assignment_tail216); 
					v1=(Token)match(input,ID,FOLLOW_ID_in_assignment_tail220); 
					match(input,19,FOLLOW_19_in_assignment_tail222); 
					pushFollow(FOLLOW_condition_in_assignment_tail226);
					c1=condition((v1!=null?v1.getText():null), (name!=null?name.getText():null));
					state._fsp--;

					match(input,16,FOLLOW_16_in_assignment_tail229); 
					 h.SetArray(c1,(v1!=null?v1.getText():null),listID);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment_tail"



	// $ANTLR start "value_list"
	// MyGrammar.g:28:1: value_list[String listID] : (v1= value ( ',' v2= value )* |);
	public final void value_list(String listID) throws RecognitionException {
		Object v1 =null;
		Object v2 =null;

		try {
			// MyGrammar.g:28:26: (v1= value ( ',' v2= value )* |)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= ID && LA8_0 <= STRING)) ) {
				alt8=1;
			}
			else if ( (LA8_0==16) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// MyGrammar.g:29:8: v1= value ( ',' v2= value )*
					{
					pushFollow(FOLLOW_value_in_value_list252);
					v1=value();
					state._fsp--;

					h.addToList(listID,v1);
					// MyGrammar.g:29:48: ( ',' v2= value )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==12) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// MyGrammar.g:29:49: ',' v2= value
							{
							match(input,12,FOLLOW_12_in_value_list256); 
							pushFollow(FOLLOW_value_in_value_list260);
							v2=value();
							state._fsp--;

							h.addToList(listID,v2);
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;
				case 2 :
					// MyGrammar.g:31:8: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value_list"



	// $ANTLR start "value"
	// MyGrammar.g:33:1: value returns [Object val] : ( INT | STRING | ID );
	public final Object value() throws RecognitionException {
		Object val = null;


		Token INT4=null;
		Token STRING5=null;
		Token ID6=null;

		try {
			// MyGrammar.g:33:27: ( INT | STRING | ID )
			int alt9=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt9=1;
				}
				break;
			case STRING:
				{
				alt9=2;
				}
				break;
			case ID:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// MyGrammar.g:34:8: INT
					{
					INT4=(Token)match(input,INT,FOLLOW_INT_in_value292); 
					val =new Integer((INT4!=null?INT4.getText():null));
					}
					break;
				case 2 :
					// MyGrammar.g:35:10: STRING
					{
					STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_value305); 
					val = new String((STRING5!=null?STRING5.getText():null));
					}
					break;
				case 3 :
					// MyGrammar.g:36:10: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_value318); 
					val = new String((ID6!=null?ID6.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "value"



	// $ANTLR start "condition"
	// MyGrammar.g:39:1: condition[String List2,String name] returns [ArrayList<Boolean> array] : ( '(' v1= ( INT | ID ) c1= COND v2= ( INT | ID ) ')' | 'not' '(' v1= ( INT | ID ) c1= COND v2= ( INT | ID ) ')' | '(' c2= condition[$List2,name] v1= ( 'or' | 'and' ) c3= condition[$List2,name] ')' );
	public final ArrayList<Boolean> condition(String List2, String name) throws RecognitionException {
		ArrayList<Boolean> array = null;


		Token v1=null;
		Token c1=null;
		Token v2=null;
		ArrayList<Boolean> c2 =null;
		ArrayList<Boolean> c3 =null;

		try {
			// MyGrammar.g:39:70: ( '(' v1= ( INT | ID ) c1= COND v2= ( INT | ID ) ')' | 'not' '(' v1= ( INT | ID ) c1= COND v2= ( INT | ID ) ')' | '(' c2= condition[$List2,name] v1= ( 'or' | 'and' ) c3= condition[$List2,name] ')' )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==9) ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= ID && LA10_1 <= INT)) ) {
					alt10=1;
				}
				else if ( (LA10_1==9||LA10_1==21) ) {
					alt10=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA10_0==21) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// MyGrammar.g:40:10: '(' v1= ( INT | ID ) c1= COND v2= ( INT | ID ) ')'
					{
					match(input,9,FOLLOW_9_in_condition341); 
					v1=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					c1=(Token)match(input,COND,FOLLOW_COND_in_condition353); 
					v2=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,10,FOLLOW_10_in_condition363); 
					array =h.SingleCondition(name,List2,(v1!=null?v1.getText():null),(v2!=null?v2.getText():null),(c1!=null?c1.getText():null));
					}
					break;
				case 2 :
					// MyGrammar.g:42:12: 'not' '(' v1= ( INT | ID ) c1= COND v2= ( INT | ID ) ')'
					{
					match(input,21,FOLLOW_21_in_condition388); 
					match(input,9,FOLLOW_9_in_condition390); 
					v1=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					c1=(Token)match(input,COND,FOLLOW_COND_in_condition402); 
					v2=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,10,FOLLOW_10_in_condition412); 
					array =h.SingleCondition2(name,List2,(v1!=null?v1.getText():null),(v2!=null?v2.getText():null),(c1!=null?c1.getText():null));
					}
					break;
				case 3 :
					// MyGrammar.g:44:11: '(' c2= condition[$List2,name] v1= ( 'or' | 'and' ) c3= condition[$List2,name] ')'
					{
					match(input,9,FOLLOW_9_in_condition436); 
					pushFollow(FOLLOW_condition_in_condition440);
					c2=condition(List2, name);
					state._fsp--;

					v1=input.LT(1);
					if ( input.LA(1)==17||input.LA(1)==22 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_condition_in_condition453);
					c3=condition(List2, name);
					state._fsp--;

					match(input,10,FOLLOW_10_in_condition456); 
					array =h.join(c2,c3,(v1!=null?v1.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return array;
	}
	// $ANTLR end "condition"



	// $ANTLR start "print"
	// MyGrammar.g:47:1: print : 'print' '(' ID ')' ;
	public final void print() throws RecognitionException {
		Token ID7=null;

		try {
			// MyGrammar.g:47:7: ( 'print' '(' ID ')' )
			// MyGrammar.g:47:9: 'print' '(' ID ')'
			{
			match(input,23,FOLLOW_23_in_print492); 
			match(input,9,FOLLOW_9_in_print494); 
			ID7=(Token)match(input,ID,FOLLOW_ID_in_print496); 
			match(input,10,FOLLOW_10_in_print498); 
			 h.printList((ID7!=null?ID7.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_stmt_in_prog12 = new BitSet(new long[]{0x0000000000800022L});
	public static final BitSet FOLLOW_assignment_in_stmt25 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_stmt32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment41 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_assignment_tail_in_assignment43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_assignment_tail64 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment_tail66 = new BitSet(new long[]{0x00000000000100E0L});
	public static final BitSet FOLLOW_value_list_in_assignment_tail68 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment_tail71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_assignment_tail93 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_assignment_tail95 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment_tail97 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment_tail99 = new BitSet(new long[]{0x00000000000000E0L});
	public static final BitSet FOLLOW_value_in_assignment_tail101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_assignment_tail123 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail127 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_assignment_tail131 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail135 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_14_in_assignment_tail159 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail163 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment_tail165 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_INT_in_assignment_tail170 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_assignment_tail174 = new BitSet(new long[]{0x0000000000010040L});
	public static final BitSet FOLLOW_INT_in_assignment_tail179 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment_tail183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_assignment_tail206 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment_tail208 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_assignment_tail210 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail214 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignment_tail216 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment_tail220 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_assignment_tail222 = new BitSet(new long[]{0x0000000000200200L});
	public static final BitSet FOLLOW_condition_in_assignment_tail226 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assignment_tail229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_value_list252 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_value_list256 = new BitSet(new long[]{0x00000000000000E0L});
	public static final BitSet FOLLOW_value_in_value_list260 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_INT_in_value292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_condition341 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_condition345 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COND_in_condition353 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_condition357 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_condition363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_condition388 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_condition390 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_condition394 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COND_in_condition402 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_set_in_condition406 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_condition412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_condition436 = new BitSet(new long[]{0x0000000000200200L});
	public static final BitSet FOLLOW_condition_in_condition440 = new BitSet(new long[]{0x0000000000420000L});
	public static final BitSet FOLLOW_set_in_condition445 = new BitSet(new long[]{0x0000000000200200L});
	public static final BitSet FOLLOW_condition_in_condition453 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_condition456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_print492 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_print494 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_print496 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print498 = new BitSet(new long[]{0x0000000000000002L});
}
