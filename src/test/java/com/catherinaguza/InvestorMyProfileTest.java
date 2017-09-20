package com.catherinaguza;

import com.catherinaguza.InvestorMyProfilePage;
import com.catherinaguza.base.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class InvestorMyProfileTest {

    @Managed
    protected WebDriver driver;

    @Steps
    private InvestorMyProfilePage.Steps user_on_investor_offering_page;

    @Test
    public void verify_that_user_can_login_and_logout() {

        user_on_investor_offering_page.opens_page();

        for(int i = 0; i < 10; i++) {
            user_on_investor_offering_page.waits_until_splash_is_disappear();
            user_on_investor_offering_page.clicks_upper_login();

            user_on_investor_offering_page.inputs_email_string("devinvestor10@mailinator.com");
            user_on_investor_offering_page.inputs_password_string("P@ssw0rd");
            user_on_investor_offering_page.clicks_on_login_button();

            user_on_investor_offering_page.waits_until_spinner_is_disappear();
            user_on_investor_offering_page.clicks_on_my_investor_profile();
            user_on_investor_offering_page.clicks_on_logout_button();
        }
    }

}
