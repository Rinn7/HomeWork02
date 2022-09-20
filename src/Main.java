public class Main {
    public static void main(String[] args) {
        var generalWorkHours = 640;
        System.out.println(generalWorkHours);
        var oneWorkerHours = 8;
        System.out.println(oneWorkerHours);
        var generalWorkersAmount = generalWorkHours / oneWorkerHours;
        System.out.println("Всего работников в компании " + generalWorkersAmount + " человек");


    }
}