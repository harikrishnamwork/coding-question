package creational.abstractfactory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

/**
 * Created by stathis on 18/2/2017.
 */
public class EveryDayDemo {

	public static void main(String[] args) throws Exception{

		String xml = "<document><body><stock>AAPL</stock></body></document>";

		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

		DocumentBuilderFactory abstractFacory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstractFacory.newDocumentBuilder();

		Document document = factory.parse(bais);

		document.getDocumentElement().normalize();

		System.out.println("Root elemet: " + document.getDocumentElement().getNodeName());

		System.out.println(abstractFacory.getClass());

		System.out.println(factory.getClass());


	}

}
