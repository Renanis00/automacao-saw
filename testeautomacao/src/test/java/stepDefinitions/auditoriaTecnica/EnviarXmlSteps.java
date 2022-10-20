package stepDefinitions.auditoriaTecnica;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.auditoriaTecnica.EnviarXmlPage;
import pageObjects.guias.GuiaDeConsultaEletivaPage;

public class EnviarXmlSteps {
    private TestContext testContext;
    private EnviarXmlPage page;

    public EnviarXmlSteps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getEnviarXmlPage();
    }

    @When("^acionar o menu TISS Faturamento Eletrônico$")
    public void acionar_o_menu_TISS_Faturamento_Eletrônico() throws Throwable {
        page.acionarMenuTissFaturamentoEletronijco();
    }

    @When("^modificar parametros do arquivo XML$")
    public void modificar_parametros_do_arquivo_XML() throws Throwable {
        page.modificarXml();
    }

    @When("^acionar Validar Estrutura Hash$")
    public void acionar_Validar_Estrutura_Hash() throws Throwable {
        page.validarHashXML();
    }

    @When("^acionar opção para escolher arquivo$")
    public void acionar_opção_para_escolher_arquivo() throws Throwable {
        page.acionarEscolherArquivo();
    }

    @When("^acionar opção validar Estrutura e Hash de arquivo XML$")
    public void acionar_opção_validar_Estrutura_e_Hash_de_arquivo_XML() throws Throwable {
        page.acionarBotaoValidarHash();
    }

    @When("^devo atualizar o XML com o Hash Correto$")
    public void devo_atualizar_o_XML_com_o_Hash_Correto() throws Throwable {
        page.atualizarXMLcomHashCorreto();
    }

    @When("^acionar opção Enviar XML$")
    public void acionar_opção_Enviar_XML() throws Throwable {
        page.acionarOpcaoEnviarXML();
    }

    @When("^selecionar um prestador Financeiro \"([^\"]*)\"$")
    public void selecionar_um_prestador_Financeiro(String arg1) throws Throwable {
        page.selecionarPrestadro(arg1);
    }

    @When("^acionar opção para escolher Arquivo XML$")
    public void acionar_opção_para_escolher_Arquivo_XML() throws Throwable {
        page.acionarOpcaoEscolherArqeuivoXML();
    }

    @When("^acionar opção para enviar arquivo$")
    public void acionar_opção_para_enviar_arquivo() throws Throwable {
        page.enviarArqueivo();
    }

    @When("^acionar o menu Auditoria Técnica Grupo de usuários$")
    public void acionar_o_menu_Auditoria_Técnica_Grupo_de_usuários() throws Throwable {
        page.menuAuditoriaTecnicaGrupoUsuarios();
    }

    @When("^acionar opção  Novo Grupo de Usuários$")
    public void acionar_opção_Novo_Grupo_de_Usuários() throws Throwable {
        page.acionarNovoGrupo();
    }

    @When("^infromar Nome do Grupo como \"([^\"]*)\"$")
    public void infromar_Nome_do_Grupo_como(String arg1) throws Throwable {
        page.informarNomeDogrupo(arg1);
    }

    @When("^marcar checkBox Permite participar da auditoria técnica$")
    public void marcar_checkBox_Permite_participar_da_auditoria_técnica() throws Throwable {
        page.marcarCheckBoxPermitirParticiparAuditTecnica();
    }

    @When("^marcar Tipo de Auditoria Administravia$")
    public void marcar_Tipo_de_Auditoria_Administravia() throws Throwable {
        page.marcarTipoAuditoriaAdministrativa();
    }

    @When("^infromar a Descrição do Grupo como \"([^\"]*)\"$")
    public void infromar_a_Descrição_do_Grupo_como(String arg1) throws Throwable {
        page.informeDescricaoGrupo(arg1);
    }

    @Then("^devo acionar opção para cadastrar$")
    public void devo_acionar_opção_para_cadastrar() throws Throwable {
        page.acionarBtnGravar();
    }

    @Then("^infromar auditor como \"([^\"]*)\"$")
    public void infromar_auditor_como(String arg1) throws Throwable {
        page.informarCampoAuditor(arg1);
    }

    @Then("^infromar data inicial e final \"([^\"]*)\" \"([^\"]*)\"$")
    public void infromar_data_inicial_e_final(String arg1, String arg2) throws Throwable {
        page.informeDataInicialEfinal(arg1, arg2);
    }

    @Then("^acionar opção para cadastrar$")
    public void acionar_opção_para_cadastrar() throws Throwable {
        page.clicarCadastrar();
    }

}
