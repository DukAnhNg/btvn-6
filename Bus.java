public class Bus extends Vehicle{
    private int speed = 20;
    private double length;

    public Bus(double length) {
        this.length = length;
    }

    @Override
    public void caculate() {
        System.out.println("Thời gian di chuyển của xe buýt là: " + (length/speed)+"h");
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
