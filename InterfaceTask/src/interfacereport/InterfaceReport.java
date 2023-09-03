//JAVA PROGRAM FOR ABSTRACTION
//FAYSAL HOSSAIN TOMAL

package interfacereport;

interface IsEmergency {

    void soundSiren();

}

class FireEmergency implements IsEmergency {

    @Override
    public void soundSiren() {
        System.out.println("Siren Sounded");
    }

}

class SmokeAlarm {

}

public class InterfaceReport {

    public static void main(String[] args) {

        Object[] myArray = new Object[4];

        myArray[0] = new SmokeAlarm();
        myArray[1] = new SmokeAlarm();
        myArray[2] = new FireEmergency();
        myArray[3] = new FireEmergency();

        for (Object obj : myArray) {
            if (obj instanceof IsEmergency) {
                System.out.println("This is an emergency!");
                ((IsEmergency) obj).soundSiren();
            } else {
                System.out.println("This is not an emergency.");
            }
        }

    }

}
