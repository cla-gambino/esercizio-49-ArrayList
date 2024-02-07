import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Claudio Gomes", 23);
        Student student2 = new Student("Matteo Brunori", 29);
        Student student3 = new Student("Edoardo Soleri", 26);
        List<Student> student = Arrays.asList(student1, student2, student3);

        System.out.println("lista studenti: " + student);

        List<Student> newStudents = new ArrayList<>(student);
        newStudents.add(new Student("Jacopo Segre", 26));
        newStudents.add(new Student("Fabio Lucioni", 36));
        newStudents.add(new Student("Francesco Di Mariano", 27));
        newStudents.add(new Student("Leonardo Mancuso", 31));

        System.out.println("lista studenti aggiornata: " + newStudents);


    }
}