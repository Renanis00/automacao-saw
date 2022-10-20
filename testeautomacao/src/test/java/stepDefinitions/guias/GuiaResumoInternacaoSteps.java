package stepDefinitions.guias;

import cucumber.TestContext;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.When;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.cucumber.java.en.When;
import gherkin.lexer.Th;
import org.springframework.core.task.TaskRejectedException;
import pageObjects.guias.GuiaResumoInternacaoPage;


public class GuiaResumoInternacaoSteps {
    private TestContext testContext;
    private GuiaResumoInternacaoPage page;

    public GuiaResumoInternacaoSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaResumoInternacaoPage();
    }

    @When("^fechar o informativo rede credenciada$")
    public void fechar_o_informativo_rede_credenciada() throws Throwable {
        page.fecharInformativo();

    }

    @When("acionar o menu TISS Painel de execucao")
    public void acionar_o_menu_TISS_Painel_de_execucao() throws Throwable {
        page.acionarMenuTISSPainelDeExecucao();

    }

    @And("acionar o menu TISS2 Painel de execucao")
    public void acionarOMenuTISS2PainelDeExecucaoSLabel() throws InterruptedException {
        page.acionarMenuTISS2PainelDeExecucao();

    }

    @When("^acionar opção Resumo Internação$")
    public void acionar_opção_Resumo_Internação() throws Throwable {
        page.clicarNoIconeResumoInternacao();
    }

    @When("^acionar campo guia de Solicitação de Internação Pesquisar$")
    public void acionar_campo_guia_de_Solicitação_de_Internação_Pesquisar() throws Throwable {
        page.clicarCampoGuiaDeSolicitaçãoDeInternaçãoPesquisar();

    }

    @When("^selecionar um tipo de guia \"([^\"]*)\"$")
    public void selecionar_um_tipo_de_guia(String arg1) throws Throwable {
        page.selecionarUmTipoDeGuia(arg1);

    }

    @When("^informar o numero da  guia \"([^\"]*)\"$")
    public void informar_o_numero_da_guia(String arg1) throws Throwable {
        page.informarNumeroDaGuia(arg1);
    }

    @When("^acionar botão pesquisar$")
    public void acionar_botão_pesquisar() throws Throwable {
        page.acionarBotaoPesquisar();
    }

    @When("^acionar opção para realização do vinculo$")
    public void acionar_opção_para_realização_do_vinculo() throws Throwable {
        page.clicarEmRealizarVinculo();

    }

    @When("^selecionar campo tipo de faturamento como \"([^\"]*)\"$")
    public void selecionar_campo_tipo_de_faturamento_como(String arg1) throws Throwable {
        page.selecionarUmTipoDeFaturamento(arg1);
    }

    @When("^informar campo data do inicio do faturamento como \"([^\"]*)\"$")
    public void informar_campo_data_do_inicio_do_faturamento_como(String arg1) throws Throwable {
        page.informarDataInicioFaturamento(arg1);
    }

    @When("^informar campo hora inicio faturamento como \"([^\"]*)\"$")
    public void informar_campo_hora_inicio_faturamento_como(String arg1) throws Throwable {
        page.informarCampoHoraInicioFaturamento(arg1);

    }

    @When("^informar campo data do fim do faturamento como \"([^\"]*)\"$")
    public void informar_campo_data_do_fim_do_faturamento_como(String arg1) throws Throwable {
        page.informarDataFimFaturamento(arg1);
    }

    @When("^informar campo hora fim faturamento como \"([^\"]*)\"$")
    public void informar_campo_hora_fim_faturamento_como(String arg1) throws Throwable {
        page.informarCampoHoraFimFaturamento(arg1);
    }

    @When("^selecionar campo Motivo Encerramento Internação como \"([^\"]*)\"$")
    public void selecionar_campo_Motivo_Encerramento_Internação_como(String arg1) throws Throwable {
        page.selecionarUmMotivoEncerramentoInternacao(arg1);
    }

    @When("^selecionar campo indicação de acidente como \"([^\"]*)\"$")
    public void selecionar_campo_indicação_de_acidente_como(String arg1) throws Throwable {
        page.selecionarUmaIndicacaoDeAcidente(arg1);
    }

    @When("^acionar checkbox procedimentos e exames realizados$")
    public void acionar_checkbox_procedimentos_e_exames_realizados() throws Throwable {
        page.acionarcheckBox();
    }

    @When("^informar Data para o procedimento ou exames realizados \"([^\"]*)\"$")
    public void informar_Data_para_o_procedimento_ou_exames_realizados(String arg1) throws Throwable {
        page.informarDataProcedimento(arg1);
    }

    @When("^informar hora inicio para procedimentos e exames realizados \"([^\"]*)\"$")
    public void informar_hora_inicio_para_procedimentos_e_exames_realizados(String arg1) throws Throwable {
        page.informarHoraInicioProcedimentos(arg1);
    }

    @When("^informar hora fim para procedimentos e exames realizados \"([^\"]*)\"$")
    public void informar_hora_fim_para_procedimentos_e_exames_realizados(String arg1) throws Throwable {
        page.informarHoraFimProcedimentos(arg1);
    }

    @When("^infrmar tabela para procedimentos e exames realizados \"([^\"]*)\"$")
    public void infrmar_tabela_para_procedimentos_e_exames_realizados(String arg1) throws Throwable {
        page.informarTabela(arg1);
    }

    @When("^informar campo Cód\\. Proced\\. como \"([^\"]*)\"$")
    public void informar_campo_Cód_Proced_como(String arg1) throws Throwable {
        page.informarCodProduto(arg1);
    }


    @When("^informar campo dosagem total do ciculo como \"([^\"]*)\"$")
    public void informar_campo_dosagem_total_do_ciculo_como(String arg1) throws Throwable {
        page.informarDosagemTotal(arg1);
    }

    @Given("^informar campo numero da carteira \"([^\"]*)\"$")
    public void informar_campo_numero_da_carteira_utilizar_cartão_para_SPSADT(String arg1) throws Throwable {
        page.campoNumeroDaCarteiraUtilizarCartao(arg1);
    }

    @When("^informar campo numero da carteira como \"([^\"]*)\"$")
    public void informar_campo_numero_da_carteira_como(String arg1) throws Throwable {
        page.campoNumeroDaCarteira(arg1);
    }

    @When("^acionar opção Internação$")
    public void acionar_opção_Internação() throws Throwable {
        page.acionaOpcaoInternacao();
    }

    @When("^informar Número da Carteira como \"([^\"]*)\"\"([^\"]*)\"$")
    public void informar_Número_da_Carteira_como(String arg1, String arg2) throws Throwable {
        page.informNumCarteirinha(arg1, arg2);
    }

    @When("^informar campo codigo na operadora \"([^\"]*)\"$")
    public void informar_campo_codigo_na_operadora(String arg1) throws Throwable {
        page.informarCodigoNaoperadora(arg1);
    }

    @When("^informar Número da Carteira como  \"([^\"]*)\"$")
    public void informar_Número_da_Carteira_como(String arg1) throws Throwable {
        page.informNumCarteira(arg1);
    }

    @When("^informar campo Nome do Profissional Solicitante como \"([^\"]*)\"$")
    public void informar_campo_Nome_do_Profissional_Solicitante_como(String arg1) throws Throwable {
        page.informarNomeProfSolicitante(arg1);
    }

    @And("selecionar campo Código CBO como \"([^\"]*)\"$")
    public void selecionarCampoCódigoCBO(String arg0) throws Throwable {
        page.selecionarCampoCBO(arg0);
    }

    @When("^selecionar campo solicitante codigo da operadora como \"([^\"]*)\"$")
    public void selecionar_campo_solicitante_codigo_da_operadora_como(String arg1) throws Throwable {
        page.selecioneCodigoSolicitanteDaOperadora(arg1);
    }

    @When("^informar o campo codigo da operadora como \"([^\"]*)\"$")
    public void informar_o_campo_codigo_da_operadora_como(String arg1) throws Throwable {
        page.informeCodigoDaOperadora(arg1);
    }


    @When("^informar campo data sugerida para internaçõa \"([^\"]*)\"$")
    public void informar_campo_data_sugerida_para_internaçõa(String arg1) throws Throwable {
        page.informarDataInternacao(arg1);

    }

    @When("^selecionar campo Tipo internação \"([^\"]*)\"$")
    public void selecionar_campo_Tipo_internação(String arg1) throws Throwable {
        page.slecionarTipoInternacao(arg1);
    }

    @When("^selecionar previsao de uso de OPME como não$")
    public void selecionar_previsao_de_uso_de_OPME_como_não() throws Throwable {
        page.selecionarUsoOPMEcomoNao();
    }

    @When("^selecionar previsao de uso de quimioterapia como não$")
    public void selecionar_previsao_de_uso_de_quimioterapia_como_não() throws Throwable {
        page.previsaoDeUsoDeQuimioterapiaNao();
    }

    @When("^selecionar campo carater de internação como \"([^\"]*)\"$")
    public void selecionar_campo_carater_de_internação_como(String arg1) throws Throwable {
        page.selecionarCaraterInternacao(arg1);
    }

    @When("^selecionar campo regime de internação como \"([^\"]*)\"$")
    public void selecionar_campo_regime_de_internação_como(String arg1) throws Throwable {
        page.selecionarRegimeInternacao(arg1);

    }

    @When("^informar Indicação Clínica como \"([^\"]*)\"$")
    public void informar_Indicação_Clínica_como(String arg1) throws Throwable {
        page.informarIndicacaoClinica(arg1);

    }

    @When("^selecionar indicação de acidente como \"([^\"]*)\"$")
    public void selecionar_indicação_de_acidente_como(String arg1) throws Throwable {
        page.selecionarIndicacaoAcidente(arg1);
    }

    @When("^selecionar o campo tabela taxa como \"([^\"]*)\"$")
    public void selecionar_o_campo_tabela_taxa_como(String arg1) throws Throwable {
        page.selecionaTabela(arg1);

    }

    @When("^informar codigo da tabela taxa \"([^\"]*)\"$")
    public void informar_codigo_da_tabela_taxa(String arg1) throws Throwable {
        page.informarCodTabela(arg1);
    }

    /*@When("^selecionar codigo da tabela como \"([^\"]*)\"$")
    public void selecionar_codigo_da_tabela_como(String arg1) throws Throwable {
        page.selecionaCodTabelaComo(arg1);
    }*/


    @When("^informar campo quantidade taxa \"([^\"]*)\"$")
    public void informar_campo_quantidade_taxa(String arg1) throws Throwable {
        page.informeQuantidade(arg1);
    }

    @When("^adicionar e selecionar o campo tabela procedimentos \"([^\"]*)\"$")
    public void adicionar_e_selecionar_o_campo_tabela_procedimentos(String arg1) throws Throwable {
        page.addInformarTabelaProcedimentos(arg1);
    }

    @When("^selecionar o campo tabela procedimentos \"([^\"]*)\"$")
    public void selecionar_o_campo_tabela_procedimentos(String arg1) throws Throwable {
        page.informeTabelaProcedimentos(arg1);
    }

    @When("^informar codigo procedimento da tabela \"([^\"]*)\"$")
    public void informar_codigo_procedimento_da_tabela(String arg1) throws Throwable {
        page.informarCodProcTabela(arg1);
    }


    @When("^informar campo quantidade procedimento \"([^\"]*)\"$")
    public void informar_campo_quantidade_procedimento(String arg1) throws Throwable {
        page.informeQuantidadeProc(arg1);
    }

    @When("^informar campo Data Provável da Admissão Hospitalar \"([^\"]*)\"$")
    public void informar_campo_Data_Provável_da_Admissão_Hospitalar(String arg1) throws Throwable {
        page.dataAdmiHosp(arg1);
    }

    @Then("^deve acionar o botão gravar$")
    public void deve_acionar_o_botão_gravar() throws Throwable {
        page.aconarGravar();

    }

    @When("^informar campo e-mail \"([^\"]*)\"$")
    public void informar_campo_e_mail(String arg1) throws Throwable {
        page.informarEmail(arg1);
    }

    @When("^informar campo telefone como \"([^\"]*)\" \"([^\"]*)\"$")
    public void informar_campo_telefone_como(String arg1, String arg2) throws Throwable {
        page.informarTelefone(arg1, arg2);
    }

    @Then("^acionar opção solicitar resumo de internação$")
    public void acionar_opção_solicitar_resumo_de_internação() throws Throwable {
        page.acionarResumoInternacao();
    }

    @Then("^acionar opção  Cadastrar guia de Resumo de internação$")
    public void acionar_opção_Cadastrar_guia_de_Resumo_de_internação() throws Throwable {
        page.cadastrarResumoInternacao();
    }

    @Then("^acionar opção internação alta$")
    public void acionar_opção_internação_alta() throws Throwable {
        page.acionarOpcaoInternacaoAlta();
    }

    @Then("^infromar Data Evento como \"([^\"]*)\"$")
    public void infromar_Data_Evento_como(String arg1) throws Throwable {
        page.informarDataEvento(arg1);
    }

    @Then("^acionar opção Tipo Evento como Internacao$")
    public void acionar_opção_Tipo_Evento_Internacao() throws Throwable {
        page.acionarTipoDeEventoComoInternacao();
    }

    @Then("^selecionar campo Motivo Encerramento como \"([^\"]*)\"$")
    public void selecionar_campo_Motivo_Encerramento_como(String arg1) throws Throwable {
        page.selecionarMotivoDeencerramento(arg1);
    }

    @Then("^acionar a opção que permite cadastrar$")
    public void acionar_a_opção_que_permite_cadastrar() throws Throwable {
        page.acionarCadastrar();
    }


    @Given("^selecionar tabela taxas \"([^\"]*)\"$")
    public void selecionar_tabela_taxas(String arg1) throws Throwable {
        page.selecionarTabelaTaxas(arg1);
    }

    @And("selecionar campo de uso de Solicitação após execução")
    public void selecionarCampoDeUsoDeSolicitaçãoApósExecução() throws Throwable {
        page.usoSolicitacaoAposExecucaoNao();
    }

    @And("apagar linhas de procedimentos")
    public void apagarLinhasDeProcedimentos() throws Throwable{
        page.apagarLinhasProcedimentos();
    }

    @And("adicionar e selecionar o campo tabela3 procedimentos \"([^\"]*)\"$")
    public void adicionarESelecionarOCampo3TabelaProcedimentos(String arg1) throws Throwable {
        page.informeTabelaProcedimentos3(arg1);
    }

    @And("informar codigo procedimento3 da tabela \"([^\"]*)\"$")
    public void informarCodigoProcedimento3DaTabela(String arg1) throws Throwable {
        page.informarCodTabela3(arg1);
        
    }

    @And("informar campo quantidade3 procedimento \"([^\"]*)\"$")
    public void informarCampoQuantidade3Procedimento(String arg1) throws Throwable{
        page.informeQuantidade3(arg1);
    }

    @And("adicionar e selecionar o campo tabela4 procedimentos \"([^\"]*)\"$")
    public void adicionarESelecionarOCampoTabela4Procedimentos(String arg1) throws Throwable{
        page.informeTabelaProcedimentos4(arg1);
    }

    @And("adicionar e selecionar o campo tabela5 procedimentos \"([^\"]*)\"$")
    public void adicionarESelecionarOCampoTabela5Procedimentos(String arg1) throws Throwable{
        page.informeTabelaProcedimentos5(arg1);
    }

    @And("informar codigo procedimento4 da tabela \"([^\"]*)\"$")
    public void informarCodigoProcedimento4DaTabela(String arg1) throws Throwable {
        page.informarCodTabela4(arg1);
    }

    @And("informar codigo procedimento5 da tabela \"([^\"]*)\"$")
    public void informarCodigoProcedimento5DaTabela(String arg1) throws Throwable {
        page.informarCodTabela5(arg1);
    }

    @And("informar campo quantidade4 procedimento \"([^\"]*)\"$")
    public void informarCampoQuantidade4Procedimento(String arg1) throws Throwable{
        page.informeQuantidade4(arg1);
    }

    @And("informar campo quantidade5 procedimento \"([^\"]*)\"$")
    public void informarCampoQuantidade5Procedimento(String arg1) throws Throwable{
        page.informeQuantidade5(arg1);
    }

    @And("adicionar e selecionar o campo tabela6 procedimentos \"([^\"]*)\"$")
    public void adicionarESelecionarOCampoTabela6Procedimentos(String arg1) throws Throwable {
        page.informeTabelaProcedimentos6(arg1);
    }

    @And("informar codigo procedimento6 da tabela \"([^\"]*)\"$")
    public void informarCodigoProcedimento6DaTabela(String arg1) throws Throwable {
        page.informarCodTabela6(arg1);
    }

    @And("informar campo quantidade6 procedimento \"([^\"]*)\"$")
    public void informarCampoQuantidade6Procedimento(String arg1) throws Throwable{
        page.informeQuantidade6(arg1);
    }
}