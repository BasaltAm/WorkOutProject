package com.basalt.toy;

import lombok.Getter;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

import java.net.BindException;
import java.util.Locale;

@Getter
public class BindExceptionWithViewName extends BindException {
    private final String viewName;

    public BindExceptionWithViewName(BindingResult bindingResult, String viewName, MessageSource messageSource, Locale locale) {
        super(String.valueOf(bindingResult));
        this.viewName = viewName;
    }

}
