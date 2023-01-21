package creational.factory;

/**
 * Created by stathis on 15/2/2017.
 */
public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebSitetype.BLOG);

		System.out.println(site.getPages());

		site = WebsiteFactory.getWebsite(WebSitetype.SHOP);

		System.out.println(site.getPages());
	}

}
