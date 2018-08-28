package Tools;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestRunner {

    final String APP_URL = "D:\\ProjectToTest\\apidemos.apk";
    final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    final int TIME_OUT = 5;

    DesiredCapabilities caps = new DesiredCapabilities();

    AndroidDriver driver;
    {
        try {
            driver = new AndroidDriver(new URL(APPIUM_URL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void setCaps(DesiredCapabilities caps) {
        this.caps = caps;
        caps.setCapability("app", APP_URL);
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("PlatformVersion", "6.0.0");
        caps.setCapability("platformName", "Android");
        caps.setCapability("fullReset", false);


        driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
    }

    @After
    public void Teardown() {
        driver.quit();
        System.out.println("I'm doing something to tidy up after the test");
    }
}