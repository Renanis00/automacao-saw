package stepDefinitions.auditoriaConcorrente;

import cucumber.TestContext;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.cucumber.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.auditoriaConcorrente.AgendamentoCirurgicoPage;

public class AgendamentoCirurgicoSteps {

    private TestContext testContext;
    private AgendamentoCirurgicoPage page;

    public AgendamentoCirurgicoSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getAgendamentoCirurgicoPage();
    }

    @When("acionar o menu auditoria concorrente internações")
    public void acionarOMenuAuditoriaConcorrenteInternações() throws InterruptedException {
        page.menuAuditoriaConcorrenteInternacoes();
    }

    @And("acionar opcao agendamento cirurgico")
    public void acionarOpcaoAgendamentoCirurgico() throws InterruptedException {
        page.acionarAgendamentoCirurgico();
    }

    @And("informar campo prestador como \"([^\"]*)\"$")
    public void informarCampoPrestadorComo(String arg0) throws InterruptedException {
        page.codigoPrestador(arg0);
    }

    @And("informar campo sala como \"([^\"]*)\"$")
    public void informarCampoSalaComo(String arg0) throws InterruptedException {
        page.informeSala(arg0);
    }

    @And("informar campo data como \"([^\"]*)\"$")
    public void informarCampoDataComo(String arg0) throws InterruptedException {
        page.informarCampoData(arg0);
    }

    @And("informar campo Local de Atendimento como \"([^\"]*)\"$")
    public void informarCampoLocalDeAtendimentoComo(String arg0) throws InterruptedException {
        page.informarCampoLocalDeAtendimento(arg0);
    }

    @And("informar campo Número Guia Prestador como \"([^\"]*)\"$")
    public void informarCampoNúmeroGuiaPrestadorComo(String arg0) throws InterruptedException {
        page.informarCampoNúmeroGuiaPrestador(arg0);
    }

    @And("informar campo Centro Cirúrgico como \"([^\"]*)\"$")
    public void informarCampoCentroCirúrgicoComo(String arg0) throws InterruptedException {
        page.informarCampoCentroCirúrgico(arg0);
    }

    @And("informar campo Codigo Beneficiário como \"([^\"]*)\"$\"([^\"]*)\"$")
    public void informarCampoCodigoBeneficiárioComo(String arg0, String arg1) throws InterruptedException {
        page.informarCampoCodigoBeneficiário(arg0, arg1);
    }

    @And("informar campo Prestador Atividade como \"([^\"]*)\"$")
    public void informarCampoPrestadorAtividadeComo(String arg0) throws InterruptedException {
        page.informarCampoPrestadorAtividade(arg0);
    }

    @And("selecionar tabela como \"([^\"]*)\"$")
    public void selecionarTabelaComo(String arg0) throws InterruptedException {
        page.selecionarTabelaComo(arg0);
    }

    @Then("devo acionar botão gravar")
    public void devoAcionarBotãoGravar() throws InterruptedException {
        page.acionarGravar();
    }

    @And("informar codigo como \"([^\"]*)\"$")
    public void informarCodigoComo(String arg0) throws InterruptedException {
        page.informarCampoCodigo(arg0);
    }

    @And("acionar o menu auditoria mapa cirurgico")
    public void acionarOMenuAuditoriaMapaCirurgico() throws InterruptedException {
        page.menuAuditoriaConcorrenteMapaCirurgico();
    }

   /* @And("acionar opção para pesquisar")
    public void acionarOpçãoParaPesquisar() throws InterruptedException {
        page.acionarPesquisar();
    }*/

    @And("acionar opção ações detalhar")
    public void acionarOpçãoAçõesDetalhar() throws InterruptedException {
        page.acoesDetalhar();
    }

    @And("informar campo prestador \"([^\"]*)\"$")
    public void informarCampoPrestador(String arg0) throws InterruptedException {
        page.informCampPrestador(arg0);
    }

    @And("acessar formulário de LP")
    public void acessarFormulárioDeLP() throws InterruptedException {
        page.acessarFormLp();
    }
}