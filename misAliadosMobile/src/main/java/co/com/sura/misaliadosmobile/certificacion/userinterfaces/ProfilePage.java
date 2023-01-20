package co.com.sura.misaliadosmobile.certificacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage {

    public static final Target BTN_LICENSE = Target.the("Button to see license.")
            .locatedBy("//android.view.View[@content-desc='Mi carnet']");
    public static final Target LBL_NAME_CONTRACTOR = Target.the("Label about of name of contractor")
            .locatedBy("//android.view.View[contains(@content-desc, '{0}')]");
}
