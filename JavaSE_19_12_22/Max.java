public class Max{
	public static void main(String[] args){
		System.out.println(max3(45,50,12));
	}
	public static int max2(int num1,int num2){
		if(num1>num2){
		return num1;
		}
		else
			return num2;
		
	}
	public static int max3(int x,int y,int z){
		if(max2(x,y)>max2(y,z))
			return max2(x,y);
		else
			return max2(y,z);
	}
}
