package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.webdriver.Url;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class DiskPage {

    public DiskPage copyFile(String fileName) {
        SelenideElement element = $("[aria-label=\"" + fileName + "\"]");
        contextClick(element, "copy");
        return this;
    }

    private void contextClick(SelenideElement element, String contextMenu) {
        element.contextClick();
        $("[value=\"" + contextMenu + "\"]").click();
    }

    public DiskPage openFolder(String folderName) {
        $("[aria-label=\"" + folderName + "\"]").doubleClick();
        Selenide.webdriver().shouldHave(new Url("https://disk.yandex.ru/client/disk/" + folderName));
        return this;
    }

    public DiskPage deleteAllFilesExcept(String excludeFile) {
        $$(".listing-item__title")
                .shouldHave(sizeGreaterThan(0).because("Должны существовать файлы для удаления!"))
                .excludeWith(attribute("aria-label", excludeFile))
                .asFixedIterable()
                .forEach(element -> contextClick(element, "delete"));
        return this;
    }

    public DiskPage checkFile(String value) {
        $$(".listing-item__title").find(attribute("aria-label", value)).shouldBe(exist);
        return this;
    }

    public DiskPage logOut() {
        $("[aria-label=\"Аккаунт\"]").click();
        $("[aria-label=\"Выйти из аккаунта\"]").click();
        return this;
    }
}


