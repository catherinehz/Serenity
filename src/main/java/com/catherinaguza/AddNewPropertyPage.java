package com.catherinaguza;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fluentlenium.core.annotation.Page;

import java.util.Random;

@DefaultUrl("http://sponsor.sp1-plp-dev.dev.cloudroute.com/")
public class AddNewPropertyPage extends PageObject {

    @FindBy(css="div.header button")
    private WebElementFacade buttonAddNewProperty;

    @FindBy(css="select[name='residency']")
    private WebElementFacade selectPropertyType;

    @FindBy(css="select[name='propStatus']")
    private WebElementFacade selectPropertyStatus;

    @FindBy(css="input[name='propName']")
    private WebElementFacade inputPropertyName;

    @FindBy(css="input[name='propAddress']")
    private WebElementFacade inputPropertyStreet;

    @FindBy(css="input[name='propCity']")
    private WebElementFacade inputPropertyCity;

    @FindBy(css="select[name='propState']")
    private WebElementFacade selectPropertyState;

    @FindBy(css="input[name='propPostCode']")
    private WebElementFacade inputPropertyPostalCode;

    @FindBy(css="#select_value_label_1197")
    private WebElementFacade selectPropertyCountry;

    @FindBy(css="button.prop-entity--btn")
    private WebElementFacade buttonUploadDocuments;

    @FindBy(css="div.prop-entity--form--upload-btn")
    private WebElementFacade buttonUploadImage;

    @FindBy(css="button.offering-entity--btn-cancel")
    private WebElementFacade buttonBottonCancel;

    public static class Steps extends ScenarioSteps {

        @Page
        private AddNewPropertyPage page; //get elements from outer class

        @Step
        public void clicks_on_add_new_property_button() {page.buttonAddNewProperty.click();}

        @Step
        public void selects_random_property_type() {
            //RandomStringUtils.randomAlphanumeric(5);
            //int num = new Random().nextInt(page.selectPropertyType.getSelectOptions().size());
            //page.selectPropertyType.click();
            page.selectPropertyType.selectByIndex(1);

        }

        @Step
        public void selects_random_property_status() {
           // int num = new Random().nextInt(page.selectPropertyStatus.getSelectOptions().size());
            //page.selectPropertyStatus.selectByIndex(num);
            page.selectPropertyStatus.selectByIndex(2);
        }

        @Step
        public void inputs_property_name() {page.inputPropertyName.type("Park Hyatt Maldives Hadahaa - 3");}

        @Step
        public void inputs_property_street_address() {page.inputPropertyStreet.type("582 Oliver St NW");}

        @Step
        public void inputs_property_city() {page.inputPropertyCity.type("Atlanta");}

        @Step
        public void selects_property_state() {
            //int num = new Random().nextInt(page.selectPropertyState.getSelectOptions().size());
            //page.selectPropertyState.selectByIndex(num);
            page.selectPropertyState.selectByIndex(4);
        }

        @Step
        public void inputs_property_postal_code() {page.inputPropertyPostalCode.type("13245");}

    }
}
