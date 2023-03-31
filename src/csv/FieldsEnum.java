package csv;

import java.util.Arrays;

public enum FieldsEnum {
    MARCA("Marca", 0, true),
    MODELLO("Modello", 1, true),
    PREZZO("Prezzo", 2, true),
    TARGA("Targa", 3, true),
    NR_RUOTE("Numero di Ruote", 4, true),
    TIPOLOGIA("Tipologia", 5, false);
    private final String name;
    private final int value;
    private final boolean inCsv;

    private FieldsEnum(String name, int value, boolean inCsv) {
        this.name = name;
        this.value = value;
        this.inCsv = inCsv;
    }

    public static FieldsEnum geFieldFromValue(int intValue) {
        return
                Arrays.stream(FieldsEnum.values())
                        .filter(e -> e.value == intValue)
                        .findFirst().get();
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isInCsv() {
        return this.inCsv;
    }
}
