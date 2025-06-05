package main.java;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SecondJson {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Test test = new Test();
        String json = mapper.writeValueAsString(test);
        System.out.println("Serialized JSON: " + json);
    }

}

class Test {
    public String a = "aaaa";
    public String b = "bbbb";

    public Test() {
    }
}