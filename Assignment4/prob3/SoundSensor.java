package Assignment4.prob3;

 public class SoundSensor extends Sensors {
     private double soundLevel;

     public SoundSensor(String location, double soundLevel){
         super(location);
         this.soundLevel =soundLevel ;
     }

     public String getSensorType(){
         return "Sound";
     }
     public double getReading(){
         return soundLevel;
     }

     public String performAction(){
         return soundLevel > 70 ? "Sound is too High! turn on Noise Cancellation " : "Sound level is within the normal range";
     }


}
