package pageObjects.auditoriaTecnica;

import org.junit.Assert;
import org.openqa.selenium.By;
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
import util.GravaArquivo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static selenium.MetodosUteis.*;

public class AuditoriaDeContasPage {
    public static final String url_listagem_auditoria = "https://sawclone.trixti.com.br/saw/ManterAuditoriaTecnica.do?comando=abrirTelaDeListagemDeAuditoriasRetrospectivas";
    private WebDriver driver;
    int timeOut = 10;


    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[1]/div/div/ul/li[2]/ul/li[2]/a")
    private WebElement menuContasMedicas;

    @FindBy(how = How.NAME, using = "manterAuditoriaTecnica.loteDeFaturamentoEmAuditoriaTecnica.loteDeFaturamento.numero")
    private WebElement filtroNumeroLote;

    @FindBy(how = How.NAME, using = "filtroParaPesquisaTransacaoTissWebService.numeroLote")
    private WebElement filtroNumeroLoteSCE;

    @FindBy(how = How.ID, using = "numAutorizacao")
    private WebElement filtroImportarAutorizacao;

    @FindBy(how = How.NAME, using = "manterAuditoriaTecnica.auditoriaTecnica.tipoAuditoriaRetrospectiva")
    private WebElement filtroTipoAuditoria;

    @FindBy(how = How.NAME, using = "/html/body/table[2]/tbody/tr/td[2]/form[1]/fieldset/div/table/tbody/tr[1]/td[2]/input")
    private WebElement filtroNumeroAuditoria;

    @FindBy(how = How.NAME, using = "btnPesquisar")
    private WebElement botaoPesquisar;

    @FindBy(how = How.NAME, using = "manterAuditoriaTecnica.auditoriaTecnica.situacao")
    private WebElement filtroStatusAuditoria;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/fieldset/a[2]")
    private WebElement botaoAuditarConta;

    @FindBy(how = How.ID, using = "qtedUnit")
    private WebElement glosarQuantidade;

    @FindBy(how = How.XPATH, using = ".//label[2716 | Exames | Exame cobrado não corresponde ao exame executado]")
    private WebElement motivoGlosa2716;

    @FindBy(how = How.ID, using = "qtdeUnit")
    private WebElement campoGlosaUnitaria;

    @FindBy(how = How.XPATH, using = ".//span[text()='Auditoria Técnica']")
    private WebElement telaAuditoria;

    @FindBy(how = How.XPATH, using = ".//li/a[text()='Auditar']")
    private WebElement menuAuditar;

    @FindBy(how = How.XPATH, using = ".//li/a[text()='Contas Médicas']")
    private WebElement contasMédicas;

    @FindBy(how = How.CSS, using = "#auditoria > tbody > tr:nth-child(1) > td:nth-child(1)")
    private WebElement numeroAuditoria;


