package cs.csmath.complexnumber;


import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    static final double DELTA = .000001;

    @Test
    public void getRealPart() {
    }

    @Test
    public void setRealPart() {
    }

    @Test
    public void getImagPart() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double imagPart = cn.getImagPart();
        System.out.println(imagPart);
        assertEquals(1.0, imagPart,0.000001);
    }

    @Test
    public void setImagPart() {
    }

    @Test
    public void add() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.add(cn2);
        assertEquals(10.5, cn1.getRealPart(), DELTA);
        assertEquals(7.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void add1() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.add(cn2);
        assertEquals(10.5, cn1.getRealPart(), DELTA);
        assertEquals(7.0, cn1.getImagPart(), DELTA);

    }

    @Test
    public void sub() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(2.0, 1.5);
        cn1.sub(cn2);
        assertEquals(2.5, cn1.getRealPart(), DELTA );
        assertEquals(1.5, cn1.getImagPart(), DELTA);

    }

    @Test
    public void sub1() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(2.0, 1.5);
        cn1.sub(cn2);
        assertEquals(2.5, cn1.getRealPart(), DELTA );
        assertEquals(1.5, cn1.getImagPart(), DELTA);

    }

    @Test
    public void mult() {
        ComplexNumber cn1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber cn2 = new ComplexNumber(1.0, 3.0);
        cn1.mult(cn2);
        assertEquals(-7.0, cn1.getRealPart(), DELTA);
        assertEquals(9.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void mult1() {
        ComplexNumber cn1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber cn2 = new ComplexNumber(1.0, 3.0);
        cn1.mult(cn2);
        assertEquals (-7.0, cn1.getRealPart(), DELTA);
        assertEquals(9.0, cn1.getImagPart(), DELTA);

    }

    @Test
    public void div() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 10.00);
        ComplexNumber cn2 = new ComplexNumber(2.0, 5.00);
        cn1.div(cn2);
        assertEquals(3.0, cn1.getRealPart(), DELTA);
        assertEquals(2.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void div1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 10.00);
        ComplexNumber cn2 = new ComplexNumber(2.0, 5.00);
        cn1.div(cn2);
        assertEquals(3.0, cn1.getRealPart(), DELTA);
        assertEquals(2.0, cn1.getImagPart(), DELTA);
        }

    @Test
    public void conj() {
        ComplexNumber cn1 = new ComplexNumber(1.0, 8.0);
        cn1.conj(cn1);
        assertEquals(1.0, cn1.getRealPart(), DELTA);
        assertEquals(-8.0, cn1.getImagPart(),DELTA);
    }

    @Test
    public void conj1() {
        ComplexNumber cn1 = new ComplexNumber(1.0, 8.0);
        cn1.conj(cn1);
        assertEquals(1.0, cn1.getRealPart(), DELTA);
        assertEquals(-8.0, cn1.getImagPart(),DELTA);
    }

    @Test
    public void abs() {
        ComplexNumber cn1 = new ComplexNumber(2.0, 4.0);
        cn1.abs(cn1);
        assertEquals(2.0,cn1.getRealPart(),DELTA);
        assertEquals(4.0,cn1.getImagPart(), DELTA);
    }

    @Test
    public void abs1() {
        ComplexNumber cn1 = new ComplexNumber(2.0 ,4.0);
        cn1.abs(cn1);
        assertEquals(2.0,cn1.getRealPart(),DELTA);
        assertEquals(4.0,cn1.getImagPart(), DELTA);
    }

    @Test
    public void ComplexNumber() {
    }

    @Test
    public void getRealPart1() {
    }

    @Test
    public void getImagPart1() {
        ComplexNumber cn = new ComplexNumber( 1.0, 1.0);
        double imagPart = cn.getImagPart();
        assertEquals(1.0, imagPart,0.000001);
    }

    @Test
    public void setRealPart1() {
    }

    @Test
    public void setRealPart2() {
    }

    @Test
    public void setImagPart1() {
    }

    @Test
    public void setImagPart2() {
    }


    public void toString(String[] args) {
        ComplexNumber cn = new ComplexNumber();
        String s = cn.toString();
        assertEquals("0.0+0.0i", s);
    }
}