package info.mikusr.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Dd {
    public static void dd(Object obj) {
        if (obj == null) {
            System.out.println("null");
            return;
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Class<?> clazz = obj.getClass();

        // 1. Handle Arrays
        if (clazz.isArray()) {
            Map<String, Object> arrayMap = new LinkedHashMap<>();
            arrayMap.put("__class__", clazz.getComponentType().getSimpleName() + "[]");

            int length = Array.getLength(obj);
            List<Map<String, Object>> elements = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                Object value = Array.get(obj, i);
                Map<String, Object> elementInfo = new LinkedHashMap<>();
                elementInfo.put("index", i);
                elementInfo.put("type", value != null ? value.getClass().getSimpleName() : "null");
                elementInfo.put("value", value);
                elements.add(elementInfo);
            }
            arrayMap.put("elements", elements);
            System.out.println(gson.toJson(arrayMap));
            return;
        }

        // 2. Handle Collections (Lists, Sets, etc.)
        if (obj instanceof Collection<?>) {
            Map<String, Object> collectionMap = new LinkedHashMap<>();
            collectionMap.put("__class__", clazz.getName());

            Collection<?> col = (Collection<?>) obj;
            List<Map<String, Object>> elements = new ArrayList<>();
            int i = 0;

            for (Object value : col) {
                Map<String, Object> elementInfo = new LinkedHashMap<>();
                elementInfo.put("index", i++);
                elementInfo.put("type", value != null ? value.getClass().getSimpleName() : "null");
                elementInfo.put("value", value);
                elements.add(elementInfo);
            }
            collectionMap.put("elements", elements);
            System.out.println(gson.toJson(collectionMap));
            return;
        }

        // 3. Handle Standard Objects (Your existing logic)
        Map<String, Object> debugMap = new LinkedHashMap<>();
        debugMap.put("__class__", clazz.getName());

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                String fieldName = field.getName();
                String fieldType = field.getType().getSimpleName();
                Object fieldValue = field.get(obj);

                Map<String, Object> typeAndValue = new LinkedHashMap<>();
                typeAndValue.put("type", fieldType);
                typeAndValue.put("value", fieldValue);

                debugMap.put(fieldName, typeAndValue);
            } catch (IllegalAccessException e) {
                debugMap.put(field.getName(), "Error accessing field: " + e.getMessage());
            }
        }

        System.out.println(gson.toJson(debugMap));
    }
}