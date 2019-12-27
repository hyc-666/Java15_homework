class Factorial{
	public static void main(String[] args){
		System.out.println(sumFactorial(6));
	}
	public static int factorial(int n){
		int ret = 1;
		for(int i = 1;i<=n;i++){
			ret *=i;
		}
		return ret;
	}
	public static int sumFactorial(int n){
		int sum = 0;
		for(int i = 1;i<=n;i++){
			
			sum += factorial(i);
		}
		return sum;
	}
}
