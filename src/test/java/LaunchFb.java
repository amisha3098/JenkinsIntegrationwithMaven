import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFb {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "E:\\CODOID\\Jenkins\\Maven Framework\\driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       driver.get("https://pptr.dev/");

       driver.manage().window().maximize();

       driver.quit();

    }


}
