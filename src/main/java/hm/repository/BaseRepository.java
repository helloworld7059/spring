package hm.repository;

public abstract class BaseRepository<T> {

    public void save(T t) {
        System.out.println("repository: save an instance of " + t.getClass().getName());
    }
}