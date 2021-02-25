package rakshit.com.StringCalc;

public class Calculator {
	public int add(String s) throws Exception {
		   String deli=",|\n";
		 
		  if(s.length()==0)return 0;
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
				  throw new Exception("Negative input!");
			  }
		  }
	  }
}
