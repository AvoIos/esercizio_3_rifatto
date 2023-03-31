package csv;

import vehicle.Vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReadCsv {
    private ReadCsv() {}

    public static void printCsv(String fileCsv) {
        try (Stream<String> input = Files.lines(Paths.get(fileCsv))) {
            input.skip(1)
                    .map(ReadCsv::getLineVehicle)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Vehicle getLineVehicle(String line) {
        String[] fields = line.split(";");
        if (fields.length >= Arrays.stream(FieldsEnum.values()).filter(e -> e.isInCsv()).count()) {
            return new Vehicle(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3], Integer.parseInt(fields[4]));
        }
        return null;
    }

    public static void searchField(String fileCsv, FieldsEnum fieldInput, String inputLine) {
        try (Stream<String> input = Files.lines(Paths.get(fileCsv))) {
            input.skip(1)
                    .map(ReadCsv::getLineVehicle)
                    .filter(vehicle -> vehicle.getField(fieldInput).contains(inputLine))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
