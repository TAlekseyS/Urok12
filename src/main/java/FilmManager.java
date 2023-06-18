public class FilmManager {
    private FilmsRepository repo;

    public FilmManager(FilmsRepository repo) {
        this.repo = repo;
    }

    public void add(FilmList item) {
        repo.save(item);
    }

    public FilmList[] findAll() {
        FilmList[] all = repo.findAll();
        FilmList[] reversed = new FilmList[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


    public FilmList[] findLastFive() {
        int number = 5;
        FilmList[] all = repo.findAll();
        FilmList[] reversed = new FilmList[number];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


}
