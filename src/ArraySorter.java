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
				String temp1, temp2;
				temp1 = alpha.get(i);
				temp2 = alpha.get(j);
				alpha.set(i, temp2);
				alpha.set(j, temp1);
				
				int temp3 = 0;
				int temp4 = 0;
				temp3 = beta.get(i);
				temp4 = beta.get(j);
				beta.set(i, temp4);
				beta.set(j, temp3);
				
				//Collections.swap(alpha, i, j);
				//Collections.swap(beta , i, j);
			}
		}
		String temp5, temp6;
		temp5 = alpha.get(i+1);
		temp6 = alpha.get(stop);
		alpha.set(i+1, temp6);
		alpha.set(stop, temp5);
		
		int temp7 = 0;
		int temp8 = 0;
		temp7 = beta.get(i+1);
		temp8 = beta.get(stop);
		beta.set(i+1, temp8);
		beta.set(stop, temp7);
		
		//Collections.swap(alpha, i+1, stop);
		//Collections.swap(beta, i+1, stop);
		return i+1;
	}
}
