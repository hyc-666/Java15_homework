import java.util.Scanner;
class Teenger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		if(age<=18){
			System.out.println("少年");
		}
		else if(age>18&&age<=28){
			System.out.println("青年");
		}
		else if(age>28&&age<=56){
			System.out.println("中年");
		}
		else{
			System.out.println("老年");
		}
	}
}
