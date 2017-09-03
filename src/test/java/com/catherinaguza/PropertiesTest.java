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
}