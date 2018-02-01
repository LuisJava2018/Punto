package com.company;

public class Punto {
    int x;
    int y;
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distancia(Punto a){
        double resultado;
        return  resultado=Math.sqrt(Math.pow((a.x-this.x),2)+Math.pow((a.y-this.y),2));

    }
}
