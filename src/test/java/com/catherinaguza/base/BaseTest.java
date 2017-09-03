package com.catherinaguza.base;

import com.catherinaguza.SponsorDashboardPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public abstract class BaseTest {

    @Managed
    protected WebDriver driver;

    @Steps
    private SponsorDashboardPage.Steps user_on_dashboard_page; //it is an Object

    @Before
    public void login_before_test() {
        user_on_dashboard_page.logs_in();
    }
}
