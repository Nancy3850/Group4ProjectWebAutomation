package pages;

import base.MainAPI;
import org.testng.annotations.Test;
import page.WalmartHome;

public class TestWalmartHome extends MainAPI {

 WalmartHome wh;

 @Test
    public void search(){
     wh.WalmartHome();
 }
}
