package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.pt.Dado;
import managers.FileReaderManager;
import pageObjects.LoginPage;

public class LoginSteps {
    private TestContext testContext;
    private LoginPage loginPage;

    public LoginSteps(TestContext context) throws Exception {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Dado("^informe usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void informe_usuario_e_senha(String user, String pw) throws Throwable {
        loginPage.login(user, pw);
    }

    @Given("^informe o usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void informe_o_usuario_e_senha(String arg1, String arg2) throws Throwable {
        loginPage.login2(arg1, arg2);
    }

    @Given("que eu acesse o sistema SAW")
    public void queEuAcesseOSistemaSAW() throws Exception {
        loginPage.acessoUrl(FileReaderManager.getInstance().getConfigReader().getAmbiente());
    }
}
