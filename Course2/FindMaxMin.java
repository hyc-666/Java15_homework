public class FindMaxMin{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("The max value is : "+findMax(a,b,c));
		System.out.println("The min value is : "+findMin(a,b,c));
	}
	public static int findMax(int a,int b,int c){
		if(a>=b&&a>=c){
			return a;
		}
		if(b>=a&&b>=c){
			return b;
		}
		if(c>=a&&c>=a){
			return c;
		}
		return 0;
	}
	public static int findMin(int a,int b,int c){
		if(a<=b&&a<=c){
			return a;
		}
		if(b<=a&&b<=c){
			return b;
		}
		if(c<=a&&c<=b){
			return c;
		}
		return 0;
	}
}
