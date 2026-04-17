package com.pluralsight;

public class RollingDice {

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
//initalize variables
        int roll1;
        int roll2;
        int r2 = 0;
        int r4 = 0;
        int r6 = 0;
        int r7 = 0;
//for loop to actually roll the dice
        for(int i = 0;  i <=100; i++){
            roll1 = dice.Roll();
            roll2 = dice.Roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + "-" + roll2 + " Sum: " + sum);
            //adding the rolls to the respective variables
            switch(sum){
                case 2:
                    r2 += 1;
                case 4:
                    r4 += 1;
                case 6:
                    r6 +=1 ;
                case 7:
                    r7 += 1;
            }

            }
        System.out.println(" # of sum 2: " + r2 + "\n # of sum 4: " + r4 + "\n # of sum 6: " + r6 + "\n # of sum 7: " + r7);
        }


    }



