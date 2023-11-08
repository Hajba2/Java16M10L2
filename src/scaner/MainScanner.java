package scaner;

import scaner.dirScanner.DirScanner;
import scaner.dirScanner.DirScannerImpl;
import scaner.reader.FileContentReader;
import scaner.reader.FileContentReaderImpl;
import scaner.searcher.StringSearcher;
import scaner.searcher.StringSearcherImpl;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class MainScanner {

    public static void main(String[] args) throws IOException {
        DirScanner ds = new DirScannerImpl();
        Collection<File> files = ds.scan(new File("../JAVA16M10L1"));

        FileContentReader fcr = new FileContentReaderImpl();
        StringSearcher ss = new StringSearcherImpl();

        for (File f : files) {
            String content = fcr.read(f);
            if (ss.search(content, "String")) {
                System.out.println(f.getCanonicalPath());
            }
        }
    }
}
