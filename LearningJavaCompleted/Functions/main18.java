public class Main{

    public static double employeeSalary (double employeeHourPerWeek,
                                         double employeeMoneyPerHour) {
        double HourPerWeek = employeeHourPerWeek;
        double MoneyPerHour = employeeMoneyPerHour;
        double Salary = (employeeHourPerWeek * employeeMoneyPerHour) * 52;

        return Salary;
    }

    public static void main (String[] args) {
        double grossYearlySalary = employeeSalary(40,40);
        System.out.println(grossYearlySalary);


    }


}