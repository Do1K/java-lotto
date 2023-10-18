package lucky;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LuckyServiceTest {

    LuckyService luckyService=new LuckyService();
    Set<Integer> numbers=new HashSet<>();

    @Test
    @DisplayName("생성된 당첨번호의 중복성과 크기 검사")
    void 당첨_번호_생성(){
        //given
        Lucky lucky=luckyService.createLucky();

        //when
        for(int i=0; i<6;i++){
            numbers.add(lucky.getLuckyNumbers().get(i));
        }
        numbers.add(lucky.getBounusNumber());

        //then
        Assertions.assertThat(numbers.size()).isEqualTo(7);
    }
}