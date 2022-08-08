package Soru_4;

public interface IKitap {
	public void kiralamaYap(Kitap kitap, Musteri musteri);

	public void isimleKitapAra(String isim);

	public void isimleMusteriAra(String isim);

	public void kitaplariListele();

	public void kiralananKitaplariListele();

	public void kimKiraladi(String id);

	public void kiralamaGecmisi(String isim);

	public void musterininKiraladigiKitaplar(String id);
}
