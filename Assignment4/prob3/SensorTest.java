package Assignment4.prob3;

import java.sql.SQLOutput;

public class SensorTest {
    public static void main(String[] args) {
        SensorInterface [] sensors = new SensorInterface[6];
        sensors[0] = new LightSensor("Garden", 80.0);
        sensors[1] = new LightSensor("Living Room", 120.0);
        sensors[2] = new SoundSensor("Bedroom", 65.0);
        sensors[3] = new SoundSensor("Kitchen", 75.0);
        sensors[4] = new TemparatureSensor("Living Room", 23.5);
        sensors[5] = new TemparatureSensor("Kitchen", 33.5);

        for (SensorInterface sensor : sensors){
            System.out.println(sensor.toString());
        }


    }
}
