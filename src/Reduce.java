import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        int num_of_steps = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = myObj.nextInt();

        while(n != 0){
            if ((n % 2) == 0) //Is even
            {
                n = n / 2;
            }
            else // Is odd
            {
                n = n - 1;
            }
            num_of_steps++;
        }
        System.out.println(num_of_steps);
    }
}
