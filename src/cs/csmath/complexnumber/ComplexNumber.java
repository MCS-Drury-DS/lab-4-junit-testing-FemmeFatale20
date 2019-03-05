package cs.csmath.complexnumber;


public class ComplexNumber {
    private double realPart;
    private double imagPart;

    public ComplexNumber (double real, double imag)
    {
        this.realPart = real;
        this.imagPart = imag;
    }


    public ComplexNumber() {
    }



    public void add(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() + otherCN.getRealPart();
        double newImagPart = this.getImagPart() + otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);

    }

    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN){
        ComplexNumber cn1 = firstCN;
        ComplexNumber cn2 = firstCN;
        cn2.add(cn1);
        return cn2;
    }

    public void sub(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() - otherCN.getRealPart();
        double newImagPart = this.getImagPart() - otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN) {
        return new ComplexNumber();
    }

    public void mult(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() * otherCN.getRealPart()
                - this.getImagPart() * otherCN.getImagPart();
        double newImagPart = this.getImagPart() * otherCN.getRealPart()
                + this.getRealPart() * otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN) {
        return new ComplexNumber();
    }

    public void div(ComplexNumber otherCN) throws ArithmeticException


    {
            double a = this.getRealPart();
            double b = this.getImagPart();
            double c = otherCN.getRealPart();
            double d = otherCN.getImagPart();


            
            double denominator = c*c + d*d;
            if (java.lang.Math.abs(denominator)<0.000001){
                throw new ArithmeticException();
            }

            this.setRealPart(a/c);
            this.setImagPart(b/d);

    }

    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN) {
       return new ComplexNumber();

    }

    public void conj(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart();
        double newImagPart = this.getImagPart() * -1;
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public static ComplexNumber conj(ComplexNumber firstCN, ComplexNumber secondCN) {
       return new ComplexNumber();
    }

    public void abs(ComplexNumber otherCN) {
        if (realPart > 0 || imagPart > 0) {
            double abs = (realPart * realPart) + (imagPart * imagPart);
            double result = Math.sqrt(abs);
            System.out.println(result);
        }
    }

    public static ComplexNumber abs(ComplexNumber firstCN, ComplexNumber secondCN) {
       return new ComplexNumber();

   }

    public void setRealPart(double realPart){
        this.realPart = realPart;
    }


    public void setImagPart(double imagPart){
        this.imagPart = imagPart;
    }


    public double getRealPart(){ return this.realPart; }



    public static double getImagPart(ComplexNumber myCN) {
        double myImag = myCN.getImagPart();
        return myImag;
    }

    public double getImagPart() {
        return this.imagPart;
    }


        public String toString() {
           return new String();

        }

        public static void main (String[] args)
        {
            ComplexNumber cn1 = new ComplexNumber();
            System.out.println("CN1 real: " + cn1.getRealPart() + "imag " + cn1.getImagPart());
            ComplexNumber cn2 = new ComplexNumber();
            cn1.mult(cn2);
            System.out.println("CN1 real: " + cn1.getRealPart() + "imag" + cn1.getImagPart());
        }


    }

