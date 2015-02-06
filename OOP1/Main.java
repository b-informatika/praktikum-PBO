
package OOP1;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs=new Mahasiswa();
        Matakuliah mk=new Matakuliah();
        Nilai nilai=new Nilai();
        
        mhs.setNim("1110520090");
        mhs.setNama("Wakwaw");
        mhs.setJurusan("Informatika");
        mhs.setJenjang("S1");
        mhs.setSemester(1);
        
        mk.setId(1);
        mk.setNamaMK("PBO");
        mk.setSks(1);
        
        nilai.setHarian(100);
        nilai.setUts(90);
        nilai.setUas(100);
        
        System.out.println("NIM     : "+mhs.getNim());
        System.out.println("Nama    : "+mhs.getNama());
        System.out.println("Jurusan : "+mhs.getJurusan());
        System.out.println("Jenjang : "+mhs.getJenjang());
        System.out.println("Semester: "+mhs.getSemester());
        
        System.out.println("ID MK   : "+mk.getId());
        System.out.println("Nama MK : "+mk.getNamaMK());
        System.out.println("SKS     : "+mk.getSks());
        
        System.out.println("Harian  : "+nilai.getHarian());
        System.out.println("UTS     : "+nilai.getUts());
        System.out.println("UAS     : "+nilai.getUas());
        
        System.out.println("NA      : "+nilai.hitungNA());
        
        
        
        
        
        
        
    }
    
}
