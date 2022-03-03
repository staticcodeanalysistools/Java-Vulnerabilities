import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;



class CWE_78_Command_injection {

  public static void main(String[] args)
  {
    // This function executes a command received from user
    try
    {
      Scanner myObj = new Scanner(System.in);
      String cmd = myObj.nextLine();
      Process process = Runtime.getRuntime().exec(cmd);
    }
     catch (IOException e) {
       return;
     }
  }

}
