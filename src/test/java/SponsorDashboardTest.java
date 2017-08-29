import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SponsorDashboardTest extends BaseTest {

    @Managed
    protected WebDriver driver;

    @Steps
    private SponsorDashboardPage.Steps user_on_dashboard_page;

    @Test
    public void verify_that_user_can_login() {
        user_on_dashboard_page.opens_page();
        user_on_dashboard_page.inputs_email_string("devsponsor6@mailinator.com");
        user_on_dashboard_page.inputs_password_string("P@ssw0rd");
        user_on_dashboard_page.clicks_on_login_button();
    }
}