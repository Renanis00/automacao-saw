package stepDefinitions.guias;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.guias.GuiaDeOutrasDespesasPage;
import pageObjects.guias.GuiaResumoInternacaoPage;

public class GuiaDeOutrasDespesasSteps {

    private TestContext testContext;
    private GuiaDeOutrasDespesasPage page;

    public GuiaDeOutrasDespesasSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaDeOutrasDespesasPage();
    }

    @When("^acionar a guia de Outras Despesas$")
    public void acionar_a_guia_de_Outras_Despesas() throws Throwable {
        page.acionarGuiaDeoutrasDespesas();
    }

    @When("^acionar opção para pesquisar Guia Referenciada$")
    public void acionar_opção_para_pesquisar_Guia_Referenciada() throws Throwable {
        page.acionarPesquisaDeGuia();
    }

    @When("^selecionar campo tipo de guia \"([^\"]*)\"$")
    public void selecionar_campo_tipo_de_guia(String arg1) throws Throwable {
        page.selecionarTipoDeGuia(arg1);
    }

    @When("^informar campo Número Guia como \"([^\"]*)\"$")
    public void informar_campo_Número_Guia_como(String arg1) throws Throwable {
        page.informarCampoNumeroGuia(arg1);
    }
    @When("^informar um numero de guia autorizada \"([^\"]*)\"$")
    public void informar_um_numero_de_guia_autorizada(String arg1) throws Throwable {
        page.informarCampoNumeroGuiaAutorizada(arg1);
    }

    @When("^acionar botão para pesquisar$")
    public void acionar_botão_para_pesquisar() throws Throwable {
        page.acionarBotaoPesquisar();
    }

    @When("^acionar opção de realização do vinculo$")
    public void acionar_opção_de_realização_do_vinculo() throws Throwable {
        page.acionarRealizacaoVinculo();
    }

    @When("^selecionar campo CD como \"([^\"]*)\"$")
    public void selecionar_campo_CD_como(String arg1) throws Throwable {
        page.selecionaCampCD(arg1);
    }

    @When("^informar campo Data \"([^\"]*)\"$")
    public void informar_campo_Data(String arg1) throws Throwable {
        page.informeCampData(arg1);
    }

    @When("^informar Hora Inicial e Final \"([^\"]*)\" \"([^\"]*)\"$")
    public void informar_Hora_Inicial_e_Final(String arg1, String arg2) throws Throwable {
        page.informarHoraInicialFinal(arg1, arg2);
    }

    @When("^informar campo Tabela  \"([^\"]*)\"$")
    public void informar_campo_Tabela(String arg1) throws Throwable {
        page.selecionarTabela(arg1);
    }

    @When("^informar campo Cód Item como \"([^\"]*)\"$")
    public void informar_campo_Cód_Item_como(String arg1) throws Throwable {
        page.selecionarCodItem(arg1);
    }

    @When("^informar campo Qtde como \"([^\"]*)\"$")
    public void informar_campo_Qtde_como(String arg1) throws Throwable {
        page.informarCampoQt(arg1);
    }

    @When("^selecionar campo Fator Red \"([^\"]*)\"$")
    public void selecionar_campo_Fator_Red(String arg1) throws Throwable {
        page.selecionarFatorRed(arg1);
    }

    @When("^informar campo Valor Unitário \"([^\"]*)\"$")
    public void informar_campo_Valor_Unitário(String arg1) throws Throwable {
        page.informValorUnitario(arg1);
    }

    @Then("^devo acionar opção para gravar$")
    public void devo_acionar_opção_para_gravar() throws Throwable {
        page.acionarBotaoGravar();
    }


}
