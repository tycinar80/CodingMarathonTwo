package Soru_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	public static List<Kitap> kitapListesi = new ArrayList<Kitap>();
	public static List<Musteri> musteriListesi = new ArrayList<Musteri>();
	public static List<Kasiyer> kasiyerListesi = new ArrayList<Kasiyer>();
	public static Map<Kitap, Musteri> kiralananKitapListesi = new HashMap<Kitap, Musteri>();
}
