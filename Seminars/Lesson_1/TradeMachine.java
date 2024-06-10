public class TradeMachine implements TradeMachineInterface {
    @Override
    public Product getProduct(String name, int volume, int temperature) {
        // реализация метода getProduct
        return new Product(String.valueOf(name), volume, temperature);
    }
}