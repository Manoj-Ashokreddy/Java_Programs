import java.util.Scanner;
class Sum2{
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("The sum of entered numbers is "+ (num1 + num2));


    }
}