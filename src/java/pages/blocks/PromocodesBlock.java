package pages.blocks;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.support.FindBy;

public class PromocodesBlock extends ElementsContainer {

    @FindBy(xpath = ".//*[@data-entity='pomocodeData']")
    private ElementsCollection promocodes;

    public void checkPromocodesBlockIsNotVisible() {
        getSelf().shouldBe(Condition.disappear);
    }

    public void checkPromocodesNotEmpty() {
        getSelf().shouldBe(Condition.appear.because("Block with promo should be visible on the page"));
        promocodes.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
