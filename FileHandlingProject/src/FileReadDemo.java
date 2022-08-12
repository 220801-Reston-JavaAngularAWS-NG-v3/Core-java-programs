import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try {
			// step 1 - Connect the file to a FileInputStream
			FileInputStream fis = new FileInputStream("sample.txt");
			
			// step 2 - read the contents of the file through the stream into a variable (byte array)
			// 2.1 create a byte array
			byte[] allData = new byte[100];
			// 2.2 read the contents from th file and put/store into the byte array
			fis.read(allData);
			// 2.3 convert the byte array to a string
			String strData = new String(allData);
			
			// step 3  - let's print the string on the console
			System.out.println(strData);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
