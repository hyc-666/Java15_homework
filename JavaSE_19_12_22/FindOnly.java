class FindOnly{
	public static void main(String[] args){
		int[] array = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9};
		System.out.println(findOnly(array));
	}
	public static int findOnly(int[] array){
		int ret = array[0];
		for(int i = 1;i<array.length;i++){
			ret ^=array[i];
		}
		return ret;
	} 
}
