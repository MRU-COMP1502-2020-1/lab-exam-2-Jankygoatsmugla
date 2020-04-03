package lsystems;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void A_ATest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'A'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new A_A());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output A", "A", line.toString());
    }
    @Test
    public void A_AATest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'A'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new A_AA());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output AA", "AA", line.toString());
    }
    @Test
    public void A_BCTest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'A'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new A_BC());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output BC", "BC", line.toString());
    }
    @Test
    public void A_QTest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'A'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new A_Q());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output Q", "Q", line.toString());
    }
    @Test
    public void A_XTest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'A'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new A_X());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output ", "", line.toString());
    }
    @Test
    public void B_ATest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'B'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new B_A());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output BA", "BA", line.toString());
    }
    @Test
    public void C_BTest() throws LSystemSymbolException, LSystemLengthException {
        char[] test = {'C'};
        Set<LRule> rules = new HashSet<LRule>();
        rules.add(new C_B());
        LLine line = new LLine(test, rules);
        line.process();
        assertEquals("Expected output B", "B", line.toString());
    }

}
