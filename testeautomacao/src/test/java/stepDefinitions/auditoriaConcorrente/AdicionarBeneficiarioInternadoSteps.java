package stepDefinitions.auditoriaConcorrente;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.auditoriaConcorrente.AdicionarBeneficiarioInternadoPage;

public class AdicionarBeneficiarioInternadoSteps {
    private TestContext testContext;
    private AdicionarBeneficiarioInternadoPage page;

    public AdicionarBeneficiarioInternadoSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getAdicionarBeneficiarioInternadoPage();
    }

    @And("acionar botão para adicionar beneficiario internado")
    public void  acionarBotãoParaAdicionarBeneficiarioInternado() throws InterruptedException {
        page.acionarBotaoBeneficiarioInternado();

    }

    @And("informar campo codigo beneficiario como \"([^\"]*)\"\"([^\"]*)\"$")
    public void informarCampoCodigoBeneficiarioComo(String arg0, String arg1) throws InterruptedException {
        page.informarCodigoBeneficiario(arg0, arg1);
    }

    @And("informar campo codigo prestador como \"([^\"]*)\"$")
    public void informarCampoCodigoPrestadorComo(String arg0) throws InterruptedException {
        page.informarCampoCodigoPrestador(arg0);
    }

    @And("informar campo data da internação como \"([^\"]*)\"$")
    public void informarCampoDataDaInternaçãoComo(String arg0) throws InterruptedException {
        page.infoCampDataInternacao(arg0);
    }

    @And("selecionar campo gerarAuditoria como Sim")
    public void selecionarCampoGerarAuditoriaComoSim() throws InterruptedException {
        page.informaCampoGerarAuditoriaComoSim();
    }

    @Then("devo acionar botão cadastrar")
    public void devoAcionarBotãoCadastrar() throws InterruptedException {
        page.acionarBotãoCadastrar();
    }

    @And("selecionar um tipo de auditoria \"([^\"]*)\"$")
    public void selecionarUmTipoDeAuditoria(String arg0) throws InterruptedException {
        page.selecionarUmTipoDeAuditoria(arg0);
    }

    @And("selecionar campo Tipo internação clinica")
    public void selecionarCampoTipoInternaçãoClinica() throws InterruptedException {
        page.campoTipoInternaçãoClinica();
    }

    @And("acionar o menu auditoria concorrente gestão de visitas")
    public void acionarOMenuAuditoriaConcorrenteGestãoDeVisitas() throws InterruptedException {
        page.menuAuditoriaConcorrenteGestãoDeVisitas();
    }

    @And("selecionar um internado botão ações alterar visitas$")
    public void selecionarUmInternadoBotãoAçõesAlterarVisitas() throws InterruptedException {
        page.selecionarUmInternadoAlterarVisita();
    }

    @And("informar campo data inicio como \"([^\"]*)\"$")
    public void informarCampoDataInicioComo(String arg0) throws InterruptedException {
        page.informarCampoDatInicio(arg0);
    }

    @And("acionar opção não atribuidas")
    public void acionarOpçãoNãoAtribuidas() throws InterruptedException {
        page.acionarOpcaoNaoAtribuidas();
    }

    @And("acionar opção para selecionar beneficiario")
    public void acionarOpçãoParaSelecionarBeneficiario() throws InterruptedException {
        page.selecionarBeneficiario();
    }

    @And("acionar radioButton usuarios")
    public void acionarRadioButtonUsuarios() throws InterruptedException {
        page.radioButtonUsuarios();
    }

    @And("o sistema deverá apresentar mensagem na modal: \"([^\"]*)\"$")
    public void oSistemaDeveráApresentarMensagemNaModal(String arg0) throws InterruptedException {
        page.apresentarMensagemNaModal(arg0);
    }

    @And("informar auditor como \"([^\"]*)\"$")
    public void informarAuditorComo(String arg0) throws InterruptedException {
        page.informarAuditor(arg0);
    }

    @And("acionar o botão Gravar")
    public void acionarOBotãoGravar() throws InterruptedException {
        page.clicarNoGravar();
    }

    @And("o sistema deverá apresentar mensagem na modal de Atribuir Visita: \"([^\"]*)\"$")
    public void oSistemaDeveráApresentarMensagemNaModalDeAtribuirVisita(String arg0) throws InterruptedException {
        page.apresentarMensagemNaModalDeAtribuirVisita(arg0);
    }

    @And("acionar opção ações alterar visitas")
    public void acionarOpçãoAçõesAlterarVisitas() {
    }

    @And("informar auditor \"([^\"]*)\"$")
    public void informarAuditor(String arg0) throws InterruptedException {
        page.informarUmAuditor(arg0);
    }

    @And("infromar data inicio \"([^\"]*)\"$")
    public void infromarDataInicio(String arg0) throws InterruptedException {
        page.informarCampoDatInicio(arg0);
    }

    @And("informar campo CID como \"([^\"]*)\"$")
    public void informarCampoCIDComo(String arg0) throws InterruptedException {
        page.adicionarCID(arg0);
    }

    @And("acionar opção não para gerar auditoria")
    public void acionarOpçãoNãoParaGerarAuditoria() throws InterruptedException {
        page.acionarNaoParaAuditoria();
    }

    @And("infromar data fim \"([^\"]*)\"$")
    public void infromarDataFim(String arg0) throws InterruptedException {
        page.informarCampoDatFim(arg0);
    }

    @And("acionar Gravar para atribuir visita")
    public void acionarGravarParaAtribuirVisita() throws InterruptedException {
        page.botaoGravar();
    }

    @And("o sistema deverá apresentar mensagem na modal de Alterar Visita: \"([^\"]*)\"$")
    public void oSistemaDeveráApresentarMensagemNaModalDeAlterarVisita(String arg0) throws InterruptedException {
        page.validarMensagemModalAlterarVisitas(arg0);
    }

    @And("informar campo codigo beneficiario \"([^\"]*)\"$")
    public void informarCampoCodigoBeneficiario(String arg0) throws InterruptedException {
        page.informarCampoCodBeneficiario(arg0);
    }

    @And("acionar botão que permite pesquisar")
    public void acionarBotãoQuePermitePesquisar() throws InterruptedException {
        page.acionarBotaoPesquisar();
    }

    @And("acionar opção Caráter Atendimento como Urgência e Emergência")
    public void acionarOpçãoCaráterAtendimentoComoUrgênciaEEmergência() throws InterruptedException {
        page.acionarOpcaoCaraterAtendimentoUrgenciaEmergencia();
    }

    @And("aguardar tempo do match")
    public void aguardarTempoDoMatch() throws InterruptedException {
        page.aguardarTempoMath();
    }
}
