import org.apache.commons.lang3.RandomStringUtils;

class GeneratorCard {
    private CardData cardData;
//    RandomGenerator generator;
    public GeneratorCard() {
    }

    public static CardData getCardData() {
        return new CardData(RandomStringUtils.randomAlphabetic(16),
                RandomStringUtils.randomAlphabetic(4),
                RandomStringUtils.randomAlphanumeric(3));
    }
}
    //         Сделать класс ГенераторДанныхБанковчкойКарты который будет возвращать Данные Карты
