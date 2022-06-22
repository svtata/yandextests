package pages;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    public AuthorizationPage setLogin(String value) {
        $("#passp-field-login").setValue(value);
        return this;
    }

    public AuthorizationPage selectEmailLogin() {
        $("[data-type=\"login\"]").click();
        return this;
    }

    public AuthorizationPage pressButton() {
        $("#passp\\:sign-in").pressEnter();
        return this;
    }

    public AuthorizationPage setPassword(String value) {
        $("#passp-field-passwd").setValue(value);
        return this;
    }
}