import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> elements;

    public GenericList() {
        elements = new ArrayList<>();
    }
    public void add(T element) {
        elements.add(element);
    }
    public boolean remove(T element) {
        return elements.remove(element);
    }
    public boolean contains(T element) {
        return elements.contains(element);
    }
    public int size() {
        return elements.size();
    }
    public T find(T element) throws Exception {
        int index = elements.indexOf(element);
        if (index != -1) {
            return elements.get(index);
        } else {
            throw new StudentNotFoundException("Estudiante no encontrado");
        }
    }
    public List<T> getAll() {
        return elements;
    }
}
