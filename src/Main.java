public class Main {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера " + firstBoxerWeight + "кг");
        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера " + secondBoxerWeight + "кг");
        var generalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров составляет " + generalWeight + "кг!");
        var differenceInWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе боксеров составляет " + differenceInWeight + "кг!");

    }
}