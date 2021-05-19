package advantageshopping;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumServer {
    protected AndroidDriver driver;
    private AppiumDriverLocalService service;

    @Before
    protected void setupUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android");
        caps.setCapability("app", "/Users/eliezermenezes/Downloads/Advantage+demo+3.1.apk");
        this.service = AppiumDriverLocalService.buildDefaultService();
        this.service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);
        this.driver = new AndroidDriver(new URL(service_url), caps);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        this.service.stop();
    }
}