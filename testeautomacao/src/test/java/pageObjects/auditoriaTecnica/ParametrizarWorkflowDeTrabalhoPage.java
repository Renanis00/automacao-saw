package pageObjects.auditoriaTecnica;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.MetodosUteis;
//import selenium.MetodosUteis.*;
import selenium.Wait;

public class ParametrizarWorkflowDeTrabalhoPage {
    private WebDriver driver;
    int timeOut = 90;
    MetodosUteis metodosUteis = new MetodosUteis();


    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Técnica']")
    private WebElement menuAuditTecnica;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Técnica']/following::a[5]")
    private WebElement menuWorkflow;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Opções']/following::a[1]")
    private WebElement novoWorkflow;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome']/following::input[1]")
    private WebElement nome;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome']/following::a[1]")
    private WebElement btnGravar;

    @FindBy(how = How.XPATH, using = ".//font[text()='Listagem de Workflow de Trabalho']")
    private WebElement voltar;

    @FindBy(how = How.XPATH, using = ".//td[text()='Workflow da Auditoria Técnica 02']/following::td[text()='adm33']/following::img[1]")
    private WebElement editar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome']/following::a[1]")
    private WebElement btnNovaEtapa;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome da Etapa']/following::input[1]")
    private WebElement campNome;

    @FindBy(how = How.XPATH, using = ".//label[text()='Grupo de Usuários']/following::select[1]")
    private WebElement campGrup;

    @FindBy(how = How.XPATH, using = ".//label[text()='Prazo (Dias)']/following::input[1]")
    private WebElement prazoDias;

    @FindBy(how = How.XPATH, using = ".//label[text()='Ação Automática']/following::select[1]")
    private WebElement acaoAutomatica;

    @FindBy(how = How.XPATH, using = ".//label[text()='Ação Automática']/following::a[1]")
    private WebElement btnDeGravar;


    public ParametrizarWorkflowDeTrabalhoPage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarMenuAuditTecnicaWorkflowDeTrabalho() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, menuAuditTecnica);
        metodosUteis.esperarEclicar(driver, menuWorkflow);
    }

    public void novoWorkflow() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, novoWorkflow);
    }

    public void informarNome(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, nome, arg1);
    }

    public void acionarBtnGravar() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, btnGravar);
        // metodosUteis.esperarEclicar(driver, voltar);

    }

    public void acionarOpcaoEditar() throws InterruptedException {
        metodosUteis.espera();
        metodosUteis.esperarEclicar(driver, editar);
    }

    public void acionaBotaoNovaEtqapa() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, btnNovaEtapa);
    }

    public void informarNomeDaEtapa(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, campNome, arg1);
    }

    public void selecionarCampoGrupoUsuario(String arg1) throws InterruptedException {
        metodosUteis.selecionarElemento(campGrup, arg1);
    }

    public void informPrazoDias(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, prazoDias, arg1);
    }

    public void selecionarAcaoAutomatica(String arg1) throws InterruptedException {
        metodosUteis.selecionarElemento(acaoAutomatica, arg1);
    }

    public void acionarBotaoGravar() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, btnDeGravar);
    }
}
