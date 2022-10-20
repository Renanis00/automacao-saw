package stepDefinitions.auditoriaTecnica;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import pageObjects.auditoriaTecnica.AuditoriaDeContasPage;

public class AuditarContaSteps {
    private TestContext testContext;
    private AuditoriaDeContasPage page;

    public AuditarContaSteps(TestContext context) throws Exception{
        testContext = context;
        page = testContext.getPageObjectManager().getAuditoriaDeContasPage();
    }


    @And("buscar lote \"([^\"]*)\"$")
    public void buscarLote(String arg0) throws Throwable {
        page.informarLote(arg0);
    }

    @And("selecionar tipo da conta \"([^\"]*)\"$")
    public void selecionarTipoInternação(String arg0) throws Throwable {
        page.selecionarTipoAuditoria(arg0);
    }

    @And("pesquisar")
    public void pesquisar() throws Throwable {
        page.pesquisar();
    }

    @When("acessar listagem de auditorias$")
    public void acessarListagemDeAuditorias() throws Throwable{
        page.acessarContasMedicas();
    }

    @And("selecionar status da auditoria \"([^\"]*)\"$")
    public void selecionarStatusDaAuditoria(String arg0) throws Throwable{
        page.selecionarStatusAuditoria(arg0);

    }

    @And("acionar a opção Editar Auditoria Técnica \"([^\"]*)\"$")
    public void acionarAOpçãoEditarAuditoriaTécnica(String arg0) throws Throwable {
        page.acionarOpcaoEditarAuditoria(arg0);

    }


    @And("abrir tela de auditoria técnica")
    public void abrirTelaDeAuditoriaTécnica() {
        page.acionarBotaoAuditarContaInternacao();
    }

    @And("acessar aba de Procedimentos")
    public void acessarAbaDeProcedimentos() {
        page.acessarAbaProcedimentosAuditoria();
    }

    @And("realizar glosa de quantidade \"([^\"]*)\"$")
    public void realizarGlosaDeQuantidade(String arg0) throws Throwable {
        page.realizarGlosaQuantidade(arg0);
    }

    @When("acessar contas médicas")
    public void acessarContasMédicas() throws Throwable {
        page.acessarContasMedicas();
    }

    @And("reprocessar auditoria de numero \"([^\"]*)\"$")
    public void reprocessarAuditoriaDeNumero(String arg0) throws Throwable{
        page.reprocessarAuditoriaCuritiba(arg0);
    }

    @When("acessar listagem de transações SCE")
    public void acessarListagemDeTransaçõesSCE() {
        page.acessarListagemSCE();
    }

    @And("resgatar e importar número de autorização do lote \"([^\"]*)\"$")
    public void resgatarNúmeroDeAutorizaçãoDoLote(String arg0) throws InterruptedException {
        page.resgatarNumeroAutorizacaoSCE(arg0);
    }


}
