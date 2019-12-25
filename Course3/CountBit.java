class CountBit{
	public static void main(String[] args){
		System.out.println(countBit(15));
		
	}
	//写一个函数返回参数二进制中 1 的个数 
	public static int countBit(int num){
		int count = 0;
		while(num>0){
			count++;
			num = num&(num-1);
		}
		return count;
	}
}
