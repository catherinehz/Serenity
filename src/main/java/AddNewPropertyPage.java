import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

@DefaultUrl("http://sponsor.sp1-plp-dev.dev.cloudroute.com/")
public class AddNewPropertyPage extends PageObject {

    @FindBy(css="div.header button")
    private WebElementFacade buttonAddNewProperty;

    @FindBy(css="select[name='residency']")
    private WebElementFacade selectPropertyType;

    @FindBy(css="md-select[name='propStatus']")
    private WebElementFacade selectPropertyStatus;

    @FindBy(css="input[name='propName']")
    private WebElementFacade inputPropertyName;

    @FindBy(css="input[name='propAddress']")
    private WebElementFacade inputPropertyStreet;

    @FindBy(css="input[name='propCity']")
    private WebElementFacade inputPropertyCity;

    @FindBy(css="md-select[name='propState']")
    private WebElementFacade selectPropertyState;

    @FindBy(css="input[name='propPostCode']")
    private WebElementFacade inputPropertyPostalCode;

    @FindBy(css="md-select-value#select_value_label_1197")
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

    }
}
