package pageObjects.auditoriaTecnica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;

import java.io.IOException;

public class ParametrizarGrupoDeUsuariosPage {
    private WebDriver driver;
    int timeOut = 90;
    MetodosUteis metodosUteis = new MetodosUteis();

    @FindBy(how = How.XPATH, using = "")
    private WebElement xpto;


    public ParametrizarGrupoDeUsuariosPage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

}
