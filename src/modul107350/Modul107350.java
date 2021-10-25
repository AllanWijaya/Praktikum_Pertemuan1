package modul107350;
import java.util.Scanner;
class konversi07350
{
    public void choice07350(float hasil07350)
    {
        if(hasil07350<60)
        {
            System.out.println(">>Nilai anda adalah E");
        }
        else if(hasil07350>=60 && hasil07350<70)
        {
            System.out.println(">>Nilai anda adalah D");
        }   
        else if(hasil07350>=70 && hasil07350<80)
        {
            System.out.println(">>Nilai anda adalah C");
        }
        else if(hasil07350>=80 && hasil07350<90)
        {
            System.out.println(">>Nilai anda adalah B");
        }
        else if(hasil07350>=90 && hasil07350<=100)
        {
            System.out.println(">>Nilai anda adalah A");
        }
    }
}
class arraynilai07350
{
    public void tes07350()
    {
        float yahaha07350 = 0,tes07350 = 0;
        konversi07350 objnil07350 = new konversi07350();
        Scanner input07350 = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai yang akan diinputkan = ");
        int banyak07350 = input07350.nextInt();
        float[] array07350 = new float[banyak07350];
        for(int i=0;i<banyak07350;i++)
        {
            System.out.print("Masukkan nilai ke-"+i+" = ");
            array07350[i]=input07350.nextInt();
            objnil07350.choice07350(array07350[i]);
        }
        for(int j=0;j<banyak07350;j++)
        {
            tes07350=tes07350+array07350[j];
        }
        tes07350=tes07350/banyak07350;
        System.out.println("Rata-Rata Seluruh Nilai adalah "+tes07350);
        if(tes07350<75)
        {
            System.out.println("===ANDA TIDAK LULUS===\n");
        }
        else if(tes07350>=75)
        {
            System.out.println("===ANDA LULUS===\n");
        }
    }
}
public class Modul107350 
{
    public static void main(String[] args) 
    {
        int tes207350;
        Scanner menuin07350 = new Scanner(System.in);
        arraynilai07350 objarr07350 = new arraynilai07350();
        do
        {
            System.out.println("Konversi Nilai Rata-Rata Mata Pelajaran");
            System.out.println("1. Cek Nilai");
            System.out.println("2. Keluar");
            System.out.print("Inputkan menu = ");
            tes207350=menuin07350.nextInt();
            switch(tes207350)
            {
                case 1:
                {
                    objarr07350.tes07350();
                    break;
                }
                case 2:
                {
                    break;
                }
                default:
                {
                    System.out.println("Nilai yang anda inputkan salah");
                }     
            }
        }while(tes207350==1);
    }
    
}
