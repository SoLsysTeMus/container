package pages.blocks;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BreadcrumbsItem extends ElementsContainer {

    @FindBy(id = "Breadcrumbs__link")
    private SelenideElement link;

    public String getName() {
        return link.getText();
    }

    public String getHref() {
        return link.getAttribute("href");
    }

    public void click() {
        getSelf().click();
    }
}
