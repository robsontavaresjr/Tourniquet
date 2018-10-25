package tourniquet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean finish = false;

        //Standard mode is current on
        while(finish != true) {

            //Initializing Components' class
            Components mechanicalComponents = new Components();

            //Simulating user touching a card at the reader
            System.out.println("Is your card valid ? (true for valid, false for invalid.)");
            Scanner scanner = new Scanner(System.in);

            //Storing card number for logic procedure below
            boolean cardNumber = scanner.nextBoolean();

            //Checking if card is valid or not.
            if(cardNumber == true){

                //Unlocking and securing that the alarm doesn't ring
                mechanicalComponents.setLocked(false);
                mechanicalComponents.setAlarmIsOn(false);

                System.out.println("tourniquet is locked ? " + mechanicalComponents.isLocked());
                System.out.println("alarm is on ? " + mechanicalComponents.isAlarmIsOn() + "\n\n");

                //Detecting passage and locking the tourniquet again
                mechanicalComponents.setPassageDetected(true);
                System.out.println("Passage was successfully detected");

                mechanicalComponents.setLocked(true);
                System.out.println("Tourniquet is locked after passage ? " + mechanicalComponents.isLocked() + "\n\n");

            } else {
                //Keeping the tourniquet locked and the alarm off
                mechanicalComponents.setLocked(true);
                mechanicalComponents.setAlarmIsOn(false);

                System.out.println("\n\ntourniquet is locked ? " + mechanicalComponents.isLocked());
                System.out.println("alarm is on ? " + mechanicalComponents.isAlarmIsOn() + "\n\n");

                //Detecting passage and checking for forced passage
                System.out.println("Forced passage is detected ? (true for detection, false for non-detection)");
                Scanner forcedPassage = new Scanner(System.in);

                if(forcedPassage.nextBoolean() == false){

                    System.out.println("There wasn't forced passage\n\n");

                } else {

                    mechanicalComponents.setAlarmIsOn(true);


                    while (mechanicalComponents.isReboot() == false ) {

                        System.out.println("Forced passage was detected. Alarm is on !!!");
                        System.out.println("alarm is on ?  " + mechanicalComponents.isAlarmIsOn() + "\n\n");

                        //Checking if user want to reboot the system
                        System.out.println("Do you want to reboot the system ? true for rebooting, false for keeping the state)");
                        Scanner rebootInside = new Scanner(System.in);
                        mechanicalComponents.setReboot(rebootInside.nextBoolean());
                        System.out.println("\n\n");

                    }
                }
            }

            System.out.println("Want to enter at diagnosis mode ? true for diagnosis mode, false to keep on running standard mode)\n\n");
            Scanner diagnosis = new Scanner(System.in);
            mechanicalComponents.setDiagnostic(diagnosis.nextBoolean());

            if(mechanicalComponents.isDiagnostic() == true) {

                System.out.println("Diagnosis mode: Enter a card ! (true for valid, false for invalid.)");
                Scanner scannerDiagnostic = new Scanner(System.in);

                //Storing card number for logic procedure below
                boolean testValidCard = scannerDiagnostic.nextBoolean();

                if(testValidCard == true) {
                    System.out.println("Valid Card\n\n");
                } else {
                    System.out.println("Unvalid Card !\n\n");
                }

            }
        }
    }
}
