package stepDefinitions.auditoriaTecnica;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.auditoriaTecnica.EnviarXmlPage;
import pageObjects.auditoriaTecnica.ParametrizarCategoriasDeRegrasPage;
import pageObjects.auditoriaTecnica.ParametrizarWorkflowDeTrabalhoPage;
import pageObjects.guias.GuiaDeConsultaEletivaPage;

public class ParametrizarCategoriasDeRegrasSteps {
    private TestContext testContext;
    private ParametrizarCategoriasDeRegrasPage page;

    public ParametrizarCategoriasDeRegrasSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getParametrizarCategoriasDeRegrasPage();
    }


    @When("^acionar o menu Auditoria Técnica Categorias De Regras$")
    public void acionar_o_menu_Auditoria_Técnica_Categorias_De_Regras() throws Throwable {
        page.acionarMenuCategoriaRegras();
    }

    @When("^acionar opção Nova categoria$")
    public void acionar_opção_Nova_categoria() throws Throwable {
        page.acionarOpcaoNovaCategoria();
    }

    @When("^infromar campo Descrição como \"([^\"]*)\"$")
    public void infromar_campo_Descrição_como(String arg1) throws Throwable {
        page.informarCampoDescricao(arg1);
    }

    @When("^infromar campo Data Início como \"([^\"]*)\"$")
    public void infromar_campo_Data_Início_como(String arg1) throws Throwable {
        page.informarData(arg1);
    }

    @When("^selecionar campo Workflow como \"([^\"]*)\"$")
    public void selecionar_campo_Workflow_como(String arg1) throws Throwable {
        page.selecionarWorkflow(arg1);
    }

    @When("^acionar opção Habilitado como sim$")
    public void acionar_opção_Habilitado_como_sim() throws Throwable {
        page.informarSim();
    }

    @When("^devo acionar opção para gravar categoria$")
    public void devo_acionar_opção_para_gravar_categoria() throws Throwable {
        page.acionarOpcaoGravar();
    }

    @Then("^devo acionar opção regras$")
    public void devo_acionar_opção_regras() throws Throwable {
        page.acionarOpcaoRegras();

    }

    @Then("^acionar checkbox RESUMO DE INTERNAÇÃO$")
    public void acionar_checkbox_RESUMO_DE_INTERNAÇÃO() throws Throwable {
        page.acionacheckboxResumoInternacao();
    }

    @Then("^acionar opção gravar regra$")
    public void acionar_opção_gravar_regra() throws Throwable {
        page.opcaoGravar();
    }

    @Then("^acionar aba contratados$")
    public void acionar_aba_contratados() throws Throwable {
        page.acionarAbaContratados();
    }

    @Then("^acionar opção para adicionar contratados$")
    public void acionar_opção_para_adicionar_contratados() throws Throwable {
        page.adicionarContratado();
    }

    @Then("^informar um contratado válido coo \"([^\"]*)\"$")
    public void informar_um_contratado_válido_coo(String arg1) throws Throwable {
        page.informarContratado(arg1);
    }

    @Then("^acionar opção gravar contratado$")
    public void acionar_opção_gravar_contratado() throws Throwable {
       page.gravarContratado();
    }
}
