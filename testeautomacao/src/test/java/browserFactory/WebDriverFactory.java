package browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {
 
	/**
     * Inicializa o Driver do browser desejado UI
     *
     * @param browser chrome e firefox, Headless - chrome-hl e firefox-hl
     * @return WebDriver
     */
    public WebDriver build(String browser) {
        WebDriver driver;
        browser = setBrowser(browser);
        switch (browser.toUpperCase()) {

            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            case "CHROME-HL":
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.setHeadless(false);
                //chromeOptions.addArguments("window-size=" + getResolution());
                chromeOptions.addArguments("--incognito");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "FIREFOX-HL":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setHeadless(true);
                firefoxOptions.addArguments("window-size=" + getResolution());

                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "CHROME":
            default:
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
        }

        
        
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return driver;

    }

    private String setBrowser(String browser) {

        if (browser.isEmpty()) {
            return "chrome";
        } else {
            return browser;
        }
    }

    private String getResolution() {
        try {
            String resolution = System.getProperty("resolution");
            if (resolution.isEmpty()) {
                return "1366x768";
            } else {
                return resolution;
            }
        } catch (Exception error) {
            return "1366x768";
        }
    }

}