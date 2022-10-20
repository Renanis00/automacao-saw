package pageObjects.auditoriaTecnica;

import static selenium.MetodosUteis.caminhoProjeto;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import selenium.MetodosUteis;
//import selenium.MetodosUteis.*;
import selenium.Wait;
import util.GravaArquivo;
import util.ModificarArquivoXML;

public class EnviarXmlPage {
    private WebDriver driver;
    int timeOut = 90;
    MetodosUteis metodosUteis = new MetodosUteis();
    ModificarArquivoXML modificarXML = new ModificarArquivoXML();

    @FindBy(how = How.XPATH, using = ".//a[text()='TISS']")
    private WebElement menuTISS;

    @FindBy(how = How.XPATH, using = ".//a[text()='TISS']/following::a[2]")
    private WebElement faturamentoEletronico;

    @FindBy(how = How.XPATH, using = ".//span[text()='Validar Estrutura/Hash']")
    private WebElement clickEstruturaHash;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/div[6]/form/fieldset/table/tbody/tr[1]/td[2]/input")
    private WebElement escolherArquivo;

    @FindBy(how = How.XPATH, using = "//input[@onclick='validarEstruturaHashXmlTiss();']")
    private WebElement btnEscolherArquivo;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[4]")
    private WebElement campHashCorreto;

    @FindBy(how = How.XPATH, using = ".//span[text()='Enviar XML']")
    private WebElement enviarXML;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Upload de Lote de Faturamento']/following::select[1]")
    private WebElement prestador;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Upload de Lote de Faturamento']/following::input[1]")
    private WebElement escolherArquivoII;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Upload de Lote de Faturamento']/following::input[2]")
    private WebElement bntEnviarArquivo;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Técnica']")
    private WebElement menuAuditTecnica;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Técnica']/following::a[4]")
    private WebElement menuGrupUsuarios;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Ações']/following::a[2]")
    private WebElement btnNovoGrup;

    @FindBy(how = How.XPATH, using = ".//label[text()='Nome do Grupo:']/following::input[1]")
    private WebElement nomeGrupo;

    @FindBy(how = How.XPATH, using = ".//label[text()='Permite participar da auditoria técnica:']/following::input[1]")
    private WebElement checkbox;

    @FindBy(how = How.XPATH, using = ".//label[text()='Tipo de Auditoria:']/following::input[1]")
    private WebElement tipAudAdministrativa;

    @FindBy(how = How.XPATH, using = ".//label[text()='Descrição do Grupo:']/following::textarea[1]")
    private WebElement descGrupo;

    @FindBy(how = How.XPATH, using = ".//label[text()='Descrição do Grupo:']/following::input[1]")
    private WebElement btnGravar;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditor:']/following::input[1]")
    private WebElement campoAuditoria;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data Inicial:']/following::input[1]")
    private WebElement dataInicial;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data Final:']/following::input[1]")
    private WebElement dataFinal;

    @FindBy(how = How.XPATH, using = ".//label[text()='Data Final:']/following::input[2]")
    private WebElement btnCadastrar;


    ModificarArquivoXML modificar = new ModificarArquivoXML();


    public EnviarXmlPage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarMenuTissFaturamentoEletronijco() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, menuTISS);
        metodosUteis.esperarEclicar(driver, faturamentoEletronico);
    }

    public void modificarXml() throws ParserConfigurationException, SAXException, IOException {
        modificar.renomearArquivo();
        modificarXML.modificaXML();
    }

    public void validarHashXML() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, clickEstruturaHash);
    }

    public void acionarEscolherArquivo() throws InterruptedException, IOException {
        GravaArquivo arquivo3 = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/novoXmlGerado.txt");
        String retornoUltimaLinha = arquivo3.retornaUltimaLinhaArquivo();
        File xmlTeste2 = new File("src/test/java/arquivosGerados/".concat(retornoUltimaLinha));


        metodosUteis.aguardaElementoSerVisivel(driver, escolherArquivo).sendKeys(xmlTeste2.getAbsolutePath());
    }

    public void acionarBotaoValidarHash() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, btnEscolherArquivo);
    }

    public void atualizarXMLcomHashCorreto() throws IOException, InterruptedException {
        metodosUteis.aguardarElementoSerClicavel(driver, campHashCorreto);
        String aux = campHashCorreto.getText();
        GravaArquivo arquivo = new GravaArquivo(caminhoProjeto + "/src/test//java/arquivosGerados/hashCorreto.txt");
        arquivo.escreverDocumento(aux);
        modificar.modificaHashDoXML();
    }

    public void acionarOpcaoEnviarXML() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
        //modificar.renomearArquivo();
        metodosUteis.esperarEclicar(driver, enviarXML);
    }

    public void selecionarPrestadro(String arg1) throws InterruptedException {
        metodosUteis.aguardaCarregamentoDaPagina(driver);
        metodosUteis.esperarEclicar(driver, prestador);
        metodosUteis.selecionarElemento(prestador, arg1);
    }

    public void acionarOpcaoEscolherArqeuivoXML() throws IOException {

        GravaArquivo arquivo3 = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/novoXmlGerado.txt");
        String retornoUltimaLinha = arquivo3.retornaUltimaLinhaArquivo();
        File xmlTeste = new File("src/test/java/arquivosGerados/".concat(retornoUltimaLinha));

        metodosUteis.aguardaElementoSerVisivel(driver, escolherArquivoII).sendKeys(xmlTeste.getAbsolutePath());
    }

    public void enviarArqueivo() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
        metodosUteis.esperarEclicar(driver, bntEnviarArquivo);
        //modificar.renomearArquivo();

    }

    public void menuAuditoriaTecnicaGrupoUsuarios() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, menuAuditTecnica);
        metodosUteis.esperarEclicar(driver, menuGrupUsuarios);
    }

    public void acionarNovoGrupo() throws InterruptedException {
        metodosUteis.aguardaEclicar(driver, btnNovoGrup);
    }

    public void informarNomeDogrupo(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, nomeGrupo, arg1);
    }

    public void marcarCheckBoxPermitirParticiparAuditTecnica() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, checkbox);
    }

    public void marcarTipoAuditoriaAdministrativa() throws InterruptedException {
        metodosUteis.aguardaEclicar(driver, tipAudAdministrativa);
    }

    public void informeDescricaoGrupo(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, descGrupo, arg1);
    }

    public void acionarBtnGravar() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, btnGravar);
    }

    public void informarCampoAuditor(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, campoAuditoria, arg1);
    }

    public void informeDataInicialEfinal(String arg1, String arg2) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, dataInicial, arg1);
        metodosUteis.esperarEpreencher(driver, dataFinal, arg2);
    }

    public void clicarCadastrar() throws InterruptedException {
        metodosUteis.aguardaEclicar(driver, btnCadastrar);
    }
}