public class BinarySearch {

    public static int binarySea(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      int nums[] = {5 , 6 , 1 , 2 , 7 , 8};
      int target = 8;

      int index = binarySea(nums, target);

      if(index == -1){
        System.out.println("There is no such element");
      }
      else{
        System.out.println(index);
      }
    }
}
