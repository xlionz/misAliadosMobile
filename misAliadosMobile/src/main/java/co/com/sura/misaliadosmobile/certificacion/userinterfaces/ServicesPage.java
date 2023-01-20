package co.com.sura.misaliadosmobile.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ServicesPage {

    public static final Target VIEW_SERVICES = Target.the("View of services.")
            .locatedBy("(//android.view.View[contains(@content-desc, 'Nuevas solicitudes')])[{0}]");
    public static final Target VIEW_LIST_SERVICES = Target.the("View of all new services.")
            .locatedBy("//android.view.View[contains(@content-desc, 'Nuevas solicitudes')]");
    public static final Target VIEW_NEW_SERVICE = Target.the("View of new service.")
            .locatedBy("//android.view.View[contains(@content-desc, '{0}') and " +
                    "contains(@content-desc, 'Nuevas solicitudes')]");
    public static final Target VIEW_QUOTE_PROCESS_SERVICE = Target.the
            ("View of services in quote process.").locatedBy("//android.view.View" +
            "[contains(@content-desc, '{0}') and contains(@content-desc, 'Servicios en proceso de cotización')]");
    public static final Target BTN_ALL_QUOTE_PROCESS_SERVICES = Target.the("Butto to view the all " +
            "services in process of quotation.").locatedBy("//android.widget.Button[@content-desc = " +
            "'Servicios en proceso de cotización']");
    public static final Target BTN_NEW_REQUEST = Target.the("Button to view list of new " +
            "request of service").locatedBy("//android.widget.Button[@content-desc = " +
            "'Nuevas solicitudes']");
    public static final Target VIEW_WAITING_REQUEST = Target.the("View of request of waiting service.")
            .locatedBy("//android.view.View[contains(@content-desc, '{0}') " +
                    "and contains(@content-desc, 'Servicio en espera')]");
    public static final Target VIEW_ACCEPT_SERVICE = Target.the("View of accept service.")
            .locatedBy("//android.view.View[contains(@content-desc, '{0}') and contains" +
                    "(@content-desc, 'Servicio aceptado')] ");
    public static final Target VIEW_INFO_SERVICE = Target.the("View of info of service.")
            .locatedBy("//android.view.View[contains(@content-desc, 'Servicio de {0}')]");
    public static final Target BTN_ACCEPT_REQUEST = Target.the("Button to accep request.")
            .locatedBy("//android.widget.Button[@content-desc = 'ACEPTAR SOLICITUD']");
    public static final Target VIEW_ACCEPTED_SERVICE = Target.the("View of accepted service.")
            .locatedBy("//android.view.View[@content-desc = 'Servicio aceptado']");
}
