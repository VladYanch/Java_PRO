public class Main {
    public static void main(String[] args) {
        CardData cardData1 = new CardData("1234567890123456","0124", "555");
        BankCard bankCard1 = new BankCard(cardData1,Currency.USD,Status.Gold);
        Client client1 = new Client("Vova", bankCard1, 10000.0);
        CardData cardData2 = new CardData("1234567890123457","0224", "444");
        BankCard bankCard2 = new BankCard(cardData1,Currency.EUR,Status.Platinum);
        Client client2 = new Client("Vasya", bankCard2,50000.0);
        BankCard bankCard3 = new BankCard(GeneratorCard.getCardData(),Currency.UAH,Status.Standard);
        Client client3 = new Client("Lena", bankCard3,3000.0);
        BankCard bankCard4 = new BankCard(GeneratorCard.getCardData(),Currency.UAH,Status.Gold);
        Client client4 = new Client("Anna", bankCard4,16000.0);
        BankCard bankCard5 = new BankCard(GeneratorCard.getCardData(),Currency.EUR,Status.Gold);
        Client client5 = new Client("Inna", bankCard5,24500.0);

        Storage storage = new Storage();

        storage.addClient(client1, client1.getBalance());
        storage.addClient(client2, client2.getBalance());
        storage.addClient(client3, client3.getBalance());
        storage.addClient(client4, client4.getBalance());
        storage.addClient(client5, client5.getBalance());

        storage.printNameBalance();
        System.out.println("_________________________________");
        storage.printStatus(Status.Gold);
        System.out.println("_________________________________");


    }


}