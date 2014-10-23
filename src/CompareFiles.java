import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompareFiles {

	public static void main(String[] args) {
		File MeSort = new File("/Users/RedSteele/Documents/School/Fall Quarter 2014/Comp 2370/Code/Programming Assignment 2/SortedFile.txt");
		File YouSort = new File("/Users/RedSteele/Downloads/DFREwords/DFREwords0016384sorted.txt");
		Scanner scanner1 = null, scanner2 = null;
		try {
			scanner1 = new Scanner(MeSort);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scanner2 = new Scanner(YouSort);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while(scanner1.hasNext() && scanner2.hasNext()){
			if(scanner1.next().compareTo(scanner2.next()) != 0){
				System.out.println("These files are not the same!!");
				System.exit(1);
			}
		}
		System.out.println("These are the same. The sort was done correctly");
		scanner1.close();
		scanner2.close();
	}

}
