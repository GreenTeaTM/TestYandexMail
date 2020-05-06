package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexEmailPage extends BasePage {
    @FindBy (className = "mail-Message-Toolbar-Subject-Wrapper")
    private WebElement MessageSubject;

    @FindBy (xpath = "//*[contains(@class, 'mail-ui-HoverLink')]")
    private WebElement NameSender;

    @FindBy (xpath = "//*[contains(@class, 'mail-ui-HoverLink-Content')]")
    private WebElement EmailSender;

    @FindBy (className = "mail-Message-Body-Content")
    private WebElement MailBody;

    @FindBy (className = "user-account__name")
    private WebElement ShowMenu;

    @FindBy (xpath = "//*[contains(@class, 'legouser__menu-item_action_exit')]")
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
