package demo.xiaozhi.com.androidseacurty;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;
import demo.xiaozhi.com.androidseacurty.utils.DESUtils;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testDes(){
        final String MESSAGE = "贺志强";
        try {
            String encryptString = DESUtils.encryptDes(MESSAGE);

            Log.d("AESTest", "encryptString---------" + encryptString);

            String decryptString = DESUtils.decryptDes(encryptString);
            Log.d("AESTest","decryptString---------"+decryptString);
        } catch (Exception e) {
            Log.d("AESTest",e.getMessage());
            e.printStackTrace();
        }
    }
}