package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage openLoginPage(){
        $(".desk-notif-card__login-new-items").$(byText("Войти")).click();
        return this;
    }

    public MainPage openDisk(){
        $(".desk-notif-card__details").$(byText("Диск")).click();
        return this;
    }





}
