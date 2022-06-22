package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.AuthorizationPage;
import pages.DiskPage;
import pages.MainPage;
import pages.components.ModalWindow;

import static data.TestData.*;


public class CopyFileTest extends TestBase {

    private static final Logger logger = LoggerFactory.getLogger(CopyFileTest.class);
    MainPage mainPage = new MainPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();
    DiskPage diskPage = new DiskPage();
    ModalWindow modalWindow = new ModalWindow();

    @Test
    void copyFile() {
        Selenide.open(Configuration.baseUrl);
        mainPage.openLoginPage();
        authorizationPage.selectEmailLogin()
                .setLogin(USERNAME)
                .pressButton()
                .setPassword(PASSWORD)
                .pressButton();
        mainPage.openDisk();
        diskPage.copyFile(FILE_NAME);

        modalWindow.selectFolder()
                .confirmCopy();
        diskPage.openFolder(FOLDER_NAME)
                .deleteAllFilesExcept(FILE_NAME);
        diskPage.checkFile(FILE_NAME);
    }

    @AfterEach
    void AfterEach() {
        diskPage.logOut();
        logger.info("Test is successful!");
    }
}
