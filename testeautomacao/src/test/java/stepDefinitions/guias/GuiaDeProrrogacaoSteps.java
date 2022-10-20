package stepDefinitions.guias;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.guias.GuiaDeProrrogacaoPage;

public class GuiaDeProrrogacaoSteps {

    private TestContext testContext;
    private GuiaDeProrrogacaoPage page;

    public GuiaDeProrrogacaoSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaDeProrrogacaoPage();
    }

    @When("^acionar a guia de Prorrogação$")
    public void acionar_a_guia_de_Prorrogação() throws Throwable {
        page.acionarGuiaProrrogacao();

    }

    @When("^acionar a opção de pesquisar Guia Referenciada$")
    public void acionar_a_opção_de_pesquisar_Guia_Referenciada() throws Throwable {
        page.acionarPesquisarGuia();
    }

    @When("^selecionar campo operadora ou prestador \"([^\"]*)\"$")
    public void selecionar_campo_operadora_ou_prestador(String arg1) throws Throwable {
        page.selecionarOperadoraPrestador(arg1);
    }

    @When("^informar campo Código na Operadora \"([^\"]*)\"$")
    public void informar_campo_Código_na_Operadora(String arg1) throws Throwable {
        page.informeCodNaOperadora(arg1);
    }

    @When("^informar campo nome do Profissional Solicitante \"([^\"]*)\"$")
    public void informar_campo_nome_do_Profissional_Solicitante(String arg1) throws Throwable {
        page.informarNomeProfSolicitante(arg1);
    }
    @When("^informar nome do Profissional Solicitante \"([^\"]*)\"$")
    public void informar_nome_do_Profissional_Solicitante(String arg1) throws Throwable {
        page.informaroNomeProfSolicitante(arg1);
    }
    @When("^informar o campo nome do Profissional Solicitante \"([^\"]*)\"$")
    public void informar_o_campo_nome_do_Profissional_Solicitante(String arg1) throws Throwable {
        page.informaroNomeProfSolicitante(arg1);
    }

    @When("^informar campo Indicação Clínica \"([^\"]*)\"$")
    public void informar_campo_Indicação_Clínica(String arg1) throws Throwable {
        page.informarCampoIndicacaoClinica(arg1);
    }

    @When("^informar o campo Tabela  \"([^\"]*)\"$")
    public void informar_o_campo_Tabela(String arg1) throws Throwable {
       page.informTabela(arg1);
    }

    @When("^informar campo Código do Procedimento \"([^\"]*)\"$")
    public void informar_campo_Código_do_Procedimento(String arg1) throws Throwable {
      page.informCodProced(arg1);
    }

    @When("^informar campo Qtd Solic \"([^\"]*)\"$")
    public void informar_campo_Qtd_Solic(String arg1) throws Throwable {
      page.informarQtdSolic(arg1);
    }

}
