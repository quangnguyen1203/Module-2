import com.sun.org.apache.bcel.internal.generic.FLOAD;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
//        float[] arr = {this.x,this.y};
//        return arr;
        return new float[] {this.x,this.y};
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
