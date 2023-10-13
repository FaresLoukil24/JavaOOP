package Exception;

import java.util.Arrays;

public class AddTable {
    public static void main(String[] args) {

        int[] array = new int[3];
        try {
            for(int i=0;i<4;++i){
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception!");
        }
        System.out.println(Arrays.toString(array));
    }
}