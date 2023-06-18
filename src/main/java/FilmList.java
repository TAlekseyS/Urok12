public class FilmList {
    //private int title;
    private int id;
    private int number;

    private String productName;

    public FilmList(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }


}
