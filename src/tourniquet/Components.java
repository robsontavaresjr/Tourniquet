package tourniquet;

public class Components {

    boolean locked;
    boolean alarmIsOn;
    boolean validCard;
    boolean passageDetected;
    boolean reboot;
    boolean diagnostic;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked){
        this.locked = locked;
    }

    public boolean isAlarmIsOn() {
        return alarmIsOn;
    }

    public void setAlarmIsOn(boolean alarmIsOn) {
        this.alarmIsOn = alarmIsOn;
    }

    public boolean isValidCard() {
        return validCard;
    }

    public void setValidCard(boolean validCard) {
        this.validCard = validCard;
    }

    public boolean isPassageDetected() {
        return passageDetected;
    }

    public void setPassageDetected(boolean passageDetected) {
        this.passageDetected = passageDetected;
    }

    public boolean isReboot() {
        return reboot;
    }

    public void setReboot(boolean reboot) {
        this.reboot = reboot;
    }

    public boolean isDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostic = diagnostic;
    }


    Components() {

        locked = true;
        alarmIsOn = false;
        validCard = false;
        passageDetected = false;
        reboot = false;
        diagnostic = false;

    }


}
