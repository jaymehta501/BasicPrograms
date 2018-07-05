package Evernote;

import java.io.File;

/* 
 * 1. Create File object for main directory.
2. Get array of files for main directory.
3. If array[i] is a file :
   -> Print out file name.
4. If array[i] is a directory :
   -> Print out directory name.
   -> Get array of files for current sub-directory.
   -> Repeat the step 3 and 4 with current sub-directory.

5. Repeat the step 3 and 4 with next array[i].
 */

public class ListFiles {
	
	static void RecursivePrint(File[] arr,int index,int level) 
    {
        // terminate condition
        if(index == arr.length)
            return;
         
        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");
         
        // for files
        if(arr[index].isFile())
            System.out.println(arr[index].getName());
         
        // for sub-directories
        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");
             
            // recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }
          
        // recursion for main directory
        RecursivePrint(arr,++index, level);
   }
    
   // Driver Method
   public static void main(String[] args)
   {
       // Provide full path for directory(change accordingly)  
      // String maindirpath = "C:\\Users\\Gaurav Miglani\\Desktop\\Test";
       String maindirpath = "C:\\Users\\jay.mehta\\eclipse";
                
       // File object
       File maindir = new File(maindirpath);
         
       if(maindir.exists() && maindir.isDirectory())
       {
           // array for files and sub-directories 
           // of directory pointed by maindir
           File arr[] = maindir.listFiles();
            
           System.out.println("**********************************************");
           System.out.println("Files from main directory : " + maindir);
           System.out.println("**********************************************");
            
           // Calling recursive method
           RecursivePrint(arr,0,0); 
      } 
   }

}
