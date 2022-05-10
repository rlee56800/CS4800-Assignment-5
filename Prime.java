import java.util.Scanner;

public class Prime {
    public static Boolean isPrime(int number) {
        if (number <= 1)
            return false;
  
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
  
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPrime(num));
    }
}