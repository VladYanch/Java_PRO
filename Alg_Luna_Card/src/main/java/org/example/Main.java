package org.example;

import java.util.Arrays;

class AlgorithmLuna {
    public static void main(String[] args) {
        System.out.println(algorithmLuna("6543210987654320")); //true 70
//                                                    12 8 4 0 16 12 8 4
//                                                     3 8 4 0  7 3 8 4 = 37
//                                                      5 3 1 9 7 5 3 0 = 33
//        System.out.println(algorithmLuna("1111111111111117")); //true 30
    }

    public static boolean algorithmLuna(String bankCardNum) {
        int[] numArr = Arrays.stream(bankCardNum.split("")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i = 0; i < numArr.length ; i++) {
            if (i % 2 == 0) {
                if (numArr[i] * 2 > 9) {
                    sum+=numArr[i]*2-9;
                } else {
                    sum+=numArr[i]*2;
                }
            }
            else sum+=numArr[i];
        }
        System.out.println(sum);
        return sum % 10 == 0 ? true : false;
    }
}