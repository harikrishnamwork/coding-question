package creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stathis on 15/2/2017.
 */
public abstract class Website {

	protected List<Page> pages = new ArrayList<>();

	public Website() {
		this.createWebsite();
	}

	public List<Page> getPages() {
		return pages;
	}

	public abstract void createWebsite();
}
