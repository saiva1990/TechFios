package nth_smallest_number;

import java.util.Arrays;
public class Nthsmall {
     
        public static void main(String[] args) {
            int numbers [] = {10, 15, 20, -88};
             
            int largest = numbers[0];
            int smallest = numbers[0];
             
            for(int i = 1;  i<numbers.length; i++) {
                 if(numbers[i]>largest) {
                   largest = numbers[i];
                 }
                 else if(numbers[i]<smallest) {
                   smallest = numbers[i];
                 }
          }
           System.out.println("List of array is: " + Arrays.toString(numbers));
           System.out.println("Smallest number is : " +smallest);
        }
    }

