public class Main {
    public static void main(String[] args) {
        var generalWorkHours = 640;
        System.out.println("Всего отработано " + generalWorkHours + " часов");
        var oneWorkerHours = 8;
        System.out.println("Один сотрудник отрабатывает " + oneWorkerHours + " часов");
        var generalWorkersAmount = generalWorkHours / oneWorkerHours;
        System.out.println("Всего работников в компании " + generalWorkersAmount + " человек");
        var workersAmount = generalWorkersAmount + 94;
        System.out.println("После добавления людей количество сотрудников составило " + workersAmount + " человек");
        var hoursAmount = workersAmount * oneWorkerHours;
        System.out.println("Если в компании работает " + workersAmount + " человек, то всего " + hoursAmount + " часов работы может быть поделено между сотрудниками.");
        



    }
}