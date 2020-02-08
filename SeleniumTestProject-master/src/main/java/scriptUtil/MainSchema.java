package scriptUtil;

import PageObjects.Home;
import PageObjects.Products;

public interface MainSchema {
    BasePage BP = new BasePage();
    ConnectingDatabase CD = new ConnectingDatabase();
    ScreenshotMethods SSM = new ScreenshotMethods();
    ReadExcel REX = new ReadExcel();
    HelpWebElementLib HWL = new HelpWebElementLib();
    Home hm = new Home();
    Products pts = new Products();

}
