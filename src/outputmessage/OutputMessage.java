package outputmessage;

public class OutputMessage {
    private OutputMessage() {
    }

    public static final String MAIN_MENU = "\nScegli un'operazione dal menu (numero + invio): " +
            "\n1 - Mostra tutto il CSV" +
            "\n2 - Aggiungi Nuovo mezzo" +
            "\n3 - Cerca" +
            "\n0 - Exit";
    public static final String ERRORE_INPUT = "Errore inatteso. Si prega di riprovare. Messaggio di errore: ";
    public static final String SCEGLI_VALORE_DA_MENU = "Scegli un valore dal menu";
    public static final String CERCA_MENU = "Per quale campo vuoi cercare?";
    public static final String CERCA_CAMPO = "Cerca per campo";
    public static final String INSERISCI = "Inserisci ";
    public static final String VALORE_INVIO = " (valore + invio):";
}
