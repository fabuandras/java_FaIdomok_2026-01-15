package idomok;

import hu.szamalk.idomok.FaIdom;
import hu.szamalk.idomok.Gomb;
import hu.szamalk.idomok.Hasab;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdomokTest {
    FaIdom idom;

    @Test
    void testAbstract() throws NoSuchMethodException {
        Class<?> clazz = FaIdom.class;
        assertTrue(Modifier.isAbstract(clazz.getModifiers()), "A 'FaIdom' osztály legyen abstract.");

        String pkg = clazz.getPackageName();
        assertEquals("hu.szamalk.idomok", pkg, "a csomag 'hu.szamalk.idomok' legyen.");

        Method method = clazz.getDeclaredMethod("terfogat");
        boolean abs = Modifier.isAbstract(method.getModifiers());
        assertTrue(abs, "a 'terfogat' metódus legyen abstract.");
    }

    @Test
    void testFajsuly(){
        assertEquals(0.8, FaIdom.getFajsuly());
    }

    @Test
    void testGombTerfogat(){
        idom = new Gomb(1.0);
        assertEquals(4.2, idom.terfogat(), 0.000001);
    }

    @Test
    void testGombSuly(){
        idom = new Gomb(1.0);
        assertEquals(3.36, idom.suly(), 0.01);
    }

    @Test
    void testHasabTerfogat(){
        idom = new Hasab(1.0, 1.0, 1.0);
        assertEquals(1, idom.terfogat(), 0.01);
    }

    @Test
    void testHasabSuly(){
        idom = new Hasab(1.0, 1.0, 1.0);
        assertEquals(0.8, idom.suly(), 0.01);
    }

    @Test
    void testHasabParamSorrend(){
        Hasab hasab = new Hasab(1,2,3);
        assertEquals(1, hasab.getA());
        assertEquals(2, hasab.getB());
        assertEquals(3, hasab.getM());
    }
}
