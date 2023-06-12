package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

class GenericsTest {
    @Test
    void combine(){
        assertEquals("First item: 5.56; Second item: Some text", Combiner.combineTwoItems(BigDecimal.valueOf(5.56), "Some text"));
        assertEquals("First item: 444; Second item: c", Combiner.combineTwoItems(Integer.valueOf("444"), 'c'));
    }
    @Test
    void print(){
        assertEquals("sample text", new Printer<>("sample text").getThingToPrint());
        assertEquals(5.557, new Printer<>(5.557).getThingToPrint());
    }
    @Test
    void storageHouse(){
        StorageHouse<String> storageHouse = new StorageHouse<>("string");
        storageHouse.addMoreItems("house");
        storageHouse.addMoreItems("mouse");
        assertThat(storageHouse.items, is(equalTo(Arrays.asList("string", "house", "mouse"))));
        assertEquals("string",storageHouse.getMaybeFirstItem().get());


        StorageHouse<Integer> storageHouse2 = new StorageHouse<>(1);
        storageHouse2.addMoreItems(2);
        storageHouse2.addMoreItems(3);
        assertThat(storageHouse2.items, is(equalTo(Arrays.asList(1,2,3))));
        assertEquals(1,storageHouse2.getMaybeFirstItem().get());
    }


}