package csv;

import outputmessage.OutputMessage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    private WriteCsv() {
    }

    protected static void addRow(String fileCsv, String csvString) {
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter(fileCsv, true))) {
            out.write("\n" + csvString);
        } catch (IOException e) {
            System.out.println(OutputMessage.ERRORE_INPUT + e);
        }
    }
}
