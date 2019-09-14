package lambda;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FillFilterLambda {
    public static void main(String[] args) {
        FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith(".java");
        FilenameFilter filenameFilter = (File dir, String name) -> name.endsWith(".java");
        File dir = new File("/home/camusbai");
        for (String filename : dir.list(filenameFilter)) {
            System.out.println(filename);
        }
    }
}
