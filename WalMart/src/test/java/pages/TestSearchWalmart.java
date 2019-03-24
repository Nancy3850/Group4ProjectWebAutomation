package pages;

import base.MainAPI;

import base.MainAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SearchWalmart;


    public class TestSearchWalmart extends MainAPI{

        SearchWalmart searchWalmart;
        public void initialize() {
            searchWalmart = PageFactory.initElements(driver, SearchWalmart.class);
        }
        @Test
        public void search () {
            searchWalmart.searchTV();
        }
        @Test
        public void search2 () {
            searchWalmart.searchCoffeeMaker();
        }
        @Test
        public void search3 () {
            searchWalmart.searchToys();
        }
        @Test
        public void search4 () {
            searchWalmart.searchMattress();
        }
        @Test
        public void search5 () {
            searchWalmart.searchPillow();
        }
        @Test
        public void search6 () {
            searchWalmart.searchBeddingComforter();
        }
        @Test
        public void search7 () {
            searchWalmart.searchMicrowave();
        }

        }













