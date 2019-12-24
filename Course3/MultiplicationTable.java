import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入乘法表的阶：");
		int n = input.nextInt();
		multiplicationTable(n);
	}
	public static void multiplicationTable(int n){
		for(int i = 1;i<=n;i++){
			for(int j = 0;j<=i;j++){
				System.out.printf("%d * %d = %2d  ",j,i,j*i);
			}
			System.out.println();
		}
	}
}
