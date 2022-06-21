package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    public AuthorizationPage setLogin(String value){
        $("#passp-field-login").setValue(value);
        return this;
    }

    public AuthorizationPage selectEmailLogin(){
        $("[data-t=button\\:default]").click();
        return this;
    }

    public AuthorizationPage loginButton(){
        $("#passp\\:sign-in").click();
        return this;
    }

    public AuthorizationPage setPassword(String value){
        $("#passp-field-passwd").setValue(value);
        return this;
    }
    public AuthorizationPage passwordButton(){
        $("#passp\\:sign-in").pressEnter();
        return this;
    }





}
