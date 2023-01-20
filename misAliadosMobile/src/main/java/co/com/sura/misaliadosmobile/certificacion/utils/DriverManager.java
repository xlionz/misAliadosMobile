package co.com.sura.misaliadosmobile.certificacion.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.sura.misaliadosmobile.certificacion.enums.MobileCapabilities.*;

public class DriverManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverManager.class);
    private static WebDriver driver = null;
    private static AppiumDriverLocalService server = null;

    public static WebDriver start() {
        server = new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingAnyFreePort().build();
        server.start();
        server.clearOutPutStreams();

        UiAutomator2Options capabilities = new UiAutomator2Options();

        capabilities.setCapability(DEVICE_NAME.getKey(), DEVICE_NAME.getValue());
        capabilities.setCapability(APP_PACKAGE.getKey(), APP_PACKAGE.getValue());
        capabilities.setCapability(APP_ACTIVITY.getKey(), APP_ACTIVITY.getValue());
        capabilities.setCapability(AUTO_GRANT_PERMISSIONS.getKey(), AUTO_GRANT_PERMISSIONS.getValue());
        capabilities.setCapability(PLATFORM_NAME.getKey(), PLATFORM_NAME.getValue());
        capabilities.setCapability(PLATFORM_VERSION.getKey(), PLATFORM_VERSION.getValue());
        capabilities.setCapability(RESET_KEY_BOARD.getKey(), RESET_KEY_BOARD.getValue());
        capabilities.setCapability(AUTOMATION_NAME.getKey(), AUTOMATION_NAME.getValue());
        capabilities.setCapability(LENGUAGE.getKey(), LENGUAGE.getValue());
        capabilities.setCapability(LOCALE.getKey(), LOCALE.getValue());
        capabilities.setCapability(NO_RESET.getKey(), NO_RESET.getValue());

        driver = new AndroidDriver(server.getUrl(), capabilities);

        LOGGER.info("El driver se inicializo");
        return driver;
    }

    public static void stop() {
        if (driver != null) {
            driver.quit();
            LOGGER.info("Driver stop");
        }

        if (server != null) {
            server.stop();
            LOGGER.info("Server stop");
        }
    }

    public static AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }
}
