import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

@DefaultUrl("http://invest.sp1-plp-dev.dev.cloudroute.com/")
public class DashboardPage extends PageObject {

    //elements on the page
    @FindBy(css="button.login-button")
    private WebElementFacade buttonLogin;

    //what I can do on the page with elements
    public class Steps extends ScenarioSteps {

        @Page
        private DashboardPage page;

        @Step
        public void opens_page() {
            page.open();
        }

        @Step
        public void clicks_login() {
            page.buttonLogin.click();
        }
    }
}
