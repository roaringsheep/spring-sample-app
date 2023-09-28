package com.juniper.SpringBootInitializr.Exceptions;

public class TrailNotFoundException extends RuntimeException {
    public TrailNotFoundException(String message) {
        super(message);
    }
    
    public TrailNotFoundException(String message, Throwable ex) {
        super(message, ex);
    }
  
    public TrailNotFoundException(Throwable ex) {
       super(ex);
    }
}
