package Assignment4.prob3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract public class Sensors implements SensorInterface {

    protected String location;
    protected LocalDateTime lastUpdated;

    public Sensors(String location){
        this.location=location;
        this.lastUpdated= LocalDateTime.now();
    }

    @Override
    public String getLocation(){
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
    lastUpdated = LocalDateTime.now();
    return lastUpdated;

    }
@Override
    public String toString(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
    return String.format(
            "Sensor Type: %s\nReading: %.2f\nLocation: %s\nLast Updated: %s\nAction: %s\n",
            getSensorType(), getReading(), getLocation(), lastUpdated.format(formatter), performAction()
    );
}

}



