package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static selenium.MetodosUteis.aguardarElementoSerClicavel;

import static selenium.MetodosUteis.*;

import java.util.List;

import enums.Ambiente;
//import junit.framework.Assert;
import managers.FileReaderManager;
import net.bytebuddy.jar.asm.commons.TryCatchBlockSorter;
import selenium.Wait;

public class LoginPage {
    private WebDriver driver;
    final int timeOut = 90;
    @FindBy(how = How.CSS, using = "")
    private WebElement botao;

    @FindBy(how = How.XPATH, using = "")
    private WebElement test;

    @FindBy(how = How.ID, using = "")
    private WebElement teste;


    @FindBy(how = How.XPATH, using = "/html/body/form/div/div/div/div[2]/input")
    private WebElement username2;

    @FindBy(how = How.XPATH, using = "/html/body/form/div/div/div/div[3]/input")
    private WebElement password2;

    @FindBy(how = How.XPATH, using = "/html/body/form/div/div/div/div[6]/input")
    private WebElement btnAutenticar2;



    @FindBy(how = How.ID, using = "login")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.ID, using = "submitForm")
    private WebElement btnAutenticar;


    @FindBy(how = How.XPATH, using = "//*[@id='mainForm:loginButton']")
    WebElement loginBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='mainForm:completeBaseID']/button")
    WebElement estacao;

    @FindBy(how = How.XPATH, using = "//*[@id='mainForm:completeBaseID_panel']/ul")
    WebElement itemEstacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mainForm:completeBaseID_panel\"]/ul/li")
    WebElement bt;

    @FindBy(how = How.XPATH, using = "//*[@id='mainForm:unidadeButton']")
    WebElement acessarBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mainForm:step2\"]/div[1]/h5")
    WebElement olaTeste;

    @FindBy(how = How.XPATH, using = "//*[@id='mainForm']/div[2]/div[1]/div[3]/ul/li[1]/span/span[1]")
    WebElement validPage;

    @FindBy(how = How.XPATH, using = ".//span[text()='Aguarde...']")
    WebElement aguarde;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public String acessoUrl(Ambiente ambiente) throws Exception {
        switch (ambiente) {
            case HM:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlHm());
                break;

            case DEV:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlDev());
                break;
            case QA:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlQa());
                break;

            case MIGR:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlMigr());
                break;

            case QA04:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlQa04());
                break;

            case QA05:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlQa05());
                break;

            case CLONE:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlClone());
                break;

            case SAWB:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlSawb());
                break;

            case PROD:
                driver.get(FileReaderManager.getInstance().getConfigReader().getUrlProd());
            default:
                Wait.untilPageLoadComplete(driver);
                break;
        }
        return null;
    }

    public void login(String usuario, String senha) throws InterruptedException {
        esperarEclicar(driver, username);
        esperarEpreencher(driver, username, usuario);
        esperarEclicar(driver, password);
        esperarEpreencher(driver, password, senha);
        esperarEclicar(driver, btnAutenticar);
    }

    public void login2(String arg1, String arg2) throws InterruptedException{
        esperarEclicar(driver, username2);
        esperarEpreencher(driver, username2, arg1);
        esperarEclicar(driver, password2);
        esperarEpreencher(driver, password2, arg2);
        esperarEclicar(driver, btnAutenticar2);
    }
}


