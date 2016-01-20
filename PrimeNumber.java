import java.util.Scanner;

public class PrimeNumber{
	

 public static void main(String[]args){
 int d,a;
 a=0;
 Scanner inputan = new Scanner(System.in);
 System.out.println("Masukkan Angka : ");
 d = inputan.nextInt();
 for (int i=1; i<=d; i++){
	 if (d % i == 0) {
		a=a+1; 
	 } 
 }  
 if (a==2) {
	 System.out.println("Bilangan Prima");
 }
 else {
	 System.out.println("Bukan Bilangan Prima");
 }
 }
}
//Ari Adrian Ibrahim 
//1301142301
//IF-38-01
