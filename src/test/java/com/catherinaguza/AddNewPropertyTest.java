package com.catherinaguza;

import com.catherinaguza.base.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AddNewPropertyTest extends BaseTest {

    @Steps
    private AddNewPropertyPage.Steps user_on_add_new_property_page;

    @Steps
    private PropertiesPage.Steps user_on_properties_list_page;

    @Test
    public void verify_that_user_can_create_property_on_the_add_new_property_page() {
        user_on_properties_list_page.clicks_properties_list();
        user_on_properties_list_page.clicks_on_add_new_property();

        user_on_add_new_property_page.selects_random_property_type_values();
        user_on_add_new_property_page.inputs_property_name();
        user_on_add_new_property_page.inputs_property_street_address();
        user_on_add_new_property_page.inputs_property_city();
        user_on_add_new_property_page.inputs_property_postal_code();

    }
}