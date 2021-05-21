package advantageshopping;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumServer {
    protected static WebDriver driver;
    protected static AppiumDriverLocalService service;

    protected void setupUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app.apk");
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);
        driver = new AndroidDriver<MobileElement>(new URL(service_url), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }
}