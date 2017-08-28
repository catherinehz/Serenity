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



    public static class Steps extends ScenarioSteps {

        @Page
        private AddNewPropertyPage page; //get elements from outer class

        @Step
        public void clicks_on_add_new_property_button() {page.buttonAddNewProperty.click();}

    }
}
