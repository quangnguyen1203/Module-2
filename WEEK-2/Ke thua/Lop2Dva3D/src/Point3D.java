public class Point3D extends Point2D{
    float z = 0.0f;

    public Point3D(){
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.z};
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}
