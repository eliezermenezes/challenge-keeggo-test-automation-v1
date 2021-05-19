package advantageshopping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseTest {
    private final LoginPage loginPage = new LoginPage();

    @Given("I go to login screen")
    public void i_go_to_screen() throws Exception {
        this.setUp();
        this.loginPage.goToLoginScreen();
    }

    @When("I enter the {string} username and {string} password")
    public void i_enter_the_username_and_password(String username, String password) {
        this.loginPage.setUsername(username);
        this.loginPage.setPassword(password);
    }

    @When("I touch the login button")
    public void i_touch_the_login_button() {
        loginPage.tapLoginButton();
    }
}
