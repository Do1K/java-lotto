package lotto;

public class LottoServiceImpl implements LottoService{

    private final LottoRepository lottoRepository=new MemoryLottoRepository();
    @Override
    public void join(Lotto lotto) {
        lottoRepository.save(lotto);
    }

    @Override
    public Lotto getLotto(Integer index) {
        return lottoRepository.GetLottoByIndex(index);
    }
}
