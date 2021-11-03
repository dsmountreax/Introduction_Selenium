package section21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Lab152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Enrique\\Desktop\\Selenium_Laboratorios\\Laboratorio_003\\Introduction\\src\\section21\\data152.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Enrique\\\\Desktop\\\\Selenium_Laboratorios\\\\Laboratorio_003\\\\Introduction\\\\src\\\\section21\\\\data152.properties");
		prop.store(fos, null);
		fos.close();
		fis.close();
	}

}
