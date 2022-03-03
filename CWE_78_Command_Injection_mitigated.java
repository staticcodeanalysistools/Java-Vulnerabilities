import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;



class CWE_78_Command_injection_mitigated {

  public static void main(String[] args)
  {
    // This function executes a command received from user
    try
    {
      Scanner myObj = new Scanner(System.in);
      // Only allow user to pass parameters
      String cmd = "ls";
      String cmd_params = myObj.nextLine();
      // Pass the command and parameters without running shell code
      String[] cmd_run = {cmd,cmd_params};
      Process process = Runtime.getRuntime().exec(cmd_run);
    }
     catch (IOException e) {
       return;
     }
  }

}
