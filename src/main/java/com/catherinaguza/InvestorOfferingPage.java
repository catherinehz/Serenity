package com.catherinaguza;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

@DefaultUrl("http://invest.sp1-plp-dev.dev.cloudroute.com/")
public class InvestorOfferingPage extends PageObject {

    //elements on the page
    @FindBy(css="button.login-button")
    private WebElementFacade buttonUpperLogin;

    @FindBy(xpath = "//md-input-container[1]")
    private WebElementFacade containerEmail;

    @FindBy(xpath = "//md-input-container[2]")
    private WebElementFacade containerPassword;

    @FindBy(xpath="//button[contains(@class, 'submit-button')]")
    private WebElementFacade buttonLoginForm;

    @FindBy(id = "user-menu")
    private WebElementFacade myInvestorProfile;

    @FindBy(xpath = "//md-menu-item[contains(@class, 'md-indent')][5]")
    private WebElementFacade logoutButton;

    @FindBy(css = "#splash-screen")
    private WebElementFacade elementAboveLoginButton;

    private static final String INPUT_EMAIL_CSS= "#input_0";

    private static final String INPUT_PASSWORD_CSS = "#input_1";

    //what I can do on the page with elements
    public static class Steps extends ScenarioSteps {

        @Page
        private InvestorOfferingPage page;

        @Step
        public void opens_page() {
            page.open();
        }

        @Step
        public void clicks_upper_login() {
            page.buttonUpperLogin.waitUntilClickable();
            page.buttonUpperLogin.click();
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
            page.buttonLoginForm.click();
        }

        
        @Step
        public void clicks_on_my_investor_profile() {

            page.elementAboveLoginButton.waitUntilNotVisible();
            page.myInvestorProfile.click();}

        @Step
        public void clicks_on_logout_button() {page.logoutButton.click();}

        @Step
        public void waits_until_splash_is_disappear() { page.elementAboveLoginButton.waitUntilNotVisible(); }

    }
}
