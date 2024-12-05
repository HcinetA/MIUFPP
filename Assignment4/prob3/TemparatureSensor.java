package Assignment4.prob3;

public class TemparatureSensor extends Sensors {

    private double temparture;

    public TemparatureSensor(String location, double temperature){
        super(location);
        this.temparture = temperature;
    }

    public String getSensorType(){
        return "Temperature";
    }

    public double getReading(){
        return temparture;
    }

    public String performAction(){
        if (temparture>30){
            return "Turn on the Ac";
        }
        else if (temparture<18){
            return "Turn on the Heater";
        }
        else
            return "Temperature is normal range";
    }
}
