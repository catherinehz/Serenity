package com.catherinaguza;

import com.catherinaguza.base.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Random;

@DefaultUrl("http://sponsor.sp1-plp-dev.dev.cloudroute.com/")
//является
public class AddNewPropertyPage extends BasePage {

    @FindBy(css="div.header button")
    private WebElementFacade buttonAddNewProperty;

    //container for select elements
    @FindBy(xpath="//md-select[@name='residency']/ancestor::div[1]")
    private WebElementFacade selectPropertyType;

    //use to get list with all values
    @FindBy(css="select[name='residency'] option")
    private List<WebElementFacade> selectPropertyTypeValues;

    //make using a new method!!
    @FindBy(css="md-select[name='propStatus']")
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

    @FindBy(css="#select_value_label_7")
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
        public void selects_random_property_type_values() {
            //RandomStringUtils.randomAlphanumeric(5);
            //int num = new Random().nextInt(page.selectPropertyType.getSelectOptions().size();
            page.selectPropertyType.click();
            page.getRandomSelectOption(page.selectPropertyTypeValues).click();
        }

        private String getRandomPropertyTypeValue() {
            String[] propertyTypeValues = {"Affordable Housing", "Condo", "Hotel"};
            return propertyTypeValues[new Random().nextInt(propertyTypeValues.length)];
        }

        @Step
        public void selects_random_property_status() {
           // int num = new Random().nextInt(page.selectPropertyStatus.getSelectOptions().size());
            //page.selectPropertyStatus.selectByIndex(num);
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
        }

        @Step
        public void inputs_property_postal_code() {page.inputPropertyPostalCode.type("13245");}

    }
}
