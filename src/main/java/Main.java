public class Main {
    public static void main(String[] args) {

        String[] films = {
                "Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"
        };
        //  String newFilm = "Аватар";

      /*  String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
*/

        String removeFilm = "Тролли. Мировой тур";

        String[] tmp = new String[films.length - 1];
        int copyToIndex = 0;
        for (String film : films) {
            if (!film.equals(removeFilm)) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;


    }
}
