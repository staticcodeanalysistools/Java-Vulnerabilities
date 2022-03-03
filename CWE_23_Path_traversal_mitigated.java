import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;



class CWE_23_Path_traversal_mitigated {

  static String sanitize(String name) {
      return name.replaceAll("[^a-zA-Z0-9]", "");
  }

  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
    String name = myObj.nextLine();
    // Sanitize user input
    name = sanitize(name);
    // This function takes in a file name and creates a new text file in the parent directory
    String parent = "/path/to/parent/directory";
    File prefix = new File(parent);
    File path = new File(prefix,name);
  }

}
