public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
        
        //для проверки
        //int bonusA = service.calculate(999)
        //System.out.println(Ожидаемый результат: 49, Фактический результат: " + bonusA
    }
}