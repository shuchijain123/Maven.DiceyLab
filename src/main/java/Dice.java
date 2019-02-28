public class Dice {


    int numofDice=0;

    public Dice(){

        this.numofDice=numofDice;
    }

    public Dice(int numofDice) {
        this.numofDice =numofDice;
    }

    public int randomNum() {

        int dicenum = (int) (Math.random() * 6) + 1; //returns an integer
        //System.out.println("random="+dicenum);
        return dicenum;

    }

    public int tossAndSum() {
        int tossnum = 0;

//System.out.println("before for");
        for (int i = 0; i < numofDice; i++) {
            //System.out.println("for="+i);

            tossnum = tossnum+randomNum();





        }
        return tossnum;


    }
}