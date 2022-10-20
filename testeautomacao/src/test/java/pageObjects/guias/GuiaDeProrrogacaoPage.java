package pageObjects.guias;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;

import static selenium.MetodosUteis.*;

public class GuiaDeProrrogacaoPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//li[text()='Prorrogação']")
    private WebElement guiaProrrog;

    @FindBy(how = How.XPATH, using = ".//label[text()='3-Número da Guia Solicitação de Internação']/following::input[1]")
    private WebElement pesquisarNumGuia;

    @FindBy(how = How.XPATH, using = ".//label[text()='Número Guia']/following::select[1]")
    private WebElement campOPouPrest;

    @FindBy(how = How.XPATH, using = ".//label[text()='9-Código na Operadora']/following::input[1]")
    private WebElement codNaOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='11-Nome do Profissional Solicitante']/following::input[1]")
    private WebElement nomeProfSolicit;

    @FindBy(how = How.XPATH, using = ".//label[text()='15-Nome do Profissional Solicitante']/following::input[1]")
    private WebElement nomeProfSolicit2;

    @FindBy(how = How.ID, using = "divAguarde")
    private WebElement aguarde;

    @FindBy(how = How.XPATH, using = ".//label[text()='18-Indicação Clínica']/following::textarea[1]")
    private WebElement campIndicacaoClinica;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Tabela']/following::select[1]")
    private WebElement tabela;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Tabela']/following::select[1]/following::input[2]")
    private WebElement codProced;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Tabela']/following::select[1]/following::input[2]/following::input[2]/following::input[1]")
    private WebElement qtdSolic;

    public GuiaDeProrrogacaoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarGuiaProrrogacao() throws InterruptedException {
        esperarEclicar(driver, guiaProrrog);
    }

    public void acionarPesquisarGuia() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEclicar(driver, pesquisarNumGuia);
    }

    public void selecionarOperadoraPrestador(String arg1) throws InterruptedException {
        esperarEclicar(driver, campOPouPrest);
        selecionarElemento(campOPouPrest, arg1);
    }

    public void informeCodNaOperadora(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEpreencher(driver, codNaOperadora, arg1);
        codNaOperadora.sendKeys(Keys.ARROW_DOWN);
        espera();
        codNaOperadora.sendKeys(Keys.ENTER);
    }

    public void informarNomeProfSolicitante(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, nomeProfSolicit);
        aguardarElementoSerClicavel(driver, nomeProfSolicit);
        esperarEpreencher(driver, nomeProfSolicit, arg1);
        esperarDesaparecer(driver, aguarde);
        espera();
        nomeProfSolicit.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        nomeProfSolicit.sendKeys(Keys.ENTER);
    }


    public void informarONomeProfSolicitante(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, nomeProfSolicit2);
        aguardarElementoSerClicavel(driver, nomeProfSolicit2);
        esperarEpreencher(driver, nomeProfSolicit2, arg1);
        esperarDesaparecer(driver, aguarde);
        espera();
        nomeProfSolicit2.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        nomeProfSolicit2.sendKeys(Keys.ENTER);
    }

    public void informaroNomeProfSolicitante(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, nomeProfSolicit2);
        aguardarElementoSerClicavel(driver, nomeProfSolicit2);
        esperarEpreencher(driver, nomeProfSolicit2, arg1);
        esperarDesaparecer(driver, aguarde);
        espera();
        nomeProfSolicit2.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        nomeProfSolicit2.sendKeys(Keys.ENTER);
    }



    public void informarCampoIndicacaoClinica(String arg1) throws InterruptedException {
        esperarEpreencher(driver, campIndicacaoClinica, arg1);
    }

    public void informTabela(String arg1) throws InterruptedException {
        esperarEclicar(driver, tabela);
        selecionarElemento(tabela, arg1);
    }

    public void informCodProced(String arg1) throws InterruptedException {
        espera();
        aguardarElementoSerClicavel(driver,codProced);
        esperarEclicar(driver,codProced);
        esperarEpreencher(driver, codProced, arg1);
        codProced.sendKeys(Keys.TAB);
    }

    public void informarQtdSolic(String arg1) throws InterruptedException {
        //esperarDesaparecer(driver,aguarde);
        esperarEpreencher(driver,qtdSolic,arg1);
    }
}
