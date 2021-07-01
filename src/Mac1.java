import com.sun.crypto.provider.AESKeyGenerator;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class Mac1 {
    public static void main(String[] args) throws Exception {
        Mac mac =Mac.getInstance("HmacSha256"); //Creating Mac instance
        byte [] secretKey="the key".getBytes(StandardCharsets.UTF_8); // secret key
        SecretKeySpec key=new SecretKeySpec(secretKey, "AES");
        mac.init(key);//initializing mac
        String msg=new String("This is a test message");
        byte [] bytes=msg.getBytes();
        byte[] macResult=mac.doFinal(bytes);
        System.out.println(macResult);

    }
}
