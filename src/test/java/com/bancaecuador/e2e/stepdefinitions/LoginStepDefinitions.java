package com.bancaecuador.e2e.stepdefinitions;

import com.bancaecuador.e2e.models.LoginData;
import com.bancaecuador.e2e.questions.SystemMessage;
import com.bancaecuador.e2e.tasks.LoginWith;
import com.bancaecuador.e2e.tasks.OpenLoginPortal;
import com.bancaecuador.e2e.ui.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class LoginStepDefinitions {
    @Before public void prepareStage() { OnStage.setTheStage(new OnlineCast()); }
    @Dado("que {actor} abre el portal de autenticación QA")
    public void abrePortalQa(Actor actor) { actor.attemptsTo(OpenLoginPortal.qaAuthenticationPage()); }
    @Cuando("inicia sesión usando el perfil {string}")
    public void iniciaSesionUsandoPerfil(String profileName) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginWith.credentials(LoginData.profile(profileName)));
    }
    @Entonces("debe visualizar el mensaje esperado para el perfil {string}")
    public void validaMensajeEsperado(String profileName) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(SystemMessage.displayed()).contains(LoginData.profile(profileName).getExpectedMessage()));
    }
    @Y("debe quedar autenticado en el área segura")
    public void validaAreaSegura() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(Text.of(LoginPage.SECURE_AREA_TITLE)).contains("Secure Area"));
    }
}
