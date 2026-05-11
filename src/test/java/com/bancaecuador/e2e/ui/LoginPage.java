package com.bancaecuador.e2e.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://the-internet.herokuapp.com/login")
public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("campo usuario").locatedBy("#username");
    public static final Target PASSWORD = Target.the("campo contraseña").locatedBy("#password");
    public static final Target LOGIN_BUTTON = Target.the("botón login").locatedBy("button[type='submit']");
    public static final Target FLASH_MESSAGE = Target.the("mensaje del sistema").locatedBy("#flash");
    public static final Target SECURE_AREA_TITLE = Target.the("título del área segura").locatedBy("h2");
}
