import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckBoxTest {
    @BeforeAll
    static void beforeAll() {
        //Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void clickCheckBox() {
        open("https://demoqa.com/checkbox");

        $(By.className("rct-option-expand-all")).click();
        $(By.className("rct-checkbox")).click();
        $("[id=result]").shouldHave(text("desktop"),text("commands"),
                text("excelFile"),text("general"));
    }

}
