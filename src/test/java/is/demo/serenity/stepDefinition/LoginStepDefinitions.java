package is.demo.serenity.stepDefinition;

import cucumber.api.java.es.*;
import is.demo.serenity.pageObject.DashboardPage;
import is.demo.serenity.steps.DashboardSteps;
import is.demo.serenity.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;
    @Steps
    DashboardSteps dashboardSteps;

    @Dado("^que el usuario abre la pagina demo serenity\\.$")
    public void queElUsuarioAbreLaPaginaDemoSerenity() {
        loginSteps.abrirNavegador();
    }


    @Cuando("^el usuario modifique las credenciales de ingreso y haga click en ingresar$")
    public void elUsuarioModifiqueLasCredencialesDeIngresoYHagaClickEnIngresar() {
        loginSteps.enviarUsuario();
        loginSteps.enviarClave();
        loginSteps.clicInicioSesion();
    }

    @Entonces("^el usuario puede visualizar el mensaje dashboard$")
    public void elUsuarioPuedeVisualizarElMensajeDashboard() {
        dashboardSteps.validarTitulo();
    }

}
