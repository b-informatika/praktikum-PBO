package OOP2;

/**
 *
 * @author Jnefer
 */
public class Mahasiswa extends SuperClass{
    private String nim,jurusan,jenjang,semester;

    public Mahasiswa() {
    }
    
    //method override
   public void setNama(String nama) {

   }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
   

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    //method tester
    public static void main(String[] args) {
        
        Mahasiswa mhs=new Mahasiswa();
        mhs.setNama("Andi");
        
    }
    
    
    
}
