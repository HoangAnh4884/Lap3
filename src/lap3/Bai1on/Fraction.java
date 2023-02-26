/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap3.Bai1on;

/**
 *
 * @author sonnlh
 */
public class Fraction {
    int numerator;
    int denominator;
    
    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }
    
    public Fraction add(Fraction f) {
        int resultDenominator = this.denominator * f.denominator;
        int resultNumerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }
    
    public Fraction sub(Fraction f) {
        int resultDenominator = this.denominator * f.denominator;
        int resultNumerator = (this.numerator * f.denominator) - (f.numerator * this.denominator);
        return new Fraction(resultNumerator, resultDenominator);    }
    
    public Fraction mul(Fraction f) {
        int resultDenominator = this.denominator * f.denominator;
        int resultNumerator = (this.numerator * f.denominator) * (f.numerator * this.denominator);
        return new Fraction(resultNumerator, resultDenominator);    }
    
    public Fraction div(Fraction f) {
        int resultDenominator = this.denominator * f.denominator;
        int resultNumerator = (this.numerator * f.denominator) / (f.numerator * this.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }
    
    public void reducer() {
    }
}