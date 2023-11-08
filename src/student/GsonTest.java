package student;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = new Student("Goga", "23");

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson1.toJson(student);
        System.out.println("jsonString = " + jsonString);

        Student student1 = gson1.fromJson(jsonString, Student.class);
        System.out.println("student1.toString() = " + student1.toString());
    }
}
