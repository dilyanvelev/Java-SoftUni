import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentInfo = scanner.nextLine().split(" ");
        List<Student> students = new ArrayList<>();

        while (!studentInfo[0].equals("end")) {
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            int age = Integer.parseInt(studentInfo[2]);
            String city = studentInfo[3];

            if (isStudentExist(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);

            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

            studentInfo = scanner.nextLine().split(" ");

        }

        String searchedCity = scanner.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(searchedCity)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }else{

            }
        }


    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student studentExist = null;
        for (Student student : students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                studentExist = student;
            }
        }
        return studentExist;
    }

    public static boolean isStudentExist(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }

        }
        return false;
    }

    public static class Student {
        //Fields
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public String getFirstName() {
            return firstName;
        }

        //Getter&Setter
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        //Constructor
        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }
        //Methods


    }
}
