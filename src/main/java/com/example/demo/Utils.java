package com.example.demo;

import java.lang.reflect.Field;

public class Utils {

    public static boolean hasNullField(Object obj) {
        if (obj == null) {
            return true;  // O próprio objeto é nulo
        }

        Field[] fields = obj.getClass().getDeclaredFields();

        try {
            for (Field field : fields) {
                field.setAccessible(true);  // Permite acessar campos privados
                Object value = field.get(obj);
                if (value == null) {
                    return true;  // Encontrou um campo nulo
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return false;  // Nenhum campo nulo
    }
}
