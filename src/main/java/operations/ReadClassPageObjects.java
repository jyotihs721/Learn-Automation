package operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadClassPageObjects {
	
	public static Properties prop;
	
	static 
	{	
			try {
					prop = new Properties();
					System.out.println("Prop" + System.getProperty("user.dir"));
					FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\resources\\config.properties");
					prop.load(fis);	
				} 
			catch (FileNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
