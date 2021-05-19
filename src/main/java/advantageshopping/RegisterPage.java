package advantageshopping;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterPage extends BasePage {

    /**
     * Register button
     */
    @AndroidFindBy(id="com.Advantage.aShopping:id/textViewSingUpToday")
    MobileElement registerButton;
}
