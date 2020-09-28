import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class reciever {

    /*public static String decrypt(byte[] cipherText) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
        //Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding", "SunJCE");
        //Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return new String(cipher.doFinal(cipherText),"UTF-8");
    }*/


    public static void main(String[] args) throws IOException {
        String data = "This is the data in the output file";
  
      try {
        // Creates a FileWriter
        FileWriter file = new FileWriter("rKey.txt");
  
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
    

