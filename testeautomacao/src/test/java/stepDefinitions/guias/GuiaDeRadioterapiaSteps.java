package stepDefinitions.guias;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.guias.GuiaDeConsultaEletivaPage;
import pageObjects.guias.GuiaDeRadioterapiaPage;

public class GuiaDeRadioterapiaSteps {

    private TestContext testContext;
    private GuiaDeRadioterapiaPage page;

    public GuiaDeRadioterapiaSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaDeRadioterapiaPage();
    }

    @Then("^acionar opção de anexo$")
    public void acionar_opção_de_anexo() throws Throwable {
        page.acionarAnexo();
    }

    @Then("^acionar opção de novo anexo$")
    public void acionar_opção_de_novo_anexo() throws Throwable {
        page.acionarNovoAnexo();

    }

    @Then("^selecionar opção de radioterapia \"([^\"]*)\"$")
    public void selecionar_opção_de_radioterapia(String arg1) throws Throwable {
        page.selecionarOpcaoRadioterapia(arg1);
    }

    @Then("^acionar opção sim$")
    public void acionar_opção_sim() throws Throwable {
        page.acionarSIM();
    }

    @Then("^acionar opção sim para anexo$")
    public void acionar_opção_sim_para_anexo() throws Throwable {
        page.acionarSIMparaAnexar();
    }

    @Then("^informar o campo idade como \"([^\"]*)\"$")
    public void informar_o_campo_idade_como(String arg1) throws Throwable {
        page.informarIdade(arg1);
    }

    @Then("^selecionar sexo como \"([^\"]*)\"$")
    public void selecionar_sexo_como(String arg1) throws Throwable {
        page.selecionarSexo(arg1);
    }

    @Then("^informar telefone do profissional de saude \"([^\"]*)\"$")
    public void informar_telefone_do_profissional_de_saude(String arg1) throws Throwable {
        page.informarTelefone(arg1);
    }

    @Then("^selecionar campo Estadiamento como \"([^\"]*)\"$")
    public void selecionar_campo_Estadiamento_como(String arg1) throws Throwable {
        page.selecionarEstadiamento(arg1);
    }

    @Then("^selecionar o campo ECOG como \"([^\"]*)\"$")
    public void selecionar_o_campo_ECOG_como(String arg1) throws Throwable {
        page.selecionarECOG(arg1);
    }

    @Then("^selecionar campo Finalidade como \"([^\"]*)\"$")
    public void selecionar_campo_Finalidade_como(String arg1) throws Throwable {
        page.selacionarFinalidade(arg1);
    }

    @Then("^informar campo Número de Campos como \"([^\"]*)\"$")
    public void informar_campo_Número_de_Campos_como(String arg1) throws Throwable {
        page.informarNumeroDecampos(arg1);
    }

    @Then("^informar campo Dose por dia \"([^\"]*)\"$")
    public void informar_campo_Dose_por_dia(String arg1) throws Throwable {
        page.informarDosePorDia(arg1);
    }

    @Then("^informar campo Dose Total \"([^\"]*)\"$")
    public void informar_campo_Dose_Total(String arg1) throws Throwable {
        page.informarDoseTotal(arg1);
    }

    @Then("^informar campo Número de Dias \"([^\"]*)\"$")
    public void informar_campo_Número_de_Dias(String arg1) throws Throwable {
        page.informeNumeroDeDias(arg1);
    }

    @Then("^informar Data Prevista para Início de Administração \"([^\"]*)\"$")
    public void informar_Data_Prevista_para_Início_de_Administração(String arg1) throws Throwable {
        page.informeDataPrevistaInicioAdmin(arg1);
    }

    @Then("^informar Data da Solicitação \"([^\"]*)\"$")
    public void informar_Data_da_Solicitação(String arg1) throws Throwable {
        page.informarDataSolicitacao(arg1);
    }

    @Then("^acionar opção de gravar$")
    public void acionar_opção_de_gravar() throws Throwable {
        page.acionarGravar();
    }


}
