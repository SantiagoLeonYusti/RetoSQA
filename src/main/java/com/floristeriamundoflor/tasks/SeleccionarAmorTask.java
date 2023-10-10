package com.floristeriamundoflor.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.floristeriamundoflor.ui.PrincipalUI.SELECCION_AMOR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarAmorTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECCION_AMOR)
        );
    }

    public static SeleccionarAmorTask on(){return instrumented(SeleccionarAmorTask.class);}
}
