package ru.netology.services;
public class VacationOrJob {
    public static int countVacationMonth(int deposit, int income, int expenses, int threshold) {
        int count = 0;
        for (int month = 0; month < 12; month++) { //цикл пройдет ровно 12 раз - на каждый месяц
            System.out.print("Денег " + deposit + ". ");
            if (deposit >= threshold) {//будем отдыхать в это месяце
                deposit = deposit - expenses;
                System.out.println("Можно отдыхать. " + "Потратил - " + expenses + " А затем еще " + ((deposit / 3) - deposit));
                deposit = deposit / 3;
                count++;
            } else {//будем работать в этом месяце
                deposit = deposit + income - expenses;
                System.out.println("Придется работать. Заработал +" + income + ". Потратил -" + expenses);
            }
        }
        return count;
    }
}