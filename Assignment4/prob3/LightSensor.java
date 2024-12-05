package Assignment4.prob3;

  public class LightSensor extends Sensors {
    private double lightLevel;

    public LightSensor (String location, double lightLevel){
        super(location);
        this.lightLevel = lightLevel;
    }

    @Override
     public String getSensorType() {
        return "Light";
     }


     @Override
     public double getReading(){
        return lightLevel;
     }


     @Override
     public String performAction(){
        return lightLevel < 100 ? " Light level is too low! Turning on the lights." : "light is sufficient";
     }
}
