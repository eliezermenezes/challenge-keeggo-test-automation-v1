package advantageshopping;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void setUsername(String username) {
        AndroidElement userElement = this.driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
        userElement.click();
        userElement.sendKeys(username);
    }

    public void setPassword(String password) {
        AndroidElement passElement = this.driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
        passElement.click();
        passElement.sendKeys(password);
    }
}
