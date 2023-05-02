package login_Page;

import basePackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class Phone_Login extends BaseClass {

    @FindBy(id = "mat-input-0")
    WebElement txt_phone;

    @FindBy(xpath = "//mat-error[text()=' Mobile Number Cannot be blank']")
    WebElement ph_error1;
    @FindBy(xpath = "//mat-error[text()=' Enter valid Mobile Number,Country Code followed by 10 digit mobile number']")
    WebElement getPh_error2;
    @FindBy(xpath = "//span[text()='Get OTP']")
    WebElement btn_GetOtp;
    @FindBy(xpath = "//div[@class='ng-otp-input-wrapper wrapper ng-star-inserted']")
    WebElement otp_field;
    @FindBy(xpath = "//span[text()='Verify']")
    WebElement btn_verify;

    public Phone_Login(WebDriver driver) throws IOException {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void phone_Number(String num) throws InterruptedException {
        Thread.sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        Thread.sleep(2000);
//        js.executeScript("document.getElementById("+txt_phone+").value="+num);
//        Thread.sleep(2000);
        txt_phone.sendKeys(num);
    }
    public void get_OTP_Button() throws InterruptedException {
        Thread.sleep(3000);
        btn_GetOtp.click();
    }
    public void passing_OTP(String otp) throws InterruptedException {
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.sendKeys(otp).perform();
    }
    public void verify_OTP() throws InterruptedException {
        Thread.sleep(3000);
        btn_verify.click();
    }



}
