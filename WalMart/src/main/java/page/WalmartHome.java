package page;

import base.MainAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class WalmartHome extends MainAPI {

    public void WalmartHome() {
        MainAPI.typeOnElementNEnter("#global-search-input", "charger");
    }
}
