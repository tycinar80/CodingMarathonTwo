package Soru_4;

import java.util.List;
import java.util.stream.Collectors;

public class Kiralama implements IKitap {

	@Override
	public void kiralamaYap(Kitap kitap, Musteri musteri) {
		if (kitap.isKiralanabilir()) {
			kitap.setKiralanabilir(false);
			DataBase.kiralananKitapListesi.put(kitap, musteri);
			kitap.setKiralamaGecmisi(musteri);
			System.out.println(musteri.toString() + "\n" + kitap.toString() + "\n kiralamýþtýr.");
		} else {
			System.out.println(kitap.getIsim() + " þu an baþka müþteridedir.");
		}
	}

	@Override
	public void isimleKitapAra(String isim) {
		List<Kitap> arama = DataBase.kitapListesi.stream().filter(s -> s.getIsim().contains(isim))
				.collect(Collectors.toList());
		System.out.println("Kitap Arama");
		arama.forEach(System.out::println);
	}

	@Override
	public void isimleMusteriAra(String isim) {
		List<Musteri> arama = DataBase.musteriListesi.stream().filter(s -> s.getIsim().contains(isim))
				.collect(Collectors.toList());
		System.out.println("Müþteri Arama");
		arama.forEach(System.out::println);
	}

	@Override
	public void kitaplariListele() {
		System.out.println("Kitap Listesi");
		DataBase.kitapListesi.forEach(System.out::println);

	}

	@Override
	public void kiralananKitaplariListele() {
		System.out.println("Kiralanan Kitap Listesi");
		DataBase.kiralananKitapListesi.entrySet().forEach(System.out::println);

	}

	@Override
	public void kimKiraladi(String id) {
		System.out.println("Kim Kiraladý");
		DataBase.kiralananKitapListesi.entrySet().stream().filter(s -> s.getKey().getId() == id)
				.forEach(System.out::println);

	}

	@Override
	public void kiralamaGecmisi(String isim) {
		System.out.println("Kiralama Geçmiþi");
		List<Kitap> arama = DataBase.kitapListesi.stream().filter(s -> s.getIsim().contains(isim))
				.collect(Collectors.toList());
		arama.forEach(s -> s.getKiralamaGecmisi().forEach(System.out::println));

	}

	@Override
	public void musterininKiraladigiKitaplar(String id) {
		DataBase.kiralananKitapListesi.entrySet().stream().filter(s -> s.getValue().getId() == id)
				.forEach(System.out::println);
	}

}
