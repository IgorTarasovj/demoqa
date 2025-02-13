import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void fillTextBox() {
        open("/text-box");

        $("[id=userName]").setValue("Nikolay Doljanskiy");
        $("[id=userEmail]").setValue("Nikolay@Doljanskiy.com");
        $("[id=currentAddress]").setValue("ul. Doljanskogo d.228 kv.1488");
        $("[id=permanentAddress]").setValue("ul. Nikolaya d.322 kv.52");

        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Nikolay Doljanskiy"),text("ul. Doljanskogo d.228 kv.1488"),
                text("Nikolay@Doljanskiy.com"),text("ul. Nikolaya d.322 kv.52"));
    }
}