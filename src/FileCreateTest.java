import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateTest {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("dir1/file.txt");
        //FileOutputStream fos2 = new FileOutputStream(new File("dir1/file.txt"));

        fos.write(65);
        fos.write(65);
        fos.write(65);
        fos.write(65);

        fos.flush();
        fos.close();
        System.out.println("fos.hashCode() = " + fos.hashCode());

        new File("dir1/subdir1").mkdir();
    }
}
