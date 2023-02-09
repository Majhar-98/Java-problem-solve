//Find out sum of digits of a number
//Input: 152
public class SumofDigits {
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 152;
        System.out.println("Sum of digits of " + number + " is " + sumOfDigits(number));
    }
}
