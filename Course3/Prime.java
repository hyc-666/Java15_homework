class Prime{
	public static void main(String[] args){
		for(int i = 2;i<10000;i++){
			if(isPrime(i))
				System.out.print(i+"\t");
		}
	}
	public static boolean isPrime(int x){
		
		if(x == 1)return false;
		if(x == 2)return true;
		for(int i = 2;i<x;i++){
			if(x%i == 0)
				return false;
		}
		return true;
		
	}
}
