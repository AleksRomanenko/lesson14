package ru.geekbrains.ru;

import org.junit.Assert;
import org.junit.Test;

public class Lesson14Test {

    Lesson14 lesson14 = new Lesson14();

    @Test
    public void arrayTest1() {
        Assert.assertArrayEquals(new int[]{3, 5}, Lesson14.after4(new int[]{1, 4, 5, 4, 3, 5}));
        Assert.assertArrayEquals(new int[]{}, Lesson14.after4(new int[]{4, 4, 4, 4}));
        Assert.assertThrows(RuntimeException.class, () -> Lesson14.after4(new int[]{1, 2, 5, 7, 3, 5}));
    }

    @Test
    public void arrayTest2() {
        Assert.assertTrue(Lesson14.isNum1and4(new int[]{1, 4, 1, 4}));
        Assert.assertFalse(Lesson14.isNum1and4(new int[]{1, 1, 1, 1}));
        Assert.assertFalse(Lesson14.isNum1and4(new int[]{4, 4, 4, 4}));
        Assert.assertFalse(Lesson14.isNum1and4(new int[]{1, 4, 1, 4, 5}));

    }
}
