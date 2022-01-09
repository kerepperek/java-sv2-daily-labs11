package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    int numbers;
    int draw;

    public Lottery(int numbers, int draw) {
        this.numbers = numbers;
        this.draw = draw;
    }

    public static void main(String[] args) {
        Lottery lottery=new Lottery(90,5);
        System.out.println(lottery.startLottery());
    }

    public List<Integer> startLottery(){
        List<Integer> result=new ArrayList<>();
        List<Integer> tempTable=generateTable();
        for(int i=1;i<=draw;i++){
            Random rand=new Random();
            int rand_int = rand.nextInt(tempTable.size());
            result.add(tempTable.get(rand_int));
            tempTable.remove(tempTable.get(rand_int));
        }
        return result;
    }
    private List<Integer> generateTable(){
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=numbers;i++) {
            result.add(i);
        }
        return result;
    };

}
