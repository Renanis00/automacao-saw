package pageObjects.guias;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.MetodosUteis;
import selenium.Wait;
import util.GravaArquivo;
import util.ModificarArquivoXML;
//import util.ModificarArquivoXML;

import static selenium.MetodosUteis.*;
import static util.ModificarArquivoXML.*;

public class GuiaDeConsultaEletivaPage {
    private WebDriver driver;
    int timeOut = 90;


    @FindBy(how = How.ID, using = "manterTISSConsulta30DTO.tissSolicitacaoDeConsultaDTO.beneficiario.unimed.codigo")
    private WebElement numCarteira;

    @FindBy(how = How.XPATH, using = ".//label[text()='4-Número da Carteira']/following::input[2]")
    private WebElement codBeneficiario;

    @FindBy(how = How.XPATH, using = ".//label[text()='9-Código na Operadora/CNPJ/CPF']/following::select[1]")
    private WebElement clicarCPFCNPJ;

    @FindBy(how = How.XPATH, using = ".//label[text()='12-Nome do Profissional Executante']/following::input[1]")
    private WebElement nomeProf;

    @FindBy(how = How.ID, using = "divAguarde")
    private WebElement aguarde;

    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div[1]")
    //private WebElement aguarde;

    @FindBy(how = How.XPATH, using = ".//label[text()='17- Indicação de Acidente (acidente ou doença relacionada)']/following::select[1]")
    private WebElement indicaAcidente;

    @FindBy(how = How.ID, using = "manterTISSConsulta30DTO.tissSolicitacaoDeConsultaDTO.grupoDeAtendimentoUnimedDTO.chave")
    private WebElement grupoAtendimento;

