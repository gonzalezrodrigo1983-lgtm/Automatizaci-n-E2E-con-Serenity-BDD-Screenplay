package com.bancaecuador.e2e.tasks;

import com.bancaecuador.e2e.models.LoginUser;
import com.bancaecuador.e2e.ui.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public final class LoginWith {
    private LoginWith() {}
    public static Performable credentials(LoginUser user) {
        return Task.where("{0} ingresa credenciales parametrizadas",
                Enter.theValue(user.getUsername()).into(LoginPage.USERNAME),
                Enter.theValue(user.getPassword()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON));
    }
}
