package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            // Lanzar una excepción de tipo RuntimeException
            throw new RuntimeException("Este es un lanzamiento intencionado de una excepción.");
        } catch (RuntimeException e) {
            // Controlar la excepción para evitar que el programa termine abruptamente
            System.out.println("Excepción controlada: " + e.getMessage());
        }
    }
}
