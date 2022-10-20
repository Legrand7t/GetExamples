package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleResultsPage extends BasePage {

    private static final String SITE_TITLES = "//div//h3";
    private static final String SEARCH_TITLE = "Sample TXT Files Download";
    List<WebElement> allTitles = getElements(SITE_TITLES);


    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchTitle() {

        for (WebElement element : allTitles) {
            if (element.getText().contains(SEARCH_TITLE)) {
                element.click();
                break;
            } else {
                System.out.println("Title not found");
            }
        }
    }
}
