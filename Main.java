import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        int flag=0;
        int m=num/2;
        if (num == 0|| num==1) {
            System.out.println("is neither prime nor composite");

        } else {
            for (int i = 2; i<m; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }

            }
        }
        if (flag == 1) {
            System.out.println(num + " is not prime");
        } else {
            System.out.println(num + " is prime");
        }
    }
}