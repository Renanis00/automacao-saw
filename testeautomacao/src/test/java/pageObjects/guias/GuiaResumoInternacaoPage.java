package pageObjects.guias;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.MetodosUteis;
import selenium.Wait;

import static selenium.MetodosUteis.*;
import static selenium.MetodosUteis.esperarAparecer;

public class GuiaResumoInternacaoPage {
    private WebDriver driver;
    int timeOut = 90;
    MetodosUteis metodosUteis = new MetodosUteis();

    @FindBy(how = How.XPATH, using = ".//span[text()='Informativo Rede Credenciada']/following::span[1]")
    private WebElement fecharInformativo;

    @FindBy(how = How.XPATH, using = ".//span[text()='Validação de Nota Fiscal']/following::span[1]")
    private WebElement fecharInformativoNota;

    @FindBy(how = How.XPATH, using = ".//span[text()='Regras - Envio de Mat e Med.']/following::span[1]")
    private WebElement fecharInformativoMatMed;

    @FindBy(how = How.XPATH, using = ".//label[text()='TISS']")
    private WebElement menuTISS;

    @FindBy(how = How.XPATH, using = ".//li/a[text()='TISS']") /* Sem label */
    private WebElement menuTISS2;

    @FindBy(how = How.XPATH, using = ".//label[text()='Painel de Execução']")
    private WebElement painelExecucao;

    //@FindBy(how = How.XPATH, using = "//*[@id=\"containerMenu\"]/ul/li[4]/ul/li/a")
    //private WebElement painelExecucao;

    @FindBy(how = How.XPATH, using = ".//li[text()='Resumo Internação']")
    private WebElement resumoInternacao;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[6]/input[1]")
    private WebElement solicitacaoDeInternacaoPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[2]/select")
    private WebElement clicarTipoDeGuia;

    @FindBy(how = How.ID, using = "numeroGuiaPesquisar")
    private WebElement numGuia;

    @FindBy(how = How.NAME, using = "btnPesquisar")
    private WebElement btnPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td[8]/div/a/img")
    private WebElement realizarVinculo;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[1]/div[2]/select")
    private WebElement clicarTipoDeFaturamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[1]/div[3]/input")
    private WebElement dtInicioFaturamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[1]/div[4]/input")
    private WebElement horacioFaturamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[1]/div[5]/input")
    private WebElement dtFimFaturamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[1]/div[6]/input")
    private WebElement horaFimFaturamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[2]/div[6]/select")
    private WebElement motivoEncerramentoInternacao;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[2]/div[5]/select")
    private WebElement indicacaoDeAcidente;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[4]/table/tbody/tr[2]/td[1]/input")
    private WebElement clicarCheck;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[4]/table/tbody/tr[2]/td[2]/input")
    private WebElement dataProcedimento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[4]/table/tbody/tr[2]/td[3]/input[1]")
    private WebElement horaProcedimento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[4]/table/tbody/tr[2]/td[3]/input[2]")
    private WebElement horaFimProcedimento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[4]/table/tbody/tr[2]/td[4]/select")
    private WebElement campTabela;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div[9]/div[4]/table/tbody/tr[2]/td[5]/input[1]")
    private WebElement codProduto;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[5]/input")
    private WebElement dosagemTotal;

    @FindBy(how = How.XPATH, using = ".//label[text()='8-Número da Carteira']/following::input[1]")
    private WebElement numeroCarteirinha;

    @FindBy(how = How.XPATH, using = ".//label[text()='8-Número da Carteira']/following::input[2]")
    private WebElement numeroCarteirinha2;

    @FindBy(how = How.XPATH, using = ".//label[text()='8-Número da Carteira']/following::input[2]")
    private WebElement numeroCarteirinhaII;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/div[4]/ul[3]")
    private WebElement opcaoInternacao;

