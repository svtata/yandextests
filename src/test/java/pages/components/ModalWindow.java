package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ModalWindow {
    public ModalWindow selectFolder() {
        $(".select-folder-dialog__content").$(byText("Test")).click();
        return this;
    }

    public ModalWindow confirmCopy() {
        $(".Button2.Button2_view_action:not(.upload-button)").click();
        return this;
    }
}
