import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		CpuTimer cputimer = new CpuTimer();
		File test = new File("/Users/RedSteele/Downloads/DFREwords/DFREwords0008192.txt");
		TextReader.readFile(test);
		ArrayList<String> sortedList = ArraySorter.quickSort(TextReader.getNames(), 0, TextReader.getNames().size()-1);
		System.out.println(cputimer.getElapsedCpuTime());
		FileWriter fwriter = null;
		try {
			fwriter = new FileWriter ("SortedFile.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		PrintWriter outputFile = new PrintWriter (fwriter);
		for(int i = 0; i<sortedList.size(); i++){

			outputFile.print(sortedList.get(i) + " " + ArraySorter.beta.get(i) + "\n");

		}
		outputFile.close();

	}

}
