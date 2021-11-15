package searchingAlgorithms;

public interface ISearch<T extends Comparable<T>> {
    int search(T[] array, T element);
}
