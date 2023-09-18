package com.enoca.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INTERNAL_ERROR(5100, "Sunucu Hatası", HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4000, "Parametre Hatası", HttpStatus.BAD_REQUEST),
    COMPANY_NOT_FOUND(4100,"Company bulunamadı",HttpStatus.NOT_FOUND),
    EMPLOYEE_NOT_FOUND(4200,"Employee bulunamadı",HttpStatus.NOT_FOUND);





    private int code;
    private String message;
    HttpStatus httpStatus;
}
