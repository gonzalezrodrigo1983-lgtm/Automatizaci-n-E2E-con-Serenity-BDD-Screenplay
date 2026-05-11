package com.bancaecuador.e2e.tasks;

import com.bancaecuador.e2e.ui.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public final class OpenLoginPortal {
    private OpenLoginPortal() {}
    public static Performable qaAuthenticationPage() {
        return Task.where("{0} abre el portal QA de autenticación", Open.browserOn().the(LoginPage.class));
    }
}
