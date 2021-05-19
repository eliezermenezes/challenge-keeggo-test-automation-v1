package advantageshopping;

public class BaseTest {
    private final AppiumServer appiumServer = new AppiumServer();

    protected void setUp() throws Exception {
        appiumServer.setupUp();
    }
}
