import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Storage {
    private Map<Client,Double> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void printNameBalance() {
        storage.entrySet().forEach(c-> System.out.println(c.getKey().getName()+": "+c.getValue()));
    }

    public void printStatus(Enum<Status> status) {
        storage.entrySet()
                .stream().filter(c->c.getKey().getBankCard().getStatus()== status)
                .forEach(c-> System.out.println(c.getKey().getName()+" ("
                + c.getKey().getBankCard().getStatus()+ ") : " +c.getValue()));
    }

    public double addClient(Client client, Double balance) {
        if (storage.containsKey(client)) {
            return storage.put(client, balance);
        }
        storage.put(client, balance);
        return balance;
    }


    public double getClient(Client client) {
        return storage.get(client);
    }
    
//    public Double printAvg(Enum<Status> status) {
//        double sum;
//        storage.values()
//                .stream()
//                .reduce(sum , a)
//
//    }

//    public List<String> getSortBalance() {
//        List<String> list = new ArrayList<>();
//        List<Double> balance = storage.values().stream().toList();
//        for (Double num :balance ) {
//
//            storage.entrySet().stream().i
//        }
//                .flatMap(s->s.getValue())
//                .map(t-> t)
//                .sorted((el1,el2)-> (int) (el1.getValue()-el2.getValue()))
//                .toList();
////                .collect(Collectors.joining(": "));
////        storage.entrySet().stream().sorted((a,b)->a.getValue(a.getKey())<b.getValue(b.getKey())).toList();
////        forEach(s->list.add(s.getKey().getName()))
//        return list;
//    }
}

//         Создать класс Хранилище где в мапе будут храниться минимум 25 Клиентов
//         Ключ это Клиент а значение его баланс
//         Написать в хранилище 10 методов которые на вход получают Мапу + может ещё какой параметр а на выходе делают следующее
//         Выводять всех клиентов у которых определенный статус карты
//         Группируют по балансу у кого больше или меньше какой то суммы
//         Средний баланс по клиентам
//         Выводят только номера карт всех клиентов в формате имя номер
//         Выводят всех клиентов в у кого закончился срок действия карт
//         Сортируют по балансу
//         Группируют у кого закончился срок карт а у кого не
