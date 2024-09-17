
import java.util.Scanner;

class Sum3{
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers count ");
        count = sc.nextInt();
        int numbers, sum=0;

        for(int i=0; i<count; i++){
            System.out.print("Enter the number ");
            numbers = sc.nextInt();
            sum= sum+numbers;
        }
        System.out.println("The sum of numbers are "+ sum);

    }
}