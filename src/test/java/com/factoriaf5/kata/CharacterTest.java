package com.factoriaf5.kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void characterTestHisAttributes() {
        Character goku = new Character();

        int gokuHealth = goku.getHealth();
        int gokuLevel = goku.getLevel();
        boolean gokuIsAlive = goku.isAlive();
        int gokuAttackDamage = goku.getAttackDamage();

        assertThat(gokuHealth, is(1000));
        assertThat(gokuLevel, is(1));
        assertThat(gokuIsAlive, is(true));
        assertThat(gokuAttackDamage, is(100));

    }

    @Test
    public void CharactersCanDamageOtherCharacter() {
        //Given
        Character goku = new Character();
        Character freezer = new Character();

        goku.attack(freezer);

        assertThat(freezer.health, is(900));

    }

}
