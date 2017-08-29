import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;

public class PropertiesTest extends BaseTest {

    @Steps
    private PropertiesPage.Steps user_on_properties_page;

    @Steps
    private SponsorDashboardPage.Steps user_on_dashboard_page;


    @Before
    public void verify_that_user_can_login_on_sponsor_site() {

        user_on_dashboard_page.opens_page();
        user_on_dashboard_page.inputs_email_string("devsponsor6@mailinator.com");
        user_on_dashboard_page.inputs_password_string("P@ssw0rd");
        user_on_dashboard_page.clicks_on_login_button();
    }

    @Test
    public void verify_that_user_can_open_add_new_property_screen() {
        user_on_dashboard_page.opens_sidemenu();
        user_on_properties_page.clicks_properties_list();
        user_on_properties_page.clicks_on_add_new_property();
    }
}