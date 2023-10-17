package lotto;

import java.util.ArrayList;
import java.util.List;

public class MemoryLottoRepository implements LottoRepository{

    private static List<Lotto> store = new ArrayList<>();

    @Override
    public void save(Lotto lotto) {
        store.add(lotto);
    }

    @Override
    public Lotto GetLottoByIndex(Integer index) {
        return store.get(index);
    }
}
