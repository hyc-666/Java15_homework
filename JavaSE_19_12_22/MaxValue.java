class MaxValue{
	public static void main(String[] args){
		System.out.println(max(98,30));
		System.out.println(max(45.36,72.12));
		System.out.println(max(2.96,3.14,3));
	}
	public static int max(int x,int y){
		return x>y?x:y;
	}
	public static double max(double x,double y){
		return x>y?x:y;
	}
	public static double max(double x,double y,int z){
		return max(x,y)>z?max(x,y):z;
	}
}
