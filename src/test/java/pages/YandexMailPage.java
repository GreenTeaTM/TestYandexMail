package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class YandexMailPage extends BasePage{

    public YandexMailPage (WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("https://mail.yandex.ru/");
        sleep(3000);
    }

    public void openMessageByText(String Text) {
        if (IsElementOnPage(By.xpath("//*[contains(text(), '" + Text + "')]"))) {
            driver.findElement(By.xpath("//*[contains(text(), '" + Text + "')]")).click();
            sleep(1000);
        } else {
            Assert.fail("Element not found");
        }
    }

}
