package stepDefinitions.guias;

import cucumber.TestContext;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.cucumber.java.en.Then;
import pageObjects.guias.GuiaDeConsultaEletivaPage;

public class GuiaDeConsultaEletivaSteps {
    private TestContext testContext;
    private GuiaDeConsultaEletivaPage page;

    public GuiaDeConsultaEletivaSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaDeConsultaEletivaPage();
    }

    @Given("^acionar a guia consulta eletiva$")
    public void acionar_a_guia_consulta_eletiva() throws Throwable {
        page.acionarGuiaConsultaEletiva();
    }

    @Given("^informar campo numero da carteira utilizar cartão \"([^\"]*)\"$")
    public void informar_campo_numero_da_carteira_utilizar_cartão(String arg1) throws Throwable {
        page.informarNumeroDaCarteira(arg1);
    }

    @Given("^informar codigo do beneficiario \"([^\"]*)\"$")
    public void informar_codigo_do_beneficiario(String arg1) throws Throwable {
        page.informarCodBeneficiario(arg1);
    }

    @Given("^informar campo Código na OperadoraCNPJCPF \"([^\"]*)\"$")
    public void informar_campo_Código_na_OperadoraCNPJCPF(String arg1) throws Throwable {
        page.informaCodNaoperadora(arg1);
    }

    @When("^informar codigo vencido para o beneficiario \"([^\"]*)\"$")
    public void informar_codigo_vencido_para_o_beneficiario(String arg1) throws Throwable {
        page.informarCodBeneficiario(arg1);
    }

    @Given("^selecionar campo codigo na operadora CNPJCPF \"([^\"]*)\"$")
    public void selecionar_campo_codigo_na_operadora_CNPJCPF(String arg0) throws Throwable {
        page.selecionarCPFCNPJ(arg0);
    }

    @Given("^infromar campo Código do Procedimento \"([^\"]*)\"$")
    public void infromar_campo_Código_do_Procedimento(String arg1) throws Throwable {
        page.informeCodProcedimento(arg1);
    }

    @Given("^informar campo Validade da Carteira \"([^\"]*)\"$")
    public void informar_campo_Validade_da_Carteira(String arg1) throws Throwable {
        page.informeValidCarteira(arg1);
    }

    @Given("^informar campo nome do profissional executante \"([^\"]*)\"$")
    public void informar_campo_nome_do_profissional_executante(String arg1) throws Throwable {
        page.informarcampoNomeDoProfissional(arg1);
    }

    @Given("^selecionar campo de indicação de acidente como \"([^\"]*)\"$")
    public void selecionar_campo_de_indicação_de_acidente_como(String arg1) throws Throwable {
        page.selecionaIndicacaoAcidente(arg1);
    }

    @Given("^selecionar campo tabela \"([^\"]*)\"$")
    public void selecionar_campo_tabela(String arg1) throws Throwable {
        page.selecionaCampoTabela(arg1);
    }

    @Then("^devo acionar opção que permite gravar$")
    public void devo_acionar_opção_que_permite_gravar() throws Throwable {
        page.acionarGravar35();
    }

    @Then("^devo acionar opção que permite gravar865$")
    public void devo_acionar_opção_que_permite_gravar865() throws Throwable {
        page.acionarGravar865();
    }

    @Then("^armazenar numero da guia autorizada$")
    public void armazenar_numero_da_guia_autorizada() throws Throwable {
        page.armazenarNumeroDaGuiaAutorizada();
    }

    @Then("^armazenar numero da guia de internação autorizada$")
    public void armazenar_numero_da_guia_de_internação_autorizada() throws Throwable {
        page.armazenarNumeroDaGuiaInternacaoAutorizada();
    }

    @Given("^alternar pagina$")
    public void alternar_pagina() throws Throwable {
        page.alternarPagina();

    }

    @Then("^armazenar numero da guia de internação autorizada campo grande$")
    public void armazenar_numero_da_guia_de_internação_autorizada_campo_grande() throws Throwable {
        page.armazenarNumeroGuiaInternacaoAutorizada35();
    }

    @Then("^o sistema deverá apresentar mensagem: \"([^\"]*)\"$")
    public void o_sistema_deverá_apresentar_mensagem(String arg1) throws Throwable {
        page.validarAmensagem(arg1);
    }

    @When("^acionar a guia de quimioterapia$")
    public void acionar_a_guia_de_quimioterapia() throws Throwable {
        page.acionarQuimioterapia();
    }

    @When("^acionar campo numero guia referenciada$")
    public void acionar_campo_numero_guia_referenciada() throws Throwable {
        page.acionarNumeroGuiaReferenciada();
    }

    @When("^selecionar um tipo de quia como \"([^\"]*)\"$")
    public void selecionar_um_tipo_de_quia_como(String arg1) throws Throwable {
        page.acionarTipodeGuia(arg1);
    }

    @When("^informar campo numero guia como \"([^\"]*)\"$")
    public void informar_campo_numero_guia_como(String arg1) throws Throwable {
        page.informNumeroGuia(arg1);
    }

    @When("^acionar opção que permite pesquisar$")
    public void acionar_opção_que_permite_pesquisar() throws Throwable {
        page.acionaPesquisar();
    }

    @When("^informar campo peso como \"([^\"]*)\"$")
    public void informar_campo_peso_como(String arg1) throws Throwable {
        page.informarPeso(arg1);

    }

    @When("^informar campo altura como \"([^\"]*)\"$")
    public void informar_campo_altura_como(String arg1) throws Throwable {
        page.informarCampoAltura(arg1);
    }

    @When("^informar campo idade como \"([^\"]*)\"$")
    public void informar_campo_idade_como(String arg1) throws Throwable {
        page.informarIdade(arg1);
    }

    @When("^selecionar campo sexo como \"([^\"]*)\"$")
    public void selecionar_campo_sexo_como(String arg1) throws Throwable {
        page.selecionarSexo(arg1);
    }

    @When("^informar campo telefone como \"([^\"]*)\"$")
    public void informar_campo_telefone_como(String arg1) throws Throwable {
        page.infoCampoTel(arg1);
    }

    @When("^selecionar um tipo de estabelecimento \"([^\"]*)\"$")
    public void selecionar_um_tipo_de_estabelecimento(String arg1) throws Throwable {
        page.selecionarTipoEstabelecimento(arg1);
    }

    @When("^selecionar campo finalidade como \"([^\"]*)\"$")
    public void selecionar_campo_finalidade_como(String arg1) throws Throwable {
        page.informeFinalidade(arg1);
    }

    @When("^selecionar campo ECOG como \"([^\"]*)\"$")
    public void selecionar_campo_ECOG_como(String arg1) throws Throwable {
        page.informarCampoECOG(arg1);
    }

    @When("^selecionar campo tumor como \"([^\"]*)\"$")
    public void selecionar_campo_tumor_como(String arg1) throws Throwable {
        page.selecionaTumor(arg1);
    }

    @When("^selecionar campo nodulo como \"([^\"]*)\"$")
    public void selecionar_campo_nodulo_como(String arg1) throws Throwable {
        page.seecionarNodulo(arg1);
    }

    @When("^selecionar campo metastase como \"([^\"]*)\"$")
    public void selecionar_campo_metastase_como(String arg1) throws Throwable {
        page.selecionaMetastase(arg1);
    }

    @When("^informar campo plano terapeutico como \"([^\"]*)\"$")
    public void informar_campo_plano_terapeutico_como(String arg1) throws Throwable {
        page.informarCampoPlanoTerapeutico(arg1);
    }

    @When("^informar campo data prevista para administração como \"([^\"]*)\"$")
    public void informar_campo_data_prevista_para_administração_como(String arg1) throws Throwable {
        page.informData(arg1);
    }

    @When("^selacionar campo tabela como \"([^\"]*)\"$")
    public void selacionar_campo_tabela_como(String arg1) throws Throwable {
        page.selecionaTabela(arg1);
    }

    @When("^selecionar campo unidade de medida como \"([^\"]*)\"$")
    public void selecionar_campo_unidade_de_medida_como(String arg1) throws Throwable {
        page.selecionaCampoUnidadeMedida(arg1);
    }

    @When("^selecionar campo via admin como \"([^\"]*)\"$")
    public void selecionar_campo_via_admin_como(String arg1) throws Throwable {
        page.selecionarCampoViaAdmin(arg1);

    }

    @When("^informar campo numero de ciculos previstos como \"([^\"]*)\"$")
    public void informar_campo_numero_de_ciculos_previstos_como(String arg1) throws Throwable {
        page.informarCampoNumeroDeCiculosPrevistos(arg1);
    }

    @When("^informar campo ciculo atual como \"([^\"]*)\"$")
    public void informar_campo_ciculo_atual_como(String arg1) throws Throwable {
        page.informarCampoCiculoAtual(arg1);
    }

    @When("^informar numero de dias do ciculo atual \"([^\"]*)\"$")
    public void informar_numero_de_dias_do_ciculo_atual(String arg1) throws Throwable {
        page.numeroDeDiasDoCiculoAtual(arg1);
    }

    @When("^informar campo intervalo entre os ciculos como \"([^\"]*)\"$")
    public void informar_campo_intervalo_entre_os_ciculos_como(String arg1) throws Throwable {
        page.informarCampoIntervaloEntreOsCiculos(arg1);
    }

    @When("^informar campo data da solicitação \"([^\"]*)\"$")
    public void informar_campo_data_da_solicitação(String arg1) throws Throwable {
        page.infocampoDataDaSolicitacao(arg1);
    }

    @Then("^devo acionar opção que permite gravar guia$")
    public void devo_acionar_opção_que_permite_gravar_guia() throws Throwable {
        page.gravarguia();
    }

    @When("^selecionar campo estadiamento como \"([^\"]*)\"$")
    public void selecionar_campo_estadiamento_como(String arg1) throws Throwable {
        page.selecionarCampoEstadiamento(arg1);
    }

    @When("^acionar campo Superfície Corporal$")
    public void acionar_campo_Superfície_Corporal() throws Throwable {
        page.acionarCampoSuperfícieCorporal();
    }

    @When("^informar campo codigo medicamento como \"([^\"]*)\"$")
    public void informar_campo_codigo_medicamento_como(String arg1) throws Throwable {
        page.informarCampoCodigoMedicamento(arg1);
    }

    @When("^informar campo frequência como \"([^\"]*)\"$")
    public void informar_campo_frequência_como(String arg1) throws Throwable {
        page.informarCampoFrequência(arg1);
    }

    @Given("^acionar a guia SPSADT$")
    public void acionar_a_guia_SPSADT() throws Throwable {
        page.acionarAGuiaSPSADT();
    }

    @Given("^informar tipo de consulta \"([^\"]*)\"$")
    public void informar_tipo_de_consulta(String arg1) throws Throwable {
        page.informaTipoDeConsulta(arg1);
    }

    @Given("^acionar um local de atendimento$")
    public void acionar_um_local_de_atendimento() throws Throwable {
        page.acionarLocalAtendimento();
    }

    @Given("^acionar opção painel de execução$")
    public void acionar_opção_painel_de_execução() throws Throwable {
        page.acionarPainelExecucao();
    }

    @Then("^acionar opção para tele Saúde$")
    public void acionar_opção_para_tele_Saúde() throws Throwable {
        page.acionarTeleSaude();
    }

    @Then("^informar campo Celular do Médico como \"([^\"]*)\"$")
    public void informar_campo_Celular_do_Médico_como(String arg1) throws Throwable {

    }

    @Then("^infromar Email do Médico como \"([^\"]*)\"$")
    public void infromar_Email_do_Médico_como(String arg1) throws Throwable {

    }

    @Then("^marcar checkBox envio da solicitação Médico Email$")
    public void marcar_checkBox_envio_da_solicitação_Médico_Email() throws Throwable {

    }

    @Then("^marcar checkBox envio da solicitação Médico SMS$")
    public void marcar_checkBox_envio_da_solicitação_Médico_SMS() throws Throwable {

    }

    @Then("^informar campo Celular do Beneficiário como \"([^\"]*)\"$")
    public void informar_campo_Celular_do_Beneficiário_como(String arg1) throws Throwable {

    }

    @Then("^infromar Email do Beneficiário como \"([^\"]*)\"$")
    public void infromar_Email_do_Beneficiário_como(String arg1) throws Throwable {

    }

    @Then("^marcar checkBox envio da solicitação Beneficiário Email$")
    public void marcar_checkBox_envio_da_solicitação_Beneficiário_Email() throws Throwable {

    }

    @Then("^marcar checkBox envio da solicitação Beneficiário SMS$")
    public void marcar_checkBox_envio_da_solicitação_Beneficiário_SMS() throws Throwable {

    }

    @Then("^acionar opção para prosseguir$")
    public void acionar_opção_para_prosseguir() throws Throwable {

    }


    @Given("^acionar a opção painel de execução$")
    public void acionar_a_opção_painel_de_execução() throws Throwable {
        page.aconarPainelExecucao();
    }


    @And("selecionar campo Código CBO-c como \"([^\"]*)\"$")
    public void selecionar_campo_Código_CBOC_Como(String arg0) throws Throwable {
        page.selecionarCampoCBOc(arg0);
    }


    @And("selecionar grupo de atendimento \"([^\"]*)\"$")
    public void selecionarGrupoDeAtendimento(String arg0) throws Throwable{
        page.selecionarGrupoAtendimento(arg0);
    }
}
