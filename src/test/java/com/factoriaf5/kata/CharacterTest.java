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

    @Test
    public void CharactersTestCan() {
        //Given

        Character goku = new Character();
        Character freezen = new Character();

        for (int i=0; i< 12; i++) {
            freezen.attack(goku);
        }

        assertThat(goku.getHealth(), is(0));
        assertThat(goku.isAlive(), is(false));
    
    } 


    @Test
    public void CharactersTesCanHealDeads() {
        //Given
        Character goku = new Character();
        Character freezer = new Character();

        freezer.setHealth(100);

        goku.heal(freezer);

        assertThat(freezer.getHealth(), is(300));

    } 


    @Test
    public void CharactersTesCanHealhiself() {
        //Given
        Character goku = new Character();
        goku.setHealth(300);

        goku.heal(goku);

        assertThat(goku.getHealth(), is(500));

    } 


    @Test
    public void CharacterTestCantHealingHealthExceed1000() {
        Character goku = new Character();
        Character pikoro = new Character();

        pikoro.setHealth(950);
        
        goku.heal(pikoro);
        
        assertThat(pikoro.getHealth(), is(1000));
    }

    @Test
    public void CharacterTestDeals50PercentLessDamageToHighLevelEnemy() {
        
        Character goku = new Character();
        Character freezer = new Character();

        freezer.setLevel(7);

        goku.attack(freezer);
        
        assertThat(freezer.getHealth(), is(950));
    }

    @Test
    public void CharacterTestDeals50PercentMoreDamageToHighLevelEnemy() {

    Character goku = new Character();
    Character freezer = new Character();
        
        goku.setLevel(10);
        freezer.setLevel(4);

        goku.attack(freezer);
        
        assertThat(freezer.getHealth(), is(850));
    } 


}
