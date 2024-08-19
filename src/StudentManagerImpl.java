import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentManagerImpl implements StudentManager {
    private GenericList<Student> studentList;

    public StudentManagerImpl() {
        studentList = new GenericList<>();
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id) throws StudentNotFoundException {
        Optional<Student> studentToRemove = studentList.getAll().stream()
                .filter(student -> student.getId() == id)
                .findFirst();

        if (studentToRemove.isPresent()) {
            studentList.remove(studentToRemove.get());
            System.out.println("Estudiante eliminado: " + studentToRemove.get());
        } else {
            throw new StudentNotFoundException("Estudiante con id " + id + " no encontrado.");
        }
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        return studentList.getAll().stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Estudiante con id " + id + " no encontrado."));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList.getAll();
    }

    public void showAllStudents() {
        studentList.getAll().stream().forEach(System.out::println);
    }

    public void filterStudentsByAge() {
        List<Student> filteredStudents = studentList.getAll().stream()
                .filter(student -> student.getAge() > 21)
                .collect(Collectors.toList());

        System.out.println("Estudiantes mayores de 21 años:");
        filteredStudents.forEach(System.out::println);
    }
    public void sortStudentsByName() {
        List<Student> sortedStudents = studentList.getAll().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println("Estudiantes ordenados por nombre:");
        sortedStudents.forEach(System.out::println);
    }
}
