package pageObjects.guias;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;
import util.GravaArquivo;

import static selenium.MetodosUteis.*;

public class GuiaDeOutrasDespesasPage {

    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//li[text()='Outras Despesas']")
    private WebElement guiaOutrasDspesas;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[5]/label/input[1]")
    private WebElement pesquisarGuia;

    @FindBy(how = How.XPATH, using = ".//label[text()='Tipo da Guia']/following::select[1]")
    private WebElement tipoDaGuia;

    @FindBy(how = How.XPATH, using = ".//label[text()='Número Guia']/following::input[3]")
    private WebElement numGuia;

    @FindBy(how = How.XPATH, using = ".//label[text()='Número Guia']/following::input[7]")
    private WebElement btnPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td[8]/div/a/img")
    private WebElement realizacaoVinculo;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[1]/select")
    private WebElement campoCD;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[2]/input")
    private WebElement campData;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[3]/input[1]")
    private WebElement horaInicial;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[3]/input[2]")
    private WebElement horaFinal;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[4]/select")
    private WebElement campTabela;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[5]/input[1]")
    private WebElement codItem;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[6]/input")
    private WebElement campQT;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[8]/select")
    private WebElement fatorRed;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[8]/table/tbody/tr[3]/td[9]/input")
    private WebElement valorUnit;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/fieldset/div[1]/div[1]/a")
    private WebElement btnGravar;

    public GuiaDeOutrasDespesasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarGuiaDeoutrasDespesas() throws InterruptedException {
        esperarEclicar(driver, guiaOutrasDspesas);
        Thread.sleep(2000);
    }

    public void acionarPesquisaDeGuia() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEclicar(driver, pesquisarGuia);
    }

    public void selecionarTipoDeGuia(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 2);
        esperarEclicar(driver, tipoDaGuia);
        selecionarElemento(tipoDaGuia, arg1);
    }


    public void informarCampoNumeroGuia(String arg1) throws Exception {
        esperarEpreencher(driver, numGuia, arg1);
    }


    public void informarCampoNumeroGuiaAutorizada(String arg1) throws Exception {
        retornarNumeroDaGuiaInternacaoAutorizada(arg1);
    }


    public void retornarNumeroDaGuiaInternacaoAutorizada(String arg) throws Exception {
        Thread.sleep(2000);
        aguardaCarregamentoDaPagina(driver);
        GravaArquivo arquivo = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/numeroGuiaInternacaoCampoGrandeAutorizada.txt");
        String retornoUltimaLinha = arquivo.retornaUltimaLinhaArquivo();
        //System.out.println("olha aí:" + retornoUltimaLinha);
        arg = retornoUltimaLinha;
        //esperarEpreencher(driver, numGuia, arg).sendKeys(Keys.LEFT, Keys.DELETE);
        esperarEpreencher(driver, numGuia, arg);

    }


    public void acionarBotaoPesquisar() throws InterruptedException {
        esperarEclicar(driver, btnPesquisar);
    }

    public void acionarRealizacaoVinculo() throws InterruptedException {
        espera();
        esperarEclicar(driver, realizacaoVinculo);

    }

    public void selecionaCampCD(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver, campoCD);
        esperarEclicar(driver, campoCD);
        selecionarElemento(campoCD, arg1);
    }

    public void informeCampData(String arg1) throws InterruptedException {
        esperarEclicar(driver, campData);
        campData.sendKeys(Keys.ENTER);
    }

    public void informarHoraInicialFinal(String arg1, String arg2) throws InterruptedException {
        esperarEpreencher(driver, horaInicial, arg1);
        esperarEpreencher(driver, horaFinal, arg2);
    }

    public void selecionarTabela(String arg1) throws InterruptedException {
        esperarEclicar(driver, campTabela);
        selecionarElemento(campTabela, arg1);
    }

    public void selecionarCodItem(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codItem, arg1);
    }

    public void informarCampoQt(String arg1) throws InterruptedException {
        esperarEpreencher(driver, campQT, arg1);
    }

    public void selecionarFatorRed(String arg1) throws InterruptedException {
        esperarEclicar(driver, fatorRed);
        selecionarElemento(fatorRed, arg1);
    }

    public void informValorUnitario(String arg1) throws InterruptedException {
        esperarEpreencher(driver, valorUnit, arg1);
    }

    public void acionarBotaoGravar() throws InterruptedException {
        Thread.sleep(2000);
        esperarEclicar(driver, btnGravar);
        espera();
        //MetodosUteis.alterarPagina(driver, 2);
    }
}
