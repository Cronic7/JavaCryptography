# JavaCryptography🔐
The Java Cryptography Architecture (JCA) is a set of API’s to implement concepts of modern cryptography such as digital signatures, message digests, certificates, encryption, key generation and management, and secure random number generation etc.

## 1: Hash Function#️⃣
 hash function is a mathematical function that converts a numerical input value into another compressed numerical value. The input to the hash function is of arbitrary length but output is always of fixed length.

Values returned by a hash function are called message digest or simply hash values.Java provides a class named MessageDigest which belongs to the package java.security. This class supports algorithms such as SHA-1, SHA 256, MD5 algorithms to convert an arbitrary length message to a message digest.

### To convert a given message to a message digest, follow the steps given below −

#### Step 1: Create a MessageDigest object

```
MessageDigest md = MessageDigest.getInstance("SHA-256");
```

#### Step 2: Pass data to the created MessageDigest object

```
md.update(msg.getBytes());
```

#### Step 3: Generate the message digest

```
byte[] digest = md.digest();
```

### Example code 👩‍💻
```
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
        System.out.println("Hex format : " + hexString.toString());

    };

    public static void main(String  args[])throws Exception{
        sha256();
        md5();
        sha1();


    }
   
}

```

### Output 🖨
```
Sha256
[B@4554617c
Md5
Hex format : 17363d9618bbd089e643f59ff71cff86
[B@74a14482
Sha1
Hex format : c194ec7b8b25a7e41eb8dd3fa9f5e6617aa3976

Process finished with exit code 0

```
