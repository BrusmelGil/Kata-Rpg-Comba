package com.factoriaf5.kata;

public class Character {

    
    int health = 1000;
    int level = 1;
    boolean isAlive = true;
    int attackDamage = 100;
    private int healQuantity = 200;


    public int getHealth() {
        return health;
    }
    public int getHealQuantity() {
    return healQuantity;
}
public void setHealQuantity(int healQuantity) {
    this.healQuantity = healQuantity;
}
    public void setHealth(int health) {
        this.health = health;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }


	public void attack(Character enemy) {
        int damage;
        int levelDifference = enemy.getLevel() - this.getLevel();

        if (enemy == this) {
            return ;
            
        }

        if (levelDifference >= 5) {
            damage = attackDamage / 2;
        } else if (levelDifference <= -5) {
            damage = attackDamage / 100 * 150;
        } else {
            damage = attackDamage;
        }

        if (enemy.health > damage) {
            enemy.setHealth(enemy.getHealth() - damage);
            
        } 
        
        if (enemy.health <= damage) {
            enemy.setHealth(0);
            enemy.setAlive(false);
            
        }


	}


    public void heal(Character friend) {
        if(friend.health > 0) {
            friend.setHealth(friend.getHealth() + healQuantity);
        }
        
        if (friend.health == 0) {
            assert true;
        } 
    
        if (friend.health + healQuantity > 1000) {
            friend.setHealth(1000);
        }

    
}

}








