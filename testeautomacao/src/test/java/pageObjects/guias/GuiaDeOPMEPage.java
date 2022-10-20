package pageObjects.guias;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;

import static selenium.MetodosUteis.*;

public class GuiaDeOPMEPage {

    private WebDriver driver;
    int timeOut = 90;
    public MetodosUteis metodos;
    MetodosUteis metodosUteis;

    {
        metodosUteis = new MetodosUteis();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[2]/td/fieldset/select")
    private WebElement comboOPME;

    @FindBy(how = How.XPATH, using = ".//li[text()='OPME']")
    private WebElement guiaOPME;

    @FindBy(how = How.XPATH, using = ".//label[text()='3-Número da Guia Referenciada']/following::input[1]")
    private WebElement campNumGuiasRef;

    @FindBy(how = How.XPATH, using = ".//label[text()='10-Telefone']/following::input[1]")
    private WebElement tel;

    @FindBy(how = How.XPATH, using = ".//label[text()='12- Justificativa Técnica']/following::textarea[1]")
    private WebElement campJustTecnica;

    @FindBy(how = How.XPATH, using = ".//label[text()='13-Tabela']/following::select[1]")
    private WebElement campTabela;

    @FindBy(how = How.XPATH, using = ".//label[text()='14-Cód.']/following::input[2]")
    private WebElement campCod;

    @FindBy(how = How.XPATH, using = ".//label[text()='16-Opção']/following::input[5]")
    private WebElement opcao;

    @FindBy(how = How.XPATH, using = ".//label[text()='17- Qtd.Solic']/following::input[6]")
    private WebElement QtdSolic;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Código CBO-s']/following::select[1]")
    private WebElement cbo;

    public GuiaDeOPMEPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }


    public void selecionarOpcaoOPME(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        espera();
        esperarEclicar(driver, comboOPME);
        selecionarElemento(comboOPME, arg1);
    }

    public void acionarGuiaOPME() throws InterruptedException {
        esperarEclicar(driver, guiaOPME);
    }

    public void pesquisarGuiasReferenciadas() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        aguardaCarregamentoDaPagina(driver);
        esperarAparecer(driver, campNumGuiasRef);
        aguardarElementoSerClicavel(driver, campNumGuiasRef);
        esperarEclicar(driver, campNumGuiasRef);
    }

    public void campoTelefone(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        Thread.sleep(2000);
        esperarAparecer(driver, tel);
        aguardarElementoSerClicavel(driver, tel);
        esperarEpreencher(driver, tel, arg1);
    }

    public void infoCampJustificTecnica(String arg1) throws InterruptedException {
        scrollByDown(driver);
        aguardarElementoSerClicavel(driver, campJustTecnica);
        esperarEpreencher(driver, campJustTecnica, arg1);
    }

    public void selecionarTabela(String arg1) throws InterruptedException {
        esperarAparecer(driver, campTabela);
        aguardarElementoSerClicavel(driver, campTabela);
        esperarEclicar(driver, campTabela);
        selecionarElemento(campTabela, arg1);
    }

    public void informarCod(String arg1) throws InterruptedException {
        esperarAparecer(driver, campCod);
        aguardarElementoSerClicavel(driver, campCod);
        esperarEpreencher(driver, campCod, arg1);

    }

    public void infoCampOpcao(String arg1) throws InterruptedException {
        esperarAparecer(driver, opcao);
        aguardarElementoSerClicavel(driver, opcao);
        esperarEpreencher(driver, opcao, arg1);
    }

    public void infomarQtdSolic(String arg1) throws InterruptedException {
        esperarAparecer(driver, QtdSolic);
        aguardarElementoSerClicavel(driver, QtdSolic);
        esperarEpreencher(driver, QtdSolic, arg1);
    }

    public void informarCampoCBOc(String arg0) throws InterruptedException {
        esperarEclicar(driver, cbo);
        selecionarElemento(cbo, arg0);

    }
}
