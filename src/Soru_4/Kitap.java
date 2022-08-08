package Soru_4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Kitap {
	private String id;
	private String isim;
	private String yazar;
	private EKategori kategori;
	private boolean kiralanabilir;
	private List<Musteri> kiralamaGecmisi;

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isim=" + isim + ", yazar=" + yazar + ", kategori=" + kategori + ", kiralanabilir="
				+ kiralanabilir + "]";
	}

	public Kitap(String isim, String yazar, EKategori kategori) {
		super();
		this.isim = isim;
		this.yazar = yazar;
		this.kategori = kategori;
		this.id = UUID.randomUUID().toString();
		this.kiralanabilir = true;
		kiralamaGecmisi = new ArrayList<Musteri>();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public EKategori getKategori() {
		return kategori;
	}

	public void setKategori(EKategori kategori) {
		this.kategori = kategori;
	}

	public boolean isKiralanabilir() {
		return kiralanabilir;
	}

	public void setKiralanabilir(boolean kiralanabilir) {
		this.kiralanabilir = kiralanabilir;
	}

	public String getId() {
		return id;
	}

	public List<Musteri> getKiralamaGecmisi() {
		return kiralamaGecmisi;
	}

	public void setKiralamaGecmisi(Musteri musteri) {
		this.kiralamaGecmisi.add(musteri);
	}

}
