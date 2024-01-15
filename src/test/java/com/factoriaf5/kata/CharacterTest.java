package com.factoriaf5.kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void characterTestHisAttributes() {
        Character goku = new Character();

        int gokuHealth = goku.getHealth();
        int gokuLevel = goku.getLevel();
        boolean gokuIsAlive = goku.isAlive();

        assertThat(gokuHealth, is(1000));
        assertThat(gokuLevel, is(1));
        assertThat(gokuIsAlive, is(true));


    }

}
