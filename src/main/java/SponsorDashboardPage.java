import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

@DefaultUrl("http://sponsor.sp1-plp-dev.dev.cloudroute.com/")
public class SponsorDashboardPage extends PageObject {

    @FindBy(id="#username")
    private WebElementFacade inputEmail;

    @FindBy(id="#password")
    private WebElementFacade inputPassword;

    @FindBy(css="button.md-raised")
    private WebElementFacade buttonLogin;

    @FindBy(xpath = "//md-input-container[1]")
    private WebElementFacade containerEmail;

    @FindBy(xpath = "//md-input-container[2]")
    private WebElementFacade containerPassword;

    private static final String INPUT_EMAIL_CSS= "#username";
    private static final String INPUT_PASSWORD_CSS = "#password";

    //elements from left menu item
    @FindBy(xpath="//div['ms-navigation-item']/descendant::a[5]")
    private WebElementFacade buttonPropertiesList;


    public static class Steps extends ScenarioSteps {

        @Page
        private SponsorDashboardPage page; //get elements from outer class

        @Step
        public void opens_page() {
            page.open();
        }

        @Step
        public void inputs_email_string(String text) {
            page.containerEmail.click();
            page.$(INPUT_EMAIL_CSS).type(text);
        }

        @Step
        public void inputs_password_string(String text) {
            page.containerPassword.click();
            page.$(INPUT_PASSWORD_CSS).type(text);
        }

        @Step
        public void clicks_on_login_button() {
            page.buttonLogin.click();
        }

        @Step
        public void clicks_on_propertiesList_button() { page.buttonPropertiesList.click();}



    }
}
