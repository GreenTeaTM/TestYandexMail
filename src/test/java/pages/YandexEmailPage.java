package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexEmailPage extends BasePage {
    @FindBy (className = "mail-Message-Toolbar-Subject-Wrapper")
    private WebElement MessageSubject;

    @FindBy (xpath = "//*[@id=\"nb-1\"]/body/div[2]/div[5]/div/div[3]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]")
    private WebElement NameSender;

    @FindBy (xpath = "//*[@id=\"nb-1\"]/body/div[2]/div[5]/div/div[3]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/span[2]/span[1]")
    private WebElement EmailSender;

    @FindBy (className = "mail-Message-Body-Content")
    private WebElement MailBody;

    @FindBy (xpath = "//*[@id=\"nb-1\"]/body/div[2]/div[5]/div/div[2]/div/div/header/div/div[5]/div[2]/a[1]")
    private WebElement ShowMenu;

    @FindBy (xpath = "//*[@id=\"nb-1\"]/body/div[2]/div[5]/div/div[2]/div/div/header/div/div[5]/div[2]/div/ul/ul/li[5]/a")
    private WebElement Logout;

    public YandexEmailPage (WebDriver driver) {
        super(driver);
    }

    public String getMessageSubject(){
        return MessageSubject.getText();
    }

    public String getNameSender(){
        return NameSender.getText();
    }

    public String getEmailSender(){
        return EmailSender.getText();
    }

    public String getMailBody(){
        return MailBody.getText();
    }

    public void LogoutSystem(){
        ShowMenu.click();
        sleep(500);
        Logout.click();
        sleep(500);
    }
}
