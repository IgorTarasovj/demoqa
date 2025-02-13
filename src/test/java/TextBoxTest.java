import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class TextBoxTest {

    @Test
     void testOutConsole(){
        System.out.println("123");
    }

    @Test
    void openTextBox(){
        open("https://demoqa.com/text-box");
    }
}
