package model;

public class Akun {
    private String name;
    private String email;
    private String noHp;
    private String password;
    private int pulsaPengguna;
    private boolean isPaketAktif;
    private String namaPaketAktif;

    public Akun setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setnoHp(String NoHp) {
        this.noHp = NoHp;
        return this;
    }

    public String getnoHp() {
        return this.noHp;
    }

    public Akun setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public Akun setPulsaPengguna(int pulsaPengguna) {
        this.pulsaPengguna = pulsaPengguna;
        return this;
    }

    public int getPulsaPengguna() {
        return this.pulsaPengguna;
    }

    public Akun setIsPaketAktif(boolean isPaketAktif) {
        this.isPaketAktif = isPaketAktif;
        return this;
    }

    public boolean getIsPaketAktif() {
        return this.isPaketAktif;
    }

    public Akun setNamaPaketAktif(String namaPaketAktif) {
        this.namaPaketAktif = namaPaketAktif;
        return this;
    }

    public String getNamaPaketAktif() {
        return this.namaPaketAktif;
    }
}