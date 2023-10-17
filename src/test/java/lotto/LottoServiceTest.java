package lotto;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoServiceTest {

    LottoService lottoService=new LottoServiceImpl();

    @Test
    void join(){
        //given
        ArrayList<Integer> lotto = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6)
        );
        Lotto lotto1 = new Lotto(lotto);

        //when
        lottoService.join(lotto1);
        Lotto findLotto=lottoService.getLotto(0);

        //then
        Assertions.assertThat(lotto1).isEqualTo(findLotto);
    }
}
