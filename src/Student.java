public class Student {
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public int setId(int id) {
        this.id = id;
        return id;
    }
    public String getName() {
        return name;
    }
    public int setName(String name) {
        this.name = name;
        return id;
    }
    public int getAge() {
        return age;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}
}
