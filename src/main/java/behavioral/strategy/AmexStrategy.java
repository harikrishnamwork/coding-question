package behavioral.strategy;

/**
 * Created by stathis on 11/2/2017.
 */
public class AmexStrategy extends ValidationStrategy {
	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("37");

		if (isValid) {
			isValid = creditCard.getNumber().length() == 15;
		}

		if (isValid) {
			isValid = passesLuhn(creditCard.getNumber());
		}

		return isValid;
	}
}
