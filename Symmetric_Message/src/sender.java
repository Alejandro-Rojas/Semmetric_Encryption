import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class sender {

    public static void main(String[] args) throws IOException {
      String data = "This is the data in the output file";

    try {
      // Creates a FileWriter
      FileWriter file = new FileWriter("senderKey.txt");

      // Creates a BufferedWriter
      BufferedWriter output = new BufferedWriter(file);

      // Writes the string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}