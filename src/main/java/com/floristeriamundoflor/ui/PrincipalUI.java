package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalUI {

    public static Target SELECCION_AMOR = Target.the("Seleccionar categoria amor ")
            .locatedBy("//*[@id='primary-menu']//a[text()='Amor']");
}
