import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] staff = new Employee[10];

        staff[0] = new Employee("Иванов Иван Иванович", 315_987, 1);
        staff[1] = new Employee("Цветков Петр Федорович", 205_356, 2);
        staff[2] = new Employee("Гуляева Марина Николаевна", 283_325, 3);
        staff[3] = new Employee("Громов Михаил Владимирович", 287_418, 2);
        staff[4] = new Employee("Блохова Анастасия Викторовна", 307_894, 4);
        staff[5] = new Employee("Муравьев Николай Андреевич", 222_548, 3);
        staff[6] = new Employee("Симонов Дмитрий Алексеевич", 157_272, 1);
        staff[7] = new Employee("Никонова Нина Александровна", 255_150, 3);
        staff[8] = new Employee("Белозеров Никита Павлович", 337_554, 5);
        staff[9] = new Employee("Брагин Артем Эдуардович", 321_054, 5);

        Employee.printStaff(staff);

        System.out.println(" ");

        System.out.println("Сумма затрат на зарплаты в месяц = " + Employee.totalCosts(staff));

        System.out.println(" ");

        System.out.println("Максимальная зарплата: " + staff[Employee.maxSalary(staff)]);

        System.out.println(" ");

        System.out.println("Минимальная зарплата: " + staff[Employee.minSalary(staff)]);

        System.out.println(" ");

        System.out.println("Среднее значение зарплаты в месяц = " + Employee.average(staff));
    }
}