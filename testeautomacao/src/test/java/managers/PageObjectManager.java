package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HooksPages;
import pageObjects.LoginPage;
import pageObjects.auditoriaConcorrente.AdicionarBeneficiarioInternadoPage;
import pageObjects.auditoriaConcorrente.AgendamentoCirurgicoPage;
import pageObjects.auditoriaConcorrente.AuditoriaInLocoPage;
import pageObjects.auditoriaConcorrente.ParametrizacaoDeAuditoriaPage;
import pageObjects.auditoriaTecnica.*;
import pageObjects.guias.*;

import java.io.IOException;

/**
 * Classe que gerencia os Page Objects a serem utilizados nos testes</n>
 */

public class PageObjectManager {

    private WebDriver driver;
    private LoginPage loginPage;

    private HooksPages hooksPages;
    private AdicionarBeneficiarioInternadoPage adicionarBeneficiarioInternadoPage;
    private AgendamentoCirurgicoPage agendamentoCirurgicoPage;
    private AuditoriaInLocoPage auditoriaInLocoPage;
    private ParametrizacaoDeAuditoriaPage parametrizacaoDeAuditoriaPage;
    private GuiaDeSP_SADTPage guiaDeSP_SADTPage;
    private GuiaDeConsultaEletivaPage guiaDeConsultaEletivaPage;
    private GuiaResumoInternacaoPage guiaResumoInternacaoPage;
    private GuiaDeRadioterapiaPage guiaDeRadioterapiaPage;
    private GuiaDeOPMEPage guiaDeOPMEPage;
    private GuiaDeOutrasDespesasPage guiaDeOutrasDespesasPage;
    private GuiaDeProrrogacaoPage guiaDeProrrogacaoPage;
    private GuiaHonorariosPage guiaHonorariosPage;
    private EnviarXmlPage enviarXmlPage;
    private ParametrizarGrupoDeUsuariosPage parametrizarGrupoDeUsuariosPage;
    private ParametrizarWorkflowDeTrabalhoPage parametrizarWorkflowDeTrabalhoPage;
    private ParametrizarCategoriasDeRegrasPage parametrizarCategoriasDeRegrasPage;
    private GguiaSPSADT174Page gguiaSPSADT174Page;
    private AuditoriaDeContasPage auditoriaDeContasPage;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Metodo que retorna a instancia de um objeto LoginPage, caso o objeto nao
     * exista e criada uma instancia do mesmo.
     *
     * @return LoginPage - Instancia da classe LoginPage.
     */

    public LoginPage getLoginPage() throws Exception {
        return (loginPage == null) ? new LoginPage(driver) : loginPage;
    }


    public AdicionarBeneficiarioInternadoPage getAdicionarBeneficiarioInternadoPage() {
        return (adicionarBeneficiarioInternadoPage == null) ? new AdicionarBeneficiarioInternadoPage(driver)
                : adicionarBeneficiarioInternadoPage;
    }

    public AgendamentoCirurgicoPage getAgendamentoCirurgicoPage() {
        return (agendamentoCirurgicoPage == null) ? new AgendamentoCirurgicoPage(driver)
                : agendamentoCirurgicoPage;
    }

    public AuditoriaInLocoPage getAuditoriaInLocoPage() {
        return (auditoriaInLocoPage == null) ? new AuditoriaInLocoPage(driver)
                : auditoriaInLocoPage;
    }

    public ParametrizacaoDeAuditoriaPage getParametrizacaoDeAuditoriaPage() {
        return (parametrizacaoDeAuditoriaPage == null) ? new ParametrizacaoDeAuditoriaPage(driver)
                : parametrizacaoDeAuditoriaPage;
    }

    public GuiaDeSP_SADTPage getGuiaDeSP_SADTPage() {
        return (guiaDeSP_SADTPage == null) ? new GuiaDeSP_SADTPage(driver)
                : guiaDeSP_SADTPage;
    }

    public GuiaDeConsultaEletivaPage getGuiaDeConsultaEletivaPage() {
        return (guiaDeConsultaEletivaPage == null) ? new GuiaDeConsultaEletivaPage(driver)
                : guiaDeConsultaEletivaPage;
    }

    public GuiaResumoInternacaoPage getGuiaResumoInternacaoPage() {
        return (guiaResumoInternacaoPage == null) ? new GuiaResumoInternacaoPage(driver)
                : guiaResumoInternacaoPage;
    }

    public HooksPages getHooksPages() {
        return (hooksPages == null) ? new HooksPages(driver)
                : hooksPages;
    }

    public GuiaDeRadioterapiaPage getGuiaDeRadioterapiaPage() {
        return (guiaDeRadioterapiaPage == null) ? new GuiaDeRadioterapiaPage(driver)
                : guiaDeRadioterapiaPage;

    }

    public GuiaDeOPMEPage getGuiaDeOPMEPage() {
        return (guiaDeOPMEPage == null) ? new GuiaDeOPMEPage(driver)
                : guiaDeOPMEPage;
    }

    public GuiaDeOutrasDespesasPage getGuiaDeOutrasDespesasPage() {
        return (guiaDeOutrasDespesasPage == null) ? new GuiaDeOutrasDespesasPage(driver)
                : guiaDeOutrasDespesasPage;
    }

    public GuiaDeProrrogacaoPage getGuiaDeProrrogacaoPage() {
        return (guiaDeProrrogacaoPage == null) ? new GuiaDeProrrogacaoPage(driver)
                : guiaDeProrrogacaoPage;
    }

    public GuiaHonorariosPage getGuiaHonorariosPage() {
        return (guiaHonorariosPage == null) ? new GuiaHonorariosPage(driver)
                : guiaHonorariosPage;
    }

    public EnviarXmlPage getEnviarXmlPage() throws IOException {
        return (enviarXmlPage == null) ? new EnviarXmlPage(driver)
                : enviarXmlPage;
    }

    public ParametrizarGrupoDeUsuariosPage getParametrizarGrupoDeUsuariosPage() throws IOException {
        return (parametrizarGrupoDeUsuariosPage == null) ? new ParametrizarGrupoDeUsuariosPage(driver)
                : parametrizarGrupoDeUsuariosPage;
    }

    public ParametrizarWorkflowDeTrabalhoPage getParametrizarWorkflowDeTrabalhoPage() throws IOException {
        return (parametrizarWorkflowDeTrabalhoPage == null) ? new ParametrizarWorkflowDeTrabalhoPage(driver)
                : parametrizarWorkflowDeTrabalhoPage;
    }

    public ParametrizarCategoriasDeRegrasPage getParametrizarCategoriasDeRegrasPage() throws IOException {
        return (parametrizarCategoriasDeRegrasPage == null) ? new ParametrizarCategoriasDeRegrasPage(driver)
                : parametrizarCategoriasDeRegrasPage;
    }

    public GguiaSPSADT174Page getGguiaSPSADT174Page() {
        return (gguiaSPSADT174Page == null) ? new GguiaSPSADT174Page(driver)
                : gguiaSPSADT174Page;
    }

    public AuditoriaDeContasPage getAuditoriaDeContasPage() {
        return (auditoriaDeContasPage == null) ? new AuditoriaDeContasPage(driver)
                : auditoriaDeContasPage;

    }
}