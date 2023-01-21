package creational.factory;

/**
 * Created by stathis on 15/2/2017.
 */
public class Blog extends Website {
	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new SearchPage());
		pages.add(new ContactPage());
	}
}
