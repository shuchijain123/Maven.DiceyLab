import java.util.HashMap;
import java.util.Map;

public class Simulation {
    int numberOfDies;
    int numberOfTosses;
    int key=0;
    int value=0;


    static Dice dice ;
    Bins bin = new Bins();

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }


    public void runSimulation(){
       bin.InitializeBin(numberOfDies,numberOfDies*6);

        for (int i=0 ; i < numberOfTosses; i++){


            //Map<Integer,Integer> finalmap = new HashMap<Integer, Integer>();


            int sum = dice.tossAndSum();
            bin.incrementBin(sum);






        }





    }
    public void  printResults() {

        System.out.println("***\n"+"Simulation of 2 dice tossed for 1000000 times.\n *** \n");
        for (HashMap.Entry<Integer, Integer> sumbin : bin.binmap.entrySet()) {

             key = sumbin.getKey();
             value = sumbin.getValue();
           float percentage = value*100/numberOfTosses;



            System.out.println(+key + (String.format("%2s"," : ") + value+":   " +percentage));
        }


    }

    public static void main(String[] args){

        Simulation sim = new Simulation(2, 1000000);
        dice = new Dice(2);


        sim.runSimulation();

        sim.printResults();
    }
}


