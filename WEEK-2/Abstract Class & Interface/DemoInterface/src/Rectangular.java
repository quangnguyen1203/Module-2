public class Rectangular extends Rectangle implements VolumeShape{
    private double height;

    public Rectangular() {
    }

    public Rectangular(double height) {
        this.height = height;
    }

    public Rectangular(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (2*height*(getWidth() + getHeight())) + (2*getWidth()*getHeight());
    }
    @Override
    public double getPerimeter(){
        return (2*height*(getWidth() + getHeight()));
    }

    @Override
    public double getVolume() {
        return getWidth()*getHeight()*this.height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Volume: " + this.getVolume());
    }
}
