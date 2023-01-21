package creational.factory;

/**
 * Created by stathis on 15/2/2017.
 */
public class Shop extends Website {
	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}
}