    @FindBy(how = How.ID, using = "btnUtilizarGrupoAtendimento")
    private WebElement btnGrupoAtendimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='19- Tipo de Consulta']/following::select[1]")
    private WebElement tipConsulta;

    @FindBy(how = How.XPATH, using = ".//label[text()='21-Código do Procedimento']/following::input[1]")
    private WebElement codProcedimento;

    @FindBy(how = How.XPATH, using = ".//label[text()='20- Tabela']/following::select[1]")
    private WebElement campTabela;

    //@FindBy(how = How.XPATH, using = ".//legend[text()='Ações']/following::img[1]")
    //private WebElement gravar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Gravar']")
    private WebElement gravar;

    @FindBy(how = How.XPATH, using = ".//label[text()='7-Nº da Guia Atribuído pela Operadora']/following::span[1]")
    private WebElement campNumeroGuia;

    @FindBy(how = How.XPATH, using = ".//label[text()='2-N° Guia no Prestador']/following::span[1]")
    private WebElement campNumeroGuiaInternacao;

    @FindBy(how = How.XPATH, using = ".//li[text()='Quimioterapia']")
    private WebElement guiaQuimio;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[5]/div[2]/input")
    private WebElement camNumeroGuia;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[2]/select")
    private WebElement tipGuia;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[3]/input[3]")
    private WebElement numeroDaGuia;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[6]/p/input")
    private WebElement btnPesquisar;

    @FindBy(how = How.XPATH, using = "/html/body/div/form/div[15]/div[2]/b[3]")
    private WebElement msg;

    @FindBy(how = How.NAME, using = "manterTissDeQuimioterapia30DTO.tissSolicitacaoDeQuimioterapiaDTO.beneficiario.pesoDoBeneficiario")
    private WebElement peso;

    @FindBy(how = How.NAME, using = "manterTissDeQuimioterapia30DTO.tissSolicitacaoDeQuimioterapiaDTO.beneficiario.alturaDoBeneficiario")
    private WebElement altura;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[7]/div[6]/input")
    private WebElement idade;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[7]/div[7]/select")
    private WebElement sexo;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[9]/div[3]/input")
    private WebElement tel;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[7]/select")
    private WebElement tipEstabelecimento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[8]/select")
    private WebElement finalidade;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[9]/select")
    private WebElement ecog;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[10]/select")
    private WebElement tumor;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[11]/select")
    private WebElement nodulo;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[12]/select")
    private WebElement metastase;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[2]/div/textarea")
    private WebElement terapeutico;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[1]/input")
    private WebElement data;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[2]/select")
    private WebElement tabela;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[6]/select")
    private WebElement unidadeMedida;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[7]/select")
    private WebElement viaAdmin;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[5]/div[1]/input")
    private WebElement numeroDeCiculosPrevistos;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[5]/div[2]/input")
    private WebElement campoCiculoAtual;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[5]/div[3]/input")
    private WebElement numDeDiasDoCiculoAtual;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[5]/div[4]/input")
    private WebElement campoIntervaloEntreOsCiculos;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dataDaSolicitacao\"]")
    private WebElement campoDataDaSolicitacao;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Ações']/following::img[1]")
    private WebElement gravarGuia;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[11]/div[1]/div[6]/select")
    private WebElement campoEstadiamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[7]/div[5]/input")
    private WebElement campoSuperfícieCorporal;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[3]/input[1]")
    private WebElement codMedicamento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[12]/div[1]/table/tbody/tr[2]/td[8]/input[1]")
    private WebElement campFrequencia;

    @FindBy(how = How.XPATH, using = ".//b[text()='Status: ']/following::b[1]")
    private WebElement mensagem;

    @FindBy(how = How.XPATH, using = ".//li[text()='SP/SADT']")
    private WebElement spsadt;

    // @FindBy(how = How.XPATH, using = "/html/body/form/div/fieldset/table/tbody/tr[1]/td[2]/input")
    // private WebElement localAtendimento;

    @FindBy(how = How.XPATH, using = "/html/body/form/div/fieldset/table/tbody/tr[1]/td[2]/input")
    private WebElement localAtendimento;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/a[5]/span/p")
    private WebElement painelExecucao;

    @FindBy(how = How.XPATH, using = ".//label[text()='TeleSaúde']")
    private WebElement telesaude;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/a[5]/span/p")
    private WebElement painelExec;

    @FindBy(how = How.XPATH, using = ".//label[text()='21-Código do Procedimento']/following::input[1]")
    private WebElement codProc;

    @FindBy(how = How.XPATH, using = ".//label[text()='5-Validade da Carteira']/following::input[1]")
    private WebElement validCarta;

    @FindBy(how = How.XPATH, using = ".//li[text()='Consulta Eletiva']")
    private WebElement guiaConsultaEletiva;

    @FindBy(how = How.XPATH, using = ".//label[text()='9-Código na Operadora/CNPJ/CPF']/following::input[1]")
    private WebElement codNaopradora;

    @FindBy(how = How.XPATH, using = "//img[@src='/saw/images/aguarde.gif']")
    private WebElement load;

    @FindBy(how = How.XPATH, using = ".//label[text()='16- Código CBO']/following::select[1]")
    private WebElement cbo;

    @FindBy(how = How.ID, using = "descricaoDoServico")
    private WebElement descricaoDoServico;



    public GuiaDeConsultaEletivaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarGuiaConsultaEletiva() throws InterruptedException {
        esperarEclicar(driver, guiaConsultaEletiva);
        MetodosUteis.alterarPagina(driver, 1);
    }

    public void informarNumeroDaCarteira(String arg0) throws InterruptedException {
        aguardaCarregamentoDaPagina(driver);
        MetodosUteis.alterarPagina(driver, 1);
        esperarEpreencher(driver, numCarteira, arg0);
        numCarteira.sendKeys(Keys.TAB);
        //Thread.sleep(1500);
    }

    public void informarCodBeneficiario(String arg0) throws InterruptedException {
        espera();
        MetodosUteis.alterarPagina(driver, 1);
        esperarEpreencher(driver, codBeneficiario, arg0);
    }

    public void selecionarCPFCNPJ(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        //espera();
        espera();
        esperarAparecer(driver, clicarCPFCNPJ );
        esperarEclicar(driver, clicarCPFCNPJ);
        selecionarElemento(clicarCPFCNPJ, arg0);
    }

    public void informarcampoNomeDoProfissional(String arg0) throws InterruptedException {
        espera();
        esperarEpreencher(driver, nomeProf, arg0);
        // nomeProf.sendKeys(Keys.BACK_SPACE);
        esperarDesaparecer(driver, aguarde);
        Thread.sleep(5000);
        nomeProf.sendKeys(Keys.ENTER);
        espera();
    }

    public void selecionaIndicacaoAcidente(String arg0) throws InterruptedException {
        espera();
        esperarAparecer(driver, indicaAcidente);
        esperarEclicar(driver, indicaAcidente);
        selecionarElemento(indicaAcidente, arg0);
    }

    public void informaTipoDeConsulta(String arg0) throws InterruptedException {
        esperarEclicar(driver, tipConsulta);
        selecionarElemento(tipConsulta, arg0);
    }


    public void selecionaCampoTabela(String arg1) throws InterruptedException {
        esperarEclicar(driver, campTabela);
        selecionarElemento(campTabela, arg1);


    }

    public void acionarGravar35() throws Exception {
        esperaTextoAparecerNoElemento(driver, descricaoDoServico, "Consulta em consultório (no horário normal ou preestabelecid");
        esperarEclicar(driver, gravar);
    }

    public void acionarGravar865() throws Exception {
        esperaTextoAparecerNoElemento(driver, descricaoDoServico, "CONSULTA EM CONSULTÓRIO (NO HORÁRIO NORMAL OU PREESTABELECID");
        esperarEclicar(driver, gravar);
    }

    /**
     * <b>Metodo para gravar numero da guia no arquivo txt <br>
     * Os parametros passados são: Numero da guia</br>
     * Os atributos desse metodo referenciam os IDs dos objetos </b>
     *
     * @throws Exception
     */

    public void gravarNumeroGuia() throws Exception {
        aguardaCarregamentoDaPagina(driver);
        esperarAparecer(driver, campNumeroGuia);
        aguardarElementoSerClicavel(driver, campNumeroGuia);
        String aux = campNumeroGuia.getText();
        //  System.out.println(aux);
        //Thread.sleep(5000);
        GravaArquivo arquivo = new GravaArquivo(
                caminhoProjeto + "/src/test//java/arquivosGerados/numeroGuiaCNUautorizada.txt");

        arquivo.escreverDocumento(aux);

        // scrollByPixel(driver);


    }

    public void gravarNumeroGuiaInternacaoAutorizada() throws Exception {
        aguardaCarregamentoDaPagina(driver);
        esperarAparecer(driver, campNumeroGuiaInternacao);
        aguardarElementoSerClicavel(driver, campNumeroGuiaInternacao);
        String aux = campNumeroGuiaInternacao.getText();
        //  System.out.println(aux);
        //Thread.sleep(5000);
        GravaArquivo arquivo = new GravaArquivo(
                caminhoProjeto + "/src/test//java/arquivosGerados/numeroGuiaInternacaoCNUautorizada.txt");

        arquivo.escreverDocumento(aux);

        // scrollByPixel(driver);


    }

    public void gravarNumeroGuiaInternacaoAutorizada35() throws Exception {
        aguardaCarregamentoDaPagina(driver);
        esperarAparecer(driver, campNumeroGuiaInternacao);
        aguardarElementoSerClicavel(driver, campNumeroGuiaInternacao);
        String aux = campNumeroGuiaInternacao.getText();
        //  System.out.println(aux);
        //Thread.sleep(5000);
        GravaArquivo arquivo = new GravaArquivo(
                caminhoProjeto + "/src/test//java/arquivosGerados/numeroGuiaInternacaoCampoGrandeAutorizada.txt");

        arquivo.escreverDocumento(aux);

        // scrollByPixel(driver);


    }


    public void validaMsgSistema(String text) throws Exception {
        Thread.sleep(2000);
        String texto = aguardaElementoSerVisivel(driver, msg).getAttribute("textContent");

        if (!texto.contains(text)) {
            throw new Error("Mensagem não encontrada");
        }
    }

    public void acionarQuimioterapia() throws InterruptedException {
        esperarEclicar(driver, guiaQuimio);
    }

    public void acionarNumeroGuiaReferenciada() throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 1);
        esperarEclicar(driver, camNumeroGuia);
    }

    public void acionarTipodeGuia(String arg0) throws InterruptedException {
        MetodosUteis.alterarPagina(driver, 2);
        esperarEclicar(driver, tipGuia);
        selecionarElemento(tipGuia, arg0);
    }

    public void informNumeroGuia(String arg0) throws InterruptedException {
        esperarEpreencher(driver, numeroDaGuia, arg0);
    }

    public void acionaPesquisar() throws InterruptedException {
        esperarEclicar(driver, btnPesquisar);
    }

    public void informarPeso(String arg0) throws InterruptedException {
        // espera();
        MetodosUteis.alterarPagina(driver, 1);
        esperarEpreencher(driver, peso, arg0);
    }

    public void informarCampoAltura(String arg0) throws InterruptedException {
        //espera();
        esperarEpreencher(driver, altura, arg0);
    }

    public void informarIdade(String arg0) throws InterruptedException {
        //espera();
        esperarEpreencher(driver, idade, arg0);
    }

    public void selecionarSexo(String arg0) throws InterruptedException {
        esperarEclicar(driver, sexo);
        selecionarElemento(sexo, arg0);
    }

    public void infoCampoTel(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        esperarEpreencher(driver, tel, arg0);
    }

    public void selecionarTipoEstabelecimento(String arg0) throws InterruptedException {
        esperarEclicar(driver, tipEstabelecimento);
        selecionarElemento(tipEstabelecimento, arg0);
    }

    public void informeFinalidade(String arg0) throws InterruptedException {
        esperarEclicar(driver, finalidade);
        selecionarElemento(finalidade, arg0);
    }

    public void informarCampoECOG(String arg0) throws InterruptedException {
        esperarEclicar(driver, ecog);
        selecionarElemento(ecog, arg0);
    }

    public void selecionaTumor(String arg0) throws InterruptedException {
        esperarEclicar(driver, tumor);
        selecionarElemento(tumor, arg0);
    }

    public void seecionarNodulo(String arg0) throws InterruptedException {
        esperarEclicar(driver, nodulo);
        selecionarElemento(nodulo, arg0);
    }

    public void selecionaMetastase(String arg0) throws InterruptedException {
        esperarEclicar(driver, metastase);
        selecionarElemento(metastase, arg0);
    }

    public void informarCampoPlanoTerapeutico(String arg0) throws InterruptedException {
        esperarEpreencher(driver, terapeutico, arg0);
    }

    public void informData(String arg0) throws InterruptedException {
        esperarEpreencher(driver, data, arg0);

    }

    public void selecionaTabela(String arg0) throws InterruptedException {
        esperarEclicar(driver, tabela);
        selecionarElemento(tabela, arg0);
    }

    public void selecionaCampoUnidadeMedida(String arg0) throws InterruptedException {
        esperarEclicar(driver, unidadeMedida);
        selecionarElemento(unidadeMedida, arg0);
    }

    public void selecionarCampoViaAdmin(String arg0) throws InterruptedException {
        esperarEclicar(driver, viaAdmin);
        selecionarElemento(viaAdmin, arg0);
    }

    public void informarCampoNumeroDeCiculosPrevistos(String arg0) throws InterruptedException {
        esperarEpreencher(driver, numeroDeCiculosPrevistos, arg0);
    }

    public void informarCampoCiculoAtual(String arg0) throws InterruptedException {
        esperarEpreencher(driver, campoCiculoAtual, arg0);
    }

    public void numeroDeDiasDoCiculoAtual(String arg0) throws InterruptedException {
        esperarEpreencher(driver, numDeDiasDoCiculoAtual, arg0);
    }

    public void informarCampoIntervaloEntreOsCiculos(String arg0) throws InterruptedException {
        esperarEpreencher(driver, campoIntervaloEntreOsCiculos, arg0);
    }

    public void infocampoDataDaSolicitacao(String arg0) throws InterruptedException {
        espera();
        esperarEclicar(driver, campoDataDaSolicitacao);
        campoDataDaSolicitacao.sendKeys(Keys.ENTER);
        //esperarEpreencher(driver, campoDataDaSolicitacao, arg0);
    }

    public void gravarguia() throws InterruptedException {
        esperarEclicar(driver, gravarGuia);
    }

    public void selecionarCampoEstadiamento(String arg0) throws InterruptedException {
        esperarEclicar(driver, campoEstadiamento);
        selecionarElemento(campoEstadiamento, arg0);
    }

    public void acionarCampoSuperfícieCorporal() throws InterruptedException {
        esperarEclicar(driver, campoSuperfícieCorporal);
        espera();
    }

    public void informarCampoCodigoMedicamento(String arg0) throws InterruptedException {
        esperarEpreencher(driver, codMedicamento, arg0);
    }

    public void informarCampoFrequência(String arg0) throws InterruptedException {
        esperarEpreencher(driver, campFrequencia, arg0);
    }

    public void validarAmensagem(String arg0) throws InterruptedException {
        espera();
        esperarAparecer(driver, mensagem);
        MetodosUteis.alterarPagina(driver, 1);
        validaMensagem(driver, mensagem, arg0);
    }

    public void acionarAGuiaSPSADT() throws InterruptedException {
        // ModificarArquivoXML moficar = new ModificarArquivoXML();
        // moficar.modificaXML();
        aguardaCarregamentoDaPagina(driver);
        espera();
        esperarAparecer(driver, spsadt);
        esperarEclicar(driver, spsadt);
    }

    public void acionarLocalAtendimento() throws InterruptedException {
        esperarEclicar(driver, localAtendimento);
    }

    public void acionarPainelExecucao() throws InterruptedException {
        esperarEclicar(driver, painelExecucao);
    }

    public void acionarTeleSaude() throws InterruptedException {
        esperarAparecer(driver, telesaude);
        esperarEclicar(driver, telesaude);
    }

    public void aconarPainelExecucao() throws InterruptedException {
        // esperarAparecer(driver, painelExec);
        esperarEclicar(driver, painelExec);
    }

    public void informeCodProcedimento(String arg1) throws InterruptedException {
        esperarEpreencher(driver, codProc, arg1);
        codProc.sendKeys(Keys.TAB);

    }

    public void informeValidCarteira(String arg1) throws InterruptedException {
        //espera();
        esperarEpreencher(driver, validCarta, arg1);
        validCarta.sendKeys(Keys.TAB);
    }

    public void armazenarNumeroDaGuiaAutorizada() throws Exception {
        gravarNumeroGuia();
    }

    public void armazenarNumeroDaGuiaInternacaoAutorizada() throws Exception {
        gravarNumeroGuiaInternacaoAutorizada();

    }

    public void armazenarNumeroGuiaInternacaoAutorizada35() throws Exception {
        gravarNumeroGuiaInternacaoAutorizada35();
    }

    public void informaCodNaoperadora(String arg1) throws InterruptedException {aguardaCarregamentoDaPagina(driver);

        Thread.sleep(2000);
        esperarEpreencher2(driver, codNaopradora, arg1);
        espera();
        codNaopradora.sendKeys(Keys.ARROW_DOWN);
        espera();
        codNaopradora.sendKeys(Keys.ENTER);

    }

    public void alternarPagina() {

        MetodosUteis.alterarPagina(driver, 0);
    }


    public void selecionarCampoCBOc(String arg0) throws InterruptedException {
        esperarEclicar(driver, cbo);
        selecionarElemento(cbo, arg0);

    }

    public void selecionarGrupoAtendimento(String arg0) throws InterruptedException {
        esperarEclicar(driver, grupoAtendimento);
        selecionarElemento(grupoAtendimento, arg0);
        esperarEclicar(driver, btnGrupoAtendimento);
    }
}