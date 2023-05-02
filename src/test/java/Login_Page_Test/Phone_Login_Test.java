package Login_Page_Test;

import basePackage.BaseClass;
import login_Page.Phone_Login;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Phone_Login_Test extends BaseClass {
    Phone_Login ph;

    public Phone_Login_Test() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization(prop.getProperty("Phone_Login_URL"));
        ph = new Phone_Login(driver);
    }
    @Test
    public void enter_Valid_PhoneNumber() throws InterruptedException {
        ph.phone_Number(prop.getProperty("Phone_Number"));
        ph.get_OTP_Button();
    }
    @Test
    public void passing_Otp() throws InterruptedException {
        ph.passing_OTP(prop.getProperty("OTP"));
        ph.verify_OTP();
    }
}
