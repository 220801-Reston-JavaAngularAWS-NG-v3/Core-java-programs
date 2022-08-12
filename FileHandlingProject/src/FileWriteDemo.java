
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) {
		try {
			// step 1 - connect a FileOutputStream to a file
			// sample.txt will get created when the line below is executed
			FileOutputStream fos = new FileOutputStream("sample.txt");
			
			// step 2 - get the variable with the data ready
			// 2.1 - get input from the user into a String variable
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a sentence : ");
			String data = scan.nextLine(); // read a whole line so we use readLine()
			//2.2 - convert this string to a byte array ( because the stream fos is designed to receive byte array)
			byte[] byteData = data.getBytes();
			
			// step 3  -  write the byte[] into the FileOutputStream fos
			fos.write(byteData);
			System.out.println("Contents written to the file sample.txt....");
			
			// try writing to a file character by character
			// try reading from a  file character by character
			// is there any other file related streams that I can use? explore FileReader and FileWriter
			// have a look at java's IO stream heirachy
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
