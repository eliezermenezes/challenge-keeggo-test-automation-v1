package advantageshopping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefinitions extends BaseTest {
    private final LoginPage login = new LoginPage();

    @Given("I go to login screen")
    public void i_go_to_screen() {
        this.login.goToLoginScreen();
    }

    @When("I enter the {string} username and {string} password")
    public void i_enter_the_username_and_password(String username, String password) {
        this.login.setUsername(username);
        this.login.setPassword(password);
    }

    @When("I touch the {string} button")
    public void i_touch_the_button(String buttonName) {
        this.login.tapButton(buttonName);
    }

    @Then("I can see the message {string}")
    public void i_can_see_the_message(String expectedMsg) {
        assertTrue(this.login.msgShouldBeDisplayed(expectedMsg));
    }
}
