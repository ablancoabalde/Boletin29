package boletin29;

import java.util.ArrayList;

public class Boletin29 {

    public static void main(String[] args) {
        Factura f=new Factura();
        Barco b1=new Velero(2, "123", 12.5, 4);
        Barco b2=new Deportivas(15.5, "234", 6, 4);
        ArrayList<Barco> arrayBarco=new ArrayList();

        arrayBarco.add(b1);

        f.calculo(b2);

    }

}
