
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan info sepeda
 *                     dan papan skate.
 *  
 */

package pbo1.pkg10118033.latihan57;

public class PBO110118033Latihan57 {
    public static void main(String[] args) {
        Bicycle speda = new Bicycle();
        speda.setMyBrand("Trek Bike");
        speda.setMyModel("7.4FX");
        speda.setMyGearCount(23);
        System.out.println("Brand : "+speda.getMyBrand());
        System.out.println("Model : "+speda.getMyModel());
        System.out.println("Jumlah Gear : "+speda.getMyGearCount()+"\n");
        
        Skateboard sket = new Skateboard();
        sket.setMyBrand("Ally Skate");
        sket.setMyModel("Rocket");
        sket.setMyBoardLength(54.5);
        System.out.println("Brand : "+sket.getMyBrand());
        System.out.println("Model : "+sket.getMyModel());
        System.out.println("Panjangnya Board : "+sket.getMyBoardLength()+"\n");
    }
}