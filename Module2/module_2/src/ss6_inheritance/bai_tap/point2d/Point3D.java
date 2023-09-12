package ss6_inheritance.bai_tap.point2d;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        setXY(x,y);
        setZ(z);
    }
    public float [] getXYZ(){
       return new float[] {this.getX(),this.getY(),this.getZ()};
    }
}
