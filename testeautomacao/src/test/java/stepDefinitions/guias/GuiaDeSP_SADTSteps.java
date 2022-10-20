package stepDefinitions.guias;

import cucumber.TestContext;
//import cucumber.api.java.en.And;
//import io.cucumber.java.en.And;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pageObjects.guias.GuiaDeSP_SADTPage;

public class GuiaDeSP_SADTSteps {
    private TestContext testContext;
    private GuiaDeSP_SADTPage page;

    public GuiaDeSP_SADTSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGuiaDeSP_SADTPage();
    }

    @Given("^informar codigo do beneficiario para SPSADT \"([^\"]*)\"$")
    public void informar_codigo_do_beneficiario_para_SPSADT(String arg1) throws Throwable {
        page.informarCodigoBeneficiario(arg1);
    }

    @When("^clicar ok para Já existe um pedido eletrônico para esse beneficiário$")
    public void clicar_ok_para_Já_existe_um_pedido_eletrônico_para_esse_beneficiário() throws Throwable {
        page.clicarNoAlerta();
    }

    @Given("^informar campo codigo na operadora como \"([^\"]*)\"$")
    public void informar_campo_codigo_na_operadora_como(String arg1) throws Throwable {
        page.informarCodigoNaOperadora(arg1);


    }    @Given("^informar campo codigo executante na operadora como \"([^\"]*)\"$")
    public void informar_campo_codigo_executante_na_operadora_como(String arg1) throws Throwable {
        page.informarCodigoExecutanteNaOperadora(arg1);
    }

    @Given("^selecionar campo codigo na operadora como \"([^\"]*)\"$")
    public void selecionar_campo_codigo_na_operadora_como(String arg1) throws Throwable {
        page.selecionarCodigoNaOperadora(arg1);
    }

    @When("^informar campo nome do profissional executante como \"([^\"]*)\"$")
    public void informar_campo_nome_do_profissional_executante_como(String arg1) throws Throwable {
        page.informarCampoNomeDoProfissionalExecutante(arg1);
    }

    @When("^informar nome do profissional executante \"([^\"]*)\"$")
    public void informar_nome_do_profissional_executante(String arg1) throws Throwable {
        page.informarNomeDoProfissionalExecutante(arg1);
    }

    @When("^selecionar campo Caráter do Atendimento como \"([^\"]*)\"$")
    public void selecionar_campo_Caráter_do_Atendimento_como(String arg1) throws Throwable {
        page.selecionarCampoCaráterDoAtendimento(arg1);
    }

    @When("^selecionar campo tabela como \"([^\"]*)\"$")
    public void selecionar_campo_tabela_como(String arg1) throws Throwable {
        page.informarTabela(arg1);
    }

    @When("^informar Cód\\. na Operadora como \"([^\"]*)\"$")
    public void informar_Cód_na_Operadora_como(String arg0) throws Throwable {
        page.informaCodigoNaOperadora(arg0);
    }

    @When("^selecionar Cód\\. na Operadora como \"([^\"]*)\"$")
    public void selecionar_Cód_na_Operadora_como(String arg1) throws Throwable {
        page.selecionaCodigoNaOperadora(arg1);
    }

    @When("^informar codigo do procedimento como \"([^\"]*)\"$")
    public void informar_codigo_do_procedimento_como(String arg1) throws Throwable {
        page.codigoProcedimento(arg1);
    }

    @When("^informar quantidade do procedimento como \"([^\"]*)\"$")
    public void informar_quantidade_do_procedimento_como(String arg1) throws Throwable {
        page.qtdProcedimento(arg1);
    }

    @When("^clicar icone do campo Cód\\. na Operadora$")
    public void clicar_icone_do_campo_Cód_na_Operadora() throws Throwable {
        page.cliacarIconeCodNaOperadora();
    }

    @When("^selecionar campo tipo de atendimento como \"([^\"]*)\"$")
    public void selecionar_campo_tipo_de_atendimento_como(String arg1) throws Throwable {
        page.selecionarCampoTipoDeAtendimento(arg1);
    }

    @When("^selecionar campo Indicação de Acidente como \"([^\"]*)\"$")
    public void selecionar_campo_Indicação_de_Acidente_como(String arg1) throws Throwable {
        page.selecionarCampoIndicaçãoDeAcidente(arg1);
    }

    @When("^informar campo Indicação Clínica como \"([^\"]*)\"$")
    public void informar_campo_Indicação_Clínica_como(String arg1) throws Throwable {
        page.informarCampoIndicaçãoClínica(arg1);
    }

    @When("^informar numero da carteira como \"([^\"]*)\"$")
    public void informar_numero_da_carteira_como(String arg1) throws Throwable {
        page.informarNumeroDaCarteira(arg1);
    }

    @When("^informar codigo na operadora como \"([^\"]*)\"$")
    public void informar_codigo_na_operadora_como(String arg1) throws Throwable {
        page.informarCodNaOperadora(arg1);
    }

    @When("^informar nome do Profissional Executante \"([^\"]*)\"$")
    public void informar_nome_do_Profissional_Executante(String arg1) throws Throwable {
        page.informarProfExecutante(arg1);
    }

    @When("^selecionar Indicação de Acidente como \"([^\"]*)\"$")
    public void selecionar_Indicação_de_Acidente_como(String arg1) throws Throwable {
        page.selecionarIndicacaoAcidente(arg1);
    }

    @When("^selecionar a tabela como \"([^\"]*)\"$")
    public void selecionar_a_tabela_como(String arg1) throws Throwable {
        page.selecionarAtabela(arg1);
    }

    @Then("^devo selecionar Tipo de Consulta como \"([^\"]*)\"$")
    public void devo_selecionar_Tipo_de_Consulta_como(String arg1) throws Throwable {
        page.selecionarTipConsulta(arg1);
    }

    @Given("^selecionar campo Tipo Atendimento como \"([^\"]*)\"$")
    public void selecionar_campo_Tipo_Atendimento_como(String arg1) throws Throwable {
        page.selecionarCampoTipoAtendimento(arg1);
    }

    @And("^selecionar campo Tipo de Consulta como \"([^\"]*)\"$")
    public void selecionar_campo_Tipo_de_Consulta_como(String arg1) throws Throwable {
        page.selecionaTipoConsultqa(arg1);
    }

    @And("incluir documentos solicitados")
    public void incluirDocumentosSolicitados() throws InterruptedException {
        page.incluirDocumentoAnexo();
    }

    @Then("^incluir arquivo solicitado$")
    public void incluir_arquivo_solicitado() throws Throwable {
        page.incluirArquivoAnexo();
    }

    @Then("^armazenar numero da guia com status aguardando$")
    public void armazenar_numero_da_guia_com_status_aguardando() throws Throwable {
        page.armazenarNumeroGuiaAguardando();
    }

    @And("acionar opção que permite cancelar")
    public void acionarOpçãoQuePermiteCancelar() throws InterruptedException {
        page.acionarCancelar();
    }

    @When("^informarmar campo observação \"([^\"]*)\"$")
    public void informarmar_campo_observação(String arg1) throws Throwable {
        page.informarCampoOBS(arg1);

    }

    @Then("^acionar opção para pedir revisão$")
    public void acionar_opção_para_pedir_revisão() throws Throwable {
        page.pedirRevisao();
    }

    @Then("^informar campo mensagem e confirmar \"([^\"]*)\"$")
    public void informar_campo_mensagem_e_confirmar(String arg1) throws Throwable {
        page.informaMensagemEconfirma(arg1);
    }

    @Then("^informar mensagem e acionar opção para confirmar \"([^\"]*)\"$")
    public void informar_mensagem_e_acionar_opção_para_confirmar(String arg1) throws Throwable {
        page.MENSAGEMeCONFIRMA(arg1);

    }

    @Given("selecionar campo codigo CBOs como \"([^\"]*)\"$")
    public void selecionar_campo_codigo_CBOs_como(String arg1) throws Throwable {
        page.selecionarCampoCBOs(arg1);
    }

    @When("^informar campo e-mail como \"([^\"]*)\"$")
    public void informar_campo_e_mail_como(String arg1) throws Throwable {
        page.informEmail(arg1);
    }

    @When("^informar campo telefone \"([^\"]*)\" \"([^\"]*)\"$")
    public void informar_campo_telefone(String arg1, String arg2) throws Throwable {
        page.informTelefoneSPSADT(arg1, arg2);
    }

    @When("^informar o campo telefone \"([^\"]*)\" \"([^\"]*)\"$")
    public void informar_o_campo_telefone(String arg1, String arg2) throws Throwable {
        page.informTelefone(arg1, arg2);
    }

    @When("^informarmar campo ObservaçãoJustificativa \"([^\"]*)\"$")
    public void informarmar_campo_ObservaçãoJustificativa(String arg1) throws Throwable {
        page.informarObs(arg1);
    }

    @And("acionar opção para realizar procedimento")
    public void acionarOpçãoParaRealizarProcedimento() throws InterruptedException {
        page.acionarRealizarProcedimento();
    }

    @Then("^informar campo data para realizar serviço \"([^\"]*)\"$")
    public void informar_campo_data_para_realizar_serviço(String arg1) throws Throwable {
        page.informarData(arg1);

    }

    @Then("^informar campo Hora Inicial e Final \"([^\"]*)\" \"([^\"]*)\"$")
    public void informar_campo_Hora_Inicial_e_Final(String arg1, String arg2) throws Throwable {
        page.informarHoraInicioFim(arg1, arg2);
    }

    @Then("^informar campo Quantidade realizada \"([^\"]*)\"$")
    public void informar_campo_Quantidade_realizada(String arg1) throws Throwable {
        page.QtdRealizada(arg1);
    }

    @Then("^acionar o botão executar$")
    public void acionar_o_botão_executar() throws Throwable {
        page.acionarBtnExecutar();
    }

    @And("acionar botao executar")
    public void acionarBotaoExecutar() throws InterruptedException {
        page.acionarBtnExecutar();
    }

    @When("^selecionar campo tabela materiais I \"([^\"]*)\"$")
    public void selecionar_campo_tabela_materiais_I(String arg1) throws Throwable {
        page.selecionarCampoTabelaMatI(arg1);
    }

    @When("^informar codigo do material I \"([^\"]*)\"$")
    public void informar_codigo_do_material_I(String arg1) throws Throwable {
        page.informeCodigoMaterialI(arg1);
    }

    @When("^informar quantidade do material I \"([^\"]*)\"$")
    public void informar_quantidade_do_material_I(String arg1) throws Throwable {
        page.quantidadeMaterialI(arg1);
    }

    @When("^selecionar campo tabela materiais II \"([^\"]*)\"$")
    public void selecionar_campo_tabela_materiais_II(String arg1) throws Throwable {
        page.selecionarCampoTabelaMatII(arg1);
    }

    @When("^informar codigo do material II \"([^\"]*)\"$")
    public void informar_codigo_do_material_II(String arg1) throws Throwable {
        page.informeCodigoMaterialII(arg1);
    }

    @When("^informar quantidade do material II \"([^\"]*)\"$")
    public void informar_quantidade_do_material_II(String arg1) throws Throwable {
        page.quantidadeMaterialII(arg1);
    }

    @When("^selecionar campo tabela medicamentos I \"([^\"]*)\"$")
    public void selecionar_campo_tabela_medicamentos_I(String arg1) throws Throwable {
        page.selecionarCampoTabelaMedicamentosI(arg1);
    }

    @When("^informar codigo do medicamento I \"([^\"]*)\"$")
    public void informar_codigo_do_medicamento_I(String arg1) throws Throwable {
        page.informeCodigoMedicamentoI(arg1);
    }

    @When("^informar quantidade do medicamento I \"([^\"]*)\"$")
    public void informar_quantidade_do_medicamento_I(String arg1) throws Throwable {
        page.quantidadeMedicamentoI(arg1);
    }

    @When("^selecionar campo tabela medicamentos II \"([^\"]*)\"$")
    public void selecionar_campo_tabela_medicamentos_II(String arg1) throws Throwable {
        page.selecionarCampoTabelaMedicamentosII(arg1);
    }

    @When("^informar codigo do medicamento II \"([^\"]*)\"$")
    public void informar_codigo_do_medicamento_II(String arg1) throws Throwable {
        page.informeCodigoMedicamentoII(arg1);
    }

    @When("^informar quantidade do medicamento II \"([^\"]*)\"$")
    public void informar_quantidade_do_medicamento_II(String arg1) throws Throwable {
        page.quantidadeMedicamentoII(arg1);
    }

    @Then("^acionar opção para realizar os procedimentos$")
    public void acionar_opção_para_realizar_os_procedimentos() throws Throwable {
        page.realizar();
    }

    @Then("^informe Hora Inicial e Final \"([^\"]*)\" \"([^\"]*)\"$")
    public void informe_Hora_Inicial_e_Final(String arg1, String arg2) throws Throwable {
        page.informeHora(arg1, arg2);
    }

    @Then("^marcar todos os procedimentos$")
    public void marcar_todos_os_procedimentos() throws Throwable {
        page.marcarTodos();
    }

    @Then("^acionar opção que permite executar$")
    public void acionar_opção_que_permite_executar() throws Throwable {
        page.acionarExecutar();
    }

    @And("acionar opção adicionar")
    public void acionarOpçãoAdicionar() throws InterruptedException {
        page.acionarOpcaoAdicionar();
    }

    @Given("^informar codigo taxas \"([^\"]*)\"$")
    public void informar_codigo_taxas(String arg1) throws Throwable {
        page.informarCodigoTaxas(arg1);
    }

    @Given("^informar quantidade de taxas \"([^\"]*)\"$")
    public void informar_quantidade_de_taxas(String arg1) throws Throwable {
        page.informarQuantidadeTaxas(arg1);
    }

    @Then("^acionar opção para Anexar Laudos$")
    public void acionar_opção_para_Anexar_Laudos() throws Throwable {
        page.acionarOpcaoAnexarLaudos();
    }

    @Then("^acionar opção para incluir$")
    public void acionar_opção_para_incluir() throws Throwable {
        page.acionarOpcaoAnexarArquivo();
    }


    @Given("^acionar opção sair$")
    public void acionar_opção_sair() throws Throwable {
        page.acioanrSair();
    }

    @Given("^acionar o menu auditar solicitações$")
    public void acionar_o_menu_auditar_solicitações() throws Throwable {
        page.menuAuditarSolicitacoes();
    }

    @Given("^informar numero da guia \"([^\"]*)\"$")
    public void informar_numero_da_guia(String arg1) throws Throwable {
        page.informeNumeroGuia(arg1);
    }

    @Given("^acionar opção para pesquisar por Nº Guia TISS$")
    public void acionar_opção_para_pesquisar_por_Nº_Guia_TISS() throws Throwable {
        page.acionarOpcaoPesquisar();
    }

    @Given("^acioanr opção para detalhar a solicitação$")
    public void acioanr_opção_para_detalhar_a_solicitação() throws Throwable {
        page.acionarOpcaoDetalhar();
    }

    @And("acionar opção Clique aqui para verificar a auditoria!")
    public void acionarOpçãoCliqueAquiParaVerificarAAuditoria() throws InterruptedException {
        page.cliqueAquiParaVerificarAauditoria();
    }

    @And("acionar opção para iniciar o atendimento")
    public void acionarOpçãoParaIniciarOAtendimento() throws InterruptedException {
        page.iniciarAtendimento();
    }

    @And("acionar opção para autorizar todos")
    public void acionarOpçãoParaAutorizarTodos() throws InterruptedException {
        page.autorizarTodos();
    }

    @And("acionar opção para negar todos")
    public void acionarOpçãoParaNegarTodos() throws InterruptedException {
        page.negarTodos();
    }

    @Then("^acionar opção para autorizar$")
    public void acionar_opção_para_autorizar() throws Throwable {
        page.autorizar();
    }

    @Given("informa mensagem e ressalva \"([^\"]*)\"$")
    public void informar_mensagem_e_nega(String arg1) throws Throwable {
        page.informeMensagemEnega(arg1);
    }

    @Given("^informar ressalva e acionar opção de autorizar \"([^\"]*)\"$")
    public void informar_ressalva_e_acionar_opção_de_autorizar(String arg1) throws Throwable {
        page.informeResalvaEautoriza(arg1);
    }

    @Then("^informar uma ressalva e acionar opção de autorizar \"([^\"]*)\"$")
    public void informar_uma_ressalva_e_acionar_opção_de_autorizar(String arg1) throws Throwable {
        page.informeUmaResalvaEautoriza(arg1);
    }
    @Then("^informar ressalva e acionar a opção de autorizar \"([^\"]*)\"$")
    public void informar_ressalva_e_acionar_a_opção_de_autorizar(String arg1) throws Throwable {
        page.informeUmaResalvaEautoriza2(arg1);
    }

    @Then("^informar a ressalva e acionar opção de autorizar \"([^\"]*)\"$")
    public void informar_a_ressalva_e_acionar_opção_de_autorizar(String arg1) throws Throwable {
        page.informeAresalvaEautoriza(arg1);
    }

    @Then("^acionar opção Clique aqui para aprovar solicitação$")
    public void acionar_opção_Clique_aqui_para_aprovar_solicitação() throws Throwable {
        page.cliqueParaAprovarSolicitação();
    }

    @Then("^devo acionar opção que permite encerrar$")
    public void devo_acionar_opção_que_permite_encerrar() throws Throwable {
        page.encerrar();
    }

    @Then("^acionar opção Clique aqui para detalhar guia$")
    public void acionar_opção_Clique_aqui_para_detalhar_guia() throws Throwable {
        page.detalharGuiaProrrogacao();
    }

    @Then("^informar o motivo e confirmar \"([^\"]*)\"$")
    public void informar_o_motivo_e_confirmar(String arg1) throws Throwable {
        page.informeMotivoEconfirma(arg1);
    }

    @And("acionar opção para atender")
    public void acionarOpçãoParaAtender() throws InterruptedException {
        page.acionarAtesder();
    }

    @Given("^acionar opção Dados de Execução / Procedimentos e Exames realizados$")
    public void acionar_opção_Dados_de_Execução_Procedimentos_e_Exames_realizados() throws Throwable {
        page.clicarEmDadosDeExecucaoProcedExamesRealizados();
    }

    @Given("^informar campo Observação$")
    public void informar_campo_Observação() throws Throwable {
        page.informCampoOBS();
    }

    @And("selecionar campo código CBOs como \"([^\"]*)\"$")
    public void selecionarCampoCódigoCBOsComo(String arg0) throws Throwable {
        page.selecionarCampoCBOs(arg0);
    }

    @Then("^devo acionar a opção gravar$")
    public void devo_acionar_opção_gravar() throws Throwable {
        page.acionarBotaoGravar();
    }

}