package pageObjects.guias;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;

import static selenium.MetodosUteis.*;

public class GuiaHonorariosPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//li[text()='Honorários']")
    private WebElement guiaHonorarios;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[6]/input[1]")
    private WebElement pesquisa;


    public GuiaHonorariosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarGuiaHonorarios() throws InterruptedException {
        esperarEclicar(driver, guiaHonorarios);
    }

    public void acionarPesquisar() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver,pesquisa);
        aguardarElementoSerClicavel(driver,pesquisa);
        esperarEclicar(driver, pesquisa);
    }
}