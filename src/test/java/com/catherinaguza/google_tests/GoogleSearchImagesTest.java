package com.catherinaguza.google_tests;

import com.catherinaguza.GoogleImagesPage;
import com.catherinaguza.base.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleSearchImagesTest {

    @Managed
    WebDriver driver;

    @Steps
    private GoogleImagesPage.Steps user_on_google_image_page;

    @Test
    public void verify_that_user_can_click_on_first_image() {
        user_on_google_image_page.opens_page();
        user_on_google_image_page.inputs_search_string("Krakow");
        user_on_google_image_page.clicks_on_search_button();
        user_on_google_image_page.clicks_on_first_image();
        user_on_google_image_page.should_see_search_results();
    }
}