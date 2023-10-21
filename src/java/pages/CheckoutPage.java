package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import pages.blocks.HeaderBlock;

public class CheckoutPage {

    @FindBy(id = "header")
    public HeaderBlock headerBlock;

    private CheckoutPage() {}

    public static CheckoutPage init() {
        return Selenide.page(CheckoutPage.class);
    }
}
