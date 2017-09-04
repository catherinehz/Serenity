package com.catherinaguza.google_tests;


import com.catherinaguza.base.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class GoogleSearchTest extends BaseTest {

    @Steps
    private GooglePage.Steps user_on_google_search_page;

    @Test
    public void verify_that_user_can_search_something_in_google() {
        user_on_google_search_page.opens_page();
        user_on_google_search_page.inputs_search_string("Serenity");
        user_on_google_search_page.clicks_on_search_button();
        user_on_google_search_page.should_see_search_results();
    }
}