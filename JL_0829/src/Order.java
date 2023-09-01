import java.util.List;

@Getter
@AllArgsConstructor
class Order {
    private String id;
    private List<Dish> dishes;

    @Setter
    private String status;

    public void addDish(Dish dish) {
        ///??????
    }
}
