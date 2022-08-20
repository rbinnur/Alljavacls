package stringpractice;

public class Stringtestcls {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String y = "Safiya nur ";
		String z = " Faiza nur";
		int a = 4;
		int b = 5;
		
		System.out.println(y+z);
		System.out.println(a+b);
		
		
		
		
				     String str = "i am Rafi and i am from bangladesh";
				     System.out.println("Total lenght " + str.length());
				     System.out.println("total char  " + str.charAt(5));
				     System.out.println("first ocarance  " + str.indexOf("a"));
				     System.out.println("second occarance " +str.indexOf("a", str.indexOf("a")+1));
				     System.out.println("third occarence " + str.indexOf("a" , str.indexOf("a")+2));
				     System.out.println("last occarance " + str.lastIndexOf("a"));
				     
				     
				     // concating
				     
				     String r = "Rashed";
				     String s = "Rafi";
				     
				     r.concat(s);
				     System.out.println(r.concat(s));
				      
				     
				     
				   //Substring 
				     str.substring(0, 5);
				     
				     System.out.println(str.substring(4, 14)); // i will cut from 4th index to before 14th index on that given string.
				     
				     
				     
				   //String comparison
				     
				     String s1="Rafi";
				     String s2="Rafi";
				     s1.equals(s2);//==
				     System.out.println(s1.equals(s2));
				     System.out.println(s1.equalsIgnoreCase(s2));
				     
				     
				   //trim
				     
					    String p = "  That is it ";
					   System.out.println("before trim :"+p);
					   String   p1=p.trim();
					   System.out.println("after trim : "+p1);  
					   
					   
					   // how to find a positive number using if method
					   
					   int bc = -10;
					   
					   if (bc >=0)  {
						   
						   System.out.println("the positive number is  "+ bc);
						   
					   } else {
						   
						   System.out.println("the negative no is:  " + bc);
						   
						 			   
							   
					   }
				     
				        
					   //Split 
					   // javalearning//ava,earning
					   /*
					    * Split method will return an arry of String.
					    */
					  // String x ="java learning class";
					//String  sarry[] =  x.split(" ");//"java" , "learning" , "class"
					
					//for (int i=0;i<sarry.length;i++ ) {
						// System.out.println("inside loop and printin an array :---> "+sarry[i]);
						
				//	}
				     
					   String x = "this is testing java";
					   String sarry[] = x.split(" ");
					   
					   for (int i=0;i<sarry.length;i++) {
						   
						   System.out.println ("printing:---> " +sarry[i]);
						   
					   }
					   
					   
					   //task 
					     
						String w ="java ";
						String y1="training";
						int a1=2;
						int b1=3;
						
						   System.out.println(w+y1);//java learning
						
						   System.out.println(a1+b1);//5
						   System.out.println(w+y+a1+b1); //java learning23
						   System.out.println(a1+b1+w+y);//5java learning//23//
						   System.out.println(w+y+(a1+b1)); //
						
						  // practice 
						   String ss = "Rafi";
						   String rr = "Rafii";
						   
						   ss.equals(rr);
						    System.out.println("value print:  " +ss.equals(rr));//t because value same
						    
						    System.out.println("veriable print: " + ss == rr);
						    
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
	}
				     
				     
						

	
	
	
	
	
	
	

}
