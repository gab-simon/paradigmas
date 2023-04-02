//a) 0 <= x < 5, f(x) = x
// b) 5<= x <10; f(x) = 2x + 1 c) x >=10; f(x) = x - 3
import java.util.Scanner;

public class ex5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;

        if (number >= 0 && number < 5) {
            result = number;
        } else if (number >= 5 && number < 10) {
            result = 2 * number + 1;
        } else if (number >= 10) {
            result = number - 3;
        }

        System.out.println(result);
    }
}
