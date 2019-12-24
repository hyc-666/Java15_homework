class Daffodils{
	public static void main(String[] args){
		for(int i = 0;i<=999;i++){
			if(isDaffodils(i)){
				System.out.print(i+" ");
			}
		}
	}
	//判断水仙花数
	public static boolean isDaffodils(int num){
		int sum = 0;
		int n = num;//传入的参数在后面还要参与比较，所以原值要保留，很重要
		int t = 0;
		while(n>0){
			t = n%10;
			n = n/10;
			sum = sum + t*t*t;
		}
		return sum == num;
	}
}
