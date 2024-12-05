package Assignment4.prob3;


import java.time.LocalDateTime;

public interface SensorInterface {
    String getSensorType();
    double getReading();
    String getLocation();
    LocalDateTime getLastUpdated();
    String performAction();
}
