import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Client {
    private String name;
    private BankCard bankCard;
    private double balance;

    public Client(String name) {
        this.name = name;
    }
}

//         Создать класс Клиент у которого есть Имя и Карта и баланс