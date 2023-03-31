package vehicle;

import csv.FieldsEnum;
import csv.ManageCsv;
import inputuser.InputUser;
import outputmessage.OutputMessage;

import static java.lang.System.exit;

public class VehicleManagement {
    ManageCsv csv;

    public VehicleManagement(String fileCsv) {
        csv = new ManageCsv(fileCsv);
    }

    public void mainMenu() {
        System.out.println(OutputMessage.MAIN_MENU);
        switch (InputUser.getInputInt()) {
            case 1:
                csv.printAllCsv();
                break;
            case 2:
                this.addVehicle();
                break;
            case 3:
                this.searchVehicleMenu();
                break;
            case 0:
                exit(0);
                break;
            default:
                System.out.println(OutputMessage.SCEGLI_VALORE_DA_MENU);
                break;
        }
        mainMenu();
    }

    private void searchVehicleMenu() {
        System.out.println(OutputMessage.CERCA_MENU);
        for (FieldsEnum field : FieldsEnum.values()) {
            System.out.println(field.getValue() + " - " + field.getName());
        }
        int inputInt = InputUser.getInputInt();
        if (inputInt >= 0 && inputInt < FieldsEnum.values().length) {
            System.out.println(OutputMessage.CERCA_CAMPO + " " + FieldsEnum.geFieldFromValue(inputInt).getName() + ":");
            csv.serarchField(FieldsEnum.geFieldFromValue(inputInt), InputUser.getInputLine());
        } else {
            this.searchVehicleMenu();
        }
    }
//ff

    private void addVehicle() {
        int i = 0;
        StringBuilder csvStringBuilder = new StringBuilder();
        for (FieldsEnum field : FieldsEnum.values()) {
            if (field.isInCsv()) {
                System.out.println(OutputMessage.INSERISCI + FieldsEnum.geFieldFromValue(i).getName() + OutputMessage.VALORE_INVIO);
                if (i != 0) {
                    csvStringBuilder.append(";");
                }

                csvStringBuilder.append(InputUser.getInputLine());
            }
            i++;
        }
        csv.addRowCSV(csvStringBuilder.toString());
        mainMenu();
    }
}
