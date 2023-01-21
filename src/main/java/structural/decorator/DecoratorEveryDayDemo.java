package structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by stathis on 27/2/2017.
 */
public class DecoratorEveryDayDemo {

	public static void main(String[] args) throws Exception{

		File file = new File("./output.txt");
		file.createNewFile();

		OutputStream outputStream = new FileOutputStream(file);

		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		dataOutputStream.writeChar('k');

		outputStream.close();
		dataOutputStream.close();

	}
}
