import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.PersonalCabinet;

public class PromocodesTests {

    @Test
    public void promocodesVisiblesInTheCatalogForAuthUser() {
        //  some auth magic
        var catalogPage = CatalogPage.init();
        catalogPage.promocodesBlock.checkPromocodesNotEmpty();
    }

    @Test
    public void promocodesNotVisibleInTheCatalogForAnonymous() {
        var catalogPage = CatalogPage.init();
        catalogPage.promocodesBlock.checkPromocodesBlockIsNotVisible();
    }

    @Test
    public void promocodesVisibleInThePersonalCabinetForAuthUser() {
        //  some auth magic
        var catalogPage = PersonalCabinet.init();
        catalogPage.promocodesBlock.checkPromocodesNotEmpty();
    }

    @Test
    public void promocodesNotVisibleInThePersonalCabinetForAnonymous() {
        var catalogPage = CatalogPage.init();
        catalogPage.promocodesBlock.checkPromocodesNotEmpty();
    }
}
