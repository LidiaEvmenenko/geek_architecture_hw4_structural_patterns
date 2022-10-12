package hw4;

public class FileStructure implements FileNamePrintable {
    private String parent;
    private String filename;

    public FileStructure(String parent, String filename) {
        this.parent = parent;
        this.filename = filename;
    }

    @Override
    public void printFileName() {
        System.out.println("File: " +parent + "\\" + filename);
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
