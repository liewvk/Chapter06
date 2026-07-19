import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter purchase amount: $ ");
        double purchaseAmount = input.nextDouble();

        double discountRate;

        if (purchaseAmount >= 500) {
            discountRate = 0.20;
        } else if (purchaseAmount >= 300) {
            discountRate = 0.15;
        } else if (purchaseAmount >= 100) {
            discountRate = 0.10;
        } else {
            discountRate = 0.00;
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println();
        System.out.println("Discount Report");
        System.out.println("---------------");
        System.out.println("Customer Name  : " + customerName);
        System.out.printf("Purchase Amount: $ %.2f%n", purchaseAmount);
        System.out.printf("Discount Rate  : %.0f%%%n", discountRate * 100);
        System.out.printf("Discount Amount: $ %.2f%n", discountAmount);
        System.out.printf("Final Amount   : $ %.2f%n", finalAmount);

        input.close();
    }
}
