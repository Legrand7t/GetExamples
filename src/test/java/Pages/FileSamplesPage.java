package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FileSamplesPage extends BasePage {

    private static final String SAMPLE_FILES = "//div[@id='output']//strong[contains(text(), '.txt')]";
    private static final String SAMPLE_FILE_3 = "//div[@id='output']/div[1]/a";
    private static final String SAMPLE_FILE_2 = "//div[@id='output']/div[2]/a";
    private static final String SAMPLE_FILE_1 = "//div[@id='output']/div[3]/a";

    List<WebElement> files = getElements(SAMPLE_FILES);

    public FileSamplesPage(WebDriver driver) {
        super(driver);
    }

    public int checkNumberOfFiles() {
        return files.size();
    }

    public WebElement getThirdSample() {
        return getElement(SAMPLE_FILE_3);
    }

    public WebElement getSecondSample() {
        return getElement(SAMPLE_FILE_2);
    }

    public WebElement getFirstSample() {
        return getElement(SAMPLE_FILE_1);
    }

    public void downloadFiles() {
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("window.scrollBy(0,350)", "");
        getThirdSample().click();
//      driver.navigate().back();
//      getThirdSample().click();
        getSecondSample().click();
        getFirstSample().click();
    }
}
