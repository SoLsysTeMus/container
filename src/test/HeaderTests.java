import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.CheckoutPage;
import pages.MainPage;
import pages.PersonalCabinet;

public class HeaderTests {

    @Test
    public void headerIsVisibleOnCatalogPage() {
        var catalogPage = CatalogPage.init();
        catalogPage.headerBlock.headerBlockIsVisible();
    }

    @Test
    public void headerIsVisibleOnCheckoutPage() {
        var checkoutPage = CheckoutPage.init();
        checkoutPage.headerBlock.headerBlockIsVisible();
    }

    @Test
    public void headerIsVisibleOnMainPage() {
        var mainPage = MainPage.init();
        mainPage.headerBlock.headerBlockIsVisible();
    }

    @Test
    public void headerIsVisibleOnPersonalCabinet() {
        var personalCabinet = PersonalCabinet.init();
        personalCabinet.headerBlock.headerBlockIsVisible();
    }
}
