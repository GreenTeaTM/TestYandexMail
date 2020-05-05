package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.YandexEmailPage;
import pages.YandexLoginPage;
import pages.YandexMailPage;

import static org.testng.Assert.assertEquals;

public class Test1 {
    WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        YandexLoginPage yandexLoginPage = new YandexLoginPage(driver);
        YandexEmailPage yandexEmailPage = new YandexEmailPage(driver);
        YandexMailPage yandexMailPage = new YandexMailPage(driver);

        yandexLoginPage.open();
        yandexLoginPage.login();
        yandexMailPage.open();
        yandexMailPage.openMessageByText("Тестовое сообщение");

        assertEquals(yandexEmailPage.getMessageSubject(),"Тестовое сообщение");
        assertEquals(yandexEmailPage.getNameSender(),"Alex Gregorjev");
        assertEquals(yandexEmailPage.getEmailSender(),"gregorjev.a.i@gmail.com");
        assertEquals(yandexEmailPage.getMailBody(),"Сообщение тестовое");

        yandexEmailPage.LogoutSystem();
    }

    @AfterClass
    public void shutdown(){
        driver.close();
    }
}
