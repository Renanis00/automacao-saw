package pageObjects.auditoriaTecnica;

import static selenium.MetodosUteis.esperarEpreencher;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.MetodosUteis;
//import selenium.MetodosUteis.*;
import selenium.Wait;

public class ParametrizarCategoriasDeRegrasPage {

    private WebDriver driver;
    int timeOut = 90;
    MetodosUteis metodosUteis = new MetodosUteis();


    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Técnica']")
    private WebElement menuAuditTecnica;

    @FindBy(how = How.XPATH, using = ".//label[text()='Auditoria Técnica']/following::a[1]")
    private WebElement categorias;

    @FindBy(how = How.XPATH, using = ".//legend[text()='Ações']/following::a[1]")
    private WebElement novaCategoria;

    @FindBy(how = How.XPATH, using = ".//td[text()='Descrição']/following::input[1]")
    private WebElement campDescricao;

    @FindBy(how = How.XPATH, using = ".//td[text()='Data Início']/following::input[1]")
    private WebElement data;

    @FindBy(how = How.XPATH, using = ".//td[text()='Workflow']/following::select[1]")
    private WebElement workflow;

    @FindBy(how = How.XPATH, using = ".//td[text()='Workflow']/following::input[1]")
    private WebElement sim;

    @FindBy(how = How.XPATH, using = ".//td[text()='Workflow']/following::input[3]")
    private WebElement gravar;

    @FindBy(how = How.XPATH, using = ".//td[text()='Categoria Auto 02']/following::img[3]")
    private WebElement regras;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/div[2]/div[1]/fieldset/div[2]/fieldset[5]/table/tbody/tr[2]/td/div[3]/div[1]/span/input")
    private WebElement checkbox;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/div[2]/div[5]/input")
    private WebElement gravar2;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/div[2]/ul/li[4]/a")
    private WebElement abaContratados;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/div[2]/div[4]/fieldset/fieldset/div[1]/div/a")
    private WebElement addContratado;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nomePrest0\"]")
    private WebElement infoContratado;

    @FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr/td[2]/form/div[2]/div[5]/input")
    private WebElement gravContratado;


    public ParametrizarCategoriasDeRegrasPage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void acionarMenuCategoriaRegras() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, menuAuditTecnica);
        metodosUteis.esperarEclicar(driver, categorias);
    }

    public void acionarOpcaoNovaCategoria() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, novaCategoria);
    }

    public void informarCampoDescricao(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, campDescricao, arg1);
    }

    public void informarData(String arg1) throws InterruptedException {
        //metodosUteis.esperarEpreencher(driver, data, arg1);
        data.sendKeys(Keys.ENTER);
    }

    public void selecionarWorkflow(String arg1) throws InterruptedException {
        metodosUteis.selecionarElemento(workflow, arg1);
    }

    public void informarSim() throws InterruptedException {
        metodosUteis.espera();
        metodosUteis.esperarEclicar(driver, sim);
    }

    public void acionarOpcaoGravar() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, gravar);
    }

    public void acionarOpcaoRegras() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, regras);
    }

    public void acionacheckboxResumoInternacao() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, checkbox);

    }

    public void opcaoGravar() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, gravar2);
    }

    public void acionarAbaContratados() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, abaContratados);
    }

    public void adicionarContratado() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, addContratado);
    }

    public void informarContratado(String arg1) throws InterruptedException {
        esperarEpreencher(driver, infoContratado, arg1);
        Thread.sleep(5000);
        infoContratado.sendKeys(Keys.ENTER);
        infoContratado.sendKeys(Keys.TAB);


    }

    public void gravarContratado() throws InterruptedException {
        metodosUteis.esperarEclicar(driver, gravContratado);
    }
}
