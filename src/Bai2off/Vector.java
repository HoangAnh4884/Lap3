/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2off;

/**
 *
 * @author sonnlh
 */
public class Vector {
    float x;
    float y;
    float z;
    
    public Vector() {
    }

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }
    
    public Vector add(Vector v) {
        float resultX = this.x + v.x;
        float resultY = this.y + v.y;
        float resultZ = this.z + v.z;
        return new Vector(resultX, resultY, resultZ);
    }
    
    public Vector sub(Vector v) {
        float resultX = x - this.x;
        float resultY = y - this.y;
        float resultZ = z - this.z;
        return new Vector(resultX, resultY, resultZ);
    }

    public Vector mul(float a) {
        float resultX = this.x * a;
        float resultY = this.y * a;
        float resultZ = this.z * a;
        return new Vector(resultX, resultY, resultZ);
    }
    
    public Vector mul(Vector v) {
        float resultX = this.x * v.x;
        float resultY = this.y * v.y;
        float resultZ = this.z * v.z;
        return new Vector(resultX, resultY, resultZ);
    }
}
