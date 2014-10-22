import java.util.ArrayList;
import java.util.Collections;


public class ArraySorter {
	public static ArrayList<Integer> beta = TextReader.getNumbers();

	public static ArrayList<String> quickSort(ArrayList<String> alpha, int start, int stop){
		if(start < stop){
			int q = Partition(alpha, start, stop);
			quickSort(alpha, start, q-1);
			quickSort(alpha, q+1, stop);
		}

		return alpha;
	}

	private static int Partition(ArrayList<String> alpha, int start, int stop) {
		String x = alpha.get(stop);
		int i = start-1;
		for(int j = start; j<stop; j++){
			FirstCheck: if(alpha.get(j).compareTo(x) <= 0){
				if(alpha.get(j).compareTo(x) == 0){
					if(beta.get(j).compareTo(beta.get(stop)) > 0){
						break FirstCheck;
					}
				}
				++i;
				Collections.swap(alpha, i, j);
				Collections.swap(beta , i, j);
			}
		}
		Collections.swap(alpha, i+1, stop);
		Collections.swap(beta, i+1, stop);
		return i+1;
	}
}
