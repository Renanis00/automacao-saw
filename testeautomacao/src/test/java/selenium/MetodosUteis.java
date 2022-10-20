package selenium;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import managers.FileReaderManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MetodosUteis {

    private static final Duration OF_SECONDS = Duration.ofSeconds(0, 5);
    public static String caminhoProjeto = System.getProperty("user.dir");
    private static WebDriverWait wait;
    private static long timeOutInSeconds = FileReaderManager.getInstance().getConfigReader().getWait();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static WebDriver driver;


    public MetodosUteis() {
    }

    public static void espera() throws InterruptedException {
        Thread.sleep(900);
    }

    public static void trocaPaginaAuditoriaEnfermagem(WebDriver driver, String arg2){
        //Filtro data inicio
        String dataInicioPesquisa = "08%2F08%2F2022";
        String dataFimPesquisa = "10%2F08%2F2022";

        //URL com os filtros
        driver.navigate().to("https://saw.trixti.com.br/saw/ManterAuditoriaTecnica.do?manterAuditoriaTecnica.auditoriaTecnica.loteDeFaturamentoEmAuditoriaTecnica.chave=0&manterAuditoriaTecnica.auditoriaTecnica.valorDaContaOriginal=NaN&" +
                "manterAuditoriaTecnica.auditoriaTecnica.tipoAuditoriaRetrospectiva=&manterAuditoriaTecnica.auditoriaTecnica.usuarioAuditor.login=&org.apache.struts.taglib.html.TOKEN=f2fc98d526d155d9941d295926e7591a&manterAuditoriaTecnica.auditoriaTecnica" +
                ".grupoResponsavel.chave=&manterAuditoriaTecnica.auditoriaTecnica.situacao=&manterAuditoriaTecnica.auditoriaTecnica.dataInicioPresquisa=+" + dataInicioPesquisa + "+&manterAuditoriaTecnica.auditoriaTecnica.dataInicioConta=&manterAuditoriaTecnica.auditoriaTecnica." +
                "prestador.codigo=&tipoCriterioPesquisa=0&comando=filtrarAuditoriasTecnicas&manterAuditoriaTecnica.auditoriaTecnica.chave=&manterAuditoriaTecnica.auditoriaTecnica.chave=&manterAuditoriaTecnica.guiaEmLoteDeAuditoria.guiaTISSDTO.numeroDaGuia=&auditoriaTecnica." +
                "situacao=&manterAuditoriaTecnica.loteDeFaturamentoEmAuditoriaTecnica.loteDeFaturamento.arquivoFaturamento.protocolo=&manterAuditoriaTecnica.auditoriaTecnica.categoriaAuditoriaTecnica.chave=&manterAuditoriaTecnica.guiaEmLoteDeAuditoria.guiaTISSDTO.beneficiario.unimed." +
                "codigo=&manterAuditoriaTecnica.numeroDeRegistrosPorPagina=10&manterAuditoriaTecnica.guiaEmLoteDeAuditoria.guiaTISSDTO.beneficiario.codigo=&manterAuditoriaTecnica.loteDeFaturamentoEmAuditoriaTecnica.loteDeFaturamento.numero=&manterAuditoriaTecnica.auditoriaTecnica.data" +
                "InicioApresentacaoConta=&manterAuditoriaTecnica.auditoriaTecnica.dataFimPresquisa=" + dataFimPesquisa + "&d-3599048-p=" + arg2 + "&criterio=&manterAuditoriaTecnica.auditoriaTecnica.dataFimApresentacaoConta=&manterAuditoriaTecnica.auditoriaTecnica.dataFimConta=");

        //Aviso de troca da página
        System.out.println(ANSI_PURPLE + "Troca de página realizada (Página " + arg2 + ")");
    }

    public static void recalcularAuditoriaAndamento(WebDriver driver, String auditoria, int arg0) throws InterruptedException {
        //Classe de espera
        wait = new WebDriverWait(driver, timeOutInSeconds);

        //Printar número da auditoria
        System.out.println(ANSI_BLUE + "Recalculando auditoria " + auditoria);

        //Encontrar e clicar no botão "Recalcular Valores Vigentes"
        driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(18) > a:nth-child(4)")).click();
        esperarAlertaOk(driver);

        //Esperar tela de edição de auditoria
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Atualizar']")));

        //Printar sucesso do recalculo e voltar para listagem de auditoria
        System.out.println(ANSI_GREEN + "Auditoria " + auditoria + " recalculada com sucesso");
        driver.navigate().back();
        driver.navigate().refresh();

    }


    public static void reprocessarAuditoriaSemPrestador(WebDriver driver, String auditoria, String linha) throws InterruptedException {
        /*String prestador = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + linha + ") > td:nth-child(6)")).getText();
        String prestadorEsperado = "--";
        String lote = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + linha + ") > td:nth-child(3)")).getText();
        String loteEsperado = "";
        String dtRecebimento = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child("+ linha +") > td:nth-child(7)")).getText();
        String dtRecebimentoEsperado = "";
        String categoria = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child("+ linha +") > td:nth-child(17)")).getText();
        String categoriaEsperado = "";
        String grupo = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child("+ linha +") > td:nth-child(5)")).getText();
        String grupoEsperado = "";*/
        String status = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child("+ linha +") > td:nth-child(15)")).getText();
        String statusEncerrado = "Encerrada";

        //Classe de espera
        WebDriverWait w = new WebDriverWait(driver, 800);

        //Printar número da auditoria
        System.out.println(ANSI_BLUE + "Reprocessando auditoria " + auditoria);


        if (!Objects.equals(status, statusEncerrado)){

            //Encontrar e clicar no botão "Reprocessar Conta"
            driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + linha + ") > td:nth-child(18) > a:nth-child(3)")).click();
            esperarAlertaOk(driver);

            //Esperar aviso de reprocessamento
            w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form[2]/table/tbody/tr/td")));

            //Printar sucesso do reprocessamento e voltar para listagem de auditoria
            System.out.println(ANSI_GREEN + "Auditoria " + auditoria + " reprocessada com sucesso");

        }else{
            System.out.println("A auditoria " + auditoria + " foi encerrada!");
            /*boolean t2 = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(2) > td:nth-child(1)")).isDisplayed();
            boolean t3 = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(3) > td:nth-child(1)")).isDisplayed();
            if (t2) {
                reprocessarAuditoriaSemPrestador(driver, auditoria, "2");
                System.out.println("A auditoria " + auditoria + " reprocessada na linha 2!");
            }else if (t3){
                reprocessarAuditoriaSemPrestador(driver, auditoria, "3");
                System.out.println("A auditoria " + auditoria + " reprocessada na linha 3!");
            }else{
                System.out.println("A auditoria " + auditoria + " não foi reprocessada!");
            }*/
    }}

    public static void recalcularAuditoriaFinalizada(WebDriver driver, String auditoria, int arg0) throws InterruptedException {
        //Classe de espera
        wait = new WebDriverWait(driver, timeOutInSeconds);

        //Printar número da auditoria finalizada
        System.out.println(ANSI_BLUE + "Recalculando auditoria finalizada " + auditoria);

        //Encontrar e clicar no botão "Recalcular Valores Vigentes"
        driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(18) > a:nth-child(6)")).click();
        esperarAlertaOk(driver);


        //Esperar tela de edição de auditoria
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Atualizar']")));

        //Printar sucesso do recalculo e voltar para listagem de auditoria
        System.out.println(ANSI_GREEN + "Auditoria " + auditoria + " recalculada com sucesso");
        driver.navigate().back();
        driver.navigate().refresh();

    }

    public static void recalcularValoresVigentesEnfermagem(WebDriver driver, int arg0) throws InterruptedException {
        String auditoria = null;
        String situacao = null;

        for (int i = 11; i > arg0; arg0++) {

            auditoria = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(1)")).getText();
            situacao = driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child("+ arg0 + ") > td:nth-child(15)")).getText();

            if(situacao.equals("Encerrada") || situacao.equals("Encerrado Glosa Total")){
                recalcularAuditoriaFinalizada(driver, auditoria, arg0);

            }else{
                recalcularAuditoriaAndamento(driver, auditoria, arg0);
            }

                /*driver.findElement(By.id("botaoFecharouVoltar")).click();
                driver.navigate().refresh();
                System.out.println(ANSI_BLUE + "Recalculando auditoria " + auditoria );
                driver.findElement(By.cssSelector("#auditoria > tbody > tr:nth-child(" + arg0 + ") > td:nth-child(17) > a:nth-child(4) > img")).click();
                Alert alert = driver.switchTo().alert();
                alert.accept(); // for OK
                w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Atualizar']")));
                System.out.println(ANSI_RED + "Auditoria " + auditoria + " recuperada e recalculada com sucesso");
                driver.navigate().back();
                driver.navigate().refresh();*/

            }
        }
        //throw new java.util.NoSuchElementException("Não foi possível continuar o processo (Verificar última tentativa de recalculo)");


    public static void esperarEpreencher2(WebDriver driver, WebElement elemento, String texto)
            throws InterruptedException {

        for (int i = 3; i < timeOutInSeconds; i++) {

            try {
                preencher(driver, elemento, texto);

                return;
            } catch (Exception e) {
                try {
                    Thread.sleep(900);
                    preencher(driver, elemento, texto);
                } catch (InterruptedException e1) {
                    Thread.sleep(900);
                    preencher(driver, elemento, texto);
                }

            }

        }

        throw new java.util.NoSuchElementException("Elemento não pode ser digitado!");

    }

    public static WebElement esperaEclica2(WebDriver driver, WebElement elemento) throws InterruptedException {
        try {
            for (int i = 0; i < 90; i++) {
                //cliarSeExibido
                if (elemento.isDisplayed()) {
                    aguardarElementoSerClicavel(driver, elemento).click();
                    break;
                }
                // Thread.sleep(900);
                //   espera();
                //  preencher(driver, elemento, texto);
            }
        } catch (Exception e) {
            try {
                //Thread.sleep(900);
                espera();
                aguardarElementoSerClicavel(driver, elemento).click();
            } catch (InterruptedException e1) {
                throw new java.util.NoSuchElementException("Elemento não pode ser digitado!");
                //  espera();
                // preencher(driver, elemento, texto);
            }
        }
        //throw new NoSuchElementException("Elemento não pode ser digitado!");
        return elemento;
    }

    public static void esperaEclica(WebDriver driver, WebElement elemento) throws InterruptedException {

        for (int i = 0; i < 90; i++) {

            try {

                aguardarElementoSerClicavel(driver, elemento).click();

                return;
            } catch (Exception e) {
                try {
                    espera();
                    aguardarElementoSerClicavel(driver, elemento).click();
                } catch (InterruptedException e1) {
                    espera();
                    aguardarElementoSerClicavel(driver, elemento).click();
                }

            }

        }

        throw new java.util.NoSuchElementException("Elemento não pode ser clicavel!");

    }


    public void aguardaEclicar(WebDriver driver, WebElement elemento) throws InterruptedException {

        for (int i = 0; i < 90; i++) {

            try {

                aguardarElementoSerClicavel(driver, elemento).click();

                return;
            } catch (Exception e) {
                try {
                    espera();
                    aguardarElementoSerClicavel(driver, elemento).click();
                } catch (InterruptedException e1) {
                    espera();
                    aguardarElementoSerClicavel(driver, elemento).click();
                }

            }

        }

        throw new java.util.NoSuchElementException("Elemento não pode ser clicavel!");

    }


    public static void preencherDivEditor(WebDriver driver, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByTagName('p')[0].innerHTML='" + text + "'");
    }

    public static void alterarPagina(WebDriver driver, int num) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }

    public static WebElement selecionarElemento(WebElement a, String arg1) {
        Select dropdown = new Select(a);
        dropdown.selectByVisibleText(arg1);

        return a;
    }

    public static WebElement aguardaElementoSerVisivel(WebDriver driver, WebElement elemento) {
        WebDriverWait espera = new WebDriverWait(driver, 325);
        espera.until(ExpectedConditions.visibilityOf(elemento));
        return elemento;

    }

    //=========================================
    public static Boolean aguardaCarregamentoDaPagina(WebDriver driver) {
        WebDriverWait espera = new WebDriverWait(driver, 120);
        return espera.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        // wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
    //=========================================

    public static WebElement aguardaElementoSerPresente(WebDriver driver, By by) {
        WebDriverWait espera = new WebDriverWait(driver, 325);
        return espera.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public static WebElement aguardaElementoSerPresente(WebDriver driver, WebElement elemento) {
        WebDriverWait espera = new WebDriverWait(driver, 325);
        WebElement until;
        until = espera.until(ExpectedConditions.presenceOfElementLocated((By) elemento));
        return until;

    }

    public static WebElement aguardaElementoSerVisivel(WebDriver driver, By elemento) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        WebElement campo = driver.findElement(elemento);

        return wait.pollingEvery(OF_SECONDS).ignoring(Exception.class).until(visibilityOf(campo));
    }

    public static WebElement aguardaElementoSerVisivel(WebDriver driver, String id) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        WebElement campo = driver.findElement(By.cssSelector("[id*='" + id + "']"));

        return wait.pollingEvery(OF_SECONDS).ignoring(Exception.class).until(visibilityOf(campo));
    }

    public static WebElement aguardaElementoSerClicavel(WebDriver driver, WebElement elemento) {
        WebDriverWait espera = new WebDriverWait(driver, 325);
        espera.until(ExpectedConditions.elementToBeClickable(elemento));
        return elemento;

    }

    public static WebElement aguardaElementoSerClicavel(WebDriver driver, By elemento) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        WebElement campo = driver.findElement(elemento);

        return wait.pollingEvery(OF_SECONDS).ignoring(Exception.class).until(elementToBeClickable(campo));
    }

    public static WebElement aguardaElementoSerClicavel(WebDriver driver, String id) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        WebElement campo = driver.findElement(By.cssSelector("[id*='" + id + "']"));

        return wait.pollingEvery(OF_SECONDS).ignoring(Exception.class).until(elementToBeClickable(campo));
    }


    public static WebElement aguardarElementoSerClicavel(WebDriver driver, WebElement elemento)
            throws InterruptedException {
        esperarAparecer(driver, elemento);
        WebDriverWait espera = new WebDriverWait(driver, 10, 25);
        espera.until(ExpectedConditions.visibilityOf(elemento));
        espera.until(ExpectedConditions.elementToBeClickable(elemento));
        return elemento;

    }

    public static void scrollByTop(WebDriver driver) {

        // Isso irá rolar a página para o topo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("window.scrollTo(-1000, 0)");
        js.executeScript("scroll(0, -250);");
    }

    public static void scrollByDown(WebDriver driver) {
        // Rolagem para baixo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,250)", "");
        // Rolagem Para cima: js.executeScript("scroll(0, -250);");

    }


    public static void rolarAteQueOelementoSejaEncontrado(WebDriver driver, String text) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Encontre o elemento pelo texto do link e armazene na variável "Element"
        WebElement Element = driver.findElement(By.linkText(text));

        // Isso rolará a página até que o elemento seja encontrado
        js.executeScript("arguments[0].scrollIntoView();", Element);

    }


    public static WebElement aguardaOElementoSerClicavel(WebDriver driver, WebElement elemento)
            throws InterruptedException {

        // esperaAparecer <<==============================
        new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(elemento));
        // esperaSerClicavel <<==============================
        new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.elementToBeClickable(elemento));
        // aguardaElementoSerVisivel(driver, elemento).click();
        aguardaElementoSerVisivel(driver, elemento);
        // aguardaElementoSerClicavel(driver, elemento);

        return wait.pollingEvery(OF_SECONDS).ignoring(Exception.class).until(ExpectedConditions.visibilityOf(elemento));

        // return elemento;
    }

    public static WebElement clicarBotao(WebDriver driver, WebElement elemento) {
        WebDriverWait espera = new WebDriverWait(driver, 325);
        new WebDriverWait(driver, 195).until(ExpectedConditions.invisibilityOf(elemento));
        espera.until(ExpectedConditions.visibilityOf(elemento)).click();
        espera.until(ExpectedConditions.elementToBeClickable(elemento)).click();
        return elemento;

    }

    public static WebElement escrever(WebDriver driver, WebElement elemento, String texto) {
        WebDriverWait wait = new WebDriverWait(driver, 325);
        wait.until(ExpectedConditions.visibilityOf(elemento)).sendKeys(texto);
        return elemento;

    }

    public static void geradorNumeroGuia(WebDriver driver, WebElement elemento, String aux) {
        Random gerador = new Random();
        aux = (String.valueOf(gerador.nextInt(10000000)));
        aguardaElementoSerVisivel(driver, elemento).sendKeys(aux);
    }


    public static void preencher(WebDriver driver, WebElement elemento, String texto) throws InterruptedException {
        esperarAparecer(driver, elemento).clear();
        aguardaElementoSerVisivel(driver, elemento);
        aguardaElementoSerClicavel(driver, elemento);
        aguardaElementoSerClicavel(driver, elemento).clear();
        aguardaElementoSerVisivel(driver, elemento).sendKeys(texto);
    }

    public static WebElement preencherData(WebDriver driver, WebElement elemento, String texto) throws InterruptedException {
        esperarAparecer(driver, elemento);
        aguardaElementoSerVisivel(driver, elemento);
        aguardaElementoSerClicavel(driver, elemento).click();
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(Keys.BACK_SPACE);
        elemento.sendKeys(texto);
        // aguardaElementoSerVisivel(driver, elemento).sendKeys(Keys.BACK_SPACE);
        //aguardaElementoSerVisivel(driver, elemento).sendKeys(texto);
        // aguardaElementoSerVisivel(driver, elemento).sendKeys(Keys.TAB);

        return elemento;
    }

    public static WebElement selecionaItemNaCombo(WebDriver driver, WebElement elemento, WebElement elemento2,
                                                  String texto) throws Exception {

        //aguardaElementoSerVisivel(driver, elemento);
        //aguardarElementoSerClicavel(driver, elemento);
        //preencher(driver, elemento, texto);
        esperarEpreencher(driver, elemento, texto);

        espera();
        WebElement dropDown = elemento2;

        List<WebElement> lista = dropDown.findElements(By.tagName("li"));

        for (WebElement webElement : lista) {
            if (webElement.getText().equals(texto)) {
                //espera();

                //aguardaElementoSerVisivel(driver, elemento2);
                //aguardarElementoSerClicavel(driver, elemento2);

                //webElement.click();
                esperarEclicar(driver, webElement);

                break;

            }

        }

        return elemento;

    }

    public static WebElement esperarAparecer(WebDriver driver, WebElement elemento) throws InterruptedException {
        new WebDriverWait(driver, 11750).until(ExpectedConditions.visibilityOf(elemento));
        return elemento;

    }

    public static void esperarImplicitamente(WebDriver driver, int segundos) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);

    }

    public static WebElement esperaTextoDesaparecerDoElemento(WebDriver driver, WebElement elemento, String texto)
            throws InterruptedException {
        new WebDriverWait(driver, 325).until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(elemento, texto)));
        return elemento;
    }

    public static WebElement esperaTextoAparecerNoElemento(WebDriver driver, WebElement elemento, String texto)
            throws InterruptedException {
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(elemento, texto));
        return elemento;
    }

    public static WebElement esperarDesaparecer(WebDriver driver, WebElement elemento) throws InterruptedException {
        new WebDriverWait(driver, 325).until(ExpectedConditions.invisibilityOf(elemento));
        return elemento;

    }

    public static void esperarOElementoPresente(WebDriver driver, WebElement elemento) {
        WebDriverWait espera = new WebDriverWait(driver, 325);
        final WebElement until = espera.until(ExpectedConditions.presenceOfElementLocated((By) elemento));
    }

    public static WebElement esperarEclicar(WebDriver driver, WebElement elemento) throws InterruptedException, java.util.NoSuchElementException {
        for (int i = 0; i < 3; i++) {

            try {
                aguardarElementoSerClicavel(driver, elemento).click();
                return elemento;
            } catch (java.util.NoSuchElementException e1) {
                espera();
                esperarEclicar(driver, elemento);
            }

        }
        throw new java.util.NoSuchElementException("Elemento não clicavel!");
    }

    public static WebElement esperarEpreencher333(WebDriver driver, WebElement elemento, String texto) throws InterruptedException {
        for (int i = 0; i < timeOutInSeconds; i++) {

            try {
                preencher(driver, elemento, texto);
                return elemento;
            } catch (java.util.NoSuchElementException e1) {
                espera();
            }

        }
        throw new java.util.NoSuchElementException("Elemento não clicavel!");

    }


    public static WebElement esperarEpreencher(WebDriver driver, WebElement elemento, String texto) throws InterruptedException {
        try {
            for (int i = 0; i < 90; i++) {
                //cliarSeExibido
                if (elemento.isDisplayed()) {
                    preencher(driver, elemento, texto);
                    break;
                }
                // Thread.sleep(900);
                //   espera();
                //  preencher(driver, elemento, texto);
            }
        } catch (Exception e) {
            try {
                //Thread.sleep(900);
                espera();
                preencher(driver, elemento, texto);
            } catch (InterruptedException e1) {
                throw new NoSuchElementException("Elemento não pode ser digitado!");
                //  espera();
                // preencher(driver, elemento, texto);
            }
        }
        //throw new NoSuchElementException("Elemento não pode ser digitado!");
        return elemento;
    }

    public static void frameEclicar(WebDriver driver, String by, WebElement elemento) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        esperaEclica2(driver, elemento);
        //esperaEclica(driver, elemento);
        //elemento.click();
        System.out.println("click ok");
        //esperarEclicar(driver, elemento);
        //driver.switchTo().defaultContent();
    }

    public static void frame_EsperaDesaparecer(WebDriver driver, String byFrame, WebElement elemento) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel;
        panel = elemento;
        WebElement panelCloseButton = panel;
        panelCloseButton = esperarDesaparecer(driver, elemento);
        driver.switchTo().defaultContent();

    }

    public static void frameEpreencher(WebDriver driver, String by, WebElement elemento, String texto) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        esperarEpreencher(driver, elemento, texto);
        driver.switchTo().defaultContent();
    }

    public static void frameEpreencher_Componente(WebDriver driver, String by, WebElement elemento, String texto) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        new WebDriverWait(driver, 11750).until(ExpectedConditions.visibilityOf(elemento));
        esperarEpreencher(driver, elemento, texto);
        Thread.sleep(1500);
        new WebDriverWait(driver, 11750).until(ExpectedConditions.visibilityOf(elemento));
        elemento.sendKeys(Keys.ARROW_DOWN);
        new WebDriverWait(driver, 11750).until(ExpectedConditions.visibilityOf(elemento));
        elemento.sendKeys(Keys.ENTER);
        driver.switchTo().defaultContent();
    }

    public static void frameEpreencherData(WebDriver driver, String by, WebElement elemento, String texto) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        aguardaElementoSerClicavel(driver, elemento);
        esperarEclicar(driver, elemento);
        preencherData(driver, elemento, texto);
        driver.switchTo().defaultContent();
    }

    public static void frameEseleciona(WebDriver driver, String by, WebElement elemento, String texto) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        esperarEclicar(driver, elemento);
        selecionarElemento(elemento, texto);
        driver.switchTo().defaultContent();
    }

    public static void frameEvalidaMensagem(WebDriver driver, String byFrame, WebElement elemento, String texto) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        Thread.sleep(2000);
        String texto2 = aguardaElementoSerVisivel(driver, elemento).getAttribute("textContent");

        if (!texto2.contains(texto)) {
            throw new Error("Mensagem não encontrada");
        }

        driver.switchTo().defaultContent();
    }


    public static WebElement validaMensagem(WebDriver driver, WebElement elemento, String texto) throws InterruptedException {
        Thread.sleep(2000);
        esperarAparecer(driver, elemento);
        String texto2 = aguardaElementoSerVisivel(driver, elemento).getAttribute("textContent");

        if (!texto2.contains(texto)) {
            throw new Error("Mensagem não encontrada");
        }

        return elemento;
    }

    public static void frameEmodalPreencher_componente(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, String texto) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        panelCloseButton = esperarAparecer(driver, elemento);
        panelCloseButton = esperarEpreencher(driver, elemento, texto);
        panelCloseButton = esperarAparecer(driver, elemento);
        espera();
        panelCloseButton.sendKeys(Keys.ARROW_DOWN);
        panelCloseButton.sendKeys(Keys.ENTER);
        espera();
        driver.switchTo().defaultContent();
    }

    public static void frameEmodal_esperarAparecer(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        panelCloseButton = esperarAparecer(driver, elemento);

        // new WebDriverWait(driver, 11750).until(ExpectedConditions.visibilityOf(aguardando));
        // return aguardando;
        driver.switchTo().defaultContent();

    }


    public static void frameEmodalPreencher_Data(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, String texto) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;

        panelCloseButton = preencherData(driver, elemento, texto);
        espera();
        panelCloseButton.sendKeys(Keys.TAB);
        // panelCloseButton.sendKeys(Keys.LEFT_ALT);
        // panelCloseButton.sendKeys(Keys.CLEAR);
        //   panelCloseButton.sendKeys(Keys.DELETE);

        //    panelCloseButton = esperarEpreencher(driver, elemento, texto);
        //   panelCloseButton = esperarAparecer(driver, elemento);

        // panelCloseButton.sendKeys(Keys.ENTER);
        // espera();
        driver.switchTo().defaultContent();
    }


    public static void frameEmodalPreencher(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, String texto) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        //panelCloseButton.sendKeys(texto);
        panelCloseButton = esperarEpreencher(driver, elemento, texto);
        panelCloseButton.sendKeys(Keys.TAB);
        espera();
        //fechaFrame
        driver.switchTo().defaultContent();
    }

    /*}    public static void frameEmodal_aguardaTexto(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, String texto) throws InterruptedException {
        //abreFrame
        WebDriverWait w = new WebDriverWait(driver, 800);
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        //panelCloseButton.sendKeys(texto);
        panelCloseButton = w.until(ExpectedConditions.textToBePresentInElement(elemento,texto));
        panelCloseButton.sendKeys(Keys.TAB);
        espera();
        //fechaFrame
        driver.switchTo().defaultContent();
    }*/

    public static void frameEmodal_Clicar(WebDriver driver, String byFrame, WebElement byModal, String byModalLocator) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator
        panelCloseButton.click();


        //fechaFrame
        driver.switchTo().defaultContent();

    }

    public static void modal_Clicar(WebDriver driver, WebElement byModal, String byModalLocator) throws InterruptedException {

        WebElement panel = byModal;
        WebElement panelButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator
        panelButton.click();

    }


    public static void frameEmodal_Click(WebDriver driver, String byFrame, WebElement byModal, String byModalLocator, WebElement elemento) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator

        panelCloseButton = esperarAparecer(driver, elemento);
        panelCloseButton = aguardarElementoSerClicavel(driver, elemento);
        panelCloseButton = esperarEclicar(driver, elemento);
        driver.switchTo().defaultContent();
    }

    public static void frameEmodal_ClickAccAlert(WebDriver driver, String byFrame, WebElement byModal, String byModalLocator, WebElement elemento) throws InterruptedException, UnhandledAlertException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator

        panelCloseButton = esperarAparecer(driver, elemento);
        panelCloseButton = aguardarElementoSerClicavel(driver, elemento);
        panelCloseButton = esperarEclicar(driver, elemento);
        driver.switchTo().defaultContent();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void frameEmodal_EsperaEPreencheComponente(WebDriver driver, String byFrame, WebElement byModal, String byModalLocator, WebElement espera, String texto) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator
        panelCloseButton = esperarAparecer(driver, espera);
        panelCloseButton = aguardarElementoSerClicavel(driver, espera);
        panelCloseButton = esperarEclicar(driver, espera);
        panelCloseButton = esperarEpreencher(driver, espera, texto);

        espera();
        panelCloseButton.sendKeys(Keys.ARROW_DOWN);
        panelCloseButton.sendKeys(Keys.ENTER);
        espera();


        driver.switchTo().defaultContent();

    }

    public static void frameEmodal_EsperaAparecer(WebDriver driver, String byFrame, WebElement byModal, WebElement byModalLocator) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        //modal
        WebElement panel = byModal;
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator

        new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(byModalLocator));
        //fechaFrame
        driver.switchTo().defaultContent();
    }

    public static void frameEmodal_scrollByDown(WebDriver driver, String byFrame, WebElement byModal) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        //modal
        WebElement panel = byModal;

        scrollByDown(driver);
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(Keys.ARROW_DOWN)));  //String byModalLocator
        panelCloseButton.click();
        //fechaFrame
        driver.switchTo().defaultContent();
    }

    public static WebElement frameE_esperarDesaparecer(WebDriver driver, String by, WebElement aguardando) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        new WebDriverWait(driver, 325).until(ExpectedConditions.invisibilityOf(aguardando));
        return aguardando;
        //driver.switchTo().defaultContent();
    }

    public static WebElement frameE_esperarAparecer(WebDriver driver, String by, WebElement aguardando) throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(by)));
        driver.switchTo().frame(frame);
        new WebDriverWait(driver, 11750).until(ExpectedConditions.visibilityOf(aguardando));
        return aguardando;
        //driver.switchTo().defaultContent();
    }

    public static void frameEmodal_Selecionar2(WebDriver driver, String byFrame, WebElement byModal, String byModalLocator) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        //modal
        WebElement panel = byModal;
        WebElement panelCloseButton = panel.findElement(By.xpath(String.valueOf(byModalLocator)));  //String byModalLocator
        panelCloseButton.click();
        espera();
        panelCloseButton.sendKeys(Keys.ARROW_DOWN);
        espera();
        panelCloseButton.sendKeys(Keys.ENTER);
        //fechaFrame
        driver.switchTo().defaultContent();

    }

    public static void frameEmodal_Selecionar(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, String texto) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        panelCloseButton = esperarAparecer(driver, elemento);
        panelCloseButton = esperarEclicar(driver, elemento);
        panelCloseButton = selecionarElemento(elemento, texto);
        //fechaFrame
        driver.switchTo().defaultContent();
    }

    public static void frameEmodal_EsperaDesaparecer(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        panelCloseButton = esperarDesaparecer(driver, elemento);
        driver.switchTo().defaultContent();
    }

    public static void frameEmodal_AguardarAteQueValueMude(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, WebElement textElement) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;
        //panelCloseButton = aguardaAteQueValueMude(driver,elemento,textElement);
        panelCloseButton = aguardaElementoSerPresente(driver, textElement);

        driver.switchTo().defaultContent();
    }

    public static WebElement aguardaAteQueValueMude(WebDriver driver, final WebElement elemento, WebElement textElement) {
        WebDriverWait wait = new WebDriverWait(driver, 900000);
        wait.until(new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {
                String value = elemento.getAttribute("value");

                while (!value.equals(textElement)) {
                    return true;
                }
                return false;

            }


        });
        return elemento;
    }


    public static void frameEmodal_validaMensagem(WebDriver driver, String byFrame, WebElement byModal, WebElement elemento, String texto) throws InterruptedException {
        //abreFrame
        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath(String.valueOf(byFrame)));
        driver.switchTo().frame(frame);
        WebElement panel = byModal;
        panel = elemento;
        WebElement panelCloseButton = panel;


        panelCloseButton = validaMensagem(driver, elemento, String.valueOf(texto));


        driver.switchTo().defaultContent();
    }

    public static void esperarAlertaOk(WebDriver driver) throws InterruptedException {
        int i=0;
        while(i++<5)
        {
            try
            {
                Alert alert = driver.switchTo().alert();
                alert.accept();
                break;
            }
            catch(NoAlertPresentException e)
            {
                Thread.sleep(1000);
                continue;
            }
        }
    }


}