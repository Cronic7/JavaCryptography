import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import java.security.Key;
import java.security.SecureRandom;

public class MAC {
    public static void main(String[] args) throws Exception{
        //Creating a KeyGenerator object
        KeyGenerator keygen= KeyGenerator.getInstance("DES");

        //Creating SecureRandom Object
        SecureRandom SecRandom=new SecureRandom();

        //Initializing the KeyGenerator
        keygen.init(SecRandom);

        //Generating Key
        Key key= keygen.generateKey();

        //Creating and Initializing mac object
        Mac mac=Mac.getInstance("Hmacsha256");
        mac.init(key);

        //Calculating the MAC
        System.out.println(new String(String.valueOf(key)));
        String msg=new String("This is a test message");
        byte [] bytes=msg.getBytes();
        byte[] macResult=mac.doFinal(bytes);
        System.out.println("Mac result:"+new String(macResult));



    }
}
