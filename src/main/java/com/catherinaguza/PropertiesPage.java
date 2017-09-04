package com.catherinaguza;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;


@DefaultUrl("http://sponsor.sp1-plp-dev.dev.cloudroute.com/")
public class PropertiesPage extends PageObject {

    @FindBy(xpath="//a[contains(@href, 'properties')]")
    private WebElementFacade buttonProperties;

    @FindBy(css="div.header button")
    private WebElementFacade buttonAddNewProperty;

     public static class Steps extends ScenarioSteps {

        @Page
        private PropertiesPage page; //get elements from outer class

        @Step
        public void clicks_properties_list() {
            page.buttonProperties.waitUntilClickable();
            page.buttonProperties.click();
        }

        @Step
         public void clicks_on_add_new_property() {
            page.buttonAddNewProperty.waitUntilClickable();
            page.buttonAddNewProperty.click();
        }

     }
}
