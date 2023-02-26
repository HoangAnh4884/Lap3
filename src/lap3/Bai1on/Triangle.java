/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap3.Bai1on;

/**
 *
 * @author sonnlh
 */
public class Triangle {
    float width = 0.0f;
    float hegth = 0.0f;

    public Triangle() {
    }
    
    public Triangle(float width, float hegth) {
        this.width = width;
        this.hegth = hegth;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHegth() {
        return hegth;
    }

    public void setHegth(float hegth) {
        this.hegth = hegth;
    }

    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ", hegth=" + hegth + '}';
    }
}
