public class Main {

    public static void main(String[] args) {
	String[] ogrenciler = new String [4];
    ogrenciler[0]= "deniz";
    ogrenciler[1]= "engin";
    ogrenciler[2]= "gül";
    ogrenciler[3]= "cem";

    for(int i=0; i<ogrenciler.length; i++) {
        System.out.println(ogrenciler[i]);
    }

    for(String ogrenci : ogrenciler) {
        System.out.println(ogrenci);
    }

    }
}
