package Tests;

import Base.BaseTest;
import Helper.FileReader;
import Pages.FileSamplesPage;
import Pages.GoogleResultsPage;
import Pages.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    private static final String MAIN_URL = "https://www.google.com.ua/";
    private static final String SEARCH_QUERY = "txt file example";
    private static final String EXPECTED_URL = "https://filesamples.com/formats/txt";

    /**
     * 1. Go to the Google search page;
     * 2. Enter "txt file example" in the search;
     * 3. From the results page, go to the search result on the site called "Sample TXT Files Download - Get Examples Instantly";
     */
    public void precondition() {
        openWebsite(MAIN_URL);
        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        GoogleResultsPage resultsPage = searchPage.search(SEARCH_QUERY);
        resultsPage.clickSearchTitle();
    }

    /**
     * 1. Check that the page has the URL: https://filesamples.com/formats/txt;
     * 2. Check that the page contains only 3 example files;
     */

    @Test(priority = 1)
    public void checkSearchResult() {
        precondition();
        FileSamplesPage samplesPage = new FileSamplesPage(driver);
        Assert.assertEquals(checkCurrentURL(), EXPECTED_URL, "URL not verified");
        Assert.assertEquals(samplesPage.checkNumberOfFiles(), 3, "Wrong amount");
    }

    /**
     * 1. Download all 3 files;
     * 2. Find which file(s) contains the string "Idemne, quod iucunde?";
     * 3. Find which file(s) contains the string "Lorem ipsum";
     * 4. Display search results on the screen;
     */

    @Test(priority = 2)
    public void checkDownloadFiles() throws InterruptedException {
        precondition();
        FileSamplesPage samplesPage = new FileSamplesPage(driver);
        samplesPage.downloadFiles();
        Thread.sleep(3000);
        FileReader fileReader = new FileReader();
        fileReader.findStrings();
    }
}
