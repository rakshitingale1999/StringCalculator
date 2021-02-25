package rakshit.com.StringCalc;

public class Calculator {
	public int add(String s) {
		   String deli=",|\n";
		 
		  if(s.length()==0)return 0;
		  String[] numbers =s.split(deli);
		  if(numbers.length==1)return Integer.parseInt(numbers[0]);
		  
		  return getSum(numbers);
}
	
	
	public int getSum(String[] numbers){
		  int sum=0;
		  for(String temp:numbers) {
			  sum+=Integer.parseInt(temp);
		  }
		  return sum;
	  }
}
