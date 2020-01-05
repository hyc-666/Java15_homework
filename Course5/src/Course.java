import java.util.Arrays;

public class Course {
    public static void main(String[] args) {
        //数组转字符串
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        transform(array);
        //System.out.println("Hello world");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
//二分查找
    public static int binarySearch(int[] arr,int x){
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int mid = (left + right)>>1;
            if(x < arr[mid]){
                right = mid -1;
            }
            else if(x>arr[mid]){
                left = mid + 1;
            }
            else
                return mid;
        }
        return -1;

    }
    public static void transform(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            if(arr[left]%2==0){
                left++;
                continue;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}
