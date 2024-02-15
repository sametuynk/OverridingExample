public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers=new BaseKrediManager[]{
                new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()
        };

        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(10000));
        }

        /*
        * Ögretmen,öğrenci,tarim kredileri overriding edildi.(ezildi)
        * Eğer bu Ögretmen,öğrenci,tarim kredi classları içerisine hesapla metodu yazmasaydık.
        * BaseKrediManagerdeki hesapla metodunu kullanırdı ve hepsi aynı faiz oranıyla hesaplanırdı.
        * */
    }
}