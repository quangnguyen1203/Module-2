public class Cylinder extends Circle implements VolumeShape{

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


    @Override
    public double getVolume(){
        return getRadius()*getRadius()*height*Math.PI;
    }

    @Override
    public void display() {
        super.display() ;
        System.out.println("Volume: " + this.getVolume());
    }
}
