package idomok;

import hu.szamalk.FaIdomokProgram;
import hu.szamalk.idomok.FaIdom;
import hu.szamalk.idomok.Gomb;
import hu.szamalk.idomok.Hasab;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    static FaIdomokProgram program;
    @BeforeAll
    static void programIni(){
        Class<?> clazz = FaIdomokProgram.class;
        String pkg = clazz.getPackageName();
        assertEquals("hu.szamalk", pkg, "a csomag 'hu.szamalk' legyen.");

        program = new FaIdomokProgram();
        program.ujIdom(new Gomb(1));
        program.ujIdom(new Hasab(1,1,1));
    }

    @Test
    void testLista(){
        ArrayList<FaIdom> lista = program.getLista();
        Assertions.assertEquals(2, lista.size());

        lista.add(new Gomb(1));
        Assertions.assertEquals(2, program.getLista().size());
    }

    @Test
    void testSzamolasok(){
        Assertions.assertEquals(4.16, program.osszSuly(), 0.01);
        Assertions.assertEquals(3.36, program.gombokOsszSuly(), 0.01);

        Hasab hasab = new Hasab(1.0, 1.0, 1.0);
        Assertions.assertEquals(hasab.terfogat(), program.minV().terfogat());
        Gomb gomb = new Gomb(1.0);
        Assertions.assertEquals(gomb.terfogat(), program.maxV().terfogat());
    }
}