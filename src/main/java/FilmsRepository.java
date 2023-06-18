public class FilmsRepository {
    private FilmList[] items = new FilmList[0];


    public void save(FilmList item) { //это новая покупка. То есть новый фильм
        FilmList[] tmp = new FilmList[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    /*  public void newShit(int id) { //это должна быть какая-то вещь, которая делает хуй пойми что
           ////?????????????????
          int number = 5;
           FilmList[] tmp = new FilmList[number];
           int copyToIndex = 0;
           for (FilmList item : items) {
               if (item.getId() !=id) {
                   tmp[copyToIndex] = item;
                   copyToIndex++;
               }
           }
           items = tmp;
       }

     */
    public void findLast(int id) { //это должна быть какая-то вещь, которая делает хуй пойми что
        ////?????????????????
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

    public FilmList[] findAll() { //возвращает все запомненные элементы в виде массива
        return items;
    }
}











