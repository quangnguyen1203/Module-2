public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getRadius()*getRadius()*height*Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with height= "
                + getHeight()
                + ", volume is:"
                + getVolume()
                +"\n" + super.toString();
    }
}
