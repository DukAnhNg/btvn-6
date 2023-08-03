public class Train extends Vehicle{
    private int speed = 40;
    private double length;

    public Train(double length) {
        this.length = length;
    }

    @Override
    public void caculate() {
        System.out.println("Thời gian di chuyển của tàu là: " + (length/speed)+"h");
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