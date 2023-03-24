import java.sql.SQLOutput;
import java.util.ArrayList;

public class latihanmodul2 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("hewan: "+Hewan);

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("hewan yang dihapus: "+DeleteHewan);

        for(String warna : DeleteHewan){
            Hewan.remove(warna);
        }
        System.out.println("output hewan: "+Hewan);
    }
}
