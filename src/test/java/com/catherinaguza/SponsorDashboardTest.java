package com.catherinaguza;

import com.catherinaguza.base.BaseTest;
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

    }
}