package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexLoginPage extends BasePage{
    @FindBy(id = "passp-field-login")
    private WebElement loginInput;

    @FindBy(className = "passp-sign-in-button")
    private WebElement loginButton;

    @FindBy(id = "passp-field-passwd")
    private WebElement passwordInput;

    public YandexLoginPage (WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("https://passport.yandex.ru/auth/add");
        driver.manage().window().maximize();
    }

    public void login(){
        loginInput.sendKeys("TestTestTestof@yandex.ru");
        sleep(500);
        loginButton.click();
        sleep(500);
        passwordInput.sendKeys("test123");
        sleep(500);
        loginButton.click();
        sleep(500);
    }
}
