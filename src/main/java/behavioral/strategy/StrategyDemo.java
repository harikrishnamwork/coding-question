package behavioral.strategy;

/**
 * Created by stathis on 11/2/2017.
 */
public class StrategyDemo {

	public static void main(String[] args) {
		CreditCard amexCard = new CreditCard(new AmexStrategy());

		amexCard.setNumber("123456789123456");
		amexCard.setNumber("04/2020");
		amexCard.setNumber("123");

		System.out.println("StrategyDemo.main, is Valid: " + amexCard.isValid());

		CreditCard visaCard = new CreditCard(new AmexStrategy());

		visaCard.setNumber("123456789123456");
		visaCard.setNumber("04/2020");
		visaCard.setNumber("123");

		System.out.println("StrategyDemo.main, is Valid: " + amexCard.isValid());

	}

}
