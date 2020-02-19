//Elena Voinu
//Control Flow Statements 
public class SumOdd {
    
    //method that checks if each number in the range is odd or even
    private static boolean isOdd(int number) {
        if (number < 0)
            return false;
        return number % 2 != 0;
    }

    static int sum = 0;

    // start and end represent the range of numbers
    private static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (start > end)) {
            return -1;
        } else{

            //loop through the numbers and call method isOdd to check if each number is odd
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    // if numbers are odd sum them up and store them in the variable sum
                    sum += i;
                }

               }// return the result
                return sum;
        }
   }

    public static void main(String[] args) {
        //test code 
        System.out.println(sumOdd(10, 20));
    }

}
