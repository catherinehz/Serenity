package com.catherinaguza;

import com.catherinaguza.base.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AddNewPropertyTest extends BaseTest {

    @Steps
    private AddNewPropertyPage.Steps user_on_add_new_property_page;

    @Test
    public void verify_that_user_can_open_add_new_property_screen() {
        user_on_add_new_property_page.selects_random_property_type();


    }
}