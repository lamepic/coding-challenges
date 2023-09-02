package org.example.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void plusOne() {
        int[] actual = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] result = PlusOne.plusOne(actual);
        assertArrayEquals(expected, result);
    }
    @Test
    void plusOne2() {
        int[] actual = {9};
        int[] expected = {1, 0};
        int[] result = PlusOne.plusOne(actual);
        assertArrayEquals(expected, result);
    }
    @Test
    void plusOne3() {
        int[] actual = {9, 9};
        int[] expected = {1, 0, 0};
        int[] result = PlusOne.plusOne(actual);
        assertArrayEquals(expected, result);
    }
    @Test
    void plusOne4() {
        int[] actual = {1, 9};
        int[] expected = {2, 0};
        int[] result = PlusOne.plusOne(actual);
        assertArrayEquals(expected, result);
    }
}