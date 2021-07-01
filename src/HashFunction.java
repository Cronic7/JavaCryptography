import sun.security.provider.MD5;

import java.security.MessageDigest;

public class HashFunction {
    //sha256 algorithm
    static void sha256() throws Exception{
        //data to be hashed or converted to message digest
        String msg1="This is message 1";

        //Creating the message digest objec
        MessageDigest md1sha256= MessageDigest.getInstance("SHA-256"); //SHA-256 algorithm

        //Passing data to the created messagedigest object
        md1sha256.update(msg1.getBytes());

        //Compute the message digest
        byte[] digest= md1sha256.digest();
        System.out.println(digest);

        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<digest.length;i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        System.out.println("Hex format : " + hexString.toString());
        System.out.println("Sha256");

    };
    //md5 algorithm
    static void md5()throws Exception{
        //data to be hashed or converted to message digest
        String msg1="This is message 1";

        //Creating the message digest objec
        MessageDigest md1md5= MessageDigest.getInstance("MD5"); //md-5 algorithm

        //Passing data to the created messagedigest object
        md1md5.update(msg1.getBytes());

        //Compute the message digest
        byte[] digest= md1md5.digest();
        System.out.println(digest);

        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<digest.length;i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        System.out.println("Md5");
        System.out.println("Hex format : " + hexString.toString());

    }
    //sha1 algorithm
    static void sha1() throws Exception{
        //data to be hashed or converted to message digest
        String msg1="This is message 1";

        //Creating the message digest objec
        MessageDigest md1sha1= MessageDigest.getInstance("SHA-1"); //SHA-1 algorithm

        //Passing data to the created messagedigest object
        md1sha1.update(msg1.getBytes());

        //Compute the message digest
        byte[] digest= md1sha1.digest();
        System.out.println(digest);

        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<digest.length;i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        System.out.println("Sha1");
        System.out.println("Hex format : " + hexString.toString());

    };

    public static void main(String  args[])throws Exception{
        sha256();
        md5();
        sha1();


    }
}
