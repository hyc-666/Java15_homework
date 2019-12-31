class Factorial_rec{
	public static void main(String[] args){
		System.out.println(factorial_rec(5));
	}
	public static int factorial_rec(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*factorial_rec(n-1);
		}
	}
}
