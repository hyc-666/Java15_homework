import java.util.Scanner;
class MaxCommonDivisor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.println(maxCommonDivisor(m,n));
		
	}
	//使用辗转相除法计算最大公约数
	public static int maxCommonDivisor(int m,int n){
		if(m>n){
			m = m^n;
			n = m^n;
			m = m^n;
		}
		int r = m;//记录余数
		while(r!=0){
			r = m%n;
			m = n;
			n = r;
			
		}
		return m;
	}
}
