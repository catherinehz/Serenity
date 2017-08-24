import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class PropertiesTest extends BaseTest {

    @Steps
    private PropertiesPage.Steps user_on_properties_page;

    @Test
    public void verify_that_user_can_login_on_sponsor_site() {

        user_on_properties_page.opens_page();
        user_on_properties_page.inputs_email_string("devsponsor6@mailinator.com");
        user_on_properties_page.inputs_password_string("P@ssw0rd");
        user_on_properties_page.clicks_on_login_button();
    }
}