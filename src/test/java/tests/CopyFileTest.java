package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;
import pages.DiskPage;
import pages.MainPage;


public class CopyFileTest extends TestBase{


    @Test
    void copyFile() {
        MainPage mainPage = new MainPage();
        AuthorizationPage authorizationPage = new AuthorizationPage();
        DiskPage diskPage = new DiskPage();

        Selenide.open(Configuration.baseUrl);
        mainPage.openLoginPage();

        authorizationPage.selectEmailLogin().setLogin("").loginButton().setPassword("").passwordButton();
        mainPage.openDisk();
        diskPage.removeAdvert()
                .selectFile();
    }









}
