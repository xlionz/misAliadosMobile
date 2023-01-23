package co.com.sura.misaliadosmobile.certificacion.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MsgError {

    MSG_ERROR_TEXT("El texto: \"%s\", no es igual al obtenido: \"%s\"");

    private String msg;

}
