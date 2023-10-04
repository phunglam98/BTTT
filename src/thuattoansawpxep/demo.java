package thuattoansawpxep;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        bubbluSort();

    }
    public static void bubbluSort(){
        int[] numbers = new int[]{3,1,6,4,7,5};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i ; j++) {
                if (numbers[j]>numbers[j+1]){
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;

            }
            }
            
        }
        System.out.println(Arrays.toString(numbers));
    }
}
