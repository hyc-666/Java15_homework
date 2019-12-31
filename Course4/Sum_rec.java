class Sum_rec{
	public static void main(String[] args){
		System.out.println(sum_rec(10));
	}
	public static int sum_rec(int n){
		if(n==1){
			return 1;
		}
		else{
			return n + sum_rec(n-1);
		}
	}
}
