package stepDefinitions.auditoriaTecnica;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import pageObjects.auditoriaTecnica.AuditoriaDeContasPage;

public class RecalcularValoresVigentesSteps {
    private TestContext testContext;
    private AuditoriaDeContasPage page;

    public RecalcularValoresVigentesSteps(TestContext context) throws Exception{
        testContext = context;
        page = testContext.getPageObjectManager().getAuditoriaDeContasPage();
    }

    //Realcular valores vigentes
    
    @When("acessar listagem de auditorias recalculo \"([^\"]*)\"$")
    public void acessarListagemDeAuditorias(String arg2) throws Throwable{
        page.acessarContasMedicasEnfermagem(arg2);
    }

    @And("recalcular auditoria de numero \"([^\"]*)\", páginas totais \"([^\"]*)\" e página atual \"([^\"]*)\"$")
    public void recalcularAuditoriaDeNumero(int arg0, int arg1, int arg2) throws Throwable{
        page.recalcularValorVigenteAuditoria(arg0, arg1, arg2);
    }
}
