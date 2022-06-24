import java.util.Scanner;

public class Example01 {
    public static void main(String[] args){
        //MortgageCalculator
        final int PERCENT =100;
        final int MONTH =12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat();
        float monthlyRate = interestRate / PERCENT / MONTH;//r

        System.out.print("Duration(years): ");
        int Years = scanner.nextInt();
        int NumberOfPayments= Years * MONTH;//n

        double Mortgage = principal *(monthlyRate *Math.pow(1+ monthlyRate ,NumberOfPayments)/ Math.pow(1 + monthlyRate,NumberOfPayments)-1);

    }
}
