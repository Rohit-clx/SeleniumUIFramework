package scriptUtil;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class ScreenshotMethods extends BasePage{

    /** Method to take screen shot and save in ./Screenshots folder*/
    public void takeScreenShot() throws IOException
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

        String scrFilepath = scrFile.getAbsolutePath();
        System.out.println("scrFilepath: " +scrFilepath);

        File currentDirFile = new File("Screenshots");
        String path = currentDirFile.getAbsolutePath();
//        deleteFolder(currentDirFile);

        System.out.println("****\n"+path+"\\screenshot"+dateFormat.format(cal.getTime())+".png");

        FileUtils.copyFile(scrFile, new File(path+"\\screenshot"+dateFormat.format(cal.getTime())+".png"));

		/*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));*/
    }

    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if(files!=null) { //some JVMs return null for empty dirs
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
	 /* cur_time = Time.now.strftime('%Y%m%d%H%M%S%L')
	  $driver.save_screenshot('./features/screenshots/screenshot' + cur_time + '.png')*/
}
