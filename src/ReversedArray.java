import java.util.Arrays;

public class ReversedArray {

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] newArray = new int[array.length];
        int it = array.length-1;

        for(int i = 0; i < array.length; i++){
            int last = array[i];
            newArray[it] = last;
            it--;
        }
        System.out.println("Reversed array = "+Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5,};
        reverse(myArray);
    }
}
