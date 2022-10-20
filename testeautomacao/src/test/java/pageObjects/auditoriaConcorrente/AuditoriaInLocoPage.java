package pageObjects.auditoriaConcorrente;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Wait;
import static selenium.MetodosUteis.*;
import static selenium.MetodosUteis.frameEmodal_Click;

public class AuditoriaInLocoPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//a[text()='Auditar']")
    private WebElement menuauditar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Internados']")
    private WebElement menuInternados;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form[1]/div[2]/div[2]/fieldset/div/table/tbody/tr/td[11]/div/button")
    private WebElement btnAcoes;

    @FindBy(how = How.ID, using = "btnAbrirPesquisaBeneficiario")
    private WebElement maisFiltroInternados;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[3]/table/tbody/tr/td[1]")
    private WebElement seila;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form[1]/div[2]/div[2]/fieldset/div/table/tbody/tr/td[11]/div/ul/li[1]/a")
    private WebElement btnVisualizarVisita;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[7]/div/div/div[1]")
    private WebElement acoes;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[7]/div/div/div[1]/ul")
    private WebElement parecer;

    @FindBy(how = How.XPATH, using = ".//button[text()='Ações ']/following::a[1]")
    private WebElement visualizar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Status']/following::select[1]")
    private WebElement status;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form[1]/div[2]/div[1]/div/fieldset[1]/div/div[6]/button")
    private WebElement btnPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[5]/a[2]")
    private WebElement btnImprimir;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[5]/a[3]")
    private WebElement btnVisitas;

    @FindBy(how = How.XPATH, using = "")
    private WebElement btnIniciar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Código da operadora']/following::input[1]")
    private WebElement codOp;

    @FindBy(how = How.XPATH, using = ".//label[text()='Código do beneficiário']/following::input[1]")
    private WebElement codBenef;

    @FindBy(how = How.XPATH, using = "//a[@onclick='encaminharParaOutroAuditor()']")
    private WebElement encaminhar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div")
    private WebElement modal;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[15]/div/div")
    private WebElement modalOutroAud;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div")
    private WebElement modalSolicitParecer;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div/div[2]/div/form/span/div[1]/div[2]/table/tbody/tr/td[1]/input")
    private WebElement radioUsers;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div/div[2]/div/form/span/div[1]/div[3]/div/div/div[1]/ul/li/input")
    private WebElement campUsuario;

    @FindBy(how = How.XPATH, using = ".//label[text()='Tipo de Auditor']/following::a[6]")
    private WebElement btnSolicitar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/span[3]/a/img")
    private WebElement btnSair;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[7]/div/div/div[4]/div/div/div[3]/div/div/textarea")
    private WebElement campDescricao;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[7]/div/div/div[4]/div/div/div[4]/div/a[2]")
    private WebElement btnFinalizar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[1]/div[2]/button[2]")
    private WebElement pesquisarVisitas;

    @FindBy(how = How.XPATH, using = "//a[@onclick='abrirModalFrequenciasVisita()']")
    private WebElement btnFrequenciaVisitas;

    @FindBy(how = How.XPATH, using = "//a[@onclick='encerrarEncaminhar()']")
    private WebElement btnEncaminhar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[17]/div/div")
    private WebElement modalFrequenciVisit;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria de Longa Permanência']/following::input[1]")
    private WebElement campFreqDeVisit;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[18]/div/div/div[2]/div/form/div[2]/div/a")
    private WebElement btnSalvar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[17]/div/div")
    private WebElement modalEncerrarEncaminhar;

    @FindBy(how = How.ID, using = "modalEncaminharOutroAuditor:inputTipoAuditor:0")
    private WebElement radioUser;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[1]/div[3]/div/div/span/div[1]/ul/li/input")
    private WebElement campUser;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[1]/div[5]/div/div/select")
    private WebElement comboTipoAudit;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[1]/div[6]/div/div/div/input")
    private WebElement dtAgendamento;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[2]/div/a[1]")
    private WebElement btnAgendar;

    @FindBy(how = How.XPATH, using = "//label[text()='PATOLOGIA']/following::input[1]")
    private WebElement campPatologia;

    @FindBy(how = How.XPATH, using = "//label[text()='DIAGNÓSTICO DO INTERNAMENTO']/following::input[1]")
    private WebElement campDiagnosticoInternado;

    @FindBy(how = How.XPATH, using = "//label[text()='EVOLUÇÃO CLÍNICA']/following::textarea[1]")
    private WebElement evolucaoClinica;

    @FindBy(how = How.XPATH, using = "//label[text()='PARECER ENFERMAGEM']/following::textarea[1]")
    private WebElement parecerEnfermagem;

    @FindBy(how = How.XPATH, using = "//label[text()='PARECER MÉDICO']/following::textarea[1]")
    private WebElement parecerMedico;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[1]")
    private WebElement DRG;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[2]")
    private WebElement PROGRAMAS;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[3]")
    private WebElement RELACIONAMENTO_COM_A_REDE;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[4]")
    private WebElement RELACIONAMENTO_COM_O_COOPERADO;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[5]")
    private WebElement SAC_PRESTADORES;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[6]")
    private WebElement SERVICO_SOCIAL;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[7]")
    private WebElement ANALISES_MEDICAS_E_LIBERACOES;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[8]")
    private WebElement ASSESSORIA_JURIDICA;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[9]")
    private WebElement ATENCAO_DOMICILIAR;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[10]")
    private WebElement AUDITORIA_EM_SAUDE_MEDICO_AUDITOR;

    @FindBy(how = How.XPATH, using = ".//label[text()='SETOR RESPONSÁVEL']/following::input[11]")
    private WebElement CENTRO_DE_QUALIDADE_DE_VIDA;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[7]/div/div/div[5]/div/div[2]/div[2]/div/div/textarea")
    private WebElement retornoSetor;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[5]/a[11]")
    private WebElement encerrar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div/span")
    private WebElement msg;

    @FindBy(how = How.XPATH, using = "//a[@onclick='preencherAlta()']")
    private WebElement alta;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[15]/div/div/div[2]/div/div/div/form/div[2]/div[1]/div/div/textarea")
    private WebElement descricao;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[15]/div/div/div[2]/div/div/div/form/div[2]/div[2]/div[1]/div/div/input")
    private WebElement campData;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[15]/div/div")
    private WebElement modalAlta;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[15]/div/div/div[2]/div/div/div/form/div[2]/div[2]/div[2]/div/select")
    private WebElement tipoAlta;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[15]/div/div/div[2]/div/div/div/form/div[3]/div/a")
    private WebElement btnAlta;

    @FindBy(how = How.XPATH, using = "//a[@onclick=\"jsf.util.chain(this,event,'mostrarDivAguarde()','mojarra.ab(this,event,\\'action\\',\\'@form\\',\\'@form\\',{\\'onevent\\':function(data) { mostrarDivAguardeAjax(data)}})');return false\"]")
    private WebElement btnAtualizar;

    public AuditoriaInLocoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void menuAuditarInternados() throws InterruptedException {
        espera();
        esperarEclicar(driver, menuauditar);
        esperarEclicar(driver, menuInternados);
    }

    public void selecionaInternado() throws InterruptedException {
        espera();
        //frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnVisualizarVisita);
    }

    public void selecionaStatus(String arg0) throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", maisFiltroInternados);
        frameEseleciona(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", status, arg0);
    }

    public void pesquisar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnPesquisar);
    }

    public void acionarBtnImprimir() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnImprimir);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnImprimir);
    }

    public void botaoVisitas() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnVisitas);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnVisitas);
    }

    public void acionarOpcaoIniciar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnIniciar);
    }

    public void informaCodOpEcodBeneficiario(String arg0, String arg1) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codOp, arg0);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", codBenef, arg1);
    }

    public void acionarEncaminhar() throws InterruptedException {
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", encaminhar);
    }

    public void acionarRadioUsuario() throws InterruptedException {
        espera();
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalOutroAud, "/html/body/div[1]/div[7]/div/div/div[2]/div/div/div/form/div[1]/span/div[2]/table/tbody/tr[1]/td/input", radioUsers);

    }

    public void acionarSolicitarParecer() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", acoes);
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", acoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", parecer);
    }

    public void marcarCheckUsuario() throws InterruptedException {
        frameEmodal_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalSolicitParecer, radioUsers);
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalSolicitParecer, "/html/body/div[1]/div[20]/div/div/div[2]/div/form/span/div[1]/div[2]/table/tbody/tr/td[1]/input", radioUsers);
    }

    public void informUsuario(String arg0) throws InterruptedException {
        frameEmodalPreencher_componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalSolicitParecer, campUsuario, arg0);
    }

    public void acionarBotaoSolicitar() throws InterruptedException {
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalSolicitParecer, ".//label[text()='Tipo de Auditor']/following::a[6]", btnSolicitar);

    }

    public void informarCampoDescricao(String arg0) throws InterruptedException {
        Thread.sleep(10000);
        scrollByDown(driver);
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campDescricao);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campDescricao, arg0);
    }

    public void acionarFinalizar() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnFinalizar);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnFinalizar);
    }

    public void filtrarPesquisa() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", pesquisarVisitas);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", pesquisarVisitas);
    }

    public void acionarBtnSair() throws InterruptedException {
        esperarEclicar(driver, btnSair);
        driver.switchTo().alert().accept();
    }

    public void acionarBotãoFrequeciaDeVisitas() throws InterruptedException {
        espera();
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnFrequenciaVisitas);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnFrequenciaVisitas);
    }

    public void informarmeCampFrequenciaDaVisita(String arg0) throws InterruptedException {
        frameEmodalPreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalFrequenciVisit, campFreqDeVisit, arg0);
    }

    public void acionarSalvar() throws InterruptedException {
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalFrequenciVisit, "/html/body/div[1]/div[18]/div/div/div[2]/div/form/div[2]/div/a", btnSalvar);
    }

    public void acionarBotaoEncaminhar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnEncaminhar);

    }

    public void acionarTipoDeAuditorUsuario() throws InterruptedException {
        try {
            frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalEncerrarEncaminhar, "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[1]/div[2]/table/tbody/tr[1]/td/input", radioUser);
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalEncerrarEncaminhar, "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[1]/div[2]/table/tbody/tr[1]/td/input", radioUser);
        }

    }

    public void informeUsuario(String arg0) throws InterruptedException {
        frameEmodalPreencher_componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalEncerrarEncaminhar, campUser, arg0);
    }

    public void selecionaTipoAuditoria(String arg0) throws InterruptedException {
        frameEmodal_Selecionar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalEncerrarEncaminhar, comboTipoAudit, arg0);
    }

    public void informeData(String arg0) throws InterruptedException {
        frameEmodalPreencher_Data(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalEncerrarEncaminhar, dtAgendamento, arg0);
    }

    public void acionarBotaoAgendar() throws UnhandledAlertException, InterruptedException {
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalEncerrarEncaminhar, "/html/body/div[1]/div[20]/div/div/div[2]/div[2]/form/span/div[2]/div/a[1]", btnAgendar);

    }

    public void campoPatologia(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campPatologia, arg0);
    }

    public void diagnosticoDoInternado(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campDiagnosticoInternado, arg0);
    }

    public void campoEvolucaoClinica(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", evolucaoClinica, arg0);
    }

    public void campoParecerEnfermagem(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", parecerEnfermagem, arg0);
    }

    public void campoParecerMedico(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", parecerMedico, arg0);
    }

    public void marcarTodosOsCheckBox() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", DRG);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", PROGRAMAS);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", RELACIONAMENTO_COM_A_REDE);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", RELACIONAMENTO_COM_O_COOPERADO);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", SAC_PRESTADORES);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", SERVICO_SOCIAL);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", ANALISES_MEDICAS_E_LIBERACOES);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", ASSESSORIA_JURIDICA);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", ATENCAO_DOMICILIAR);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", AUDITORIA_EM_SAUDE_MEDICO_AUDITOR);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", CENTRO_DE_QUALIDADE_DE_VIDA);

    }

    public void campoRetornoSetor(String arg0) throws InterruptedException {
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", retornoSetor, arg0);
    }

    public void acionarEncerrar() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", encerrar);
    }

    public void validaMensagem(String arg0) throws InterruptedException {
        frameEvalidaMensagem(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", msg, arg0);
        frame_EsperaDesaparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", msg);
    }

    public void acionarBotaoAlta() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", alta);
    }

    public void informeCampDescricao(String arg0) throws InterruptedException {
        frameEmodalPreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAlta, descricao, arg0);
    }

    public void informCampoData(String arg0) throws InterruptedException {
        frameEmodalPreencher_Data(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAlta, campData, arg0);
    }

    public void campoTipoDeAlta(String arg0) throws InterruptedException {
        espera();
        frameEmodal_Selecionar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAlta, tipoAlta, arg0);
    }

    public void confirmaAlta() throws InterruptedException {
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAlta, "/html/body/div[1]/div[15]/div/div/div[2]/div/div/div/form/div[3]/div/a", btnAlta);


    }

    public void acionarAtualizar() throws InterruptedException {
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAlta, "/html/body/div[1]/div[15]/div/div/div[2]/div/div/div/form/div[3]/div/a", btnAtualizar);
    }
}
