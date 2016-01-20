import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        double x;
        double y;
        System.out.println("Menu : ");
        System.out.println("1. Konvert Ke Reamur ");
        System.out.println("2. Konvert Ke Fahrenheit ");
        System.out.println("3. Konvert Ke Kelvin ");
        System.out.print("Pilih : ");
        menu = input.nextInt();
        
        switch (menu) {
            case 1:
                System.out.print("Masukkan Celcius : ");
                x = input.nextDouble();
                y = x*4/5;
                System.out.println("Reamur : " + y);
                break;
            case 2:
                System.out.print("Masukkan Celcius : ");
                x = input.nextDouble();
                y = 9/5*x+32;
                System.out.println("Fahrenheit : " + y);
                break;
            case 3:
                System.out.print("Masukkan Celcius : ");
                x = input.nextDouble();
                y = x+273;
                System.out.println("Kelvin : " + y);
                break;
            default:
                break;
        }
            
    }
    
}

//Ari Adrian Ibrahim
//1301142301
//IF-38-01
