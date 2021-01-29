/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Admin
 */
public class Canh {
    public double cDai;
    public double cRong;

    public Canh(double cDai, double cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    public int soSanh(){
        return (int) (cDai-cRong);
    }

    @Override
    public String toString() {
        return  "cDai=" + cDai + ", cRong=" + cRong ;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Canh other = (Canh) obj;
        if (Double.doubleToLongBits(this.cDai) != Double.doubleToLongBits(other.cDai)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cRong) != Double.doubleToLongBits(other.cRong)) {
            return false;
        }
        return true;
    }
    
    
}
