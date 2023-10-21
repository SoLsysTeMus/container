package pages.blocks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class HeaderBlock extends ElementsContainer {

    @FindBy(id = "cart")
    private SelenideElement cartButton;

    @FindBy(id = "profile")
    private SelenideElement profileButton;

    public void headerBlockIsVisible() {
        getSelf().shouldBe(Condition.visible
                .because("На странице должен отображаться Header"));
    }
}
