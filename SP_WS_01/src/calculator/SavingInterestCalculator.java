package calculator;

import org.springframework.stereotype.Component;

@Component("savingCalcator")
public class SavingInterestCalculator implements InterestCalculator{ //저축이자
	
	private static final double RATE = 0.0334;
	@Override
	public double calculate(int amount) {
		System.out.println();
		return amount * RATE;
	}

}
