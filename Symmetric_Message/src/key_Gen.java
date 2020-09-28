import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class key_Gen {
    static String IV = "AAAAAAAAAAAAAAAA";
    //static String plaintext = "test text 123\0\0\0"; /*Note null padding*/
    static String plaintext = "test text 123456ABCDEF987654321"; /*Note null padding*/
    //static String plaintext2 = "2nd piece 789\0\0\0"; /*Note null padding*/
    static String encryptionKey = "0123456789abcdef";
    public static void main(String [] args) {
        try {

            System.out.println("==Java==");
            System.out.println("plain:   " + plaintext);

            byte[] cipher = encrypt();

            System.out.print("cipher:  ");
            for (int i=0; i<cipher.length; i++)
                System.out.format("%2X ", new Byte(cipher[i]));
            System.out.println("");

            String decrypted = decrypt(cipher);

            System.out.println("decrypt: " + decrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}

