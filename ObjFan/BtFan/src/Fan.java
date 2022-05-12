import javax.sound.midi.Soundbank;

public class Fan {
    int speed = 1;
    boolean isOn = false;
    double radius = 5;
    String color = "blue";

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public String getSpeed() {
        switch (this.speed){
            case 1:
                 return "Slow";
            case 2:
                 return "Medium";
            case 3:
                return "Higt";
            default:
                return "Không có tốc độ";
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String toString(){
        return "Fan is " +isOn()+ ". Speed : " +getSpeed()+ ". Color " + getColor()+ ". Radius: " + getRadius();
    }
}
