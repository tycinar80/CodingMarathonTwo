package Soru_1;

import java.util.Scanner;

import Soru_2.MyArray;

public class Aritmetik {
	Scanner scanner = new Scanner(System.in);
	MyArray array;

	public void islem() {
		menu();
		boolean kontrol = true;
		int secim = -1;
		do {
			System.out.print("Ýþlem: ");
			secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 0:
				System.out.println("Programdan Çýkýlýyor...");
				kontrol = false;
				break;

			case 1:
				topla(sayiGir());
				kontrol = true;
				break;

			case 2:
				cikar(sayiGir());
				kontrol = true;
				break;

			case 3:
				carp(sayiGir());
				kontrol = true;
				break;

			case 4:
				bol(sayiGir());
				kontrol = true;
				break;

			case 5:
				duzgunCokgenAlanHesapla();
				kontrol = true;
				break;

			default:
				System.out.println("Hatalý iþlem seçimi!");
				kontrol = true;
				break;
			}
		} while (kontrol);
	}

	private void menu() {
		System.out.println("******************");
		System.out.println("Aritmetik Ýþlemler");
		System.out.println("******************");
		System.out.println();
		System.out.println("0 - Çýkýþ\n" + "1- Toplama Ýþlemi\n" + "2- Çýkarma Ýþlemi\n" + "3- Çarpma Ýþlemi\n"
				+ "4- Bölme Ýþlemi\n" + "5- Düzgün Çokgen Alan Hesabý\n");
	}

	private float[] sayiGir() {
		float[] sayilar = {};
		array = new MyArray();
		int sayi = 0;
		boolean kontrol = true;
		do {
			try {
				System.out.print("Sayý Gir: ");
				sayi = scanner.nextInt();
				scanner.nextLine();
				sayilar = array.sonunaEkle(sayilar, sayi);
				kontrol = kontrol();

			} catch (Exception e) {
				System.out.println("Hatalý deðer girdiniz");
				kontrol = true;
			} finally {
				scanner = new Scanner(System.in);
			}
		} while (kontrol);

		return sayilar;
	}

	private int sayiGir(String islem) {

		int sayi = 0;
		boolean kontrol = true;
		do {
			try {
				System.out.print(islem + ": ");
				sayi = scanner.nextInt();
				scanner.nextLine();
				kontrol = false;

			} catch (Exception e) {
				System.out.println("Hatalý deðer girdiniz");
				kontrol = true;
			} finally {
				scanner = new Scanner(System.in);
			}
		} while (kontrol);
		return sayi;
	}

	private boolean kontrol() {
		String sorgu = "";
		System.out.println("Sayý girmek için bir tuþa basýn\n" + "Tamamlamak için 'H''ye basýn");
		System.out.print("Sayý girecek misiniz?(E/H): ");
		sorgu = scanner.nextLine();
		if (sorgu.equalsIgnoreCase("H"))
			return false;
		else
			return true;
	}

	private void topla(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam = " + toplam);
	}

	private void cikar(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam -= sayilar[i];
		}
		System.out.println("Fark = " + toplam);
	}

	private void carp(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam *= sayilar[i];
		}
		System.out.println("Çarpým = " + toplam);
	}

	private void bol(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam /= sayilar[i];
		}
		System.out.println("Bölüm = " + toplam);
	}

	/**
	 * Düzgün bir çokgenin kenar sayýsý ve kenar uzunluðuna göre alanýný hesaplar
	 */
	private void duzgunCokgenAlanHesapla() {
		int kenarsayisi = 0;
		float kenaruzunlugu = 0;
		do {
			kenarsayisi = sayiGir("Kenar Sayýsý");
			if (kenarsayisi < 3)
				System.out.println("Kenar sayýsý 2'den büyük olmalýdýr!");
		} while (kenarsayisi < 3);

		do {
			kenaruzunlugu = sayiGir("Kenar Uzunluðu(cm)");
			if (kenaruzunlugu <= 0)
				System.out.println("Kenar uzunluðu 0'dan büyük olmalýdýr.");
		} while (kenaruzunlugu <= 0);
		float alan = (float) (Math.pow(kenaruzunlugu, 2) * kenarsayisi)
				/ (float) (4 * Math.tan((Math.PI) / kenarsayisi));
		System.out.println(kenarsayisi + " kenarlý düzgün çokgenin alaný = " + alan);
	}
}
