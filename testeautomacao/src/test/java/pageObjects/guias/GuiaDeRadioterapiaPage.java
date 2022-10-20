package pageObjects.guias;

import io.cucumber.java.hr.Kad;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;

import static selenium.MetodosUteis.*;

public class GuiaDeRadioterapiaPage {

    private WebDriver driver;
    int timeOut = 90;
    public MetodosUteis metodos;
    MetodosUteis metodosUteis;

    {
        metodosUteis = new MetodosUteis();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div/form/fieldset/div[1]/div[16]/a")
    private WebElement btnAnexo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/fieldset/a")
    private WebElement novoAnexo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/table/tbody/tr[2]/td/fieldset/select")
    private WebElement comboRadioTerapia;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/table/tbody/tr[2]/td/fieldset/input[1]")
    private WebElement sim;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/table/tbody/tr/td/fieldset/input")
    private WebElement simAnexar;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[7]/div[3]/input")
    private WebElement idade;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[7]/div[4]/select")
    private WebElement sexo;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[9]/div[3]/input")
    private WebElement tel2;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[7]/select")
    private WebElement estadiamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[8]/select")
    private WebElement ecog;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[9]/select")
    private WebElement finalidade;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/div[1]/input")
    private WebElement numCamp;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/div[2]/input")
    private WebElement dosePorDia;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/div[3]/input")
    private WebElement doseTotal;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/div[4]/input")
    private WebElement numDias;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/div[5]/input")
    private WebElement dataInicioAdmin;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[3]/input")
    private WebElement dataSolicitacao;

    @FindBy(how = How.XPATH, using = "/html/body/form/fieldset/div[1]/div[1]/a")
    private WebElement btnGravar;

    public GuiaDeRadioterapiaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarAnexo() throws InterruptedException {
        espera();
        metodosUteis.aguardaEclicar(driver, btnAnexo);
    }

    public void acionarNovoAnexo() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEclicar(driver, novoAnexo);
    }

    public void selecionarOpcaoRadioterapia(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        espera();
        esperarEclicar(driver, comboRadioTerapia);
        selecionarElemento(comboRadioTerapia, arg1);
    }

    public void acionarSIM() throws InterruptedException {
        espera();
        esperarEclicar(driver, sim);
    }

    public void acionarSIMparaAnexar() throws InterruptedException {
        espera();
        esperarEclicar(driver, simAnexar);
    }

    public void informarIdade(String arg1) throws InterruptedException {
        esperarAparecer(driver, idade);
        esperarEpreencher(driver, idade, arg1);
    }

    public void selecionarSexo(String arg1) throws InterruptedException {
        esperarAparecer(driver, sexo);
        selecionarElemento(sexo, arg1);
    }

    public void informarTelefone(String arg1) throws InterruptedException {
        esperarAparecer(driver, tel2);
        esperarEclicar(driver, tel2);
        esperarEpreencher(driver, tel2, arg1);
    }

    public void selecionarEstadiamento(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, estadiamento);
        esperarEclicar(driver, estadiamento);
        selecionarElemento(estadiamento, arg1);
    }

    public void selecionarECOG(String arg1) throws InterruptedException {
        esperarAparecer(driver, ecog);
        esperarEclicar(driver, ecog);
        selecionarElemento(ecog, arg1);
    }

    public void selacionarFinalidade(String arg1) throws InterruptedException {
        esperarAparecer(driver, finalidade);
        esperarEclicar(driver, finalidade);
        selecionarElemento(finalidade, arg1);
    }

    public void informarNumeroDecampos(String arg1) throws InterruptedException {
        esperarAparecer(driver, numCamp);
        esperarEclicar(driver, numCamp);
        esperarEpreencher(driver, numCamp, arg1);
    }

    public void informarDosePorDia(String arg1) throws InterruptedException {
        esperarAparecer(driver, dosePorDia);
        esperarEclicar(driver, dosePorDia);
        esperarEpreencher(driver, dosePorDia, arg1);
    }

    public void informarDoseTotal(String arg1) throws InterruptedException {
        esperarAparecer(driver, doseTotal);
        esperarEclicar(driver, doseTotal);
        esperarEpreencher(driver, doseTotal, arg1);
    }

    public void informeNumeroDeDias(String arg1) throws InterruptedException {
        esperarAparecer(driver, numDias);
        esperarEclicar(driver, numDias);
        esperarEpreencher(driver, numDias, arg1);
    }

    public void informeDataPrevistaInicioAdmin(String arg1) throws InterruptedException {
        esperarAparecer(driver, dataInicioAdmin);
        esperarEclicar(driver, dataInicioAdmin);
        dataInicioAdmin.sendKeys(Keys.ENTER);
        // esperarEpreencher(driver,dataInicioAdmin,arg1);
    }

    public void informarDataSolicitacao(String arg1) throws InterruptedException {
        esperarAparecer(driver, dataSolicitacao);
        esperarEclicar(driver, dataSolicitacao);
        dataSolicitacao.sendKeys(Keys.ENTER);
    }

    public void acionarGravar() throws InterruptedException {
        esperarAparecer(driver, btnGravar);
        esperarEclicar(driver, btnGravar);
    }
}
