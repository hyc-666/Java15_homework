//加法
class Add{
	public static void main(String[] args){
		System.out.println("4+3="+add(4,3));
		System.out.println("4.24+3.14+5.05="+add(4.24,3.14,5.05));
	}
	public static int add(int x,int y){
		return x+y;
	}
	public static double add(double x,double y,double z){
		return x+y+z;
	}
}
