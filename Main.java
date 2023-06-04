
public class Main {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(139));

    }
    public static boolean isHappyNumber(int num) {
        int digit, sum, finalVal = num;

        while (finalVal != 1 && finalVal != 4 && finalVal > 0) {
            num = finalVal;
            sum = 0;
            while (num > 0) {
                digit = num % 10;
                sum = sum + (digit * digit);
                num = num / 10;
                System.out.println("Digit: " + digit);
                System.out.println(sum);
            }
            finalVal = sum;
        }
        return finalVal == 1;
    }
}