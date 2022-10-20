package stepDefinitions.auditoriaConcorrente;

import cucumber.TestContext;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.auditoriaConcorrente.ParametrizacaoDeAuditoriaPage;

public class ParametrizacaoDeAuditoriaSteps {
    private TestContext testContext;
    private ParametrizacaoDeAuditoriaPage page;

    public ParametrizacaoDeAuditoriaSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getParametrizacaoDeAuditoriaPage();
    }

    @When("acionar o menu auditoria concorrente formulario padrão")
    public void acionarOMenuAuditoriaConcorrenteFormularioPadrão() throws InterruptedException {
        page.acionarMenuAuditoriaConcorrenteFormePadrao();
    }

    @And("acionar opcao novo")
    public void acionarOpcaoNovo() throws InterruptedException {
        page.acionarBtnNovo();
    }

    @And("informar campo nome como {string}")
    public void informarCampoNomeComo(String arg0) throws InterruptedException {
        page.informaNoem(arg0);
    }

    @And("acionar opção gravar")
    public void acionarOpçãoGravar() throws InterruptedException {
        page.acionarGravar();
    }

    @And("acionar o menu auditoria concorrente formulario personalizado")
    public void acionarOMenuAuditoriaConcorrenteFormularioPersonalizado() throws InterruptedException {
        page.menuAuditoriaConcorrenteFormularioPersonalizado();
    }

    @And("acionar opcao novo formulario personalizado")
    public void acionarOpcaoNovoFormularioPersonalizado() throws InterruptedException {
        page.acionarBtnNovoPessonalizado();
    }

    @And("informar nome como {string}")
    public void informarNomeComo(String arg0) throws InterruptedException {
        page.informaCampNoem(arg0);
    }

    @And("acionar opção salvar formulario")
    public void acionarOpçãoSalvarFormulario() throws InterruptedException {
        page.salvatFormulario();
    }

    @And("acionar o menu auditoria concorrente tipos")
    public void acionarOMenuAuditoriaConcorrenteTipos() throws InterruptedException {
        page.menuAuditoriaConcorrenteTipos();
    }

    @And("acionar opção novo para tipos de auditoria")
    public void acionarOpçãoNovoParaTiposDeAuditoria() throws InterruptedException {
        page.acionarBtnNovoTipoDeAuditoria();
    }

    @And("selecionar campo configuração estatica como {string}")
    public void selecionarCampoConfiguraçãoEstaticaComo(String arg0) throws InterruptedException {
        page.selecionarCampoConfiguracaoEstatica(arg0);
    }

    @And("selecionar campo configuração Dinamica como {string}")
    public void selecionarCampoConfiguraçãoDinamicaComo(String arg0) throws InterruptedException {
        page.selecionarCampoConfiguracaoDinamica(arg0);
    }

    @And("acionar botão gravar")
    public void acionarBotãoGravar() throws InterruptedException {
        page.acionarBtnGravar();
    }

    @And("acionar o menu auditoria concorrente usuário")
    public void acionarOMenuAuditoriaConcorrenteUsuário() throws InterruptedException {
        page.menuAuditoriaConcorrenteUsuário();
    }


    @And("selecionar campo ações como alterar")
    public void selecionarCampoAçõesComoAlterar() throws InterruptedException {
        page.selecionarAlterar();
    }

    @And("informar campo usuario como {string}")
    public void informarCampoUsuarioComo(String arg0) throws InterruptedException {
        page.informarUsuario(arg0);

    }

    @And("acionar opção para adicionar")
    public void acionarOpçãoParaAdicionar() throws InterruptedException {
        page.acionarAdicionar();
    }

    @And("acionar botão gravar usuario")
    public void acionarBotãoGravarUsuario() throws InterruptedException {
        page.acionarBtnGravarUsuario();
    }

    @And("acionar o menu auditoria concorrente workflow")
    public void acionarOMenuAuditoriaConcorrenteWorkflow() throws InterruptedException {
        page.menuAuditoriaConcorrenteWorkflow();
    }

    @And("acionar opção novo")
    public void acionarOpçãoNovo() throws InterruptedException {
        page.acionarOpcaoNovo();
    }

    @And("informar campo nome do workflow como {string}")
    public void informarCampoNomeDoWorkflowComo(String arg0) throws InterruptedException {
        page.informarCampoNomeDoWorkflow(arg0);
    }

    @And("informar campo data inicio para workflow {string}")
    public void informarCampoDataInicioParaWorkflow(String arg0) throws InterruptedException {
        page.informarDataInicio(arg0);
    }

    @And("informar campo data fim para workflow {string}")
    public void informarCampoDataFimParaWorkflow(String arg0) throws InterruptedException {
        page.informarDataFim(arg0);
    }

    @And("marcar checkBox Habilitado")
    public void marcarCheckBoxHabilitado() throws InterruptedException {
        page.checkBoxHabilitado();
    }

    @And("marcar checkBox Gerar auditoria")
    public void marcarCheckBoxGerarAuditoria() throws InterruptedException {
        page.checkBoxGerarAuditoria();
    }

    @And("informar campo descrição como {string}")
    public void informarCampoDescriçãoComo(String arg0) throws InterruptedException {
        page.informarCampoDescricao(arg0);
    }

    @And("informar tempo maximo de atendimento como {string}")
    public void informarTempoMaximoDeAtendimentoComo(String arg0) throws InterruptedException {
        page.tempoMaximoDeAtendimento(arg0);
    }

    @And("acionar aba auditores")
    public void acionarAbaAuditores() throws InterruptedException {
        page.acionarAbaAuditores();
    }

    @And("informar campo auditor como {string}")
    public void informarCampoAuditorComo(String arg0) throws InterruptedException {
        page.informCampAuditor(arg0);
    }

    @And("informar campo data inicio para auditoria {string}")
    public void informarCampoDataInicioParaAuditoria(String arg0) throws InterruptedException {
        page.informarDataInicioAuditoria(arg0);

    }

    @And("informar o campo auditor como {string}")
    public void informarOCampoAuditorComo(String arg0) throws InterruptedException {
        page.infoCampoAuditorComo(arg0);
    }

    @And("informar campo data fim para auditoria {string}")
    public void informarCampoDataFimParaAuditoria(String arg0) throws InterruptedException {
        page.informarDataFimAuditoria(arg0);
    }

    @And("marcar escala segunda-feira como {string} {string}")
    public void marcarEscalaSegundaFeiraComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaSegundaFeiraComo(arg0, arg1);
    }

    @And("marcar escala terça-feira como {string} {string}")
    public void marcarEscalaTerçaFeiraComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaTerçaFeiraComo(arg0, arg1);
    }

    @And("marcar escala quarta-feira como {string} {string}")
    public void marcarEscalaQuartaFeiraComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaQuartaFeira(arg0, arg1);
    }

    @And("marcar escala quinta-feira como {string} {string}")
    public void marcarEscalaQuintaFeiraComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaQuintaFeira(arg0, arg1);
    }

    @And("marcar escala sexta-feira como {string} {string}")
    public void marcarEscalaSextaFeiraComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaSextaFeira(arg0, arg1);
    }

    @And("marcar escala sabado como {string} {string}")
    public void marcarEscalaSabadoComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaSabado(arg0, arg1);
    }

    @And("marcar escala domingo como {string} {string}")
    public void marcarEscalaDomingoComo(String arg0, String arg1) throws InterruptedException {
        page.marcarEscalaDomingo(arg0, arg1);
    }

    @And("acionar botão adicionar")
    public void acionarBotãoAdicionar() throws InterruptedException {
        page.acionarBtnAdicionar();
    }

    @Then("devo acionar opção gravar")
    public void devoAcionarOpçãoGravar() throws InterruptedException {
        page.acionarBotaoGravar();
    }

    @And("informar campo tipo de auditoria como {string}")
    public void informarCampoTipoDeAuditoriaComo(String arg0) throws InterruptedException {
        page.infoTipoAuditoria(arg0);
    }

    @And("o sistema deverá apresentar mensagem: Registro cadastrado com sucesso {string}")
    public void oSistemaDeveráApresentarMensagemRegistroCadastradoComSucesso(String arg0) throws InterruptedException {
        page.validaMsgSistema(arg0);
    }


}