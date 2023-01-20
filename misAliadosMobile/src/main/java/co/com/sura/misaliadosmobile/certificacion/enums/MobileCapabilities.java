package co.com.sura.misaliadosmobile.certificacion.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MobileCapabilities {

    DEVICE_NAME("appium:deviceName", "R58T61BNTVK"),
    APP_PACKAGE("appium:appPackage", "com.misaliados.appv2.lab"),
    APP_ACTIVITY("appium:appActivity", "com.example.mis_aliados_flutter_app.MainActivity"),
    AUTO_GRANT_PERMISSIONS("appium:autoGrantPermissions", true),
    RESET_KEY_BOARD("appium:resetKeyboard", true),
    PLATFORM_NAME("platformName", "Android"),
    PLATFORM_VERSION("appium:platformVersion", "12"),
    AUTOMATION_NAME("appium:automationName", "UiAutomator2"),
    LENGUAGE("appium:language", "es"),
    LOCALE("appium:locale", "ES"),
    NO_RESET("appium:noReset", false);

    private final String key;
    private final Object value;
}
