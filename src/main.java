import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month;
        double interestRate, money;
        System.out.println("Nhap so tien gui");
        money=scanner.nextDouble();
        System.out.println("Nhap so thang gui");
        month=scanner.nextInt();
        System.out.println("Nhap lai suat tinh theo nam");
        interestRate=scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 ;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
