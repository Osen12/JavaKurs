package Document;

public class DocumentChecker {
    public static void main(String[] args) {

        Document excelDocument = new ExcelDocument();
        Document PDFDocument = new PDFDocument();

        excelDocument.getDescription();
        PDFDocument.getDescription();


    }
}