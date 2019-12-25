class OddBit{
	public static void main(String[] args){
		printBit(15);
	}
	public static void printBit(int num){
		System.out.println("偶数位：");
		for(int i = 0;i<32;i+=2){
			System.out.print((1&(num>>i))+" ");
		}
		System.out.println();
		System.out.println("奇数位：");
		for(int i = 1;i<32;i+=2){
			System.out.print((1&(num>>i))+" ");
		}
	}
}
