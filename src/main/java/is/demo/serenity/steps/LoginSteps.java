package is.demo.serenity.steps;

import is.demo.serenity.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Step("Usuario abre el navegador")
    public void abrirNavegador(){
        loginPage.openUrl("https://demo.serenity.is/");
    }

    @Step("Usuario abre el navegador")
    public void enviarUsuario(){
        loginPage.getDriver().findElement(loginPage.getTxtUsuario()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtUsuario()).sendKeys("admin");
    }

    @Step("Usuario abre el navegador")
    public void enviarClave(){
        loginPage.getDriver().findElement(loginPage.getTxtClave()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtClave()).sendKeys("serenity");
    }

    @Step("Usuario abre el navegador")
    public void clicInicioSesion(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }
}
