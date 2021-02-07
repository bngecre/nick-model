package me.bungeecore.nickserver.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter()
public class ErrorBody {
    private String timestamp;
    private int status;
    private String error;
    private String message;
}