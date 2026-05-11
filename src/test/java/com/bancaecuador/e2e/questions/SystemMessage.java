package com.bancaecuador.e2e.questions;

import com.bancaecuador.e2e.ui.LoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public final class SystemMessage {
    private SystemMessage() {}
    public static Question<String> displayed() {
        return actor -> Text.of(LoginPage.FLASH_MESSAGE).answeredBy(actor).trim();
    }
}
