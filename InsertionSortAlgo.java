import java.util.*;
public class InsertionSortAlgo {
   public static void main(String[] args) {
       int [] arr = {2,-3,5,13,7,10,8,9,7};
       System.out.println(Arrays.toString(arr));
       System.out.println("Sorted Array -:");
       insertionSort(arr);
       System.out.println(Arrays.toString(arr));


   }
   static void  insertionSort(int[] nums) {
       for (int k = 0; k < nums.length - 1; k++) {
           int value = nums[k + 1];
           if (value > nums[k]) continue;
           int insertionIndex = k;    
           for (int i = 0; i < (k + 1); i++) {
               if (nums[i] > value) {
                   insertionIndex = i;
                   break;
               }
           }
           for (int i = k + 1; i > insertionIndex ; i--) {
               nums[i] = nums[i - 1];
           }
           nums[insertionIndex] = value;
       }
   }
}
