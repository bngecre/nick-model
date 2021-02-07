package me.bungeecore.nickserver.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiException extends RuntimeException{
    private final int status;
    private final String error;
    private final String message;
}