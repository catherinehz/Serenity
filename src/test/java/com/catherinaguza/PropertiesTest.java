package com.catherinaguza;

import com.catherinaguza.base.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class PropertiesTest extends BaseTest {

    @Steps
    private PropertiesPage.Steps user_on_properties_page;

    @Test
    public void verify_that_user_can_open_add_new_property_screen() {
        user_on_properties_page.clicks_properties_list();
        user_on_properties_page.clicks_on_add_new_property();

    }

    @Steps
    private InvestorOfferingPage.Steps user_on_investor_offering_page;

    @Test
    public void verify_that_user_can_login_and_logout() {

        user_on_investor_offering_page.opens_page();
        user_on_investor_offering_page.waits_until_splash_is_disappear();

        for(int i = 0; i < 3; i++) {
            user_on_investor_offering_page.clicks_upper_login();

            user_on_investor_offering_page.inputs_email_string("devinvestor10@mailinator.com");
            user_on_investor_offering_page.inputs_password_string("P@ssw0rd");
            user_on_investor_offering_page.clicks_on_login_button();

            user_on_investor_offering_page.clicks_on_my_investor_profile();
            user_on_investor_offering_page.clicks_on_logout_button();
        }
    }
}