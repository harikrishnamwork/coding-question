package behavioral.strategy;

/**
 * Created by stathis on 11/2/2017.
 */
public class VisaStrategy extends ValidationStrategy {
	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = creditCard.getNumber().startsWith("4");

		if (isValid) {
			isValid = creditCard.getNumber().length() == 16;
		}

		if (isValid) {
			isValid = passesLuhn(creditCard.getNumber());
		}

		return isValid;
	}
}
