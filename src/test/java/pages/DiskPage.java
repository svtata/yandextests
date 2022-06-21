package pages;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DiskPage {
    public DiskPage removeAdvert() {
//        if($("#app").exists()) {
//            $(".Button2-Text").click();
//        }
        return this;
    }

    public DiskPage selectFile() {
        $("[title='Файл для копирования.docx']").click();
        return this;
    }
}


