package ru.vsu.amm.labs;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
//import java.util.AbstractList
/**
 * Created by FManukovskiy on 30.06.17.
 */
public class FindSuperclassTest {
    private Map<String, String> testData = new HashMap<>();
    @Before
    public void setUp() throws Exception {
        testData.put("java.util.ArrayList", "java.util.AbstractList");
        testData.put("java.util.AbstractList", "java.util.AbstractCollection");
        testData.put("java.util.AbstractCollection", "java.lang.Object");
    }

    @Test
    public void getSuperClass() throws Exception {
        for (Map.Entry<String, String> entry : testData.entrySet()) {
            String actual = FindSuperclass.getSuperClass(Class.forName(entry.getKey())).getName();
            assertEquals(entry.getValue(), actual);
        }
    }

}