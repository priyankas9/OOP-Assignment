public class FanTest {
    public static void main(String[] args) {

        Fan fan = new Fan();

        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        System.out.println(fan.toString());
    }
}
