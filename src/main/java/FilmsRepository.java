public class FilmsRepository {
    private String[] items = new String[0];
    private int bazaCountMovie;

    public FilmsRepository(int bazaCountMovie) {
        this.bazaCountMovie = bazaCountMovie;
    }


    public FilmsRepository() {
        this.bazaCountMovie = 5;
    }

    public void add(String movie) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = movie;
        items = tmp;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLength;
        if (items.length < bazaCountMovie) {
            resultLength = items.length;
        } else {
            resultLength = bazaCountMovie;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}





















/*  //  private FilmsRepository repo;

    public FilmsRepository(FilmsRepository repo) {
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

    public void save(FilmList item) { //это новая покупка. То есть новый фильм
        FilmList[] tmp = new FilmList[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void findLast(int id) {
        FilmList[] tmp = new FilmList[items.length - 1];
        int copyToIndex = 0;
        for (FilmList item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

  //  public FilmList[] findAll() { //возвращает все запомненные элементы в виде массива
 //       return items;
  //  }
}

*/









