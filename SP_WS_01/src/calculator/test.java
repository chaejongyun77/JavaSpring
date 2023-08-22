package calculator;

public class test {
	public static void main(String[] args) {
        ApplicationContext context = 
                new AnnotationConfigApplicationContext(CalculatorContext.class);

        InterestCalculatorService interestCalculatorService = context.getBean(InterestCalculatorService.class);
        int amount = 100_000_000;
        double loanInterest = interestCalculatorService.calculateLoanInterest(amount);
        System.out.printf("Amount : %10d loanInterest is %.2f", amount, loanInterest);
        
        System.out.println();
        
        double savingInterest = interestCalculatorService.calculateSavingInterest(amount);
        System.out.printf("Amount : %10d savingInterest is %.2f", amount, savingInterest);
        
        context.close();
    }
}
