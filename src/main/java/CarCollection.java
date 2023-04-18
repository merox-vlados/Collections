public interface CarCollection<T> extends Iterable<Car>{

    boolean add(Car car);

    boolean remove(Car car);

    int size();

    void clear();

    boolean contains(Car car);
}
