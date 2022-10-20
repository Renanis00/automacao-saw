package pageObjects.auditoriaConcorrente;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;
import static selenium.MetodosUteis.*;
public class ParametrizacaoDeAuditoriaPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//a[text()='Auditoria Concorrente']")
    private WebElement menuAuditoriaConcorrente;

    @FindBy(how = How.XPATH, using = ".//a[text()='Formulário Padrão']")
    private WebElement menuFormePadrao;

    @FindBy(how = How.XPATH, using = ".//a[text()='Formulário Personalizado']")
    private WebElement menuFormePersonal;

    @FindBy(how = How.XPATH, using = ".//a[text()='Workflow']")
    private WebElement subMenuWorkflow;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div[2]/div/a")
    private WebElement btnNovoWorkFlow;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Ações']/following::a[2]")
    private WebElement btnNovo;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[3]/fieldset/a")
    private WebElement btnNovoPersonal;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/iframe")
    private WebElement frameLocator;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome']/following::input[1]")
    private WebElement campoNome;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[3]/div/div/div/div/input")
    private WebElement campoNomePersonal;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[3]/div/div[1]/ul/li[2]/a")
    private WebElement btnGravar;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[2]/fieldset/a[2]")
    private WebElement btnSalvar;

    @FindBy(how = How.XPATH, using = ".//a[text()='Tipos']")
    private WebElement menuTipos;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[3]/fieldset/a[2]")
    private WebElement btnNovoTipo;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div/div[2]/div/fieldset/div[2]/div/div/select")
    private WebElement configEstatica;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div/div[2]/div/fieldset/div[2]/div/div/select/option[5]")
    private WebElement configEstatica2;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div/div[2]/div/fieldset/div[3]/div/div/select")
    private WebElement configDinamica;

    @FindBy(how = How.XPATH, using = ".//a[text()='Gravar']")
    private WebElement btnParaGravar;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/div/div/ul/li[4]/ul/li/ul/li[2]/a")
    private WebElement menuUsuario;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/fieldset/div/table/tbody/tr[1]/td[4]/div/button")
    private WebElement btnAcoes;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/fieldset/div/table/tbody/tr[1]/td[4]/div/ul/li/a")
    private WebElement alterar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div/div[2]/div/div/div/div/form/div[2]/div/div[1]/ul/li/input")
    private WebElement usuario;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/input")
    private WebElement campNomeWorkFlow;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/div/input")
    private WebElement dataInicioWorkFlow;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[1]/fieldset/div[1]/div[3]/div/div/input")
    private WebElement dataFimWorkFlow;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[1]/fieldset/div[2]/div[1]/div/div[1]/label/span/span")
    private WebElement checkBoxHabilitado;

    @FindBy(how = How.XPATH, using = "")
    private WebElement checkBoxGerarAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[1]/fieldset/div[3]/div/div/textarea")
    private WebElement campDescricao;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[1]/fieldset/div[6]/div[2]/div/div/div/div/div[2]/div/div/div/input")
    private WebElement tempMaxAtendimento;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/ul/li[7]/a")
    private WebElement abaAuditires;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditor']/following::input[1]")
    private WebElement infoAuditor;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data inicial']/following::input[1]")
    private WebElement datInicioAuditoria;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data final']/following::input[1]")
    private WebElement datFimAuditoria;

    @FindBy(how = How.XPATH, using = ".//a[text()='Escala']/following::span[2]")
    private WebElement segundaFeiraCheck;

    @FindBy(how = How.XPATH, using = ".//a[text()='Escala']/following::input[2]")
    private WebElement segundaFeiraInicio;

    @FindBy(how = How.XPATH, using = ".//a[text()='Escala']/following::input[3]")
    private WebElement segundaFeiraFim;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::span[4]")
    private WebElement tercaFeiraCheck;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[5]")
    private WebElement tercaFeiraInicio;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[6]")
    private WebElement tercaFeiraFim;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::span[6]")
    private WebElement quartaFeiraCheck;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[8]")
    private WebElement quartaFeiraInicio;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[9]")
    private WebElement quartaFeiraFim;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::span[8]")
    private WebElement quintaFeiraCheck;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[11]")
    private WebElement quintaFeiraInicio;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[12]")
    private WebElement quintaFeiraFim;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::span[10]")
    private WebElement sextaFeiraCheck;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[14]")
    private WebElement sextaFeiraInicio;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[15]")
    private WebElement sextaFeiraFim;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::span[12]")
    private WebElement sabadoCheck;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[17]")
    private WebElement sabadoInicio;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[18]")
    private WebElement sabadoFim;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::span[14]")
    private WebElement domingoCheck;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[20]")
    private WebElement domingoInicio;

    @FindBy(how = How.XPATH, using = "//a[text()='Escala']/following::input[21]")
    private WebElement domingoFim;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/form/div[1]/div/div/div/div[7]/div/span/div[2]/a")
    private WebElement btnAdcionar;

    @FindBy(how = How.XPATH, using = ".//h5[text()='Escala de Auditores']/following::a[4]")
    private WebElement botaoGravar;

    @FindBy(how = How.XPATH, using = ".//a[text()='Parametrização']")
    private WebElement menuParametrizacao;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/form/div[1]/div/div/div/div[1]/fieldset/div[2]/div[2]/div/div[3]/div/div[2]/select")
    private WebElement tipAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/div/ul")
    private WebElement msg;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/fieldset[1]/div[1]/div[1]/div[1]/div/script[1]/text()")
    private WebElement aguardando;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div/div[2]/div/div/div/div/form/div[2]/div/div[1]/ul/li/input")
    private WebElement infoUsuario;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div")
    private WebElement modal;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div/div[2]/div/div/div/div/form/div[4]/div/a")
    private WebElement btnGravarUsuario;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div/div[2]/div/div/div/div/form/div[2]/div/div[3]/a")
    private WebElement opcaAdicionar;


    public ParametrizacaoDeAuditoriaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarMenuAuditoriaConcorrenteFormePadrao() throws InterruptedException {
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuParametrizacao);
        esperarEclicar(driver, menuFormePadrao);
    }

    public void acionarBtnNovo() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnNovo);
    }

    public void informaNoem(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campoNome, arg0);
    }

    public void acionarGravar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnGravar);
    }

    public void menuAuditoriaConcorrenteFormularioPersonalizado() throws InterruptedException {
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuParametrizacao);
        esperarEclicar(driver, menuFormePersonal);
    }

    public void acionarBtnNovoPessonalizado() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnNovoPersonal);
    }

    public void informaCampNoem(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campoNomePersonal, arg0);
    }

    public void salvatFormulario() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnSalvar);
    }

    public void menuAuditoriaConcorrenteTipos() throws InterruptedException {
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuParametrizacao);
        esperarEclicar(driver, menuTipos);
    }

    public void acionarBtnNovoTipoDeAuditoria() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnNovoTipo);
    }

    public void selecionarCampoConfiguracaoEstatica(String arg0) throws InterruptedException {
        frameEseleciona(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", configEstatica, arg0);
    }

    public void selecionarCampoConfiguracaoDinamica(String arg0) throws InterruptedException {
        frameEseleciona(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", configDinamica, arg0);
    }

    public void acionarBtnGravar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnParaGravar);
    }

    public void menuAuditoriaConcorrenteUsuário() throws InterruptedException {
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuParametrizacao);
        esperarEclicar(driver, menuUsuario);
    }

    public void selecionarAlterar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        espera();
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/iframe"));
        driver.switchTo().frame(frame);
        esperarEclicar(driver, alterar);
        driver.switchTo().defaultContent();
    }

    public void informarUsuario(String arg0) throws InterruptedException {
        espera();
        frameEmodalPreencher_componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, infoUsuario, arg0);
    }

    public void acionarAdicionar() throws InterruptedException {
        espera();
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "/html/body/div[1]/form/div[4]/div/div/div[2]/div/div/div/div/form/div[2]/div/div[3]/a");
    }

    public void acionarBtnGravarUsuario() throws InterruptedException {
        espera();
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "/html/body/div[1]/form/div[4]/div/div/div[2]/div/div/div/div/form/div[4]/div/a");
    }

    public void menuAuditoriaConcorrenteWorkflow() throws InterruptedException {
        espera();
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuParametrizacao);
        esperarEclicar(driver, subMenuWorkflow);
    }

    public void acionarOpcaoNovo() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnNovoWorkFlow);
    }

    public void informarCampoNomeDoWorkflow(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campNomeWorkFlow, arg0);
    }

    public void informarDataInicio(String arg0) throws InterruptedException {
        frameEpreencherData(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", dataInicioWorkFlow, arg0);
    }

    public void informarDataFim(String arg0) throws InterruptedException {
        frameEpreencherData(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", dataFimWorkFlow, arg0);
    }

    public void checkBoxHabilitado() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", checkBoxHabilitado);
    }

    public void checkBoxGerarAuditoria() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", checkBoxGerarAuditoria);
    }

    public void informarCampoDescricao(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campDescricao, arg0);
    }

    public void tempoMaximoDeAtendimento(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tempMaxAtendimento, arg0);
    }

    public void acionarAbaAuditores() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", abaAuditires);

    }

    public void informCampAuditor(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", infoAuditor, arg0);
    }

    public void informarDataInicioAuditoria(String arg0) throws InterruptedException {
        espera();
        frameEpreencherData(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", datInicioAuditoria, arg0);
    }

    public void infoCampoAuditorComo(String arg0) throws InterruptedException {
        frameEpreencher_Componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", infoAuditor, arg0);
    }

    public void informarDataFimAuditoria(String arg0) throws InterruptedException {
        frameEpreencherData(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", datFimAuditoria, arg0);
    }

    public void marcarEscalaSegundaFeiraComo(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", segundaFeiraCheck);
        espera();
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", segundaFeiraInicio, arg0);
        espera();
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", segundaFeiraFim, arg1);

    }

    public void marcarEscalaTerçaFeiraComo(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tercaFeiraCheck);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tercaFeiraInicio, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tercaFeiraFim, arg1);
    }

    public void marcarEscalaQuartaFeira(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", quartaFeiraCheck);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", quartaFeiraInicio, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", quartaFeiraFim, arg1);
    }


    public void marcarEscalaQuintaFeira(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", quintaFeiraCheck);
        espera();
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", quintaFeiraInicio, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", quintaFeiraFim, arg1);
    }

    public void marcarEscalaSextaFeira(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sextaFeiraCheck);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sextaFeiraInicio, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sextaFeiraFim, arg1);
    }

    public void marcarEscalaSabado(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sabadoCheck);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sabadoInicio, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", sabadoFim, arg1);
    }

    public void marcarEscalaDomingo(String arg0, String arg1) throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", domingoCheck);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", domingoInicio, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", domingoFim, arg1);
    }

    public void acionarBtnAdicionar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAdcionar);
    }

    public void acionarBotaoGravar() throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", botaoGravar);
    }

    public void infoTipoAuditoria(String arg0) throws InterruptedException {
        frameEseleciona(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", tipAuditoria, arg0);
    }

    public void validaMsgSistema(String arg0) throws InterruptedException {
        frameEvalidaMensagem(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", msg, arg0);
    }

}
