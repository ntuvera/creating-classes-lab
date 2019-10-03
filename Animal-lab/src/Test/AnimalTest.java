package Test;

import static co.ga.nyc.Animal.*;

import co.ga.nyc.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
public class AnimalTest {

    Animal animal = new Animal(4,15,true,"Chester");
    Animal animal2 = new Animal(2,5,false,"Penny");

    private final java.io.ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
//    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
//        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
//        System.setErr(originalErr);
    }
    @Test
    public void testAnimalHasGetName(){
        assertEquals("Chester", animal.getName());
        assertEquals("Penny", animal2.getName());

    }
//    @Test
//    public void testAnimalHasSetName(){
//        assertEquals("Chester2", animal.setName("Chester2"));
//        assertEquals("Penn2", animal2.setName("Penn2"));
//
//    }
    @Test
    public void testAnimalHasGetTopSpeed(){
        assertEquals(10, animal.getTopSpeed(10));
        assertEquals(4, animal2.getTopSpeed(4));

    }
//    @Test
//    public void testAnimalHasSetTopSpeed(){
//        assertEquals(15, animal.getTopSpeed());
//        assertEquals(5, animal2.getTopSpeed());
//
//    }
    @Test
    public void testAnimalHasIsEndangered(){
        assertEquals(true, animal.isEndangered());
        assertEquals(false, animal2.isEndangered());

    }
    @Test
    public void testAnimalHasSetEndangered(){
        assertEquals(false, animal.setEndangered(false));
        assertEquals(true, animal2.setEndangered(true));

    }
    @Test
    public void testAnimalHasGetNumLegs(){
        assertEquals(4, animal.getNumLegs());
        assertEquals(2, animal2.getNumLegs());

    }
//    @Test
//    public void testAnimalHasSetNumLegs(){
//        assertEquals(null, animal.setNumLegs(6));
//        assertEquals(null, animal2.setNumLegs(0));
//
//    }
    @Test
    public void testStringOut(){
        animal.stateCharacteristics();

       assertEquals("Method Sys Print: Chester can travel at a top speed of 15mph.", outContent.toString().trim());

    }
//    @Test
//    public void animalHasConstructor(){
//
//    }
}
