import ru.netology.services.VacationOrJob;

public class Main {
    public static void main(String[] args) {
        VacationOrJob count = new VacationOrJob();
        int actual = count.countVacationMonth(0, 100000, 60000, 150000);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
}