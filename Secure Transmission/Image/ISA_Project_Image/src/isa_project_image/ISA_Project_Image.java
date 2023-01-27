package isa_project_image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;  
import javax.crypto.CipherInputStream;
public class ISA_Project_Image {
    public static void main(String[] args)
    {
        try
        {
            Cipher cipher=Cipher.getInstance("DES");
            KeyGenerator keyg=KeyGenerator.getInstance("DES");
            Key key=keyg.generateKey();
            cipher.init(Cipher.ENCRYPT_MODE, key); 
            CipherInputStream cipt=new CipherInputStream(new FileInputStream(new File("D:/F2-CSE3501/Project/Trial/imgsample5.jpg")), cipher);
            FileOutputStream fileip=new FileOutputStream(new File("D:/F2-CSE3501/Project/Trial/encrypt5.jpg"));
            int i;
            while((i=cipt.read())!=-1)
            {
                fileip.write(i);
            }
            cipher.init(Cipher.DECRYPT_MODE, key);
            CipherInputStream ciptt=new CipherInputStream(new FileInputStream(new File("D:/F2-CSE3501/Project/Trial/encrypt5.jpg")), cipher);
            FileOutputStream fileop=new FileOutputStream(new File("D:/F2-CSE3501/Project/Trial/decrypt5.jpg"));
            int j;
            while((j=ciptt.read())!=-1)
            {
                fileop.write(j);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}