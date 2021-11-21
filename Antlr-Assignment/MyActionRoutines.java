import java.util.*;

public class MyActionRoutines{
	static HashMap<String,ArrayList<Object>> lists= new HashMap<String,ArrayList<Object>>();
	
	public void initList(String ListID){
		lists.put(ListID,new ArrayList<Object>());
	}
	
	public void printList(String ListID){
		System.out.println(ListID + "=" +lists.get(ListID));
	}
	
	public void addToList(String listID,Object value){
		ArrayList<Object> l= lists.get(listID);
		l.add(value);
	}
	public void Copy(String first,String second){
		lists.put(second,new ArrayList<Object>());
		ArrayList<Object> list= lists.get(first);
		ArrayList<Object> toAdd = lists.get(second);
		for(Object i : list){
			toAdd.add(i);
		}
	}
	public void update(String listID,int index,Object value){
		ArrayList<Object> l= lists.get(listID);
		l.set(index,value);
	}
	public void Slicing(String name,String list2,String index1,String index2){
		lists.put(name,new ArrayList<Object>());
		ArrayList<Object> second= lists.get(list2);
		ArrayList<Object> third= lists.get(name);
		int c=0;
		int c2=0;
		if(index1==null){
			c=0;
		}
		else{
			c= new Integer(index1).intValue();
		}
		if(index2==null){
			c2=second.size()-1;
		}
		else{
			c2= new Integer(index2).intValue();
		}
		
		for(int i=c;i<c2;i++){
			third.add(second.get(i));
		}
	}		
	
	public ArrayList<Boolean> join(ArrayList<Boolean> b1, ArrayList<Boolean> b2,String s1){
		ArrayList<Boolean> f= new ArrayList<>();
		for(int i=0;i<b1.size();i++){
			if(s1.equals("or")){
				f.add(b1.get(i)||b2.get(i));
			}
			else{
				f.add(b1.get(i)&&b2.get(i));
			}
		}
		return f;
	}
		
	public void concatenate(String list1,String list2){
		ArrayList<Object> first= lists.get(list1);
		ArrayList<Object> concatenated= lists.get(list2);
		for(Object i: first){
			concatenated.add(i);
		}
	}
	
