import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardData {
    private String number;
    private String valid;
    private String cvv;

    public String getCard(String num) {
        if (number.equals(num)) return number + valid + cvv;
        else return "";
    }

    public CardData(String number, String valid, String cvv) {
        this.number = number;
        this.valid = valid;
        this.cvv = cvv;
    }
}

//         Данные карты должны быть стрингой вида
//         12345678123456780000999
//         Первые 16 цифр это номер
//         Потом дата месяцгод
//         Потом си Ви Ви код