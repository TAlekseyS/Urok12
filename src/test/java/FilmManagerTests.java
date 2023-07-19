import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTests {
    FilmsRepository manager = new FilmsRepository(5);

    @BeforeEach
    public void setup() {
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
    }

    @Test
    public void shouldAllPosters() {

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Should7Posters() {
        FilmsRepository manager = new FilmsRepository();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");


        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void should3Posters() {

        //manager.add("Movie 1");
        // manager.add("Movie 2");
        // manager.add("Movie 3");

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldPostersLimit() {

        manager.add("Movie 4");
        manager.add("Movie 5");


        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

// FilmsRepository repo = new FilmsRepository();
//  FilmManager manager = new FilmManager(repo);

/*
    FilmList item1 = new FilmList(1, "Джентельмены");
    FilmList item2 = new FilmList(2, "Бладшот");
    FilmList item3 = new FilmList(3, "Вперёд");
    FilmList item4 = new FilmList(4, "Отель Белград");
    FilmList item5 = new FilmList(5, "Человек-невидимка");
    FilmList item6 = new FilmList(6, "Тролли. Мировой тур");
    FilmList item7 = new FilmList(7, "Номер один");
    FilmList item8 = new FilmList(8, "Сенобит");
    FilmList item9 = new FilmList(9, "Бензопила");

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
    }
   /* @Test
    public void shouldReverseAllFilms() {

        FilmList[] expected = { item9, item8, item7, item6, item5, item4, item3, item2, item1};
        FilmList[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    */
/*
    @Test
    public void findAll() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);


        FilmList[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9};
        FilmList[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        FilmList[] expected = {item9, item8, item7, item6, item5};
        FilmList[] actual = manager.findLastFive();

        Assertions.assertArrayEquals(expected, actual);
    }


}*/
