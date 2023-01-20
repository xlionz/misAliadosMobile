package co.com.sura.misaliadosmobile.certificacion.utils;

import co.com.sura.misaliadosmobile.certificacion.models.Independent;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFiles {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);
    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String CONFIG_INDEPENDENTS = "independents.";

    public static Independent readIndependent(String independent) {

        LOGGER.info("Se crea el objeto independent");

        return new Independent(
                CONF.getProperty(CONFIG_INDEPENDENTS + independent + ".name"),
                CONF.getProperty(CONFIG_INDEPENDENTS + independent + ".email"),
                CONF.getProperty(CONFIG_INDEPENDENTS + independent + ".password")
        );
    }
}
