package modul107350;
import java.util.Scanner;
class konversi_07350
{
    public void choice_07350(float hasil_07350)
    {
        if(hasil_07350<60)
        {
            System.out.println(">>Nilai anda adalah E");
        }
        else if(hasil_07350>=60 && hasil_07350<70)
        {
            System.out.println(">>Nilai anda adalah D");
        }   
        else if(hasil_07350>=70 && hasil_07350<80)
        {
            System.out.println(">>Nilai anda adalah C");
        }
        else if(hasil_07350>=80 && hasil_07350<90)
        {
            System.out.println(">>Nilai anda adalah B");
        }
        else if(hasil_07350>=90 && hasil_07350<=100)
        {
            System.out.println(">>Nilai anda adalah A");
        }
    }
}
class arraynilai_07350
{
    public void tes_07350()
    {
        float yahaha_07350 = 0,tes_07350 = 0;
        konversi_07350 objnil_07350 = new konversi_07350();
        Scanner input_07350 = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai yang akan diinputkan = ");
        int banyak_07350 = input_07350.nextInt();
        float[] array_07350 = new float[banyak_07350];
        for(int i=0;i<banyak_07350;i++)
        {
            System.out.print("Masukkan nilai ke-"+i+" = ");
            array_07350[i]=input_07350.nextInt();
            objnil_07350.choice_07350(array_07350[i]);
        }
        for(int j=0;j<banyak_07350;j++)
        {
            tes_07350=tes_07350+array_07350[j];
        }
        tes_07350=tes_07350/banyak_07350;
        System.out.println("Rata-Rata Seluruh Nilai adalah "+tes_07350);
        if(tes_07350<75)
        {
            System.out.println("===ANDA TIDAK LULUS===\n");
        }
        else if(tes_07350>=75)
        {
            System.out.println("===ANDA LULUS===\n");
        }
    }
}
public class Modul107350 
{
    public static void main(String[] args) 
    {
        int tes2_07350;
        Scanner menuin_07350 = new Scanner(System.in);
        arraynilai_07350 objarr_07350 = new arraynilai_07350();
        do
        {
            System.out.println("Konversi Nilai Rata-Rata Mata Pelajaran");
            System.out.println("1. Cek Nilai");
            System.out.println("2. Keluar");
            System.out.print("Inputkan menu = ");
            tes2_07350=menuin_07350.nextInt();
            switch(tes2_07350)
            {
                case 1:
                {
                    objarr_07350.tes_07350();
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
        }while(tes2_07350==1);
    }
    
}
