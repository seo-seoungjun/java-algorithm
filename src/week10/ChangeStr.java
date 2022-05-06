package week10;

import java.io.*;
import java.util.*;

public class ChangeStr {
	public static void main(String[] args) throws Exception {
		// Check command line parameter usage
	    if (args.length != 2) {
	      System.out.println(
	        "Usage: java RemoveText targetStr sourceFile");
	      System.exit(1);
	    }

	    // Check if source file exists
	    File sourceFile = new File(args[1]);
	    if (!sourceFile.exists()) {
	      System.out.println("Source file " + args[1] + " does not exist");
	      System.exit(2);
	    }
	    
	    String str = "";
	    
	    try (
	      Scanner input = new Scanner(sourceFile);
	    ) {        
	      while (input.hasNext()) {
	        String s1 = input.nextLine();
	        System.out.println(s1);
	        String s2 = s1.replaceAll(args[0], "")+"\n";
	        System.out.println(s2);
	        str+=s2;
	      }
	    }
	      PrintWriter output = new PrintWriter(sourceFile);
	      output.println(str);
	      output.close();
	}
}
