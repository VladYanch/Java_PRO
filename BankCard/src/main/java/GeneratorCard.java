import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.Arrays;

class GeneratorCard {
    private CardData cardData;
//    public GeneratorCard() {
//    }

    public static CardData getCardData() {
        String cardNum;
        String valid;
        while (!algorithmLuna(cardNum = RandomStringUtils.randomNumeric(16).toString()));
        while (!validDate((valid = RandomStringUtils.randomNumeric(4).toString())));
        return new CardData(cardNum,valid, RandomStringUtils.randomNumeric(3).toString());
    }

    public static boolean validDate(String data) {
        int month = Integer.parseInt(data.substring(0,2));
        if (month == 0 || month > 12) return false;
        LocalDate today = LocalDate.now();
        int year = 2000+Integer.parseInt(data.substring(2,4));
        if (year - today.getYear() < 4 || year - today.getYear() > 5 ) return false;;
        return true;
    }

    public static boolean algorithmLuna(String bankCardNum) {
        int[] numArr = Arrays.stream(bankCardNum.split("")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i = 0; i < numArr.length ; i++) {
            if (i % 2 == 0) {
                if (numArr[i] * 2 > 9) {
                    sum+=numArr[i]*2-9;
                } else {
                    sum+=numArr[i]*2;
                }
            }
            else sum+=numArr[i];
        }
        return sum % 10 == 0 ? true : false;
    }
}

//         Сделать класс ГенераторДанныхБанковчкойКарты который будет возвращать Данные Карты
