public class Main {
    public static void main(String[] args) {
        StudentManagerImpl studentManager = new StudentManagerImpl();
        try {
            studentManager.addStudent(new Student(1423, "Pedro", 17));
            studentManager.addStudent(new Student(2213, "Lucia", 34));
            studentManager.addStudent(new Student(3343, "Mario", 21));
            studentManager.addStudent(new Student(4231, "Patricia", 23));
            studentManager.addStudent(new Student(5743, "Melanie", 19));

            System.out.println("\n****************************************");
            System.out.println("\n----Lista de estudiantes:----");
            studentManager.showAllStudents();

            System.out.println("\n****************************************");
            System.out.println("\n----Estudiantes mayores de 21 años:----");
            studentManager.filterStudentsByAge();

            System.out.println("\n****************************************");
            System.out.println("\n----Ordenando estudiantes por nombre:----");
            studentManager.sortStudentsByName();

            System.out.println("\n****************************************");
            System.out.println("\n----Buscando al estudiante con id 3343:----");
            Student foundStudent = studentManager.findStudent(3343);
            System.out.println("Estudiante encontrado: " + foundStudent);

            System.out.println("\n****************************************");
            System.out.println("\n----Eliminando al estudiante con id 2213:----");
            studentManager.removeStudent(22123);

            System.out.println("\n****************************************");
            System.out.println("\n----Intento de eliminar al estudiante con id 3343:----");
            studentManager.removeStudent(3343);

        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\n****************************************");
        System.out.println("\n----Lista de estudiantes autualizada:----");
        studentManager.showAllStudents();
        System.out.println("\n****************************************");
    }
}
