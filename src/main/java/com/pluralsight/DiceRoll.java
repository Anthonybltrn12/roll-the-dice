package com.pluralsight;

public class DiceRoll {
    public DiceRoll() {
    }

    public int Roll(){
      int randomNumber = (int)(Math.random() * 6) + 1;
      return randomNumber;

    }

}
