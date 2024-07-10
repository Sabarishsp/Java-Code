import java.util.Scanner;

public class naturalno{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        
        if (isNaturalNumber(number)) {
            System.out.println(number + " is a natural number.");
        } else {
            System.out.println(number + " is not a natural number.");
        }
        
        s.close();
    }
    
    public static boolean isNaturalNumber(int number) {
        return number>0;
    }
}
