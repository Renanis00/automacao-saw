package stepDefinitions;

//import java.io.File;

import java.io.File;
import java.io.IOException;
//import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.HooksPages;

import static selenium.MetodosUteis.*;

public class Hooks {

// WebDriverManager webDriverManager;
// TestContext testContext;

    private TestContext testContext;
    private HooksPages hooksPages;

// private WebDriverManager webDriverManager;

    @FindBy(how = How.XPATH, using = "//*[@id='mainForm']/div[2]/div[1]/div[3]/ul/li[1]/span/span[1]")
    WebElement logoEstacao;

    public Hooks(TestContext context) throws Exception {
        testContext = context;
        hooksPages = testContext.getPageObjectManager().getHooksPages();

    }


    @Before
    public void BeforeSteps(Scenario cenario) throws InterruptedException {

// testContext = new TestContext();
//WebDriverManager webDriverManager = new WebDriverManager();
        Thread.sleep(1000);
        afterScenario(cenario);
        Reporter.assignAuthor("QA analyst - Renan Gabriel");
    }

    @After(order = 1)

    public void afterScenario(Scenario cenario) {

        if (cenario.isFailed()) {

            String screenshotName = cenario.getName().replaceAll(" ", "Erro_");

            try {

                // Isso tira uma captura de tela do driver ao salvá-lo no local especificado
                File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
                        .getScreenshotAs(OutputType.FILE);

                // Criando o caminho de destino da captura de tela para salvar
                // Também cria uma pasta 'screenshots' na pasta cucumber-report
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/"
                        + screenshotName + ".png");

                // Copiar screenshot tirada do local de origem para o local de destino
                Files.copy(sourcePath, destinationPath);

                // Isso anexa a captura de tela especificada ao teste
                Reporter.addScreenCaptureFromPath(destinationPath.toString());

            } catch (IOException e) {

            }

        }
    }

    @After(order = 0)
    public void AfterSteps(Scenario cenario) throws InterruptedException {

        Thread.sleep(900);


        if (cenario.isFailed()) {
            String screenshotName = cenario.getName().replaceAll(" ", "Passou_");
            try {

                // Isso tira uma captura de tela do driver ao salvá-lo no local especificado
                File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
                        .getScreenshotAs(OutputType.FILE);

                // Criando o caminho de destino da captura de tela para salvar
                // Também cria uma pasta 'screenshots' na pasta cucumber-report
                File destinationPath = new File(
                        System.getProperty("user.dir") + "/target/cucumber-reports/" + screenshotName + ".png");

                // Copiar screenshot tirada do local de origem para o local de destino
                Files.copy(sourcePath, destinationPath);

                // Isso anexa a captura de tela especificada ao teste
                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (IOException e) {
            }
            // Thread.sleep(5000);
            // Assert.assertEquals("AMBIENTE DE DESENVOLVIMENTO", logoEstacao.getText());

            espera();
            //testContext.getWebDriverManager().closeDriver();

            //testContext.getWebDriverManager().killDriver();
        } else {
        testContext.getWebDriverManager().closeDriver();
         }
    }}
