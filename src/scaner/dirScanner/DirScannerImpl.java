package scaner.dirScanner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class DirScannerImpl implements DirScanner{

    @Override
    public Collection<File> scan(File dir) {
        ArrayList<File> files = new ArrayList<>();
        recursiveScan(dir, files);
        return files;
    }

    private void recursiveScan(File dir, Collection<File> files) {
        File[] filesInDir = dir.listFiles();
        for(File f : filesInDir) {
            if (f.isDirectory()) {
                recursiveScan(f, files);
            } else {
                files.add(f);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        DirScannerImpl dsi = new DirScannerImpl();
        Collection<File> files = dsi.scan(new File("dir1"));

        for (File f : files) {
            System.out.println("f.getCanonicalPath() = " + f.getCanonicalPath());
        }
    }
}
