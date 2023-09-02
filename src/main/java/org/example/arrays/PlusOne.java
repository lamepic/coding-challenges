package org.example.arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int remainder = 1;

        for(int i = digits.length-1; i>=0; i--) {
            int result = digits[i] + remainder;
            if (result <= 9) {
                digits[i] = result;
                break;
            }else{
                digits[i] = 0;
                if(i == 0 && result > 9){
                    int[] arr = new int[digits.length + 1];
                    System.arraycopy(digits, 0, arr, 1, digits.length - 1);
                    digits = arr;
                    digits[0] = 1;
                }
            }
        }

        return digits;
    }
}
