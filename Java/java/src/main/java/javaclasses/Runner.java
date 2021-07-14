package javaclasses;

//Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.

public class Runner {
    public static void main(String[] args) {
        StudentList studentlist = new StudentList();
        studentlist.addStudent(new Student(1, "3упкин", "Василий", "Васильевич",
                "11.12.1997", "г. Минск, ул. Пушкинская 15, кв.1", "+375291112233",
                Faculty.GENERAL, 1, 1));
        studentlist.addStudent(new Student(2, "Пупкин", "Василий", "Васильевич",
                "11.12.1997", "г. Минск, ул. Пушкинская 15, кв.1", "+375291112233",
                Faculty.GENERAL, 1, 1));
        studentlist.addStudent(new Student(3, "Супкин", "Дмитрий", "Васильевич",
                "14.12.1993", "г. Минск, ул. Толбухина 15, кв.3", "+375291312233",
                Faculty.PEDIATRIC, 2, 3));
        studentlist.addStudent(new Student(4, "Гуркин", "Лев", "Львович",
                "15.12.1994", "г. Минск, ул. Якуба Коласа 15, кв.4", "+375291412233",
                Faculty.PHARMACEUTICAL, 2, 7));
        studentlist.addStudent(new Student(5, "Пушкина", "Василиса", "Анатольевна",
                "16.12.1994", "г. Минск, ул. Янки Мавра 15, кв.5", "+375291512233",
                Faculty.PHARMACEUTICAL, 2, 7));
        studentlist.addStudent(new Student(6, "Душкина", "Анна", "Васильевна",
                "17.12.1994", "г. Минск, ул. Бурдейного 15, кв.6", "+375291612233",
                Faculty.DENTAL, 2, 3));
        studentlist.addStudent(new Student(7, "Сушкина", "Василисиа", "Васильевна",
                "18.12.1991", "г. Минск, ул. Якубовского 15, кв.7", "+375291712233",
                Faculty.DENTAL, 4, 5));
        studentlist.addStudent(new Student(8, "Лушкина", "Лариса", "Антоновна",
                "18.12.1991", "г. Минск, ул. Якубовского 15, кв.8", "+375291812233",
                Faculty.DENTAL, 2, 5));
        System.out.println("Лечебный факультет:");
        studentlist.printStudentsByFaculty(Faculty.PEDIATRIC);
        System.out.println("\nСписки студентов для каждого факультета и курса:");
        studentlist.printStudentsForEachFacultyAndCourse();
        System.out.println("\nСтуденты после 1995 года:");
        studentlist.printStudentsByYearAfter(1995);
        System.out.println("\nСписок учебной группы 7:");
        studentlist.printStudentsByGroup(7);
    }
}