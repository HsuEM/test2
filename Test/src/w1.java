
public class w1 {
//遞迴 求最大工因數
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //demo2
		  System.out.println(gcd1(18,30));  

		  System.out.println(gcd2(18,30));  
		  System.out.println(gcd2(18, gcd2(30, 12))   );  

	}
	
	 public static int gcd1(int m, int n){

		 int result = 1;

		  while(m%n!=0){
		   result=n;   
		   n=m%n;
		   m=result;
		  }
		  result=n;
		  return result; 

	} 
	 
	 public static int gcd2(int m, int n){

			if(m%n==0){
				return n;
			} else{
				return gcd2(n,m%n);
			}

		 } 
	 
	

}
