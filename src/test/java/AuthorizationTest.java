import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorizationTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void LaunchPage() throws Exception{
        driver.manage().window().maximize();
        driver.get("https://tomatovan.github.io/cards-slip/");
        Thread.sleep(3000);
    }

    @Test (priority = 1)
    public void Login() throws Exception{
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.frame > form > div.submit > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#root > div > header > div > div.user-data > div.user-data__name")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.frame > div.profile > div.profile__button > button")).click();
    }

    @Test (priority = 2)
    public void SignUp() throws Exception{
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.frame > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test_mail@mail.ru");
        driver.findElement(By.name("password")).sendKeys("test22");
        driver.findElement(By.name("confirm_password")).sendKeys("test22");
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.frame > form > div.submit > button")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("#root > div > header > div > div.user-data > div.user-data__name")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.frame > div.profile > div.profile__button > button")).click();
    }

    @Test (priority = 3)
    public void TearDown() {
        driver.quit();
    }
}
