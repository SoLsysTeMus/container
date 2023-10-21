package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import pages.blocks.HeaderBlock;

public class PersonalCabinet {

    @FindBy(id = "header")
    public HeaderBlock headerBlock;

    public static PersonalCabinet init() {
        return Selenide.page(PersonalCabinet.class);
    }
}
