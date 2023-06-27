public class ArrInt {
    public static void main(String[] args) {
        getArr(ArrInt::getArrSum);
    }
    public static void getArrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void getArr(Sum sum) {
        int[] arr = {1, 2, 3, 4, 5};
        sum.get(arr);
    }
}
@FunctionalInterface
interface Sum {
        void get(int[] arr);
}


