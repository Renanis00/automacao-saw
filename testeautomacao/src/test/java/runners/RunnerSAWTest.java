package runners;

import java.io.File;

import com.cucumber.listener.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests/", glue = {"stepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html/"},
        //plugin = {"json:target/cucumber.json", "rerun:target/rerun.txt"},

         //Terminal: mvn clean test -Deriver=chrome -Dcucumber.options="--tags '@fluxo33'"
         //Terminal: mvn clean test -Ddriver=chromeHL -Dcucumber.options="--tags '@Amanual'"

        //SCRIPTS PRONTOS
        //tags = {"@35AuditarSADT, @35SPSADTAuditarGuiaAutorizarTodos"},

        //TAGS OK
        //tags = {"@35SPSADTautorizada, @865InternacaoItensAdicionais, @865EletivaAutorizada"},


        // TAGS NOK
        //tags = {"@865EletivaAutorizada", @35SPSADTaguardando}, //Operadora não retorna beneficiário e serviço


        //AVULSOS
        //tags = {"@35Consulta"},
        tags = {"@recalcular32"},
        //tags = {"@importarGuia32"},
        //tags = {"@reprocessarAuditoriaCuritiba"},
        // = {"@fluxo1"},
        //tags = {"@inlocoLp"},
        //tags = {"@importarAutorizacaoCuritiba"},


        //DESENVOLVIMENTO
        //tags = {"@174SPSADTEmAnalise"},
        //tags = {"@2007SPSADTemAnalise"},
        //tags = {"@174Consulta"},
        //tags={"@865AuditarInternacao"},
        //tags = {"@35SPSADTAuditarGuia"},
        //tags={"@35SPSADTAuditarGuiaNegarTodos"},
        //tags={"@TISS40Eletiva"},


        monochrome = true)


public class RunnerSAWTest {
    @AfterClass
    public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getCaminhoReport()));

        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.7.0");
        Reporter.setSystemInfo("Maven", "4.0.0");
        Reporter.setSystemInfo("Java Version", "1.8.0_181");


    }
}