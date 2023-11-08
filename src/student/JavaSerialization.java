package student;

import java.io.*;
import java.sql.Struct;

public class JavaSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeToFile();
        readFromFile();
    }

    public static void writeToFile() throws IOException {
        Student student = new Student("asd", "asd");
        Student student2 = new Student("asd", "asd");

        OutputStream os = new FileOutputStream("dir1/serialized.bin");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(student);
        oos.writeObject(student2);

        oos.flush();
        oos.close();
    }

    public static void readFromFile() throws IOException, ClassNotFoundException {
        File file = new File("dir1/serialized.bin");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object o = ois.readObject();
        Object o2 = ois.readObject();

        Student s = (Student) o;
        System.out.println("s.toString() = " + s.toString());
        System.out.println("o2.toString() = " + o2.toString());
    }
}
