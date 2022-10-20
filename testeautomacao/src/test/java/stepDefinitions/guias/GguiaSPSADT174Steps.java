package stepDefinitions.guias;


import cucumber.TestContext;
//import cucumber.api.java.en.And;
//import io.cucumber.java.en.And;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pageObjects.guias.GguiaSPSADT174Page;
import pageObjects.guias.GuiaDeSP_SADTPage;


public class GguiaSPSADT174Steps {
    private TestContext testContext;
    private GguiaSPSADT174Page page;

    public GguiaSPSADT174Steps(TestContext context) throws Exception {
        testContext = context;
        page = testContext.getPageObjectManager().getGguiaSPSADT174Page();
    }


    @When("^selecionar campo Conselho Profissional como \"([^\"]*)\"$")
    public void selecionar_campo_Conselho_Profissional_coo(String arg1) throws Throwable {
        page.selecionarConselhoProficional(arg1);
    }

    @When("^informar campo Número no Conselho como \"([^\"]*)\"$")
    public void informar_campo_Número_no_Conselho_como(String arg1) throws Throwable {
        page.informarNumeroDoConselho(arg1);

    }

    @When("^selecionar campo UF como \"([^\"]*)\"$")
    public void selecionar_campo_UF_como(String arg1) throws Throwable {
        page.selecionarUF(arg1);

    }

    @When("^selecionar campo Código CBO-s como \"([^\"]*)\"$")
    public void selecionar_campo_Código_CBO_s_como(String arg1) throws Throwable {
        page.selecionarCBO(arg1);
    }


}
