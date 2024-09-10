
import java.util.InputMismatchException;
import java.util.Scanner;
.
public class Main {
    public static void main(String[] args) {
        int n, count = 1;
        float xF, averageF, sumF = 0;
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            n = input.nextInt();

            while (count <= n) {
                System.out.print("Enter the value of element: ");

                if (input.hasNext("q")){
                    System.out.print("You chose to exit");
                    break;
                }

                try {
                    xF = input.nextFloat();
                    sumF += xF;
                    count++;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid Numeric, please try again or press q to exit");
                    input.next();
                }
            }


            averageF = sumF / n;
            System.out.println("The average of " + n + " numbers is " + averageF);
        }
        }

