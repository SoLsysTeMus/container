package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import pages.blocks.HeaderBlock;

public class CatalogPage {

    @FindBy(id = "header")
    public HeaderBlock headerBlock;

    private CatalogPage() {}

    public static CatalogPage init() {
        return Selenide.page(CatalogPage.class);
    }
}
