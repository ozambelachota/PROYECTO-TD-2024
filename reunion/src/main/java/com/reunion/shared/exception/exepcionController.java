<<<<<<< HEAD
=======
<<<<<<<< HEAD:usuario/src/main/java/com/project/demo/shared/exceptions/exepcionController.java
>>>>>>> 7e7f197 (avance del  proyecto)
<<<<<<<< HEAD:reunion/src/main/java/com/reunion/shared/exception/exepcionController.java
package com.reunion.shared.exception;
========
package com.project.demo.shared.exceptions;
>>>>>>>> af798b7 (feature: files reorganized):usuario/src/main/java/com/project/demo/shared/exceptions/exepcionController.java
<<<<<<< HEAD
=======
========
package com.reunion.shared.exception;
>>>>>>>> 7e7f197 (avance del  proyecto):reunion/src/main/java/com/reunion/shared/exception/exepcionController.java
>>>>>>> 7e7f197 (avance del  proyecto)

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exepcionController {
    private static final Logger logger = LoggerFactory.getLogger(exepcionController.class);
    
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, Object>> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "El formato del cuerpo de la solicitud es incorrecto o incompatible");
        response.put("details", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        logger.error(ex.getMessage());
        logger.error("Formato del body ingresado no valido");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(NoSuchElementException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "No se encontró un elemento con este ID");
        response.put("details", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        logger.warn(ex.getMessage());
        logger.warn("ID ingresado no existe");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<Map<String, Object>> handleDontExist(EmptyResultDataAccessException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "El ID proporcionado no existe");
        response.put("details", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        logger.warn(ex.getMessage());
        logger.warn("ID ingresado no existe");
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(response);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleNullArgument(IllegalArgumentException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "Valor null dentro de parametro");
        response.put("details", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        logger.error(ex.getMessage());
        logger.error("Valor null dentro de parametro");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "Ocurrió un error inesperado");
        response.put("details", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        logger.error(ex.getMessage());
        logger.error("Ocurrio un error inesperado");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}