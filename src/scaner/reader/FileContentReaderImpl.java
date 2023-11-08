package scaner.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;

public class FileContentReaderImpl implements FileContentReader{
    @Override
    public String read(File file) {
        StringJoiner sj = new StringJoiner("\n");

        try (Scanner s = new Scanner(file)) {
            while (s.hasNextLine()) {
                sj.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("error!!!");
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        FileContentReader fcr = new FileContentReaderImpl();
        String read = fcr.read(new File("dir1/file.txt"));
        System.out.println("read = " + read);
    }
}
