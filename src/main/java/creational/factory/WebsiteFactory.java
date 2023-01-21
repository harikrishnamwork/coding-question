package creational.factory;

/**
 * Created by stathis on 15/2/2017.
 */
public class WebsiteFactory {

	public static Website getWebsite(WebSitetype siteType) {
		switch (siteType) {
		case BLOG: {
			return new Blog();
		}
		case SHOP: {
			return new Shop();
		}
		default: {
			return null;
		}
		}
	}

}
