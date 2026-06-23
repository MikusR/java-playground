package info.mikusr.utils;

public class Dd {
    public static void dd(Object obj) {

        com.google.gson.Gson gson = new com.google.gson.GsonBuilder()
                .setPrettyPrinting()
                .create();
        System.out.println(gson.toJson(obj));
    }
}
