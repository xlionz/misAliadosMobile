package co.com.sura.misaliadosmobile.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomoPage {
    public static final Target BTN_EXIT = Target.the("Button to 'SALIR'")
            .located(By.xpath("//android.view.View[@content-desc= 'SALIR']"));
    public static final Target BTN_PROFILE = Target.the("Button to see profile.")
            .located(By.xpath("//android.view.View[@content-desc= 'Perfil\nPestaña 3 de 4']"));
    public static final Target BTN_SERVICES = Target.the("Button to see services.")
            .locatedBy("//android.view.View[@content-desc= 'Servicios\nPestaña 2 de 4']");
}
