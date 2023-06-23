import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Creating variable and instance of Scanner class
        int borderNumber;
        Scanner input = new Scanner(System.in);

    //Getting value of borderNumber variable
        System.out.println("Enter the number which represents upper limit of calculated powers of 4 and 5:"); 
        borderNumber = input.nextInt();
        
        for(int i=1, j=1; i <=borderNumber && j <= borderNumber; i*=4, j*=5)
        {
            System.out.println("Powers of 4 up to upper number");
            System.out.println(i);

            System.out.println("Powers of 5 up to upper number");
            System.out.println(j);
        }
    }
}
