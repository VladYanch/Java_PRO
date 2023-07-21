public class InterfaceExample {
//    * 2. Нужно написать модуль программы по составлению отчета по продажам за выбранные даты.
//            * Продажа представляет собой: артикул, количество и стоимость.
//     * Отчет должен отображать: самый продаваемый артикул и общую стоимость всех продаж по каждому артикулу.
//     * Желаемый интерфейс:
//            * <p>
//     * interface ReportGenerator {
//     *     ReportResult generateReport(ZonedDateTime from, ZoneDateTime to);
//     * }
//     * public interface SoldItemsProvider {
//     *     List<SellItem> load(ZonedDateTime from, ZonedDateTime to);
//     * }
//     * <p>
//     * Примечание:
//            * а) при этом выгрузкой информации по продажам занимается другая команда, которая пока ещё не передала вам
//     * информацию как в вашем модуле получать сами заказы. Обойдите это ограничение.
//     * б) ZonedDateTime можно создать с помощью:
//            * LocalDate.parse("2023-06-01").atStartOfDay(ZoneId.of("Europe/Berlin"));
//     * c) В классе Продажа дата не нужна!

}