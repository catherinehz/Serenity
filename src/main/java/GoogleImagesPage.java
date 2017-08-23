import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

@DefaultUrl("https://images.google.com/")
public class GoogleImagesPage extends PageObject {

    @FindBy(id="lst-ib")
    private WebElementFacade inputSearch;

    @FindBy(id="_fZl")
    private WebElementFacade buttonSearch;

    @FindBy(xpath="(//div[@id='rg_s']/descendant::a)[1]")
    private WebElementFacade imageFirst;

    @FindBy(css="#irc_cc")
    private WebElementFacade blockResult;

    public static class Steps extends ScenarioSteps {

        @Page
        private GoogleImagesPage page; //get elements from outer class

        @Step
        public void opens_page() {
            page.open();
        }

        @Step
        public void inputs_search_string(String text) {
            page.inputSearch.type(text);
        }

        @Step
        public void clicks_on_search_button() {
            page.buttonSearch.click();
        }

        @Step
        public void clicks_on_first_image() {page.imageFirst.click();}

        @Step
        public void should_see_search_results() {
            Assert.assertTrue("Search results were not displayed", page.blockResult.isDisplayed());
        }
    }
}
