package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import pages.blocks.BreadcrumbsItem;
import pages.blocks.HeaderBlock;
import pages.blocks.PromocodesBlock;

import java.util.List;

public class CatalogPage {

    @FindBy(id = "header")
    public HeaderBlock headerBlock;

    @FindBy(id = "promocodesWrapper")
    public PromocodesBlock promocodesBlock;

    @FindBy(id = "breadcrumbsItem")
    public List<BreadcrumbsItem> breadcrumbs;

    private CatalogPage() {}

    public static CatalogPage init() {
        return Selenide.page(CatalogPage.class);
    }
}
