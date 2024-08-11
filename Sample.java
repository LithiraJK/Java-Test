
import java.util.Arrays;
class Sample {
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length-1 ; i++) {
            int value = array[i+1];
            if(value>array[i])continue;
            
            int insertionIndex = i;
            for (int j = 0; j < (i+1); j++) {
                if(array[j]>value){
                    insertionIndex=j;
                    break;
                }
            }

            for (int j = i+1 ; j > insertionIndex; j--) {
                array[j] = array[j-1];
            }
            array[insertionIndex]=value;
            
        }
        
    }
    public static void main(String[] args) {
        int[] ar = {10, -3, 7, 9, -25, 13, 2};
        System.out.println(Arrays.toString(ar));
        System.out.println("Sorted Array: ");
        insertionSort(ar);
        System.out.println(Arrays.toString(ar));


 
    }
}
