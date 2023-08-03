public class Plane extends Vehicle{
    private int speed = 80;
    private double length;

    public Plane(double length) {
        this.length = length;
    }

    @Override
    public void caculate() {
        System.out.println("Thời gian di chuyển của máy bay là: " + (length/speed)+"h");
    }

    @Override
    public void bus() {

    }

    @Override
    public void train() {

    }

    @Override
    public void plane() {

    }
}
