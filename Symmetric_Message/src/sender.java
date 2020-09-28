import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class sender {



  /*public static byte[] encrypt() throws Exception {
    //Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
    Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding", "SunJCE");
    //Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding", "SunJCE");
    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
    cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
    return cipher.doFinal(plaintext.getBytes("UTF-8"));
}*/

    public static void main(String[] args) throws IOException {
      String data = "This is the data in the output file";

    try {
      // Creates a FileWriter
      FileWriter file = new FileWriter("sKey.txt");

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