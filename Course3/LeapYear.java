class LeapYear{
	public static void main(String[] args){
		for(int i = 1000;i<=2000;i++){
			if(isLeapYear(i)){
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isLeapYear(int year){
		if(year%4==0&&year%100!=0){
			return true;
		}
		if(year%400==0){
			return true;
		}
		return false;
	}
}
