package page;

import base.MainAPI;
import org.testng.Assert;

public class SearchWalmart extends MainAPI {

    public void searchTV(){
            typeOnElementNEnter("Tile-image","TV");
            String st = driver.getTitle();
            System.out.println(st);
        }
        public void searchCoffeeMaker() {
            typeOnElementNEnter("header-search-input", "Coffee maker");
            String st = driver.getTitle();
            System.out.println(st);
        }
        public void searchToys(){
            typeOnElementNEnter("global-search-input","Toys");
            String st = driver.getTitle();
            System.out.println(st);
        }
        public void searchMattress(){
            typeOnElementNEnter("header-search-input","Mattress");
            String st = driver.getTitle();
            System.out.println(st);
        }
        public void searchPillow(){
            typeOnElementNEnter("global-search-input","Pillow");
            String st = driver.getTitle();
            System.out.println(st);
        }public void searchBeddingComforter(){
            typeOnElementNEnter("global-search-input","Bedding Comforter");
            String st = driver.getTitle();
            System.out.println(st);
        }public void searchMicrowave(){
            typeOnElementNEnter("header-search-input","Microwave");
            String st = driver.getTitle();
            System.out.println(st);
        }





    }


