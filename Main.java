import java.util.*;
class Pengguna {
    private int IdPengguna;
    private String nama;
    private String email;
    private String password;

    
}

class Transaksi {
    private int IdTransaksi;
    private String deskripsi;
    private Date tanggal;
    private String jenis;
    private String kategori;
    private double nominal;
}

class Kategori {
    private String nama;
}

class LaporanBulanan {
    private String bulan;
    private double totalPemasukan;
    private double totalPengeluaran;
    private double saldoAkhir;
}

class Notifikasi {
    private int IdNotifikasi;
    private String tipe;
    private String isi;
    private Date waktu;
}

class ManajerTransaksi {
    private List<Transaksi> daftarTransaksi = new ArrayList<>();
}

class ManajerNotifikasi {
    private List<Notifikasi> daftarNotifikasi = new ArrayList<>();
}

