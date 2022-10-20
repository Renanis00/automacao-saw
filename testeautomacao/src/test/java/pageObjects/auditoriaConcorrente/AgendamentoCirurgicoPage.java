package pageObjects.auditoriaConcorrente;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;
import static selenium.MetodosUteis.*;
import static selenium.MetodosUteis.frameEpreencher_Componente;

public class AgendamentoCirurgicoPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Concorrente']")
    private WebElement menuAuditoriaConcorrente;

    @FindBy(how = How.XPATH, using = ".//label[text()='Internações']")
    private WebElement menuInternacoes;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[1]/div[2]/div[1]/div[1]/button[2]")
    private WebElement btnAddBeneficiarioInternado;

    @FindBy(how = How.XPATH, using = ".//a[text()='Mapa Cirúrgico']")
    private WebElement menuMapaCirurcico;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome']/following::a[1]")
    private WebElement brnPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[1]/div[2]/div[1]/div[1]/button[3]")
    private WebElement agendamentoCirurgico;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[2]/div[1]/div[1]/fieldset/div/div[1]/div[1]/div/ul/li/input")
    private WebElement codPrest;

    @FindBy(how = How.XPATH, using = ".//label[text()='Sala']/following::input[1]")
    private WebElement sala;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data Cirurgia']/following::input[1]")
    private WebElement data;

    @FindBy(how = How.XPATH, using = ".//label[text()='Local de Atendimento']/following::input[1]")
    private WebElement localAtendimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='Número Guia Prestador']/following::input[1]")
    private WebElement numeroGuiaPrestador;

    @FindBy(how = How.XPATH, using = ".//label[text()='Centro Cirúrgico']/following::input[1]")
    private WebElement campoCentroCirúrgico;

    @FindBy(how = How.XPATH, using = ".//label[text()='Código Beneficiário *']/following::input[1]")
    private WebElement codOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='Código Beneficiário *']/following::input[2]")
    private WebElement codigoBeneficiario;

    @FindBy(how = How.XPATH, using = ".//label[text()='Prestador Atividade']/following::input[1]")
    private WebElement campoPrestadorAtividade;

    @FindBy(how = How.XPATH, using = ".//label[text()='Tabela']/following::select[1]")
    private WebElement tabela;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Agendamento Cirúrgico']/following::a[1]")
    private WebElement btnGravar;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Cirurgia/Procedimento']/following::input[1]")
    private WebElement campoCodigo;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/fieldset[2]/div/table/tbody/tr[1]/td[8]/div")
    private WebElement btnAcoes;

    @FindBy(how = How.XPATH, using = ".//a[text()=' Detalhar']")
    private WebElement btnDetalhar;

    @FindBy(how = How.XPATH, using = ".//a[text()='Auditoria de Longa Permanência']")
    private WebElement navAudLp;

    @FindBy(how = How.XPATH, using = ".//a[text()='Auditoria de UTI']")
    private WebElement navAudUti;


    @FindBy(how = How.XPATH, using = "//*[@id=\"token-input-compContratado:idFiltroContratado:idFiltroContratado:idInput\"]")
    private WebElement codPrestador;

    public AgendamentoCirurgicoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void menuAuditoriaConcorrenteInternacoes() throws InterruptedException {
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuInternacoes);
        frameE_esperarAparecer(driver,"/html/body/table[2]/tbody/tr/td[2]/iframe", btnAddBeneficiarioInternado);

    }

    public void acionarAgendamentoCirurgico() throws InterruptedException {
        scrollByDown(driver);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", agendamentoCirurgico);
    }

    public void codigoPrestador(String arg0) throws InterruptedException {
        //espera();
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codPrest);
        frameEpreencher_Componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codPrest, arg0);
    }

    public void informeSala(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sala, arg0);
    }

    public void informarCampoData(String arg0) throws InterruptedException {
        frameEpreencherData(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", data, arg0);
    }

    public void informarCampoLocalDeAtendimento(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", localAtendimento, arg0);
    }

    public void informarCampoNúmeroGuiaPrestador(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", numeroGuiaPrestador, arg0);
    }

    public void informarCampoCentroCirúrgico(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campoCentroCirúrgico, arg0);
    }

    public void informarCampoCodigoBeneficiário(String arg0, String arg1) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codOperadora, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codigoBeneficiario, arg1);
    }

    public void informarCampoPrestadorAtividade(String arg0) throws InterruptedException {
        frameEpreencher_Componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campoPrestadorAtividade, arg0);
    }

    public void selecionarTabelaComo(String arg0) throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tabela);
        //espera();
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tabela);
        frameEseleciona(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tabela, arg0);
    }

    public void acionarGravar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnGravar);
    }

    public void informarCampoCodigo(String arg0) throws InterruptedException {
        frameEpreencher_Componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campoCodigo, arg0);
    }

    public void menuAuditoriaConcorrenteMapaCirurgico() throws InterruptedException {
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuMapaCirurcico);
    }

    public void acionarPesquisar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", brnPesquisar);
    }

    public void acoesDetalhar() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnDetalhar);
    }

    public void informCampPrestador(String arg0) throws InterruptedException {
        //espera();
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codPrestador);
        frameEpreencher_Componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codPrestador, arg0);
    }

    public void acessarFormLp() throws InterruptedException{

        navAudLp.click();

    }
}