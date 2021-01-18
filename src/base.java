import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


    public class base {

    public static void main(String args[]) throws MalformedURLException {
        File f= new File("src");
        File fs=new File(f,"ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2_XL_API_30");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        System.out.println("Secon project jenkins pipeline");
      //  AndroidDriver<AndroidElement> ad= new AndroidDriver<>(new URL("https://127.0.0.1:4723/wd/hub"),cap);
    }
}
