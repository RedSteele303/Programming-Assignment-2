import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteNewText {
	public static void WriteTxt(String string){
		FileWriter fwriter;
		try {
			fwriter = new FileWriter ("SortedFile.txt");

			PrintWriter outputFile = new PrintWriter (fwriter);
			
			outputFile.println(string);
			outputFile.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
