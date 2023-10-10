package co.sqasa.StepDef;


import com.floristeriamundoflor.tasks.SeleccionarAmorTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TestStepDefinition {

    @Before
    public void setStage(){setTheStage(new OnlineCast());}

    @Dado("^que el usuario abre la pagina de Floristeria Mundo Flor$")
    public void queElUsuarioAbreLaPaginaDeFloristeriaMundoFlor() {

        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );

    }

    @Cuando("^el usuario seleccione la categoria \"([^\"]*)\"$")
    public void elUsuarioSeleccioneLaCategoria() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarAmorTask.on()
        );

    }

    @Cuando("^el usuario selecciona el primer producto de la lista$")
    public void elUsuarioSeleccionaElPrimerProductoDeLaLista() {

    }

    @Cuando("^agraga el producto al carro de comras$")
    public void agragaElProductoAlCarroDeComras() {

    }

    @Cuando("^selecciona otro producto de la pagina$")
    public void seleccionaOtroProductoDeLaPagina() {

    }

    @Entonces("^el usuario agrgara el segundo producto al carro de compras$")
    public void elUsuarioAgrgaraElSegundoProductoAlCarroDeCompras() {

    }


}
