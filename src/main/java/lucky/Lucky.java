package lucky;

import java.util.List;

public class Lucky {
    private final List<Integer> luckyNumbers;
    private final int bounusNumber;

    public Lucky(List<Integer> luckyNumbers,int bounusNumber) {
        this.luckyNumbers = luckyNumbers;

        this.bounusNumber=bounusNumber;
    }

    public List<Integer> getLuckyNumbers(){
        return luckyNumbers;
    }

    public int getBounusNumber(){
        return bounusNumber;
    }


}
