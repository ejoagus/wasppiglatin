/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se.kth.itm.mmk.md.nmjg.test;

import org.junit.Test;

import se.kth.itm.mmk.md.nmjg.PigLatin;

import static org.junit.Assert.*;

public class PigLatinTest {
    @Test public void testAppHasAGreeting() {
        PigLatin classUnderTest = new PigLatin();
        assertTrue(classUnderTest.hello().equals("Hello World"));
    }
}