    @FindBy(how = How.XPATH, using = ".//label[text()='7-Número da Carteira']/following::input[1]")
    private WebElement numOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='7-Número da Carteira']/following::input[2]")
    private WebElement numCarteirinha;

    @FindBy(how = How.XPATH, using = ".//label[text()='12-Código na Operadora']/following::input[1]")
    private WebElement codOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='14-Nome do Profissional Solicitante']/following::input[1]")
    private WebElement nomeProfSolicitante;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[1]/table/tbody/tr/td/img")
    private WebElement aguarde;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Código da Operadora / CNPJ']/following::select[1]")
    private WebElement codDAOperadora;

    @FindBy(how = How.XPATH, using = ".//label[text()='21-Data Sugerida para Internação']/following::input[1]")
    private WebElement dataInternacao;

    @FindBy(how = How.XPATH, using = ".//label[text()='23-Tipo de Internação']/following::select[1]")
    private WebElement tipInternacao;

    @FindBy(how = How.XPATH, using = ".//label[text()='26-Previsão de uso de OPME']/following::input[2]")
    private WebElement nao;

    @FindBy(how = How.XPATH, using = ".//label[text()='27-Previsão de uso de quimioterapia']/following::input[2]")
    private WebElement quimioNao;

    @FindBy(how = How.XPATH, using = ".//label[text()='22-Caráter de Internação']/following::select[1]")
    private WebElement caraterInternacao;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Regime de Internação']/following::select[1]")
    private WebElement regimeInternacao;

    @FindBy(how = How.XPATH, using = ".//label[text()='28-Indicação Clínica']/following::textarea[1]")
    private WebElement campIndicaClinica;

    @FindBy(how = How.XPATH, using = ".//label[text()='33-Indicação de Acidente (acidente ou doença relacionada)']/following::select[1]")
    private WebElement indicacaoAcidente;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[1]")
    private WebElement tabela;

    @FindBy(how = How.XPATH, using = ".//label[text()='35-Código']/following::input[2]")
    private WebElement codTabela1;

    @FindBy(how = How.XPATH, using = ".//label[text()='35-Código']/following::select[2]/option[text()='60000694 - DIÁRIA DE  ENFERMARIA DE 3 LEITOS COM BANHEIRO PRIVATIVO']")
    private WebElement codTabelaElemento;

    @FindBy(how = How.XPATH, using = ".//label[text()='37-Qt. Solic.']/following::input[5]")
    private WebElement qtd1;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[3]")
    private WebElement tabelaProc;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[3]/following::input[2]")
    private WebElement codTabelaProc;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[3]/following::input[5]")
    private WebElement qtd2;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[5]")
    private WebElement tabelaProc3;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[5]/following::input[2]")
    private WebElement codTabelaProc3;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[5]/following::input[5]")
    private WebElement qtd3;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[7]")
    private WebElement tabelaProc4;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[7]/following::input[2]")
    private WebElement codTabelaProc4;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[7]/following::input[5]")
    private WebElement qtd4;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[9]")
    private WebElement tabelaProc5;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[9]/following::input[2]")
    private WebElement codTabelaProc5;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[9]/following::input[5]")
    private WebElement qtd5;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[11]")
    private WebElement tabelaProc6;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[11]/following::input[2]")
    private WebElement codTabelaProc6;

    @FindBy(how = How.XPATH, using = ".//label[text()='34-Tabela']/following::select[11]/following::input[5]")
    private WebElement qtd6;

    @FindBy(how = How.XPATH, using = ".//label[text()='Gravar']")
    private WebElement btnGravar;

    @FindBy(how = How.XPATH, using = ".//label[text()='39-Data Provável da Admissão Hospitalar']/following::input[1]")
    private WebElement dataHosp;

    @FindBy(how = How.XPATH, using = ".//label[text()='Email']/following::input[1]")
    private WebElement email;

    @FindBy(how = How.XPATH, using = ".//label[text()='Celular']/following::select[1]")
    private WebElement ddd;

    @FindBy(how = How.XPATH, using = ".//label[text()='Celular']/following::input[1]")
    private WebElement tel;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/fieldset/div[1]/div[12]/a/img")
    private WebElement resumoInter;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/fieldset/a")
    private WebElement cadResumoInternacao;

    @FindBy(how = How.XPATH, using = ".//label[text()='Internação/Alta']")
    private WebElement intrnacaoAlta;

    @FindBy(how = How.XPATH, using = "/html/body/form/fieldset/table/tbody/tr[7]/td[2]/input")
    private WebElement dataEvento;

    @FindBy(how = How.XPATH, using = "/html/body/form/fieldset/table/tbody/tr[8]/td[2]/input[1]")
    private WebElement internacao;

    @FindBy(how = How.XPATH, using = "/html/body/form/fieldset/table/tbody/tr[9]/td[2]/select")
    private WebElement motivoEncerramento;

    @FindBy(how = How.XPATH, using = "/html/body/form/fieldset/table/tbody/tr[10]/td/input[1]")
    private WebElement cadastrar;

    @FindBy(how = How.XPATH, using = ".//label[text()='24-Tabela']/following::select[6]")
    private WebElement tabelaTaxas;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Código da Operadora / CNPJ']/following::input[1]")
    private WebElement hospital;

    @FindBy(how = How.XPATH, using = ".//label[text()='7-Número da Carteira']/following::input[2]")
    private WebElement numCarteira;

    @FindBy(how = How.XPATH, using = ".//label[text()='18-Código CBO-s']/following::select[1]")
    private WebElement cbo;

    @FindBy(how = How.XPATH, using = ".//label[text()='Solicitação Após Execução']/following::input[2]")
    private WebElement solicitacaoAposNao;

    @FindBy(how = How.ID, using = "qata-remover")
    private WebElement btnRemover;

    @FindBy(how = How.ID, using = "qata-adicionar")
    private WebElement btnAdicionar;





    public GuiaResumoInternacaoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void fecharInformativo() throws InterruptedException {
        espera();
        esperarAparecer(driver,fecharInformativoMatMed);
        esperarEclicar(driver, fecharInformativoMatMed);
        espera();
        aguardaCarregamentoDaPagina(driver);
        espera();
    }

    public void acionarMenuTISSPainelDeExecucao() throws InterruptedException {
        espera();
        esperarEclicar(driver, menuTISS);
        espera();
        esperarEclicar(driver, painelExecucao);
        espera();

    }

    public void acionarMenuTISS2PainelDeExecucao() throws InterruptedException {   /*Sem label*/
        espera();
        esperarEclicar(driver, menuTISS2);
        espera();
        esperarEclicar(driver, painelExecucao);
        espera();
    }

    public void clicarNoIconeResumoInternacao() throws InterruptedException {
        esperarEclicar(driver, resumoInternacao);
    }

    public void clicarCampoGuiaDeSolicitaçãoDeInternaçãoPesquisar() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEclicar(driver, solicitacaoDeInternacaoPesquisar);

    }

    public void selecionarUmTipoDeGuia(String arg0) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 2);
        esperarEclicar(driver, clicarTipoDeGuia);
        selecionarElemento(clicarTipoDeGuia, arg0);
    }


    public void informarNumeroDaGuia(String arg0) throws InterruptedException {
        esperarEpreencher(driver, numGuia, arg0);
    }

    public void acionarBotaoPesquisar() throws InterruptedException {
        esperarEclicar(driver, btnPesquisar);
    }

    public void clicarEmRealizarVinculo() throws InterruptedException {
        esperarEclicar(driver, realizarVinculo);
    }

    public void selecionarUmTipoDeFaturamento(String arg0) throws InterruptedException {
        espera();
        MetodosUteis.alterarPagina(driver, 1);
        espera();
        //aguardaElementoSerPresente(driver,clicarTipoDeFaturamento);
        esperarEclicar(driver, clicarTipoDeFaturamento);
        selecionarElemento(clicarTipoDeFaturamento, arg0);


    }

    public void informarDataInicioFaturamento(String arg0) throws InterruptedException {
        esperarEpreencher(driver, dtInicioFaturamento, arg0);
    }

    public void informarCampoHoraInicioFaturamento(String arg0) throws InterruptedException {
        esperarEpreencher(driver, horacioFaturamento, arg0);
    }

    public void informarDataFimFaturamento(String arg0) throws InterruptedException {
        esperarEpreencher(driver, dtFimFaturamento, arg0);
    }

    public void informarCampoHoraFimFaturamento(String arg0) throws InterruptedException {
        esperarEpreencher(driver, horaFimFaturamento, arg0);
    }

    public void selecionarUmMotivoEncerramentoInternacao(String arg0) throws InterruptedException {
        esperarEclicar(driver, motivoEncerramentoInternacao);
        selecionarElemento(motivoEncerramentoInternacao, arg0);
    }

    public void selecionarUmaIndicacaoDeAcidente(String arg0) throws InterruptedException {
        esperarEclicar(driver, indicacaoDeAcidente);
        selecionarElemento(indicacaoDeAcidente, arg0);
    }

    public void acionarcheckBox() throws InterruptedException {
        esperarEclicar(driver, clicarCheck);
    }

    public void informarDataProcedimento(String arg0) throws InterruptedException {
        esperarEpreencher(driver, dataProcedimento, arg0);

    }

    public void informarHoraInicioProcedimentos(String arg0) throws InterruptedException {
        esperarEpreencher(driver, horaProcedimento, arg0);
    }

    public void informarHoraFimProcedimentos(String arg0) throws InterruptedException {
        esperarEpreencher(driver, horaFimProcedimento, arg0);
    }

    public void informarTabela(String arg0) throws InterruptedException {
        esperarEclicar(driver, campTabela);
        selecionarElemento(campTabela, arg0);
    }

    public void informarCodProduto(String arg0) throws InterruptedException {
        esperarEpreencher(driver, codProduto, arg0);
    }


    public void informarDosagemTotal(String arg0) throws InterruptedException {
        esperarEpreencher(driver, dosagemTotal, arg0);

    }

    public void campoNumeroDaCarteiraUtilizarCartao(String arg0) throws InterruptedException {
        //espera();
        Thread.sleep(5000);
        aguardaCarregamentoDaPagina(driver);
        MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver, numeroCarteirinha);

        /*
        espera();
        esperarAparecer(driver, numeroCarteirinha);
        esperarEpreencher(driver, numeroCarteirinha, arg0);
        espera();
        numeroCarteirinha.sendKeys(Keys.TAB);

         */
        esperarAparecer(driver, numeroCarteirinha);
        esperarEpreencher(driver, numeroCarteirinha, arg0);
        esperarAparecer(driver, numeroCarteirinhaII);
        numeroCarteirinha.sendKeys(Keys.TAB);


    }

    public void campoNumeroDaCarteira(String arg0) throws InterruptedException {
        //espera();
        Thread.sleep(2000);
        aguardaCarregamentoDaPagina(driver);
        MetodosUteis.alterarPagina(driver, 1);
        esperarAparecer(driver, numeroCarteirinha2);

        esperarAparecer(driver, numeroCarteirinha2);
        esperarEpreencher(driver, numeroCarteirinha2, arg0);
        //esperarAparecer(driver, numeroCarteirinhaII);
        numeroCarteirinha2.sendKeys(Keys.TAB);

    }

    public void acionaOpcaoInternacao() throws InterruptedException {
        aguardaCarregamentoDaPagina(driver);
        esperarEclicar(driver, opcaoInternacao);
    }

    public void informNumCarteirinha(String arg1, String arg2) throws InterruptedException {
        espera();

        MetodosUteis.alterarPagina(driver, 1);
        aguardaCarregamentoDaPagina(driver);
        Thread.sleep(2000);
        esperarEpreencher(driver, numOperadora, arg1);
        espera();
        numOperadora.sendKeys(Keys.TAB);
        esperarAparecer(driver, numCarteirinha);
        esperarEpreencher(driver, numCarteirinha, arg2);

    }

    public void informarCodigoNaoperadora(String arg1) throws InterruptedException {
        espera();
        esperarEpreencher(driver, codOperadora, arg1);
        espera();
        codOperadora.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        //esperarAparecer(driver, codOperadora);
        // esperarEclicar(driver, codOperadora);
        // selecionarElemento(codOperadora, arg1);
    }

    public void informarNomeProfSolicitante(String arg1) throws InterruptedException {
        // Thread.sleep(3000);
        //espera();
        //aguardaElementoSerClicavel(driver, nomeProfSolicitante);
        //esperarAparecer(driver, nomeProfSolicitante);
        //esperarEclicar(driver, nomeProfSolicitante);
        //Thread.sleep(3000);
        //espera();
        //aguardaElementoSerClicavel(driver, nomeProfSolicitante);
        esperarAparecer(driver, nomeProfSolicitante);
        esperarEpreencher(driver, nomeProfSolicitante, arg1);
        // esperarDesaparecer(driver, aguarde);
        //Thread.sleep(6000);
        Thread.sleep(5000);
        nomeProfSolicitante.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    public void selecioneCodigoSolicitanteDaOperadora(String arg1) throws InterruptedException {
        espera();
        selecionarElemento(codDAOperadora, arg1);
        Thread.sleep(2000);
        //codDAOperadora.sendKeys(Keys.ENTER);



    }

    public void informarDataInternacao(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        esperarEclicar(driver, dataInternacao);
        dataInternacao.sendKeys(Keys.ENTER);
        //dataInternacao.clear();
        //esperarEpreencher(driver, dataInternacao, arg1);
    }

    public void slecionarTipoInternacao(String arg1) throws InterruptedException {
        esperarEclicar(driver, tipInternacao);
        selecionarElemento(tipInternacao, arg1);
    }

    public void selecionarUsoOPMEcomoNao() throws InterruptedException {
        esperarEclicar(driver, nao);
    }

    public void previsaoDeUsoDeQuimioterapiaNao() throws InterruptedException {
        esperarEclicar(driver, quimioNao);
    }

    public void selecionarCaraterInternacao(String arg1) throws InterruptedException {
        esperarEclicar(driver, caraterInternacao);
        selecionarElemento(caraterInternacao, arg1);
    }

    public void selecionarRegimeInternacao(String arg1) throws InterruptedException {
        esperarEclicar(driver, regimeInternacao);
        selecionarElemento(regimeInternacao, arg1);
    }

    public void informarIndicacaoClinica(String arg1) throws InterruptedException {
        esperarEpreencher(driver, campIndicaClinica, arg1);
    }

    public void selecionarIndicacaoAcidente(String arg1) throws InterruptedException {
        esperarEclicar(driver, indicacaoAcidente);
        selecionarElemento(indicacaoAcidente, arg1);
    }

    public void selecionaTabela(String arg1) throws InterruptedException {
        espera();
        //esperarAparecer(driver, tabela);
        esperarEclicar(driver, tabela);
        espera();
        selecionarElemento(tabela, arg1);
        espera();
        //esperarAparecer(driver,codTabela);
        // Thread.sleep(5000);
        //tabela.sendKeys(Keys.TAB);

    }

    public void informarCodTabela(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codTabela1, arg1);
        espera();
        codTabela1.sendKeys(Keys.TAB);

    }

    /*public void selecionaCodTabelaComo(String arg1) throws InterruptedException {
        espera();
        esperarEclicar(driver, codTabela);
        espera();
        codTabela.sendKeys(Keys.ARROW_DOWN);
        espera();
        codTabela.sendKeys(Keys.ENTER);
    }*/

    public void informeQuantidade(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtd1, arg1);
    }

    public void informeTabelaProcedimentos865(String arg1) throws InterruptedException {
        espera();
        esperarEclicar(driver, tabelaProc);
        selecionarElemento(codTabelaProc, arg1);
        espera();

    }

    public void informeTabelaProcedimentos(String arg1) throws InterruptedException {
        espera();
        esperarEclicar(driver, tabelaProc);
        selecionarElemento(tabelaProc, arg1);
        espera();

    }    public void addInformarTabelaProcedimentos(String arg1) throws InterruptedException {
        esperarEpreencher(driver, tabelaProc, arg1);
        codTabelaProc.sendKeys(Keys.TAB);

    }

    public void informarCodProcTabela(String arg1) throws InterruptedException {
        //espera();
        esperarEpreencher(driver, codTabelaProc, arg1);
        codTabelaProc.sendKeys(Keys.TAB);

    }

    public void informeQuantidadeProc(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtd2, arg1);
    }

    public void dataAdmiHosp(String arg1) throws InterruptedException {
        espera();
        scrollByDown(driver);
        esperarEclicar(driver, dataHosp);
        espera();
        dataHosp.sendKeys(Keys.ENTER);
    }

    public void aconarGravar() throws InterruptedException {
        esperarEclicar(driver, btnGravar);
    }

    public void informarEmail(String arg1) throws InterruptedException {
        esperarEpreencher(driver, email, arg1);
    }

    public void informarTelefone(String arg1, String arg2) throws InterruptedException {
        esperarEclicar(driver, ddd);
        selecionarElemento(ddd, arg1);
        esperarEpreencher(driver, tel, arg2);

    }

    public void acionarResumoInternacao() throws InterruptedException {
        esperarEclicar(driver, resumoInter);
    }

    public void cadastrarResumoInternacao() throws InterruptedException {
        esperarEclicar(driver, cadResumoInternacao);
    }

    public void acionarOpcaoInternacaoAlta() throws InterruptedException {
        espera();
        esperarAparecer(driver, intrnacaoAlta);
        aguardarElementoSerClicavel(driver, intrnacaoAlta);
        esperarEclicar(driver, intrnacaoAlta);
    }

    public void informarDataEvento(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 2);
        esperarAparecer(driver, dataEvento);
        esperarEclicar(driver, dataEvento);
        dataEvento.sendKeys(Keys.ENTER);
    }

    public void acionarTipoDeEventoComoInternacao() throws InterruptedException {
        esperarAparecer(driver, internacao);
        esperarEclicar(driver, internacao);
    }

    public void selecionarMotivoDeencerramento(String arg1) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 2);
        esperarAparecer(driver, motivoEncerramento);
        esperarEclicar(driver, motivoEncerramento);
        selecionarElemento(motivoEncerramento, arg1);
    }

    public void acionarCadastrar() throws InterruptedException {
        esperarAparecer(driver, cadastrar);
        esperarEclicar(driver, cadastrar);



    }

    public void selecionarTabelaTaxas(String arg1) throws InterruptedException {
        espera();
        esperarAparecer(driver, tabelaTaxas);
        esperarEclicar(driver, tabelaTaxas);
        espera();
        selecionarElemento(tabelaTaxas, arg1);
    }

    public void informeCodigoDaOperadora(String arg1) throws InterruptedException {
        aguardaCarregamentoDaPagina(driver);
        esperarAparecer(driver, hospital);
        Thread.sleep(2000);
        esperarEpreencher(driver, hospital, arg1);
        espera();
        //hospital.sendKeys(Keys.ARROW_DOWN);
        espera();
        hospital.sendKeys(Keys.ENTER);


    }

    public void informNumCarteira(String arg1) throws InterruptedException{
        //aguardaCarregamentoDaPagina(driver);
        MetodosUteis.alterarPagina(driver, 1);
        esperarEpreencher(driver,numCarteira,arg1);

    }

    public void selecionarCampoCBO(String arg0) throws InterruptedException {
        esperarEclicar(driver, cbo);
        selecionarElemento(cbo, arg0);
        cbo.sendKeys(Keys.ENTER);

    }

    public void usoSolicitacaoAposExecucaoNao() throws InterruptedException{
        esperarEclicar(driver, solicitacaoAposNao);
    }

    public void apagarLinhasProcedimentos() throws InterruptedException {
        for (int i = 1; i < 14; i += 1) {
         esperarEclicar(driver, btnRemover);
        }
    }

    //CAMPO DE PROCEDIMENTOS LINHA 3
    public void informeTabelaProcedimentos3(String arg1) throws InterruptedException {
        esperarEclicar(driver, btnAdicionar);
        espera();
        esperarEclicar(driver, tabelaProc3);
        selecionarElemento(tabelaProc3, arg1);
        espera();
    }

    public void informarCodTabela3(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codTabelaProc3, arg1);
        espera();
        codTabelaProc3.sendKeys(Keys.TAB);

    }

    public void informeQuantidade3(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtd3, arg1);
    }

    //CAMPO DE PROCEDIMENTOS LINHA 4
    public void informeTabelaProcedimentos4(String arg1) throws InterruptedException {
        esperarEclicar(driver, btnAdicionar);
        espera();
        esperarEclicar(driver, tabelaProc4);
        selecionarElemento(tabelaProc4, arg1);
        espera();
    }

    public void informarCodTabela4(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codTabelaProc4, arg1);
        espera();
        codTabelaProc4.sendKeys(Keys.TAB);

    }

    public void informeQuantidade4(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtd4, arg1);
    }

    //CAMPO DE PROCEDIMENTOS LINHA 5
    public void informeTabelaProcedimentos5(String arg1) throws InterruptedException {
        esperarEclicar(driver, btnAdicionar);
        espera();
        esperarEclicar(driver, tabelaProc5);
        selecionarElemento(tabelaProc5, arg1);
        espera();
    }

    public void informarCodTabela5(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codTabelaProc5, arg1);
        espera();
        codTabelaProc5.sendKeys(Keys.TAB);

    }

    public void informeQuantidade5(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtd5, arg1);
    }

    //CAMPO DE PROCEDIMENTOS LINHA 6
    public void informeTabelaProcedimentos6(String arg1) throws InterruptedException {
        esperarEclicar(driver, btnAdicionar);
        espera();
        esperarEclicar(driver, tabelaProc6);
        selecionarElemento(tabelaProc6, arg1);
        espera();
    }

    public void informarCodTabela6(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codTabelaProc6, arg1);
        espera();
        codTabelaProc6.sendKeys(Keys.TAB);

    }

    public void informeQuantidade6(String arg1) throws InterruptedException {
        esperarEpreencher(driver, qtd6, arg1);
    }
}