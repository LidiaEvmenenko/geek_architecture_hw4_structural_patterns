package hw4;

import java.io.File;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        StructureComposite structureComposite = new StructureComposite();
        File file = new File("./");
        structureComposite.createFileNamePrintableObjects(file);
        structureComposite.printFileName();

    }
}
