package pageObjects.auditoriaConcorrente;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;


import static selenium.MetodosUteis.*;

public class AdicionarBeneficiarioInternadoPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[1]/div[2]/div[1]/div[1]/button[2]")
    private WebElement btnAddBeneficiarioInternado;

    @FindBy(how = How.ID, using = "modalIncluirBeneficiarioInternado:idBeneficiario:j_idt202:idInput")
    private WebElement codbeneficiario1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[3]/table/tbody/tr/td[1]")
    private WebElement seila;

    @FindBy(how = How.ID, using = "modalIncluirBeneficiarioInternado:idBeneficiario:j_idt208:idInput")
    private WebElement codbeneficiario2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div")
    private WebElement modal;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome']/following::input[1]")
    private WebElement campNome;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[6]/div/div")
    private WebElement modalAltVisita;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/section/div/div[6]/a/div/div")
    private WebElement naoAtribuidas;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/div/div")
    private WebElement modalVisitNaoAtribuida;

    @FindBy(how = How.XPATH, using = "/html/body/div[12]/div/h3/img")
    private WebElement carregamentoBenefNovoInternado;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[7]/div/div")
    private WebElement modaAtribuirVisit;

    @FindBy(how = How.ID, using = "token-input-modalIncluirBeneficiarioInternado:compCid:codCid:codCid:idInput")
    private WebElement cid;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[7]/div/div/div[2]/div/div/div/form")
    private WebElement formAtribuirVisit;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[7]/div/div/div[2]/div/div/div/form/div[1]/span/div[2]/table/tbody/tr[1]/td/input")
    private WebElement radioUsers;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[9]/div/div/div[2]/div[2]/form/span/div[2]/div[2]/div[1]/div/input")
    private WebElement campDatInicio;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[9]/div/div/div[2]/div[2]/form/span/div[2]/div[2]/div[2]/div/input")
    private WebElement campDatFim;

    @FindBy(how = How.ID, using = "token-input-modalIncluirBeneficiarioInternado:compContratadoInclusao:idFiltroContratadoInclusaoInternado:idFiltroContratadoInclusaoInternado:idInput")
    private WebElement codigoPrestador;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div/div[2]/div/div/div/div[1]/div[8]/div[1]/div/div/input")
    private WebElement campDaInternacao;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div/div[2]/div/div/div/div[1]/div[8]/div[10]/div/table/tbody/tr/td[1]/input")
    private WebElement simGerarAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/a[1]")
    private WebElement btnCadastrar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Tipo de Auditoria']/following::select[1]")
    private WebElement tipoAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div/div[2]/div/div/div/div[1]/div[8]/div[11]/div/select/option[3]")
    private WebElement tipoAuditoria2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/form/div[2]/div/div/div[2]/div/div/div/div[1]/div[8]/div[11]/div/select")
    private WebElement combotipoAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/div/div/ul/li[6]/a")
    private WebElement menuAuditoriaConcorrente;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/div/div/ul/li[6]/ul/li[1]/a")
    private WebElement menuGstaoDeVisistas;

    @FindBy(how = How.XPATH, using = "/html/body/div[14]/div/h3")
    private WebElement processando;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[3]/table/tbody/tr[2]/td/ul/li[2]/span[2]/div/button")
    private WebElement btnAcoes;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[3]/table/tbody/tr[2]/td/ul/li[2]/span[2]/div/ul/li[3]/a")
    private WebElement btnAlterarVisita;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[9]/div/div/div[2]/div[2]/form/span/div[2]/div[1]/div/div/div[1]/ul/li/input")
    private WebElement campAuditor;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[6]/div/div/div[2]/div/form/span/div[2]/div[2]/div[1]/div/input")
    private WebElement dtInicio;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[6]/div/div/div[2]/div/form/span/div[2]/div[2]/div[2]/div/input")
    private WebElement dtFim;

    @FindBy(how = How.ID, using = "modalIncluirBeneficiarioInternado:idMessagesCadastrarBeneficiario")
    private WebElement modalMSG;

    @FindBy(how = How.ID, using = "modalAlterarVisita:idMessagesEncerrarCenso")
    private WebElement modalMSGAltVisit;

    @FindBy(how = How.XPATH, using = ".//label[text()=' Auditor']/following::input[1]")
    private WebElement auditor;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[7]/div/div/div[2]/div/div/div/form/div[2]/div/a")
    private WebElement gravar;

    @FindBy(how = How.ID, using = "idFiltroCodigoBeneficiario")
    private WebElement campCodBeneficiario;

    @FindBy(how = How.ID, using = "modalIncluirBeneficiarioInternado:idNomeBeneficiario")
    private WebElement campNomeBeneficiario;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[2]/div[2]/div[2]/div[2]/input")
    private WebElement btnPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[4]/div/div")
    private WebElement modalAuditoriaConcorrente;

    @FindBy(how = How.ID, using = "modalIncluirBeneficiarioInternado:j_idt252:idInputDataFimEnfermariaAcomodacao")
    private  WebElement dtInternacao;

    @FindBy(how = How.XPATH, using = "//*[@id='idListAuditoriaConcorrente']/tbody/tr/td[1]")
    private  WebElement expandirLista;



    public AdicionarBeneficiarioInternadoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarBotaoBeneficiarioInternado() throws InterruptedException {
        //scrollByDown(driver);
        espera();
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAddBeneficiarioInternado);
    }

    public void informarCodigoBeneficiario(String arg0, String arg1) throws InterruptedException {
        //espera();
        frameEmodalPreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, codbeneficiario1, arg0);
        frameEmodalPreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, codbeneficiario2, arg1);


    }

    public void informarCampoCodigoPrestador(String arg0) throws InterruptedException {
        //espera();
        //frameEmodal_EsperaAparecer(driver,"/html/body/table[2]/tbody/tr/td[2]/iframe", modal , codigoPrestador);
        //frameEmodal_EsperaDesaparecer(driver,"/html/body/table[2]/tbody/tr/td[2]/iframe", modal, carregamentoBenefNovoInternado);
        frameEmodalPreencher_componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, codigoPrestador, arg0);
    }

    public void infoCampDataInternacao(String arg0) throws InterruptedException {
        frameEmodalPreencher_Data(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, dtInternacao, arg0);
    }

    public void informaCampoGerarAuditoriaComoSim() throws InterruptedException {
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "//*[@id='modalIncluirBeneficiarioInternado:booleanGeraAuditora:0']");
        espera();
    }

    public void acionarBotãoCadastrar() throws InterruptedException {
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "/html/body/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/form/div/div/div[2]/div/div/a[1]");
    }

    public void selecionarUmTipoDeAuditoria(String arg0) throws InterruptedException {
        espera();
        frameEmodal_Selecionar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, tipoAuditoria, arg0);
    }

    public void campoTipoInternaçãoClinica() throws InterruptedException {
        espera();
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "/html/body/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/form/div/div/div[1]/div[8]/div[9]/div/table/tbody/tr/td[1]/input");
    }

    public void menuAuditoriaConcorrenteGestãoDeVisitas() throws InterruptedException {
        //esperarOElementoPresente(driver, menuAuditoriaConcorrente);
        //esperarAparecer(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuAuditoriaConcorrente);
        esperarEclicar(driver, menuGstaoDeVisistas);
    }

    public void selecionarUmInternadoAlterarVisita() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", seila);
        //frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAcoes);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnAlterarVisita);

    }

    public void informarUmAuditor(String arg0) throws InterruptedException {
        espera();
        frameEmodalPreencher_componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAltVisita, campAuditor, arg0);
    }

    public void informarCampoDatInicio(String arg0) throws InterruptedException {
        frameEmodalPreencher_Data(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAltVisita, campDatInicio, arg0);
    }

    public void acionarOpcaoNaoAtribuidas() throws InterruptedException {
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", naoAtribuidas);
    }

    public void selecionarBeneficiario() throws InterruptedException {
        espera();
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalVisitNaoAtribuida, "/html/body/div[1]/div[4]/div/div/div[2]/div/div/div/div/div[1]/div[5]/p/a");
    }

    public void radioButtonUsuarios() throws InterruptedException {
        espera();
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modaAtribuirVisit, "/html/body/div[1]/div[7]/div/div/div[2]/div/div/div/form/div[1]/span/div[2]/table/tbody/tr[1]/td/input", radioUsers);
    }

    public void apresentarMensagemNaModal(String arg0) throws InterruptedException {
        espera();
        frameEmodal_validaMensagem(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalVisitNaoAtribuida, modalMSG, arg0);
    }

    public void informarAuditor(String arg0) throws InterruptedException {
        espera();
        frameEmodal_EsperaEPreencheComponente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modaAtribuirVisit, ".//label[text()=' Auditor']/following::input[1]", auditor, arg0);
    }

    public void clicarNoGravar() throws InterruptedException {
        frameEmodal_Click(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modaAtribuirVisit, "/html/body/div[1]/div[7]/div/div/div[2]/div/div/div/form/div[2]/div/a", gravar);
    }

    public void apresentarMensagemNaModalDeAtribuirVisita(String arg0) throws InterruptedException {
        frameEmodal_validaMensagem(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modaAtribuirVisit, modaAtribuirVisit, arg0);
    }

    public void adicionarCID(String arg0) throws InterruptedException {
        espera();
        //frameEmodal_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, cid);
        frameEmodalPreencher_componente(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, cid, arg0);
    }

    public void acionarNaoParaAuditoria() throws InterruptedException {
        espera();
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "/html/body/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/form/div/div/div[1]/div[8]/div[10]/div/table/tbody/tr/td[2]/input");
    }

    public void informarCampoDatFim(String arg0) throws InterruptedException {
        frameEmodalPreencher_Data(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAltVisita, campDatFim, arg0);
    }

    public void botaoGravar() throws InterruptedException {
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAltVisita, "/html/body/div[1]/div[9]/div/div/div[2]/div[2]/form/span/div[2]/div[3]/div/a");
    }

    public void validarMensagemModalAlterarVisitas(String arg0) throws InterruptedException {
        frameEmodal_validaMensagem(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modalAltVisita, modalMSGAltVisit, arg0);
    }

    public void informarCampoCodBeneficiario(String arg0) throws InterruptedException {
        espera();
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campCodBeneficiario);
        frameEpreencher(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", campCodBeneficiario, arg0);
    }

    public void acionarBotaoPesquisar() throws InterruptedException {
        frameE_esperarAparecer(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnPesquisar);
        frameEclicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", btnPesquisar);
        driver.findElement(By.xpath("//html")).click();
    }

    public void acionarOpcaoCaraterAtendimentoUrgenciaEmergencia() throws InterruptedException {
        frameEmodal_Clicar(driver, "/html/body/table[2]/tbody/tr/td[2]/iframe", modal, "/html/body/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/form/div/div/div[1]/div[8]/div[3]/div/table/tbody/tr/td[2]/input");
    }

    public void aguardarTempoMath() throws InterruptedException {
        Thread.sleep(90000);
    }
}