package stepDefinitions.auditoriaConcorrente;
import cucumber.TestContext;
import pageObjects.auditoriaConcorrente.AuditoriaInLocoPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class AuditoriaInLocoSteps {
    private TestContext testContext;
    private AuditoriaInLocoPage page;

    public AuditoriaInLocoSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getAuditoriaInLocoPage();
    }

    @When("acionar o menu auditar internados")
    public void acionarOMenuAuditarInternados() throws InterruptedException {
        page.menuAuditarInternados();
    }

    @And("selecionar um internado$")
    public void selecionarUmInternado() throws InterruptedException {
        page.selecionaInternado();
    }

    @And("selecionar campo status como \"([^\"]*)\"$")
    public void selecionarCampoStatusComo(String arg0) throws InterruptedException {
        page.selecionaStatus(arg0);
    }

    @And("acionar opção pesquisar")
    public void acionarOpçãoPesquisar() throws InterruptedException {
        page.pesquisar();
    }

    @And("acionar botao imprimir")
    public void acionarBotaoImprimir() throws InterruptedException {
        page.acionarBtnImprimir();
    }

    @And("acionar botao visitas")
    public void acionarBotaoVisitas() throws InterruptedException {
        page.botaoVisitas();
    }

    @And("acionar opção iniciar")
    public void acionarOpçãoIniciar() throws InterruptedException {
        page.acionarOpcaoIniciar();
    }

    @And("informar codigo da operadora e codigo do beneficiario \"([^\"]*)\"\"([^\"]*)\"$")
    public void informarCodigoDaOperadoraECodigoDoBeneficiario(String arg0, String arg1) throws InterruptedException {
        page.informaCodOpEcodBeneficiario(arg0, arg1);
    }

    @And("acionar opção encaminhar")
    public void acionarOpçãoEncaminhar() throws InterruptedException {
        page.acionarEncaminhar();
    }

    @And("acionar radioButton Usuário")
    public void acionarRadioButtonUsuário() throws InterruptedException {
        page.acionarRadioUsuario();
    }

    @And("acionar botao acoes solicitar parecer")
    public void acionarBotaoAcoesSolicitarParecer() throws InterruptedException {
        page.acionarSolicitarParecer();
    }

    @And("marcar checkBox Usuario")
    public void marcarCheckBoxUsuario() throws InterruptedException {
        page.marcarCheckUsuario();
    }

    @And("informar campo usuario \"([^\"]*)\"$")
    public void informarCampoUsuario(String arg0) throws InterruptedException {
        page.informUsuario(arg0);
    }

    @And("acionar botao solicitar")
    public void acionarBotaoSolicitar() throws InterruptedException {
        page.acionarBotaoSolicitar();
    }

    @And("informar campo descrição do parecer \"([^\"]*)\"\"([^\"]*)\"$")
    public void informarCampoDescriçãoDoParecer(String arg0) throws InterruptedException {
        page.informarCampoDescricao(arg0);
    }

    @And("acionar opção finalizar")
    public void acionarOpçãoFinalizar() throws InterruptedException {
        page.acionarFinalizar();
    }

    @And("acionar opção filtro de pesquisa")
    public void acionarOpçãoFiltroDePesquisa() throws InterruptedException {
        page.filtrarPesquisa();
    }

    @And("acionar botao sair")
    public void acionarBotaoSair() throws InterruptedException {
        page.acionarBtnSair();
    }

    @And("acionar botao frequencia visita")
    public void acionarBotaoFrequenciaVisita() throws InterruptedException {
        page.acionarBotãoFrequeciaDeVisitas();
    }

    @And("informar campo Frequência da visita \"([^\"]*)\"\"([^\"]*)\"$")
    public void informarCampoFrequênciaDaVisita(String arg0) throws InterruptedException {
        page.informarmeCampFrequenciaDaVisita(arg0);
    }

    @And("acionar botao salvar")
    public void acionarBotaoSalvar() throws InterruptedException {
        page.acionarSalvar();
    }

    @And("acionar botão encaminhar")
    public void acionarBotãoEncaminhar() throws InterruptedException {
        page.acionarBotaoEncaminhar();
    }

    @And("acionar radioButton tipo de auditor usuario")
    public void acionarRadioButtonTipoDeAuditorUsuario() throws InterruptedException {
        page.acionarTipoDeAuditorUsuario();
    }

    @And("informar usuario como \"([^\"]*)\"$")
    public void informarUsuarioComo(String arg0) throws InterruptedException {
        page.informeUsuario(arg0);
    }

    @And("selecionar tipo de auditoria \"([^\"]*)\"$")
    public void selecionarTipoDeAuditoria(String arg0) throws InterruptedException {
        page.selecionaTipoAuditoria(arg0);
    }

    @And("informar data de atendimento como \"([^\"]*)\"$")
    public void informarDataDeAtendimentoComo(String arg0) throws InterruptedException {
        page.informeData(arg0);
    }

    @And("acionar opção que permite agendar")
    public void acionarOpçãoQuePermiteAgendar() throws InterruptedException, AWTException {
        page.acionarBotaoAgendar();
    }

    @And("informar campo patologia como \"([^\"]*)\"$")
    public void informarCampoPatologiaComo(String arg0) throws InterruptedException {
        page.campoPatologia(arg0);
    }

    @And("informar campo diagnostico do internado \"([^\"]*)\"$")
    public void informarCampoDiagnosticoDoInternado(String arg0) throws InterruptedException {
        page.diagnosticoDoInternado(arg0);
    }

    @And("informar campo evolução clinica \"([^\"]*)\"$")
    public void informarCampoEvoluçãoClinica(String arg0) throws InterruptedException {
        page.campoEvolucaoClinica(arg0);
    }

    @And("infrmar campo parecer enfermagem \"([^\"]*)\"$")
    public void infrmarCampoParecerEnfermagem(String arg0) throws InterruptedException {
        page.campoParecerEnfermagem(arg0);
    }

    @And("infrmar campo parecer medico \"([^\"]*)\"$")
    public void infrmarCampoParecerMedico(String arg0) throws InterruptedException {
        page.campoParecerMedico(arg0);
    }

    @And("marcar todos os checkBox do SETOR RESPONSÁVEL")
    public void marcarTodosOsCheckBoxDoSETORRESPONSÁVEL() throws InterruptedException {
        page.marcarTodosOsCheckBox();
    }

    @And("informar campo retorno setor \"([^\"]*)\"\"([^\"]*)\"$")
    public void informarCampoRetornoSetor(String arg0) throws InterruptedException {
        page.campoRetornoSetor(arg0);
    }

    @Then("devo acionar opção que permite encerar")
    public void devoAcionarOpçãoQuePermiteEncerar() throws InterruptedException {
        page.acionarEncerrar();
    }

    @And("o sistema deverá apresentar mensagem:  Visita realizada com sucesso! \"([^\"]*)\"$")
    public void oSistemaDeveráApresentarMensagemVisitaRealizadaComSucesso(String arg0) throws InterruptedException {
        page.validaMensagem(arg0);
    }

    @And("acionar opção para alta")
    public void acionarOpçãoParaAlta() throws InterruptedException {
        page.acionarBotaoAlta();
    }

    @And("informar campo descrição \"([^\"]*)\"\"([^\"]*)\"$")
    public void informarCampoDescrição(String arg0) throws InterruptedException {
        page.informeCampDescricao(arg0);
    }

    @And("infromar campo data alta \"([^\"]*)\"\"([^\"]*)\"$")
    public void infromarCampoDataAlta(String arg0) throws InterruptedException {
        page.informCampoData(arg0);
    }

    @And("selecionar campo tipo de alta \"([^\"]*)\"\"([^\"]*)\"$")
    public void selecionarCampoTipoDeAlta(String arg0) throws InterruptedException {
        page.campoTipoDeAlta(arg0);
    }

    @And("acionar botão para confirmar a alta")
    public void acionarBotãoParaConfirmarAAlta() throws InterruptedException {
        page.confirmaAlta();
    }

    @And("acionar opção que permite atualizar")
    public void acionarOpçãoQuePermiteAtualizar() throws InterruptedException {
        page.acionarAtualizar();
    }


}
