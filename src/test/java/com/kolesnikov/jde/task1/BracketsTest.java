package com.kolesnikov.jde.task1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BracketsTest {

    @Test
    public void checkBrackets() throws Exception {
        assertTrue(new Brackets().checkBrackets("()"));
        assertTrue(new Brackets().checkBrackets("(){}[]"));
        assertTrue(new Brackets().checkBrackets("{[]}"));
        assertFalse(new Brackets().checkBrackets("(]"));
        assertFalse(new Brackets().checkBrackets("([)]"));
    }
}