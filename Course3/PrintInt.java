class PrintInt{
	public static void main(String[] args){
		printInt(1729);
	}
	//13. 输出一个整数的每一位.
	public static void printInt(int num){
		if (num > 9){
			printInt(num / 10);
		}
		System.out.printf("%d ", num % 10);
	}
}
