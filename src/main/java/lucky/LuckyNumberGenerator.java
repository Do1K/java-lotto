package lucky;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberGenerator {

    private static final int LOTTO_START_NUMBER=1;
    private static final int LOTTO_FINAL_NUMBER=45;

    private List<Integer> numbers=new ArrayList<>();
    private int bonusNumber;

    public void luckyNumberGenerate(){
        numbers= Randoms.pickUniqueNumbersInRange(LOTTO_START_NUMBER,LOTTO_FINAL_NUMBER,6);
        while(true){
            int number=Randoms.pickNumberInRange(LOTTO_START_NUMBER,LOTTO_FINAL_NUMBER);
            if(duplicateBonusNumber(number)){
                bonusNumber=number;
                break;
            }
        }
    }

    private boolean duplicateBonusNumber(int number){
        if(!numbers.contains(number)){
            return true;
        }
        return false;
    }

    public List<Integer> getNumbers(){
        return numbers;
    }

    public int getBonusNumber(){
        return bonusNumber;
    }



}
