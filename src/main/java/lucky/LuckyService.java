package lucky;

public class LuckyService {

    LuckyNumberGenerator luckyNumberGenerator=new LuckyNumberGenerator();
    private static Lucky lucky;

    public Lucky createLucky(){
        luckyNumberGenerator.luckyNumberGenerate();
        lucky=new Lucky(luckyNumberGenerator.getNumbers(), luckyNumberGenerator.getBonusNumber());
        return lucky;
    }

    public Lucky getLucky(){
        return lucky;
    }


}
