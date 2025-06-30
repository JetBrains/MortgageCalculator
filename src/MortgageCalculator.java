import java.util.Scanner;

public class MortgageCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get input from the user
    System.out.print("Enter loan amount: ");
    double loanAmount = scanner.nextDouble();

    System.out.print("Enter annual interest rate (in %): ");
    double annualInterestRate = scanner.nextDouble();

    System.out.print("Enter loan term (in years): ");
    int termYears = scanner.nextInt();

    // Calculate monthly interest rate and total number of payments
    double monthlyInterestRate = annualInterestRate / 100 / 12;
    int totalPayments = termYears * 12;

    // Calculate monthly payment
    double monthlyPayment =
            (loanAmount * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));

    double totalPayment = monthlyPayment * totalPayments;
    double totalInterest = totalPayment - loanAmount;

    // Output results
    System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
    System.out.printf("Total Payment: $%.2f%n", totalPayment);
    System.out.printf("Total Interest: $%.2f%n", totalInterest);

    scanner.close();
  }
}

