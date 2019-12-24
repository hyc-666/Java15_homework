class Sum{
	public static void main(String[] args){
		//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
		double sum = 0;
		int flag = 1;
		double s = 1;
		for(int i = 1;i<=100;i++){
			sum = sum + flag*(1/s);
			s++;
			flag = -flag;
		}
		System.out.println(sum);
	}
}
