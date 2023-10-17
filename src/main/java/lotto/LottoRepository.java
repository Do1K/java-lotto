package lotto;

public interface LottoRepository {

    void save(Lotto lotto);

    Lotto GetLottoByIndex(Integer index);
}
