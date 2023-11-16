import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentInfo = scanner.nextLine().split(" ");
        List<Student> students = new ArrayList<>();

        while (!studentInfo[0].equals("end")) {
            Student student = new Student();
            student.setFirstName(studentInfo[0]);
            student.setLastName(studentInfo[1]);
            student.setAge(Integer.parseInt(studentInfo[2]));
            student.setHomeTown(studentInfo[3]);
            students.add(student);

            studentInfo = scanner.nextLine().split(" ");
        }
        String searchTown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(searchTown)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }else{

            }
        }
    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }


        public String getHomeTown() {
            return homeTown;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
    }
}
