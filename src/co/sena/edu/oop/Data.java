package co.sena.edu.oop;

public class Data {
    public double areaTriangulo(double numero1, double numero2) {
        return (numero1 * numero2) / 2;
    }

    //Metodo Suma
    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    //Metodo Elevar numero al cuadrado
    public double elevadoCuadrado(double numero1) {
        return Math.pow(numero1, 2);
    }

    //Metodo conversion de euro a dolar
    public double conversionEuroDolar(double euro) {
        return euro * 1.15;
    }

    //Metodo donde ingresa el area del cuadrado y muestr el valor del area y perimetro
    public double areaCuadrado(float numero1) {
        return numero1 * numero1;
    }

    public double perimetroCuadrado(float numero1) {
        return numero1 * 4;
    }

    //Area y Volumen de un Cilindro
    public double areaCilindro(double numero1, double numero2) {
        return ((2 * Math.PI) * numero1) * (numero1 + numero2);
    }

    public double volumenCilindro(double numero1, double numero2) {
        return Math.PI * Math.pow(numero1, 2) * numero2;
    }

    //Algoritmo de una Circunferencia
    public double areaCirculo(double numero1) {
        return Math.PI * (Math.pow((numero1 / 2), 2));
    }

    public double radioCirculo(double numero1) {
        return numero1;
    }

    // Metodo para promedio de tres numeros
    public double promedio(double numero1, double numero2, double numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }

}


