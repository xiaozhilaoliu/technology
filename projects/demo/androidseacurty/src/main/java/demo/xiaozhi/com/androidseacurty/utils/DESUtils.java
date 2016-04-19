package demo.xiaozhi.com.androidseacurty.utils;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by hezhiqiang on 4/19/16.
 */
public class DESUtils {
    public static final String TAG = "DESUtils";
    private static final String DES = "DES";
    private static final String DES_CLIPER = "DES/CBC/PKCS5Padding";
    private static final String PASSWORD = "12345678";

    public static final byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };

    public static String encryptDes(String encryptString, String key) throws Exception {

        //指定加密的向量
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes("utf-8"), DES);
        Cipher cipher = Cipher.getInstance(DES_CLIPER);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, zeroIv);
        byte[] encryptedData = cipher.doFinal(encryptString.getBytes());
        return new String(Base64.encode(encryptedData, Base64.DEFAULT), "utf-8");
    }

    public static String decryptDes(String decryptString, String key) throws Exception {
        byte[] byteDecryptData = Base64.decode(decryptString, Base64.DEFAULT);
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "DES");

        Cipher cipher = Cipher.getInstance(DES_CLIPER);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, zeroIv);
        byte decryptedData[] = cipher.doFinal(byteDecryptData);
        return new String(decryptedData, "utf-8");
    }

    public static String encryptDes(String encryptString) throws Exception {
        return encryptDes(encryptString, PASSWORD);
    }

    public static String decryptDes(String decryptString) throws Exception {
        return decryptDes(decryptString, PASSWORD);
    }
}
