package pageObjects.guias;

import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;
import util.GravaArquivo;

import java.io.File;

import static selenium.MetodosUteis.*;

public class GuiaDeSP_SADTPage {
    private WebDriver driver;
    int timeOut = 90;

    @FindBy(how = How.XPATH, using = ".//label[text()='8-Número da Carteira']/following::input[2]")
    private WebElement codBeneficiario;

    // @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[27]/input[1]")
    //  private WebElement codNaOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='13-Código na Operadora']/following::input[1]")
    private WebElement codNaOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='13-Código na Operadora']/following::input[5]")
    private WebElement codNaOperadoraII;

    @FindBy(how = How.XPATH, using = ".//label[text()='29-Cód. na Operadora']/following::select[1]")
    private WebElement codigoNaOperadora;

    //  @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[30]/input[1]")
    // private WebElement nomeDoProfissionalExecutante;

    @FindBy(how = How.XPATH, using = ".//label[text()='15-Nome do Profissional Solicitante']/following::input[1]")
    private WebElement nomeDoProfissionalExecutante;

    @FindBy(how = How.XPATH, using = "//img[@src='/saw/images/aguarde.gif']")
    private WebElement load;

    @FindBy(how = How.XPATH, using = ".//label[text()='23-Observação/justificativa']/following::textarea[1]")
    private WebElement campOBS2;

    @FindBy(how = How.XPATH, using = ".//span[text()='Digite a Mensagem Livre:']/following::textarea[1]")
    private WebElement mensagem;

    @FindBy(how = How.XPATH, using = ".//select[text()='Mensagens Disponíveis']/following::option[1]")
    private WebElement mensagemNegaAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/input")
    private WebElement transfereMensagemAuditoria;

    @FindBy(how = How.XPATH, using = ".//span[text()='Digite a Mensagem Livre:']/following::input[1]")
    private WebElement confirma;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/fieldset/div[1]/div[1]/a")
    private WebElement btnGravar;




    /* load .. aguarde..

    /html/body/div/form/div[2]/table/tbody/tr/td/img

    //img[@src='/saw/images/aguarde.gif']

*/
    //   @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[37]/div[1]/select")
    //   private WebElement caraterAtendimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='21-Caráter do Atendimento']/following::select[1]")
    private WebElement caraterAtendimento;

    // @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[38]/table/tbody/tr[2]/td[1]/select")
    //  private WebElement tabela;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[1]")
    private WebElement tabela;

    @FindBy(how = How.XPATH, using = ".//label[text()='29-Cód. na Operadora']/following::select[1]")
    private WebElement codExecutante;

    @FindBy(how = How.XPATH, using = ".//label[text()='29-Cód. na Operadora']/following::input[1]")
    private WebElement codExecutanteInput;

    @FindBy(how = How.XPATH, using = ".//label[text()='13-Código na Operadora']/following::input[1]")
    private WebElement codSolicitante;

    @FindBy(how = How.XPATH, using = ".//label[text()='29-Cód. na Operadora']/following::select[1]")
    private WebElement codOperadoraSelect;

    @FindBy(how = How.XPATH, using = ".//option[text()='57936 -- ANDRE RIBEIRO ARAUJO DE MENEZES']")
    private WebElement pessoaFisica;

    @FindBy(how = How.XPATH, using = ".//label[text()='25-Código Do Procedimento']/following::input[2]")
    private WebElement codPrecedimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='25-Código Do Procedimento']/following::input[4]")
    private WebElement descPrecedimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='27-Qt. Solic.']/following::input[5]")
    private WebElement qtdPrecedimento;

    //@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[40]/div[3]/select")
    // private WebElement campoTipoDeAtendimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='32-Tipo Atendimento']/following::select[1]")
    private WebElement campoTipoDeAtendimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='33-Indicação de Acidente (Acidente ou doença relacionada)']/following::select[1]")
    private WebElement campoIndicaçãoDeAcidente;

    @FindBy(how = How.XPATH, using = ".//label[text()='23-Indicação Clínica']/following::input[1]")
    private WebElement indicacaoClinica;

    // @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[40]/div[1]/div[1]/a/img")
    // private WebElement iconeCodOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='29-Cód. na Operadora']/following::img[1]")
    private WebElement iconeCodOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='4-Número da Carteira']/following::input[2]")
    private WebElement numCarteira;

    @FindBy(how = How.XPATH, using = ".//label[text()='9-Código na Operadora/CNPJ/CPF']/following::input[1]")
    private WebElement codOperadora2;

    @FindBy(how = How.XPATH, using = ".//label[text()='12-Nome do Profissional Executante']/following::input[1]")
    private WebElement profExecut;

    @FindBy(how = How.XPATH, using = ".//label[text()='17- Indicação de Acidente (acidente ou doença relacionada)']/following::select[1]")
    private WebElement campIndcAcidente;

    @FindBy(how = How.XPATH, using = ".//label[text()='20- Tabela']/following::select[1]")
    private WebElement campTabela;

    @FindBy(how = How.XPATH, using = "//label[text()='19- Tipo de Consulta']/following::select[1]")
    private WebElement tipConslt;

    @FindBy(how = How.XPATH, using = ".//font[text()='Arquivo 1:']/following::input[1]")
    private WebElement btnSelecionaArquivo;

    // @FindBy(how = How.XPATH, using = ".//span[text()='Incluir']")
    // private WebElement btnIncluir;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[6]/td/input[1]")
    private WebElement btnIncluir;

    @FindBy(how = How.XPATH, using = ".//font[text()='Arquivo 5:']/following::span[1]")
    private WebElement btnIncluir2;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[7]/td/input[2]")
    private WebElement btnFechar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/fieldset/div[1]/div[3]/a/img")
    private WebElement btnCancelar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[8]/table/tbody/tr/td/textarea")
    private WebElement motivo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[8]/table/tbody/tr/td/input")
    private WebElement btnConfirmar;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[21]/div[39]/div[7]/span/a")
    private WebElement mostrarDados;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[21]/div[39]/div[8]/div[4]/div[1]/textarea")
    private WebElement obsCamp;

    @FindBy(how = How.XPATH, using = ".//label[text()='Pedir Revisão']")
    private WebElement btnPedirRewvisao;

    @FindBy(how = How.XPATH, using = ".//span[text()='Digite a Mensagem Livre:']/following::textarea[1]")
    private WebElement campMensagem;

    @FindBy(how = How.XPATH, using = ".//span[text()='Digite a Mensagem Livre:']/following::input[1]")
    private WebElement btnConfMensagem;

    @FindBy(how = How.ID, using = "manterTISSSPSADT30DTO.tissSolicitacaoDeSPSADTDTO.profissionalSolicitante.cbos")
    private WebElement campoCBOs;

    @FindBy(how = How.XPATH, using = ".//label[text()='Email']/following::input[1]")
    private WebElement email;

    @FindBy(how = How.XPATH, using = ".//label[text()='Celular']/following::select[1]")
    private WebElement campoDDD;

    @FindBy(how = How.XPATH, using = ".//label[text()='Celular']/following::input[1]")
    private WebElement campoTel;

    @FindBy(how = How.XPATH, using = ".//label[text()='Celular ']/following::select[1]")
    private WebElement campoDDD2;

    @FindBy(how = How.XPATH, using = ".//label[text()='Celular ']/following::input[1]")
    private WebElement campoTel2;

    @FindBy(how = How.XPATH, using = " .//td[5]/following::label[text()='Status']/following::img[1]")
    private WebElement btnProcedimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data']/following::input[1]")
    private WebElement campData;

    @FindBy(how = How.XPATH, using = ".//label[text()='Hora Inicial/ Final']/following::input[1]")
    private WebElement horaInicio;

    @FindBy(how = How.XPATH, using = ".//label[text()='Hora Inicial/ Final']/following::input[2]")
    private WebElement horaFim;

    @FindBy(how = How.XPATH, using = ".//label[text()='Quantidade realizada(s)']/following::input[1]")
    private WebElement qtdRealizada;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[12]/td/input[1]")
    private WebElement btnExecutar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[20]/div[40]/div[3]/select")
    private WebElement tipAtendimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tipo de Consulta']/following::select[1]")
    private WebElement tipConsult;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[2]")
    private WebElement tabelaMatI;

    @FindBy(how = How.XPATH, using = ".//label[text()='25-Código Do Procedimento']/following::select[2]/following::input[2]")
    private WebElement codMatI;

    @FindBy(how = How.XPATH, using = ".//label[text()='25-Código Do Procedimento']/following::select[2]/following::input[5]")
    private WebElement qtdMatI;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[3]")
    private WebElement tabelaMatII;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[3]/following::input[2]")
    private WebElement codMatII;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[3]/following::input[5]")
    private WebElement qtdMatII;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[4]")
    private WebElement tabelaMedI;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[4]/following::input[2]")
    private WebElement codMedI;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[4]/following::input[5]")
    private WebElement qtdMedI;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[5]")
    private WebElement tabelaMedII;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[5]/following::input[2]")
    private WebElement codMedII;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[5]/following::input[5]")
    private WebElement qtdMedII;

    @FindBy(how = How.XPATH, using = ".//label[text()='Realizar']")
    private WebElement btnRealizar;

    @FindBy(how = How.XPATH, using = "/html/body/form/table[1]/tbody/tr[2]/td[2]/input")
    private WebElement data;

    @FindBy(how = How.XPATH, using = ".//label[text()='Hora Inicial/ Final']/following::input[1]")
    private WebElement hsInicio;

    @FindBy(how = How.XPATH, using = ".//label[text()='Hora Inicial/ Final']/following::input[2]")
    private WebElement hsFim;

    @FindBy(how = How.XPATH, using = ".//label[text()='Realizar']/following::img[1]")
    private WebElement marcaTodos;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[2]/input[1]")
    private WebElement btnExec;

    @FindBy(how = How.XPATH, using = "//input[@onclick='adicionarProcedimentoSolicitado()']")
    private WebElement opcaoAdicionar;

    //@FindBy(how = How.XPATH, using = ".//label[text()='25-Código Do Procedimento']/following::input[197]")
    // private WebElement codTaxas;

    @FindBy(how = How.XPATH, using = "//select[@name='procedimentosSolicitados[5].tipoTabela'] /following::input[2]")
    private WebElement codTaxas;

    // @FindBy(how = How.XPATH, using = ".//label[text()='25-Código Do Procedimento']/following::input[200]")
    // private WebElement qtdTaxas;

    @FindBy(how = How.XPATH, using = "//select[@name='procedimentosSolicitados[5].tipoTabela'] /following::input[5]")
    private WebElement qtdTaxas;

    @FindBy(how = How.XPATH, using = ".//label[text()='Anexar Laudos']")
    private WebElement anexarLaudos;

    @FindBy(how = How.XPATH, using = ".//font[text()='Arquivo 1:']/following::input[1]")
    private WebElement anexarArquivo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/table[5]/tbody/tr/td/input")
    private WebElement anexar1;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/button[1]")
    private WebElement btIncluir;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/span[3]/a/img")
    private WebElement sair;

    //@FindBy(how = How.XPATH, using = ".//a[text()='Auditar']")
    //private WebElement menuAuditar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditar']")
     private WebElement menuAuditar;

    //@FindBy(how = How.XPATH, using = ".//a[text()='Solicitações']")
    //private WebElement subMenuSolicitacoes;

    @FindBy(how = How.XPATH, using = ".//label[text()='Solicitações']")
    private WebElement subMenuSolicitacoes;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[6]/input[3]")
    private WebElement campGuia;

    @FindBy(how = How.ID, using = "btnPesquisar")
    private WebElement pesquisar;

    @FindBy(how = How.XPATH, using = " //img[@onclick='mudarFundoDeGrid(event);']/following::img[1]")
    private WebElement detalhar;

    @FindBy(how = How.XPATH, using = ".//b[text()='Clique aqui para verificar a auditoria!']")
    private WebElement verificarAuditoria;

    @FindBy(how = How.XPATH, using = ".//strong[text()='Atender']")
    private WebElement iniciarArend;

    @FindBy(how = How.XPATH, using = ".//a[text()='Autorizar Todos']")
    private WebElement autorizaTodos;

    @FindBy(how = How.XPATH, using = ".//a[text()='Negar Todos']")
    private WebElement negaTodos;

    @FindBy(how = How.XPATH, using = "/html/body/form/table[9]/tbody/tr[7]/td/table/tbody/tr/td[13]/a/img")
    private WebElement autorizar;

    @FindBy(how = How.ID, using = "textArea")
    private WebElement resalva;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[7]/td/input[1]")
    private WebElement autoriza;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[3]/td/table/tbody/tr[8]/td/input[1]")
    private WebElement nega;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[4]/td/span/textarea")
    private WebElement resalva3;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[5]/td/input[1]")
    private WebElement autoriza3;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[4]/td/textarea")
    private WebElement resalva4;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[6]/td/input[1]")
    private WebElement autoriza4;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[4]/td/span/textarea")
    private WebElement resalva2;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[5]/td/input[1]")
    private WebElement autoriza2;


    @FindBy(how = How.XPATH, using = ".//strong[text()='Encerrar']")
    private WebElement encerra;

    @FindBy(how = How.XPATH, using = ".//span[text()='Digite o motivo/ressalva:']/following::input[1]")
    private WebElement confirmar;


    @FindBy(how = How.XPATH, using = ".//span[text()='Digite o motivo/ressalva:']/following::textarea[1]")
    private WebElement infMotivo;

    @FindBy(how = How.XPATH, using = ".//span[text()='Digite o motivo/ressalva:']/following::input[1]")
    private WebElement confirme;

    @FindBy(how = How.XPATH, using = ".//strong[text()='Atender']")
    private WebElement atender;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[4]/following::input[4]")
    private WebElement descricaoMedI;

    @FindBy(how = How.XPATH, using = ".//label[text()='7-Nº da Guia Atribuído pela Operadora']/following::span[1]")
    private WebElement campNumeroGuia;

    @FindBy(how = How.XPATH, using = ".//label[text()='32-Tipo Atendimento']/following::img[1]")
    private WebElement opcaoParaAbrirObs;

    @FindBy(how = How.XPATH, using = ".//label[text()=' 58-Observação:']/following::textarea[1]")
    private WebElement campOBS;

    @FindBy(how = How.XPATH, using = ".//button[text()='OK']")
    private WebElement alerta;

    @FindBy(how = How.XPATH, using = ".//td[text()='Ações']/following::img[1]")
    private WebElement cliqueAqui;

    @FindBy(how = How.XPATH, using = ".//th[text()='Tipo Guia']/following::a[4]")
    private WebElement detalharGuiaProrrogacao;

    @FindBy(how = How.ID, using = "divAguarde")
    private WebElement aguarde;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[21]/div[31]/div/ul/li")
    private WebElement profissionalLi;




    File pdfTeste = new File("src/test/resources/anexos/2045.pdf");

    public GuiaDeSP_SADTPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void informarCodigoBeneficiario(String arg0) throws InterruptedException {
        //MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver, codBeneficiario);
        esperarEpreencher(driver, codBeneficiario, arg0);
        espera();

    }

    public void clicarNoAlerta() throws InterruptedException {
        esperarEclicar(driver, alerta);

    }


    public void informarCodigoNaOperadora(String arg0) throws InterruptedException {
        /*
        espera();
        esperarEpreencher(driver, codNaOperadora, arg0);

         */

        esperarAparecer(driver, codSolicitante);
        esperarEpreencher(driver, codSolicitante, arg0);
        esperarAparecer(driver, codSolicitante);
        codSolicitante.sendKeys(Keys.TAB);


        // espera();
        // esperarAparecer(driver, codNaOperadora);
        // esperarEclicar(driver, codNaOperadora);
        // espera();
        // selecionarElemento(codNaOperadora, arg0);
    }

    public void selecionarCodigoNaOperadora(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, codExecutante);
        esperarEclicar(driver, codExecutante);
        espera();
        selecionarElemento(codExecutante, arg1);
    }

    public void informarCodigoExecutanteNaOperadora(String arg0) throws InterruptedException {
        /*
        espera();
        esperarEpreencher(driver, codNaOperadora, arg0);

         */

        esperarAparecer(driver, codExecutanteInput);
        esperarEpreencher(driver, codExecutanteInput, arg0);
        esperarAparecer(driver, codExecutanteInput);
        codExecutanteInput.sendKeys(Keys.TAB);
    }

    public void informarCampoNomeDoProfissionalExecutante(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        esperarEpreencher(driver, nomeDoProfissionalExecutante, arg0);
        esperarAparecer(driver, profissionalLi);
        //esperarDesaparecer(driver, aguarde);
        nomeDoProfissionalExecutante.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        //nomeDoProfissionalExecutante.sendKeys(Keys.TAB);
        //Thread.sleep(2000);


        /*
        espera();
        esperarAparecer(driver, nomeDoProfissionalExecutante);
        Thread.sleep(2000);
        try {
            for (int i = 0; i < 90; i++) {
                if (nomeDoProfissionalExecutante.isDisplayed()) {
                    esperarEclicar(driver, nomeDoProfissionalExecutante).sendKeys(Keys.TAB);
                    break;
                }

            }
        } catch (Exception e) {


        }

*/
    }

    public void informarNomeDoProfissionalExecutante(String arg0) throws InterruptedException {
        espera();
        esperarDesaparecer(driver, load);
        esperarEpreencher(driver, nomeDoProfissionalExecutante, arg0);
        nomeDoProfissionalExecutante.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    public void selecionarCampoCaráterDoAtendimento(String arg0) throws InterruptedException {
        espera();
        esperarAparecer(driver, caraterAtendimento);
        esperarEclicar(driver, caraterAtendimento);
        espera();
        selecionarElemento(caraterAtendimento, arg0);
    }

    public void informarTabela(String arg0) throws InterruptedException {
        espera();
        esperarAparecer(driver, tabela);
        esperarEclicar(driver, tabela);
        selecionarElemento(tabela, arg0);
        //tabela.sendKeys(Keys.TAB);
    }

    public void informaCodigoNaOperadora(String arg0) throws InterruptedException {
        //esperarEclicar(driver, iconeCodOperadora);

        esperarEpreencher(driver, codSolicitante, arg0);
        aguardaCarregamentoDaPagina(driver);
        codSolicitante.sendKeys(Keys.TAB);
        esperarDesaparecer(driver, aguarde);


    }

    public void selecionaCodigoNaOperadora(String arg0) throws InterruptedException {

        espera();
        esperarAparecer(driver, codOperadoraSelect);
        esperarEclicar(driver, codOperadoraSelect);
        espera();
        codOperadoraSelect.sendKeys(Keys.ARROW_DOWN);
        codOperadoraSelect.sendKeys(Keys.ENTER);
        esperarDesaparecer(driver, aguarde);

        /*Thread.sleep(2000);
        codOperadora.sendKeys(Keys.ARROW_DOWN);
        codOperadora.sendKeys(Keys.ARROW_DOWN);
        codOperadora.sendKeys(Keys.ARROW_DOWN);
        codOperadora.sendKeys(Keys.ARROW_DOWN);
        codOperadora.sendKeys(Keys.ENTER);
        // esperarEclicar(driver, pessoaFisica);
        */

    }


    public void qtdProcedimento(String arg0) throws InterruptedException {
        //espera();
        esperarEpreencher(driver, qtdPrecedimento, arg0);
    }


    public void selecionarCampoTipoDeAtendimento(String arg0) throws InterruptedException {
        espera();
        esperarEclicar(driver, campoTipoDeAtendimento);
        selecionarElemento(campoTipoDeAtendimento, arg0);
    }

    public void selecionarCampoIndicaçãoDeAcidente(String arg0) throws InterruptedException {
        espera();
        esperarAparecer(driver, campoIndicaçãoDeAcidente);
        esperarEclicar(driver, campoIndicaçãoDeAcidente);
        selecionarElemento(campoIndicaçãoDeAcidente, arg0);
    }

    public void informarCampoIndicaçãoClínica(String arg0) throws InterruptedException {
        esperarEpreencher(driver, indicacaoClinica, arg0);
    }

    public void codigoProcedimento(String arg0) throws InterruptedException {
        espera();
        esperarAparecer(driver, codPrecedimento);
        esperarEpreencher(driver, codPrecedimento, arg0);
        esperarAparecer(driver, descPrecedimento);
        codPrecedimento.sendKeys(Keys.TAB);
        esperarDesaparecer(driver, aguarde);
    }

    public void incluirDocumentoAnexo() throws InterruptedException {
        //MetodosUteis.alterarPagina(driver, 1);
        MetodosUteis.alterarPagina(driver, 2);
        aguardaElementoSerVisivel(driver, btnSelecionaArquivo).sendKeys(pdfTeste.getAbsolutePath());
        esperarEclicar(driver, btnIncluir);
        //esperarAparecer(driver, btnFechar);
        //esperarEclicar(driver, btnFechar);
        MetodosUteis.alterarPagina(driver, 1);
    }


    public void incluirArquivoAnexo() throws InterruptedException {
        aguardaElementoSerVisivel(driver, anexar1).sendKeys(pdfTeste.getAbsolutePath());
    }


    public void acionarCancelar() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver, btnCancelar);
        esperarEclicar(driver, btnCancelar);
        esperarEpreencher(driver, motivo, "teste");
        esperarEclicar(driver, btnConfirmar);

    }

    public void informarCampoOBS(String arg1) throws InterruptedException {
        esperarEclicar(driver, mostrarDados);
        espera();
        esperarEpreencher(driver, obsCamp, arg1);
    }

    public void pedirRevisao() throws InterruptedException {
        espera();
        esperarEclicar(driver, btnPedirRewvisao);
    }

    public void MENSAGEMeCONFIRMA(String arg1) throws InterruptedException {
        esperarEpreencher(driver, campMensagem, arg1);
        esperarEclicar(driver, btnConfMensagem);
    }

    public void selecionarCampoCBOs(String arg0) throws InterruptedException {
        esperarEclicar(driver, campoCBOs);
        selecionarElemento(campoCBOs, arg0);
    }

    public void informEmail(String arg0) throws InterruptedException {
        esperarEpreencher(driver, email, arg0);
    }

    public void informTelefone(String arg1, String arg2) throws InterruptedException {
        selecionarElemento(campoDDD, arg1);
        espera();
        esperarEpreencher(driver, campoTel, arg2);
    }

    public void informTelefoneSPSADT(String arg1, String arg2) throws InterruptedException {
        selecionarElemento(campoDDD2, arg1);
        esperarEpreencher(driver, campoTel2, arg2);
    }

    public void acionarRealizarProcedimento() throws InterruptedException {
        esperarEclicar(driver, btnProcedimento);
        MetodosUteis.alterarPagina(driver, 2);
    }

    public void informarData(String arg1) throws InterruptedException {
        // esperarEpreencher(driver, campData, arg1);
        espera();
        esperarEclicar(driver, campData);
        esperarEpreencher(driver, campData, arg1);
        campData.sendKeys(Keys.ENTER);
    }

    public void informarHoraInicioFim(String arg1, String arg2) throws InterruptedException {
        esperarEpreencher(driver, horaInicio, arg1);
        esperarEpreencher(driver, horaFim, arg1);
    }

    public void QtdRealizada(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtdRealizada, arg1);
    }

    public void acionarBtnExecutar() throws InterruptedException {
        espera();
        esperarAparecer(driver, btnExecutar);
        esperarEclicar(driver, btnExecutar);
        // esperarDesaparecer(driver,btnExecutar);
        Thread.sleep(5000);
    }


    public void selecionarCampoTipoAtendimento(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tipAtendimento);
        esperarEclicar(driver, tipAtendimento);
        selecionarElemento(tipAtendimento, arg1);

    }

    public void selecionaTipoConsultqa(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tipConsult);
        esperarEclicar(driver, tipConsult);
        selecionarElemento(tipConsult, arg1);
    }

    public void selecionarCampoTabelaMatI(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tabelaMatI);
        esperarEclicar(driver, tabelaMatI);
        selecionarElemento(tabelaMatI, arg1);
    }

    public void informeCodigoMaterialI(String arg1) throws InterruptedException {
        /*
        espera();
        esperarEpreencher(driver, codMatI, arg1);
        espera();
        codMatI.sendKeys(Keys.BACK_SPACE);
        espera();
        codMatI.sendKeys(Keys.TAB);
        */
        esperarAparecer(driver, codMatI);
        esperarEpreencher(driver, codMatI, arg1);
        espera();
        codMatI.sendKeys(Keys.BACK_SPACE);
        espera();
        esperarAparecer(driver, descPrecedimento);
        codMatI.sendKeys(Keys.TAB);
    }

    public void quantidadeMaterialI(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtdMatI, arg1);
    }

    public void selecionarCampoTabelaMatII(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tabelaMatII);
        esperarEclicar(driver, tabelaMatII);
        selecionarElemento(tabelaMatII, arg1);
    }

    public void informeCodigoMaterialII(String arg1) throws InterruptedException {
        /*
        espera();
        esperarEpreencher(driver, codMatII, arg1);
        espera();
        codMatII.sendKeys(Keys.BACK_SPACE);
        espera();
        codMatII.sendKeys(Keys.TAB);
        */
        esperarAparecer(driver, codMatII);
        esperarEpreencher(driver, codMatII, arg1);
        espera();
        esperarAparecer(driver, descPrecedimento);
        espera();
        codMatII.sendKeys(Keys.TAB);


    }

    public void quantidadeMaterialII(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, qtdMatII);
        esperarEpreencher(driver, qtdMatII, arg1);
    }

    public void selecionarCampoTabelaMedicamentosI(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tabelaMedI);
        esperarEclicar(driver, tabelaMedI);
        selecionarElemento(tabelaMedI, arg1);
    }

    public void informeCodigoMedicamentoI(String arg1) throws InterruptedException {
        /*
        espera();
        esperarEpreencher(driver, codMedI, arg1);
        codMedI.sendKeys(Keys.BACK_SPACE);
        espera();
        esperarAparecer(driver, descricaoMedI);
        codMedI.sendKeys(Keys.TAB);

         */

        esperarAparecer(driver, codMedI);
        esperarEpreencher(driver, codMedI, arg1);
        espera();
        esperarAparecer(driver, descPrecedimento);
        codMedI.sendKeys(Keys.TAB);


    }

    public void quantidadeMedicamentoI(String arg1) throws InterruptedException {
        esperarAparecer(driver, qtdMedI);
        esperarEpreencher(driver, qtdMedI, arg1);
    }

    public void selecionarCampoTabelaMedicamentosII(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tabelaMedII);
        esperarEclicar(driver, tabelaMedII);
        selecionarElemento(tabelaMedII, arg1);
    }

    public void informeCodigoMedicamentoII(String arg1) throws InterruptedException {
        /*
        espera();
        esperarEpreencher(driver, codMedII, arg1);
        codMedII.sendKeys(Keys.BACK_SPACE);
        espera();
        codMedII.sendKeys(Keys.TAB);

         */
        esperarAparecer(driver, codMedII);
        esperarEpreencher(driver, codMedII, arg1);
        esperarAparecer(driver, descPrecedimento);
        codMedII.sendKeys(Keys.TAB);


    }

    public void quantidadeMedicamentoII(String arg1) throws InterruptedException {
        esperarAparecer(driver, qtdMedII);
        esperarEpreencher(driver, qtdMedII, arg1);
        qtdMedII.sendKeys(Keys.TAB);
    }

    public void realizar() throws InterruptedException {
        // esperarAparecer(driver, btnRealizar);
        MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver, btnRealizar);
        esperarEclicar(driver, btnRealizar);
        driver.switchTo().alert().accept();
        espera();
        MetodosUteis.alterarPagina(driver, 2);
        espera();
        esperarEclicar(driver, data);
        data.clear();
        esperarEpreencher(driver, data, "30/05/2020");
        data.sendKeys(Keys.ENTER);
    }

    public void informeHora(String arg1, String arg2) throws InterruptedException {
        esperarEpreencher(driver, hsInicio, arg1);
        esperarEpreencher(driver, hsFim, arg2);
    }

    public void marcarTodos() throws InterruptedException {
        esperarEclicar(driver, marcaTodos);
    }

    public void acionarExecutar() throws InterruptedException {
        espera();
        //Thread.sleep(5000);
        scrollByDown(driver);
        esperarAparecer(driver, btnExec);
        esperarEclicar(driver, btnExec);
        //Thread.sleep(5000);
        MetodosUteis.alterarPagina(driver, 1);
    }


    /**
     * <b>Metodo para gravar numero da guia no arquivo txt <br>
     * Os parametros passados são: Numero da guia</br>
     * Os atributos desse metodo referenciam os IDs dos objetos </b>
     *
     * @throws Exception
     */

    public void gravarNumeroGuia() throws Exception {
        aguardarElementoSerClicavel(driver, campNumeroGuia);
        String aux = campNumeroGuia.getText();
        System.out.println("olha aqui: ");
        System.out.println(aux);
        Thread.sleep(5000);
        GravaArquivo arquivo = new GravaArquivo(
                caminhoProjeto + "/src/main//java/arquivosGerados/numeroGuiaCNUautorizada.txt");

        arquivo.escreverDocumento(aux);

        // scrollByPixel(driver);

    }


    public void acionarOpcaoAdicionar() throws InterruptedException {
        espera();
        esperarEclicar(driver, opcaoAdicionar);
    }

    public void informarCodigoTaxas(String arg1) throws InterruptedException {
        espera();
        esperarEpreencher(driver, codTaxas, arg1);
        codTaxas.sendKeys(Keys.BACK_SPACE);
        espera();
        codTaxas.sendKeys(Keys.TAB);
    }

    public void informarQuantidadeTaxas(String arg1) throws InterruptedException {
        esperarAparecer(driver, qtdTaxas);
        esperarEpreencher(driver, qtdTaxas, arg1);
        qtdTaxas.sendKeys(Keys.TAB);
    }

    public void acionarOpcaoAnexarLaudos() throws InterruptedException {
        esperarEclicar(driver, anexarLaudos);
    }

    public void acionarOpcaoAnexarArquivo() throws InterruptedException {
        esperarEclicar(driver, btIncluir);
    }

    public void acioanrSair() throws InterruptedException {
        esperarAparecer(driver, sair);
        esperarEclicar(driver, sair);
        driver.switchTo().alert().accept();
    }

    public void menuAuditarSolicitacoes() throws InterruptedException {
        espera();
        esperarEclicar(driver, menuAuditar);
        esperarEclicar(driver, subMenuSolicitacoes);
    }

    public void informeNumeroGuia(String arg1) throws Exception {
        //esperarEpreencher(driver, campGuia, arg1);
        retornarNumeroDaGuiaAguardando(arg1);
    }

    /**
     * <b>Metodo para retornar numero da guia que está gravado no arquivo txt <br>
     * Os parametros passados são: Numero da guia</br>
     * Os atributos desse metodo referenciam os IDs dos objetos </b>
     *
     * @throws Exception
     */
    public void retornarNumeroDaGuiaAguardando(String arg) throws Exception {
        Thread.sleep(2000);
        aguardaCarregamentoDaPagina(driver);
        GravaArquivo arquivo = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/numeroGuiaCampGrandAguardando.txt");
        String retornoUltimaLinha = arquivo.retornaUltimaLinhaArquivo();
        //System.out.println("olha aí:" + retornoUltimaLinha);
        arg = retornoUltimaLinha;
        esperarEpreencher(driver, campGuia, arg);

    }

    public void acionarOpcaoPesquisar() throws InterruptedException {
        esperarEclicar(driver, pesquisar);
    }

    public void acionarOpcaoDetalhar() throws InterruptedException {
        espera();
        esperarAparecer(driver, detalhar);
        esperarEclicar(driver, detalhar);
    }

    public void cliqueAquiParaVerificarAauditoria() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEclicar(driver, verificarAuditoria);
    }

    public void iniciarAtendimento() throws InterruptedException {
        // MetodosUteis.alterarPagina(driver, 1);
        esperaEclica(driver, iniciarArend);
    }

    public void autorizarTodos() throws InterruptedException {
        espera();
        esperaEclica(driver, autorizaTodos);
    }

    public void negarTodos() throws InterruptedException {
        espera();
        esperaEclica(driver, negaTodos);
    }

    public void autorizar() throws InterruptedException {
       // driver.switchTo().alert().accept();
        espera();
        esperaEclica(driver, autorizar);
    }

    public void informeMensagemEnega(String arg0) throws InterruptedException {
        espera();
        esperarEclicar(driver, mensagemNegaAuditoria );
        esperarEclicar(driver, transfereMensagemAuditoria);
        esperarEpreencher(driver,resalva,arg0);
        esperarEclicar(driver,nega);

    }

    public void informeResalvaEautoriza(String arg0) throws InterruptedException {
        espera();
        esperarEpreencher(driver, resalva, arg0);
        esperarEclicar(driver, autoriza);
    }

    public void informeUmaResalvaEautoriza(String arg0) throws InterruptedException {
        espera();
        esperarEpreencher(driver, resalva3, arg0);
        esperarEclicar(driver, autoriza3);
    }

    public void informeUmaResalvaEautoriza2(String arg0) throws InterruptedException {
        espera();
        esperarEpreencher(driver, resalva4, arg0);
        esperarEclicar(driver, autoriza4);
    }


    public void informeAresalvaEautoriza(String arg0) throws InterruptedException {
        espera();
        esperarEpreencher(driver, resalva2, arg0);
        esperarEclicar(driver, autoriza2);

    }

    public void encerrar() throws InterruptedException {
        esperarEclicar(driver, encerra);
        esperarEclicar(driver, confirmar);
    }

    public void informeMotivoEconfirma(String arg1) throws InterruptedException {
        esperarEpreencher(driver, infMotivo, arg1);
        esperarEclicar(driver, confirme);
    }

    public void acionarAtesder() throws InterruptedException {
        esperarEclicar(driver, atender);
    }

    /**
     * <b>Metodo para gravar numero da guia no arquivo txt <br>
     * Os parametros passados são: Numero da guia</br>
     * Os atributos desse metodo referenciam os IDs dos objetos </b>
     *
     * @throws Exception
     */

    public void gravarNumeroGuiaAguardando() throws Exception {
        aguardaCarregamentoDaPagina(driver);
        esperarAparecer(driver, campNumeroGuia);
        aguardarElementoSerClicavel(driver, campNumeroGuia);
        String aux = campNumeroGuia.getText();
        //  System.out.println(aux);
        // Thread.sleep(5000);
        GravaArquivo arquivo = new GravaArquivo(
                caminhoProjeto + "/src/test//java/arquivosGerados/numeroGuiaCampGrandAguardando.txt");
        arquivo.escreverDocumento(aux);

        // scrollByPixel(driver);

    }

    public void armazenarNumeroGuiaAguardando() throws Exception {
        gravarNumeroGuiaAguardando();
    }

    public void clicarEmDadosDeExecucaoProcedExamesRealizados() throws InterruptedException {
        esperarEclicar(driver, opcaoParaAbrirObs);
    }

    public void informCampoOBS() throws InterruptedException {
        esperarAparecer(driver, campOBS);
        esperarEpreencher(driver, campOBS, "Uma Pequena Observação");
    }

    public void cliqueParaAprovarSolicitação() throws InterruptedException {
        esperarEclicar(driver, cliqueAqui);
        aguardaCarregamentoDaPagina(driver);
    }

    public void detalharGuiaProrrogacao() throws InterruptedException {
        esperarEclicar(driver, detalharGuiaProrrogacao);
        aguardaCarregamentoDaPagina(driver);
    }

    public void informarObs(String arg1) throws InterruptedException {
        esperarEpreencher(driver, campOBS2, arg1);
    }

    public void informaMensagemEconfirma(String arg1) throws InterruptedException {
        espera();
        esperarEpreencher(driver, mensagem, arg1);
        espera();
        esperarEclicar(driver, confirma);
    }

    public void cliacarIconeCodNaOperadora() throws InterruptedException {
        esperarEclicar(driver, iconeCodOperadora);
    }

    public void informarNumeroDaCarteira(String arg1) throws InterruptedException {
        esperarEpreencher(driver, numCarteira, arg1);
    }

    public void informarCodNaOperadora(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codOperadora2, arg1);
    }

    public void informarProfExecutante(String arg1) throws InterruptedException {
        espera();
        esperarEpreencher(driver, profExecut, arg1);
        espera();
        profExecut.sendKeys(Keys.ARROW_DOWN);
        espera();
        profExecut.sendKeys(Keys.ENTER);
        espera();
        profExecut.sendKeys(Keys.TAB);

    }

    public void selecionarIndicacaoAcidente(String arg1) throws InterruptedException {
        esperarEclicar(driver, campIndcAcidente);
        selecionarElemento(campIndcAcidente, arg1);
    }

    public void selecionarAtabela(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        esperarEclicar(driver, campTabela);
        espera();
        selecionarElemento(campTabela, arg1);
    }

    public void selecionarTipConsulta(String arg1) throws InterruptedException {
        esperarEclicar(driver, tipConslt);
        selecionarElemento(tipConslt, arg1);
    }

    public void acionarBotaoGravar() throws InterruptedException {
        Thread.sleep(2000);
        esperarEclicar(driver, btnGravar);
        espera();
        //MetodosUteis.alterarPagina(driver, 2);
    }
}