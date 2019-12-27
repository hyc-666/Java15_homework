//调整数组使得奇数位于偶数之前
class Arraysort{
	public static void main(String[] args){
		int[] array = {15,6,8,64,3,7,11,35,41,92};
		System.out.println("before:");
		printArray(array);
		sort(array);
		System.out.println("\nafter:");
		printArray(array);
	}
	public static void sort(int[] array){
		int left = 0;
		int right = array.length-1;
		while(left<right){
			if((array[left]&1)==0){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				right--;
				continue;
			}
			else
				left++;
		}
	}
	//打印数组
	public static void printArray(int[] array){
		for(int i = 0;i<array.length;i++){
			System.out.printf("%2d ",array[i]);
		}
	}
}
