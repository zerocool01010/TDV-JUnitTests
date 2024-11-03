import org.example.Padron;
import org.example.Persona;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PadronTest {
    static Padron padron;
    @BeforeClass
    public static void setUpPadron() throws Exception {
        padron = new Padron();

        Persona p1 = new Persona("Manuel","37.766.544","1993-21-12",30,true);
        Persona p2 = new Persona("Carolina","47.733.564","2003-09-11",21,true);
        Persona p3 = new Persona("Belen","41.872.928","1998-08-03",26,true);
        Persona p4 = new Persona("Florencia","40.000.102","1996-02-02",27,true);
        Persona p5 = new Persona("Gonzalo","45.462.218","2000-07-10",24,true);

        padron.addVotante(p1);
        padron.addVotante(p2);
        padron.addVotante(p3);
        padron.addVotante(p4);
        padron.addVotante(p5);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Bye byte ");
    }

    @Test
    public void testCantVotantesActualizada(){
        Persona nuevoVotante = new Persona("Pedrito","27.544.666","1983-02-10",40,true);
        int cantVieja = padron.getPartipantes().size();
        padron.addVotante(nuevoVotante);
        int cantNueva = padron.getPartipantes().size();
        assertEquals(cantNueva, cantVieja + 1);
    }

    @Test
    public void testVotanteAgregado(){
        Persona nuevoVotante = new Persona("Pedrito","27.544.666","1983-02-10",40,true);
        padron.addVotante(nuevoVotante);
        Persona p = padron.getPersona(nuevoVotante.getDNI());
        assertNotNull(p);
    }


}
