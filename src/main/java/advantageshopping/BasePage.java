package advantageshopping;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

public class BasePage {
    protected WebDriver driver;

    protected BasePage() {
        AppiumServer server = new AppiumServer();
        try {
            server.setupUp();
            this.driver = server.getDriver();
        } catch (MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    protected void tapMenu() {
        this.driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
    }

    protected void tapLoginOption() {
        this.driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin")).click();
    }

    protected void goToLoginScreen() {
        this.tapMenu();
        this.tapLoginOption();
    }

    protected void tapButton(String name) {
        this.driver.findElement(By.xpath("//android.widget.Button[@text='" + name +"']")).click();
    }

    protected boolean msgShouldBeDisplayed(String message) {
        MobileElement element = this.driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + message + "')]"));
        return element.isDisplayed();
    }
}
