package is.demo.serenity.steps;

import is.demo.serenity.pageObject.DashboardPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage();

    @Step("Validar Titulo")
    public void validarTitulo(){


        Assert.assertThat(
                dashboardPage.getDriver().findElement(dashboardPage.getLblTitle()).isDisplayed(),
                Matchers.is(true)
        );
    }
}
