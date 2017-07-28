public interface Iter<T> {
    T get();
    void advance();
    boolean equals(Iter<T> other);
    Iter<T> clone();
}
