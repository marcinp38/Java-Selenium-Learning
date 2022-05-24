package MyAdditionalExercises.youtube.Computer.usbdevice;

public interface USBDevice {
    boolean connect();

    boolean disconnect();

    String getName();
}
