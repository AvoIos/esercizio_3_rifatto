package csv;

public class ManageCsv {
    private String fileCsv = System.getProperty("user.dir") + "\\out\\production\\esercizio_3_rifatto\\resources\\veicoli.csv";

    public ManageCsv(String fileCsv) {
        if (fileCsv != null) {
            this.fileCsv = fileCsv;
        }
    }

    public void printAllCsv() {

        ReadCsv.printCsv(this.fileCsv);
    }

    public void addRowCSV(String csvString) {
        WriteCsv.addRow(this.fileCsv, csvString);
    }

    public void serarchField(FieldsEnum fieldInput, String inputLine) {
        ReadCsv.searchField(this.fileCsv, fieldInput, inputLine);

    }
}
