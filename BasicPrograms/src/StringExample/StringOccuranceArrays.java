package StringExample;

import java.util.HashMap;

//Input : arr[] = {wer, wer, tyu, oio, tyu}
//q[] =   {wer, tyu, uio}
//Output : 2 2 0

public class StringOccuranceArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] usr1 = { "wer", "wer", "tyu", "oio", "tyu" };
		String[] usr2 = { "wer", "tyu", "uio" };

		printRepeatedCountOdEachString(usr1, usr2);

	}

	public static void printRepeatedCountOdEachString(String[] usr1,String[] usr2) {

		HashMap<String, Integer> countRepeatedStrings = new HashMap<String, Integer>();

		for (int i = 0; i < usr1.length; i++) {
			if (countRepeatedStrings.containsKey(usr1[i])) {
				countRepeatedStrings.put(usr1[i],
						countRepeatedStrings.get(usr1[i]) + 1);
			} else {
				countRepeatedStrings.put(usr1[i], 1);
			}
		}
		
		for (int i=0; i < usr2.length; i++){
			if (countRepeatedStrings.get(usr2[i]) != null){
				System.out.print(countRepeatedStrings.get(usr2[i]) + " ");
			} else if (countRepeatedStrings.get(usr2[i]) == null) {
				
				System.out.print("0" + " ");
			}
			
		}
	}

}
