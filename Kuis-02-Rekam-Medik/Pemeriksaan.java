
import java.util.Date;
public class Pemeriksaan
{
    Catatan [] catatan;
    Date tanggalPemeriksaan;
    Obat [] resep;
    
    public Pemeriksaan (Catatan [] catatan, Date tanggalPemeriksaan, Obat [] resep){
        this.catatan=catatan;
        this.tanggalPemeriksaan=tanggalPemeriksaan;
        this.resep=resep;
    }
}
