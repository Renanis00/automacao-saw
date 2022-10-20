package stepDefinitions.auditoriaTecnica;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.auditoriaTecnica.EnviarXmlPage;
import pageObjects.auditoriaTecnica.ParametrizarWorkflowDeTrabalhoPage;
import pageObjects.guias.GuiaDeConsultaEletivaPage;

public class ParametrizarWorkflowDeTrabalhoSteps {
    private TestContext testContext;
    private ParametrizarWorkflowDeTrabalhoPage page;

    public ParametrizarWorkflowDeTrabalhoSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getParametrizarWorkflowDeTrabalhoPage();
    }

    @When("^acionar o menu Auditoria Técnica Workflow de Trabalho$")
    public void acionar_o_menu_Auditoria_Técnica_Workflow_de_Trabalho() throws Throwable {
        page.acionarMenuAuditTecnicaWorkflowDeTrabalho();
    }

    @When("^acionar opção Novo Workflow de Trabalho$")
    public void acionar_opção_Novo_Workflow_de_Trabalho() throws Throwable {
        page.novoWorkflow();
    }

    @When("^infromar campo Nome como \"([^\"]*)\"$")
    public void infromar_campo_Nome_como(String arg1) throws Throwable {
        page.informarNome(arg1);
    }

    @When("^acionar opção para cadastrar Workflow$")
    public void acionar_opção_para_cadastrar_Workflow() throws Throwable {
        page.acionarBtnGravar();
    }

    @When("^acionar opção para editar$")
    public void acionar_opção_para_editar() throws Throwable {
        page.acionarOpcaoEditar();
    }

    @When("^acionar opção nova etapa$")
    public void acionar_opção_nova_etapa() throws Throwable {
        page.acionaBotaoNovaEtqapa();
    }

    @When("^infromar campo Nome da Etapa como \"([^\"]*)\"$")
    public void infromar_campo_Nome_da_Etapa_como(String arg1) throws Throwable {
        page.informarNomeDaEtapa(arg1);
    }

    @When("^selecionar campo Grupo de Usuario como \"([^\"]*)\"$")
    public void selecionar_campo_Grupo_de_Usuario_como(String arg1) throws Throwable {
        page.selecionarCampoGrupoUsuario(arg1);
    }

    @When("^informar campo prazo dias como \"([^\"]*)\"$")
    public void informar_campo_prazo_dias_como(String arg1) throws Throwable {
        page.informPrazoDias(arg1);
    }

    @When("^selecionar campo Ação Automática como \"([^\"]*)\"$")
    public void selecionar_campo_Ação_Automática_como(String arg1) throws Throwable {
        page.selecionarAcaoAutomatica(arg1);
    }

    @Then("^devo acionar opção para gravar nova etapa$")
    public void devo_acionar_opção_para_gravar_nova_etapa() throws Throwable {
        page.acionarBotaoGravar();
    }
}
