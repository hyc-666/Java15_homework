public class Fibonacci {
	public static void main(String[] args){
		//System.out.println(fibonacci(10));
		for(int i = 1;i<=10;i++){
			System.out.print(fibonacci(i)+" ");
		}
	}
	public static int fibonacci(int n){
		int fn = 0;
		int f1 = 1;
		int f2 = 1;
		if(n<=2){
			return 1;
		}
		for(int i = 3;i<=n;i++){
			fn = f1+f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
	}
}
