package stepDefinitions.guias;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.guias.GuiaHonorariosPage;

public class GuiaDeHonorariosSteps {
    private TestContext testContext;
    private GuiaHonorariosPage page;

    public GuiaDeHonorariosSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaHonorariosPage();
    }

    @When("^acionar a guia de Honorários$")
    public void acionar_a_guia_de_Honorários() throws Throwable {
        page.acionarGuiaHonorarios();
    }

    @When("^acionar opção pesquisar Guia Referenciada$")
    public void acionar_opção_pesquisar_Guia_Referenciada() throws Throwable {
        page.acionarPesquisar();
    }
}
