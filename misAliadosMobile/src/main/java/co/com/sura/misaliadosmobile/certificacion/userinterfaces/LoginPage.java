package co.com.sura.misaliadosmobile.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target INPUT_EMAIL = Target.the("Input of email.")
            .locatedBy("//android.view.View[@content-desc= 'Email']" +
                    "/following-sibling::android.widget.EditText[1]");
    public static final Target INPUT_PASSWORD = Target.the("Input of password.")
            .locatedBy("//android.view.View[@content-desc= 'Contraseña']" +
                    "/following-sibling::android.widget.EditText");
    public static final Target BTN_LOGIN = Target.the("Button to login.")
            .located(By.xpath("//android.widget.Button[@content-desc= 'INGRESAR']"));
}
