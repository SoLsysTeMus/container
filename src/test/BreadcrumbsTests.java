import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.CheckoutPage;
import pages.MainPage;
import pages.PersonalCabinet;

public class BreadcrumbsTests {

    @Test
    public void clickToBreadcrumb() {
        var catalogPage = CatalogPage.init();
        catalogPage.breadcrumbs.get(0).click();
    }
}
