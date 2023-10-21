package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import pages.blocks.HeaderBlock;

public class MainPage {

    @FindBy(id = "header")
    public HeaderBlock headerBlock;

    private MainPage() {}

    public static MainPage init() {
        return Selenide.page(MainPage.class);
    }
}
