import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static org.apache.tools.ant.taskdefs.SetPermissions.NonPosixMode.fail;

public class MainPageTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void LoginValidate() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://tomatovan.github.io/cards-slip/");
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.frame > form > div.submit > button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#root > div > header > div > div.user-data > div.user-data__avatar > img")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("frame__back")).click();
        Thread.sleep(3000);
    }

    @Test (dependsOnMethods = "LoginValidate")
    public void AddPack() throws Exception{
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div.cards__top > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(1) > div > input")).sendKeys("AnyPack");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div.submit.submit__modals > button.button.button--undefined")).click();
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "AddPack")
    public void AddCard() throws Exception {
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(4) > div > div.packs__list > div:nth-child(1) > div.pack__col.pack__title > div.pack__name.cut")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(3) > div > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(2) > div > input")).sendKeys("Whats ur name?");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(3) > div > input")).sendKeys("Nikita");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div.submit.submit__modals > button.button.button--undefined")).click();
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "AddCard")
    public void DeleteCard() throws Exception {
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div.packs > div.pack > div:nth-child(5) > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeSmall.pack__button.pack__button--del.css-1j7qk7u > svg")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > div.modals__deleteMessage > div > button.button.button--delete")).click();
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "DeleteCard")
    public void DeletePack() throws Exception {
       driver.get("https://tomatovan.github.io/cards-slip/#/packs?accessory=All");
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(4) > div > div.packs__list > div:nth-child(1) > div:nth-child(5) > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeSmall.pack__button.pack__button--del.css-1j7qk7u > svg > path")).click();
       driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > div.modals__deleteMessage > div > button.button.button--delete")).click();
       Thread.sleep(3000);
    }
    @Test (priority = 8)
    public void StartStudying() throws Exception{
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div.cards__top > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(1) > div > input")).sendKeys("AnyPack");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div.submit.submit__modals > button.button.button--undefined")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(4) > div > div.packs__list > div:nth-child(1) > div.pack__col.pack__title > div.pack__name.cut")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(3) > div > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(2) > div > input")).sendKeys("Whats ur name?");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(3) > div > input")).sendKeys("Nikita");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div.submit.submit__modals > button.button.button--undefined")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div.cards__menu > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(2) > div > input")).sendKeys("Hm");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div:nth-child(3) > div > input")).sendKeys("Mh");
        driver.findElement(By.cssSelector("body > div.MuiModal-root.css-8ndowl > div.modals > form > div.submit.submit__modals > button.button.button--undefined")).click();
        Thread.sleep(3000);
        driver.get("https://tomatovan.github.io/cards-slip/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(4) > div > div.packs__list > div:nth-child(1) > div:nth-child(5) > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeSmall.pack__button.pack__button--teach.css-1j7qk7u > svg > path")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.learn > div.frame > div.learn__btn > button")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.cssSelector("#root > div > div.content > div > div.learn > div.frame > div.learn__answer > div:nth-child(1) > span")).getText();
        String answer1 = "Nikita";
        if (answer1.equals(text) == false){
            org.testng.Assert.fail("Incorrect");
        }
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.learn > div.frame > div.learn__answer > div.grades > div > div > label:nth-child(1) > span.MuiButtonBase-root.MuiRadio-root.MuiRadio-colorPrimary.PrivateSwitchBase-root.MuiRadio-root.MuiRadio-colorPrimary.MuiRadio-root.MuiRadio-colorPrimary.css-1a5icme > input")).click();
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.learn > div.frame > div.learn__answer > div.learn__btn > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.learn > div.frame > div.learn__btn > button")).click();
        Thread.sleep(3000);
        String text2 = driver.findElement(By.cssSelector("#root > div > div.content > div > div.learn > div.frame > div.learn__answer > div:nth-child(1) > span")).getText();
        String answer2 = "Mh";
        if (answer2.equals(text2) == false){
            org.testng.Assert.fail("Incorrect");
        }
        driver.get("https://tomatovan.github.io/cards-slip/#/packs?accessory=All");
        Thread.sleep(3000);
    }

    @Test (dependsOnMethods = "StartStudying")
    public void Search() throws Exception{
        String name = "Anypack";
        driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div.cards__menu > div.search > label > input")).sendKeys(name);
        Thread.sleep(3000);
        String text = driver.findElement(By.cssSelector("#root > div > div.content > div > div.cards > div:nth-child(4) > div > div.packs__list > div > div.pack__col.pack__title > div.pack__name.cut")).getText();
        if (name.equals(text) == false){
            org.testng.Assert.fail("Incorrect");
        }
    }
}
