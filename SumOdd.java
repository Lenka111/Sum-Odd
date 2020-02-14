public class SumOdd {

    private static boolean isOdd(int number) {
        if (number < 0)
            return false;
        return number % 2 != 0;
    }

    static int sum = 0;

    private static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (start > end)) {
            return -1;
        } else{


            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }

                }
                return sum;
        }
            }

    public static void main(String[] args) {
        System.out.println(sumOdd(10, 20));
    }

}