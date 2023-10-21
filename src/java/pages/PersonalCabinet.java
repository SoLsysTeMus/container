package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import pages.blocks.HeaderBlock;
import pages.blocks.PromocodesBlock;

public class PersonalCabinet {

    @FindBy(id = "header")
    public HeaderBlock headerBlock;

    @FindBy(id = "promocodesWrapper")
    public PromocodesBlock promocodesBlock;

    public static PersonalCabinet init() {
        return Selenide.page(PersonalCabinet.class);
    }
}
