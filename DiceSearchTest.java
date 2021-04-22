import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiceSearchTest {

    private static final String DICE_MAIN_PAGE_URL = "https://www.dice.com/";
    WebDriver driver;
    //1. Open a browser
    //2. Go to Dice main page
    //3. Type search query
    //4.Submit query
    //5. Verify results page is appeared

    @Test
    public void test001() {
        openBrowser();
        goToMainPage();
        waitForSearchElement();
        typeSearchQuery();
        submitQuery();
        waitForElement();
        verifyResultsPage();
    }
    private void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers_Mac_OS/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    private void goToMainPage() {
        driver.get(DICE_MAIN_PAGE_URL);
    }
    private void waitForSearchElement() {
        WebDriverWait wait = new WebDriverWait(driver, 20 );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchInput-div\"]/form/div/div[1]/div/dhi-new-typeahead-input/div/input")));
    }
    private void typeSearchQuery() {
        driver.findElement(By.xpath("//*[@id=\"searchInput-div\"]/form/div/div[1]/div/dhi-new-typeahead-input/div/input")).sendKeys("qa engineer");
    }
    private void submitQuery() {
        driver.findElement(By.xpath("//*[@id=\"searchInput-div\"]/form/div/div[1]/div/dhi-new-typeahead-input/div/input")).submit();
    }
    private void waitForElement() {
        WebDriverWait wait = new WebDriverWait(driver, 20 );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#searchInput-div > form > div > div.flex-grow-1.mr-md-2 > div > dhi-new-typeahead-input > div > input")));
    }
    private void verifyResultsPage() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"search-div\"]/dhi-search-page-results/div/div[1]/div/div/h4"));
        boolean displayed = element.isDisplayed();
        Assert.assertEquals(displayed, true);
    }

}
