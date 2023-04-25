package net.jktech.math;
import java.util.List;
public class Vector3{
    public int x;
    public int y;
    public int z;
    public float r;
    public float g;
    public float b;
    public boolean IS_COLOR=false;
    public Vector3(float x_OR_r, float y_OR_g, float z_OR_b,boolean rgb){
        if (rgb){
            this.IS_COLOR=true;
            this.r=x_OR_r;
            this.g=y_OR_g;
            this.b=z_OR_b;
        }
        else {
            this.x=(int)x_OR_r;
            this.y=(int)y_OR_g;
            this.z=(int)z_OR_b;
        }
    }
    public void sum(Vector3 other){
        this.x= other.x+this.x;
        this.y= other.y+this.y;
        this.z= other.z+this.z;
        return;
    }
    public void average(){
        return;
    }
}