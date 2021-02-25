package rakshit.com.StringCalc;

import java.util.HashSet;

public class Calculator {
	HashSet<String> del= new HashSet<String>();
	public int add(String s) throws Exception {
		   String deli="[,|\n";
		 
		  if(s.length()==0)return 0;
		  if(s.charAt(0)=='/' && s.charAt(2)=='[') {
				 s=findMultiDeli(s);
				 return getSum2(s);
			 }
		  else if(s.charAt(0)=='/') {
			  deli+=s.charAt(2);
			  s = s.replace(s.substring(0,4), "");
		  }
		  deli+=']';
		  String[] numbers =s.split(deli);
		  if(numbers.length==1)return Integer.parseInt(numbers[0]);
		  
		  return getSum(numbers);
}
	
	
	public int getSum(String[] numbers)throws Exception{
		int sum=0;
		  fireNegative(numbers);
		  for(String temp:numbers) {
			  if(Integer.parseInt(temp)>1000)continue;
			  sum+=Integer.parseInt(temp);
		  }
		  
		  return sum;
	  }
	
	public void fireNegative(String[] numbers) throws Exception {
		  for(String temp:numbers) {
			  if(Integer.parseInt(temp)<0) {
				  throw new Exception("negatives not allowed");
			  }
		  }
	  }
	
	public String findMultiDeli(String s) {
		  int l=0,h=0,n=s.length();
		  while(l<n && h<n) {
			  if(s.charAt(h)=='\n')break;
			  if(s.charAt(h)=='[') {
				  h++;
				  while(s.charAt(h)!=']')h++;
				  del.add(s.substring(l+1,h));
				  l=h;
			  }else {l++;h++;}
			  
		  }
		  s = s.replace(s.substring(0,h+1), "");
		  return s;
	  }
	
	  public int getSum2(String s) throws Exception {
		  int l=0,h=0,n=s.length(),sum=0;
		  
		  while(h<n && l<n)
		     {
		         if(Character.isDigit(s.charAt(h))){
		             while(h<n && (Character.isDigit(s.charAt(h))  || s.charAt(h)=='-')){h++;}

		            if( Integer.parseInt(s.substring(l,h))<0)
		            {
		            	throw new Exception("negatives not allowed");
		            }
		             sum+= Integer.parseInt(s.substring(l,h));
		             l=h;
		            }else{
		             while(h<n && !Character.isDigit(s.charAt(h))){h++;}
		             if(!del.contains(s.substring(l,h)))break;
		             l=h;
		         }
		     }
	  return sum;
	  }
	
}

