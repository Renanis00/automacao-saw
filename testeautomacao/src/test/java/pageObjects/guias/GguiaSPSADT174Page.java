package pageObjects.guias;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.MetodosUteis;
import selenium.Wait;
import util.GravaArquivo;
import util.ModificarArquivoXML;
//import util.ModificarArquivoXML;

import static selenium.MetodosUteis.*;
import static util.ModificarArquivoXML.*;

public class GguiaSPSADT174Page {
    private WebDriver driver;
    int timeOut = 90;
    MetodosUteis metodosUteis = new MetodosUteis();

    @FindBy(how = How.XPATH, using = ".//label[text()='16-Conselho Profissional']/following::select[1]")
    private WebElement conselhoProf;

    @FindBy(how = How.XPATH, using = ".//label[text()='17-Número no Conselho']/following::input[1]")
    private WebElement numeroDoConselho;

    @FindBy(how = How.XPATH, using = ".//label[text()='18-UF']/following::select[1]")
    private WebElement uf;

    @FindBy(how = How.XPATH, using = ".//label[text()='19-Código CBO-s']/following::select[1]")
    private WebElement cbo;


    public GguiaSPSADT174Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Wait.untilPageLoadComplete(driver);
    }

    public void selecionarConselhoProficional(String arg1) throws InterruptedException {
        metodosUteis.esperarEclicar(driver, conselhoProf);
        espera();
        metodosUteis.selecionarElemento(conselhoProf, arg1);

    }

    public void informarNumeroDoConselho(String arg1) throws InterruptedException {
        metodosUteis.esperarEpreencher(driver, numeroDoConselho, arg1);
    }

    public void selecionarUF(String arg1) throws InterruptedException {
        metodosUteis.esperarEclicar(driver, uf);
        espera();
        metodosUteis.selecionarElemento(uf, arg1);
    }

    public void selecionarCBO(String arg1) throws InterruptedException {
        metodosUteis.esperarEclicar(driver, cbo);
        espera();
        metodosUteis.selecionarElemento(cbo, arg1);
    }
}
