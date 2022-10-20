package stepDefinitions.guias;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.guias.GuiaDeOPMEPage;
import pageObjects.guias.GuiaDeRadioterapiaPage;

public class GuiaDeOPMESteps {


    private TestContext testContext;
    private GuiaDeOPMEPage page;

    public GuiaDeOPMESteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaDeOPMEPage();
    }

    @Then("^selecionar opção de OPME \"([^\"]*)\"$")
    public void selecionar_opção_de_OPME(String arg1) throws Throwable {
        page.selecionarOpcaoOPME(arg1);

    }

    @When("^acionar a guia de OPME$")
    public void acionar_a_guia_de_OPME() throws Throwable {
        page.acionarGuiaOPME();
    }

    @When("^acionar opção de pesquisar Guia Referenciada$")
    public void acionar_opção_de_pesquisar_Guia_Referenciada() throws Throwable {
        page.pesquisarGuiasReferenciadas();
    }

    @When("^informar campo telefone \"([^\"]*)\"$")
    public void informar_campo_telefone(String arg1) throws Throwable {
        page.campoTelefone(arg1);
    }

    @When("^informar campo justificativa tecnica \"([^\"]*)\"$")
    public void informar_campo_justificativa_tecnica(String arg1) throws Throwable {
        page.infoCampJustificTecnica(arg1);
    }

    @When("^selecionar o campo tabela \"([^\"]*)\"$")
    public void selecionar_o_campo_tabela(String arg1) throws Throwable {
        page.selecionarTabela(arg1);
    }

    @When("^informar campo Cód como \"([^\"]*)\"$")
    public void informar_campo_Cód_como(String arg1) throws Throwable {
        page.informarCod(arg1);
    }

    @When("^informar campo Opção como \"([^\"]*)\"$")
    public void informar_campo_Opção_como(String arg1) throws Throwable {
       page.infoCampOpcao(arg1);
    }

    @When("^informar campo Qtd Solic como \"([^\"]*)\"$")
    public void informar_campo_Qtd_Solic_como(String arg1) throws Throwable {
       page.infomarQtdSolic(arg1);
    }

    @And("informar campo Código CBO-c como \"([^\"]*)\"$")
    public void informar_campo_Código_CBOC_Como(String arg0) throws Throwable {
        page.informarCampoCBOc(arg0);
    }

}
