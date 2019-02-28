import java.util.HashMap;
import java.util.Iterator;


public class Bins {
    int binKeyValue;
    int binStartvalue;
    int binLastValue;

    HashMap<Integer, Integer> binmap = new HashMap<Integer, Integer>();

    public Bins() {

        this.binKeyValue = binKeyValue;
    }


    Dice dice = new Dice();


    public Bins(int binStartvalue, int binLastValue) {
        this.binStartvalue = binStartvalue;
        this.binLastValue = binLastValue;


    }


    public int getBin(int binValue) {


        return binValue;


    }


    public void incrementBin(Integer noOfBin) {
        int IncrementedValue = 0;
        /*for(HashMap.Entry<Integer,Integer>sumbin: binmap.entrySet()){
           int key = sumbin.getKey();
            int value = sumbin.getValue();


*/
       // System.out.println("sumoftoss="+noOfBin);
        int val = binmap.get(noOfBin);



            //if (sumbin.getKey()==(noOfBin)) {


               binmap.put(noOfBin,val+1);
            //}

            //}

        }






        public void InitializeBin(int binStartvalue, int binLastValue) {
            for (int i = binStartvalue; i <= binLastValue; i++) {
                binmap.put(i, 0);
            }

        }
    }
