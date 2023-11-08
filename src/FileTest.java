import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file1 = new File("../someDir/file.txt");
        File fileAbsolute = new File("C://someDir/file.txt");
        file1.createNewFile();
        fileAbsolute.createNewFile();

        File src = new File("src");
        System.out.println("src.isFile() = " + src.isFile());
        System.out.println("src.isDirectory() = " + src.isDirectory());
    }
}
