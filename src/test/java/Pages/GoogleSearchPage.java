package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends BasePage {

    private static final String SEARCH_FIELD = "//div/input[@name='q']";

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField(){
        return getElement(SEARCH_FIELD);
    }

    public GoogleResultsPage search(String query){
        getSearchField().sendKeys(query);
        getSearchField().submit();
        return new GoogleResultsPage(driver);
    }
}
