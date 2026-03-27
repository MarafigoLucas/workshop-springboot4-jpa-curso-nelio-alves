package com.educandoweb.course.services.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -1L;

    public ResourceNotFoundException(Object id) {
        super("Resouce not found. Id" + id);
    }
}
