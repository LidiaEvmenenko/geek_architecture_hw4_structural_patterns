package hw4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StructureComposite implements FileNamePrintable {
    private final List<FileNamePrintable> list;

    public StructureComposite() {
        list = new ArrayList<>();
    }

    @Override
    public void printFileName() {
        list.forEach(FileNamePrintable::printFileName);
    }

    public void addFileStructure(FileNamePrintable fileNamePrintable) {
        list.add(fileNamePrintable);
    }

    public void removeFileStructure(FileNamePrintable fileNamePrintable) {
        list.remove(fileNamePrintable);
    }
    public void createFileNamePrintableObjects(File file) throws IOException {
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                FileNamePrintable dir = new DirectoryStructure(f.getParent(),f.getName());
                addFileStructure(dir);
                createFileNamePrintableObjects(f);
            } else {
                FileNamePrintable fil = new FileStructure(f.getParent(), f.getName());
                addFileStructure(fil);
            }
        }
    }
}
