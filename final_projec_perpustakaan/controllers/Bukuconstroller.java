import java.util.List;

/**
 * Bukuconstroller
 */
public class Bukuconstroller {
    private List<buku>listbBukus;
    static Scanner scan = new Scanner(System.in);
    public List<buku> getListbBukus() {
        return listbBukus;
    }
    public void setListbBukus(List<buku> listbBukus) {
        this.listbBukus = listbBukus;
    }
    public static Scanner getScan() {
        return scan;
    }
    public static void setScan(Scanner scan) {
        Bukuconstroller.scan = scan;
    }


    
}