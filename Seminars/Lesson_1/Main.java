public class Main {
    public static void main(String[] args) {
        // Создание объектов
        HotDrinkWithTemperature drink1 = new HotDrinkWithTemperature("Чай", 200, 80);
        HotDrinkWithTemperature drink2 = new HotDrinkWithTemperature("Кофе", 250, 90);

        // Создание торгового автомата
        TradeMachine tradeMachine = new TradeMachine();

        // Воспроизведение логики
        Product product1 = tradeMachine.getProduct(drink1.getName(), drink1.getVolume(), drink1.getTemperature());
        Product product2 = tradeMachine.getProduct(drink2.getName(), drink2.getVolume(), drink2.getTemperature());

        // Вывод результатов
        System.out.println("Название: " + product1.getName());
        System.out.println("Объём: " + product1.getVolume());
        System.out.println("Температура: " + product1.getTemperature());
        System.out.println();

        System.out.println("Название: " + product2.getName());
        System.out.println("Объём: " + product2.getVolume());
        System.out.println("Температура: " + product2.getTemperature());
    }
}