    public AuditoriaDeContasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }


    public void acessarContasMedicas() throws InterruptedException {
        esperarEclicar(driver, menuAuditar);
        esperarEclicar(driver, menuContasMedicas);

    }

    public void informarLote(String arg0) throws InterruptedException {
        esperarEpreencher(driver, filtroNumeroLote, arg0);
    }

    public void selecionarTipoAuditoria(String arg0) throws InterruptedException {
        selecionarElemento(filtroTipoAuditoria, arg0);
    }

    public void selecionarStatusAuditoria(String arg0) throws InterruptedException {
        selecionarElemento(filtroStatusAuditoria, arg0);
    }

    public void pesquisar() throws InterruptedException {
        driver.findElement(By.name("btnPesquisar")).click();

    }

    public void acionarOpcaoEditarAuditoria(String arg0) throws IllegalAccessException {
        //Armazenar Valor Original
        String vlrOriginal = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(10)")).getText();
        //float numeroOriginal = Float.parseFloat(vlrOriginal);

        //Armazenar Valor Vigente
        //String vlrVigente = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(11)")).getText();
        //float numeroVigente = Float.parseFloat(vlrVigente);

        //Verificar se valor vigente é menor que o original
        //if(numeroOriginal > numeroVigente){
        //throw new IllegalAccessException("O Valor original é maior que o valor vigente");
        //}

        driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(17) > a:nth-child(1)")).click();
        //Armazenar Valor inicial de glosa
        String valorGlosadoInicial = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div[4]/fieldset/table/tbody/tr[2]/td[6]")).getText();

    }

    public void acionarBotaoAuditarContaInternacao() {
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/fieldset/a[3]")).click();
        driver.getTitle().equals("SAW - Sistema de Atendimento Web - Conta Em Auditoria Técnica");
        //Listar todas janelas
        Set AllWindowHandles = driver.getWindowHandles();
        List Allwin = new ArrayList(AllWindowHandles);
        System.out.printf(String.valueOf(Allwin));
        //Selecionar página
        driver.switchTo().window((String) Allwin.get(1));

    }

    public void acessarAbaProcedimentosAuditoria() {
        driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
    }

    public void realizarGlosaQuantidade(String arg0) {
        driver.findElement(By.xpath("/html/body/div[3]/form/div[6]/table[1]/tbody/tr[1]/td[19]/a[1]/img")).click();
        driver.findElement(By.id("qtdeUnit")).sendKeys(arg0);
        driver.findElement(By.id("btnGlosarItem")).click();
    }

    //Recalcular Valores Vigentes

    public void acessarContasMedicasEnfermagem(String arg2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        trocaPaginaAuditoriaEnfermagem(driver, arg2);

    }

    public void recalcularValorVigenteAuditoria(int arg0, int arg1, int arg2) throws InterruptedException {
        for (int i = arg1; arg1 > arg2; arg2 += 1) {
            MetodosUteis.recalcularValoresVigentesEnfermagem(driver, arg0);
            String paginaAtual = String.valueOf(arg2);

            if (arg2 == 1) {
                arg2 = 2;
                String paginaAtual2 = String.valueOf(arg2);
                trocaPaginaAuditoriaEnfermagem(driver, paginaAtual2);
            } else {
                trocaPaginaAuditoriaEnfermagem(driver, paginaAtual);

            }
        }
    }

    public void reprocessarAuditoriaCuritiba(String arg0) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form[1]/fieldset/div/table/tbody/tr[1]/td[2]/input")).sendKeys(arg0);
        //driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form[1]/fieldset/div/table/tbody/tr[2]/td[4]/input")).sendKeys(arg0);
        driver.findElement(By.name("btnPesquisar")).click();
        try {
            boolean t = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(1) > td:nth-child(1)")).isDisplayed();
            if (t) {
                MetodosUteis.reprocessarAuditoriaSemPrestador(driver, arg0, "1");
            }
        }catch (Exception e){
            System.out.println("Auditoria não encontrada");
        }}

        public void acessarListagemSCE() {
        driver.navigate().to("https://saw.trixti.com.br/saw/ManterTransacaoTissWebService.do?comando=abrirTelaInicialTransacaoLoteSceWebService");

        }

        public void resgatarNumeroAutorizacaoSCE(String arg0) throws InterruptedException {
        //Resgatar numero de autorização
        esperarEpreencher(driver, filtroNumeroLoteSCE, arg0);
        driver.findElement(By.name("btnPesquisar")).click();
        String numeroAut = driver.findElement(By.cssSelector("#transacaoWebServiceBean > tbody > tr > td:nth-child(2)")).getText();
        System.out.println("Número de autorização do lote " + arg0 +" é: " + numeroAut);

        //Pesquisar e importar guia
        espera();
        driver.navigate().to("https://saw.trixti.com.br/saw/ImportacaoDeAutorizacoes.do?comando=abrirTelaDeImportacaoDeAutorizacoesRegistradasDiretamenteNoSistemaDeGestao");
        esperarEpreencher(driver, filtroImportarAutorizacao, numeroAut);
        driver.findElement(By.name("btnPesquisar")).click();
            try {
                boolean t = driver.findElement(By.cssSelector("#a > tbody > tr > td:nth-child(8) > center > input[type=checkbox]")).isDisplayed();
                if (t) {
                    driver.findElement(By.cssSelector("#a > tbody > tr > td:nth-child(8) > center > input[type=checkbox]")).click();
                    driver.findElement(By.id("btnImportar")).click();
                    espera();
                    System.out.println("Guia da autorização " + numeroAut + " importada com sucesso!");
                }
            }catch (Exception e){
                String semAut = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/table/tbody/tr/td")).getText();
                System.out.println(semAut);

        }

    }}


