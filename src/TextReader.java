import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextReader {
	
	private static ArrayList<String> names = new ArrayList<String>();
	private static ArrayList<Integer> numbers = new ArrayList<>();
	
	public static void readFile(File text){
		Scanner scanner = null;
		try {
			scanner = new Scanner(text);
		} catch (FileNotFoundException e) {
			System.out.println("This is not a valid File. Operation aborted");
			e.printStackTrace();
		}
		//Tests for invalid inputs
		
		//Adds file inputs to arrays
		while(scanner.hasNext()){
			names.add(scanner.next());
			numbers.add(scanner.nextInt());
		}
	}

	public static ArrayList<String> getNames() {
		return names;
	}

	public static ArrayList<Integer> getNumbers() {
		return numbers;
	}
}
