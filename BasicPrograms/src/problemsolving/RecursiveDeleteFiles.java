package problemsolving;

import java.io.File;

public class RecursiveDeleteFiles {

	public static void recursiveDelete(File file) {
		//to end the recursive loop
		if (!file.exists()) {
			return;
		}
		//if directory, go inside and call recursively
		if (file.isDirectory()) {
			for (File fl : file.listFiles()) {
				recursiveDelete(fl);
			}

		}
		//call delete to delete files and empty directory
		file.delete();
	}

}