	public void SetArray(ArrayList<Boolean> a1,String s1,String s2){
		ArrayList<Object> array=lists.get(s1);
		ArrayList<Object> array2=lists.get(s2);
		for(int i=0;i<a1.size();i++){
			if(a1.get(i)==true){
				array2.add(array.get(i));
			}
		}
	}				
	public static boolean isStringOnlyAlphabet(String str) 
    { 
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
    } 		
	public ArrayList<Boolean> SingleCondition(String name,String list2,String v1,String v2,String condition){
		ArrayList<Boolean> array= new ArrayList<Boolean>();
		ArrayList<Object> list=lists.get(list2);
		for(int i=0;i<list.size();i++){
			array.add(false);
		}
		boolean found1=false;
		boolean found2=false;
		int v3=0;
		int v4=0;
		if(isStringOnlyAlphabet(v1)==false){
			v3= new Integer(v1).intValue();
			found1=true;
		}
		if(isStringOnlyAlphabet(v2)==false){
			v4= new Integer(v2).intValue();
			found2=true;
		}
		boolean error=false;
		boolean error1=false;
		boolean error2=false;
		if(found1==false){
			if(!v1.equals(name)){
				error=true;
				error1=true;
			}
		}
		if(found2==false){
			if(!v2.equals(name)){
				error=true;
				error2=true;
			}
		}
		if(found1==false && found2==false && error==false){
			if(v1.equals(v2) && condition.equals("==")){
				for(int i=0;i<list.size();i++){
					array.set(i,true);
				}
				return array;
			}
			System.out.println("SYNTAX ERROR,NOT A GOOD CONDITION");
			return null;
		}
		int counter=0;
		for(Object o: list){
			if(error==true){
				String a= new String("");
				if(error1==true){
					a=v1;
				}
				else{
					a=v2;
				}
				System.out.println("UNKNOWN VARIABLE "+ a+ " DID YOU MEAN " + name);
			}
			else{
				if(condition.equals("==")){
					if(found1==false){
						if(o.equals(v4)){
							array.set(counter,true);
						}
					}
					else if(found2==false){
						if(o.equals(v3)){
							array.set(counter,true);
						}
					}
					else{
						if(v3==v4){
							array.set(counter,true);
						}
					}
				}
				if(condition.equals("!=")){
					if(found1==false){
						if(!o.equals(v4)){
							array.set(counter,true);
						}
					}
					else if(found2==false){
						if(!o.equals(v3)){
							array.set(counter,true);
						}
					}
					else{
						if(v3!=v4){
							array.set(counter,true);
						}
					}
				}
				else if(condition.equals(">")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a>v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3>b){
								array.set(counter,true);
							}
						}
					}
					else{
						if(v3>v4){
							array.set(counter,true);
						}
					}
				}
				else if(condition.equals(">=")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a>=v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3>=b){
								array.set(counter,true);
							}
						}
					}
					else{
						if(v3>=v4){
							array.set(counter,true);
						}
					}
				}
				else if(condition.equals("<")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a<v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3<b){
								array.set(counter,true);
							}
						}
					}
					else{
						if(v3<v4){
							array.set(counter,true);
						}
					}
				}
				else if(condition.equals("<=")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a<=v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3<=b){
								array.set(counter,true);
							}
						}
					}
					else{
						if(v3<=v4){
							array.set(counter,true);
						}
					}
				}
			}
			counter++;
		}	
		return array;
	}
	
	public ArrayList<Boolean> SingleCondition2(String name,String list2,String v1,String v2,String condition){
		ArrayList<Boolean> array= new ArrayList<Boolean>();
		ArrayList<Object> list=lists.get(list2);
		for(int i=0;i<list.size();i++){
			array.add(false);
		}
		boolean found1=false;
		boolean found2=false;
		int v3=0;
		int v4=0;
		if(isStringOnlyAlphabet(v1)==false){
			v3= new Integer(v1).intValue();
			found1=true;
		}
		if(isStringOnlyAlphabet(v2)==false){
			v4= new Integer(v2).intValue();
			found2=true;
		}
		boolean error=false;
		boolean error1=false;
		boolean error2=false;
		if(found1==false){
			if(!v1.equals(name)){
				error=true;
				error1=true;
			}
		}
		if(found2==false){
			if(!v2.equals(name)){
				error=true;
				error2=true;
			}
		}
		if(found1==false && found2==false && error==false){
			if(!v1.equals(v2) && condition.equals("==")){
				for(int i=0;i<list.size();i++){
					array.set(i,true);
				}
				return array;
			}
			System.out.println("SYNTAX ERROR,NOT A GOOD CONDITION");
			return null;
		}
		int counter=0;
		for(Object o: list){
			if(error==true){
				String a= new String("");
				if(error1==true){
					a=v1;
				}
				else{
					a=v2;
				}
				System.out.println("UNKNOWN VARIABLE "+ a+ " DID YOU MEAN " + name);
			}
			else{
				if(condition.equals("==")){
					if(found1==false){
						if(!o.equals(v4)){
							array.set(counter,true);
						}
					}
					else if(found2==false){
						if(!o.equals(v3)){
							array.set(counter,true);
						}
					}
				}
				if(condition.equals("!=")){
					if(found1==false){
						if(o.equals(v4)){
							array.set(counter,true);
						}
					}
					else if(found2==false){
						if(o.equals(v3)){
							array.set(counter,true);
						}
					}
				}
				else if(condition.equals(">")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a<=v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3<=b){
								array.set(counter,true);
							}
						}
					}
				}
				else if(condition.equals(">=")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a<v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3<b){
								array.set(counter,true);
							}
						}
					}
				}
				else if(condition.equals("<")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a>=v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3>=b){
								array.set(counter,true);
							}
						}
					}
				}
				else if(condition.equals("<=")){
					if(found1==false){
						if(o.getClass()==Integer.class){
							Integer a=(Integer)o;
							if(a>v4){
								array.set(counter,true);
							}
						}
					}
					else if(found2==false){
						if(o.getClass()==Integer.class){
							Integer b=(Integer)o;
							if(v3>b){
								array.set(counter,true);
							}
						}
					}
				}
			}
			counter++;
		}	
		return array;
	}
		
}