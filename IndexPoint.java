
import java.util.Scanner;

public class IndexPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double z;
        double w;
        System.out.print("Mid-term Score : ");
        x = input.nextInt();
        System.out.print("End-term Score : ");
        y = input.nextInt();
        System.out.print("Quiz score : ");
        z = input.nextInt();
        w = x/100*35 + y/100*40 + z/100*25;
        if (w >= 85) 
                System.out.println("Grade : Excellent");
        else if ((w >= 75) && (w <= 84))
                System.out.println("Grade : Very Good");
        else if ((w >= 65) && (w <= 74))
                System.out.println("Grade : Good");        
        else if ((w >= 50) && (w <= 64))
                System.out.println("Grade : Accepted");
        else if ((w >= 0) && (w <= 49))
                System.out.println("Grade : Failed");        
    }
    
}

//Ari Adrian Ibrahim
//1301142301
//if=38=01
