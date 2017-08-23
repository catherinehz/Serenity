import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Managed
    WebDriver driver;

    @Steps
    private DashboardPage.Steps user_on_dashboard_page;

    @Test
    public void verify_that_user_can_login() {
        user_on_dashboard_page.opens_page();
        user_on_dashboard_page.clicks_login();
    }
}