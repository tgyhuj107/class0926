import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //01英里轉公里
//        Scanner scn = new Scanner(System.in);
//        float mile =scn.nextFloat();
//        float km =mile*1.6f;
//        System.out.println(Math.round(km*100)/100f);
        //02攝氏轉華氏
//        Scanner scn =new Scanner(System.in);
//        float c =scn.nextFloat();
//        float f = (c*9/5f)+32;
//        System.out.println(f);
        //03合 差 乘
//        Scanner scn =new Scanner(System.in);
//        int a =scn.nextInt();
//        int b =scn.nextInt();
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
        //04總分 平均
//        Scanner scn =new Scanner(System.in);
//        int ch =scn.nextInt();
//        int en =scn.nextInt();
//        int ma =scn.nextInt();
//        System.out.println(ch+en+ma);
//        System.out.println((ch+en+ma)/3);
        //05身高 體重
//        Scanner scn =new Scanner(System.in);
//        int cm =scn.nextInt();
//        int kg =scn.nextInt();
//        double a=cm/2.54f;
//        double b=kg/0.454f;
//        System.out.println(a);
//        System.out.println(b);
        //06公升轉加崙
//        Scanner scn =new Scanner(System.in);
//        float l =scn.nextFloat();
//        float a = l*0.26418f;
//        System.out.println(Math.round(a*10)/10f);
        //07秤斤論兩
//        Scanner scn = new Scanner(System.in);
//        float g =scn.nextFloat();
//        float a =g/600;
//        System.out.println(Math.round(a*10)/10f);
        //08總合 乘 差 除 餘數
//        Scanner scn =new Scanner(System.in);
//        int a =scn.nextInt();
//        int b =scn.nextInt();
//        System.out.println(a+"+"+b+"="+(a+b));
//        System.out.println(a+"*"+b+"="+(a*b));
//        System.out.println(a+"-"+b+"="+(a-b));
//        System.out.println(a+"/"+b+"="+(a/b)+"..."+(a%b));
        //09取字元ASCll碼
//        Scanner scn =new Scanner(System.in);
//        char a=scn.next().charAt(0);
//        System.out.println((int)a);
        //***10取得中文萬國碼***
//        Scanner scn =new Scanner(System.in);
//        char a =scn.next().charAt(0);
//        String str =Integer.toHexString(a);
//        System.out.println(str);
        //11萬國碼-->中文
//        Scanner scn =new Scanner(System.in);
//        int a =scn.nextInt(16);
//        System.out.println((char)a);
        //12圓柱體積
//        Scanner scn =new Scanner(System.in);
//        float r =scn.nextFloat();
//        float h =scn.nextFloat();
//        double v = Math.PI*r*r*h;
//        System.out.println(v);
        //13開根號
//        Scanner scn =new Scanner(System.in);
//        int old =scn.nextInt();
//        int n =(int)Math.sqrt(old)*10;
//        System.out.println(n);
        //14標準體重
//        Scanner scn =new Scanner(System.in);
//        int t1 =scn.nextInt();
//        int s1 =scn.nextInt();
//        int t2 =scn.nextInt();
//        int s2 =scn.nextInt();
//        if (s1==1){
//            System.out.println(Math.round((t1-80)*0.7f*10)/10f);
//        }else {
//            System.out.println(Math.round((t1-70)*0.6f*10)/10f);
//        }
//        if (s2==1){
//            System.out.println(Math.round((t2-80)*0.7f*10)/10f);
//        }else {
//            System.out.println(Math.round((t2-70)*0.6f*10)/10f);
//        }
        //15零錢問題
//        Scanner scn =new Scanner(System.in);
//        int n=scn.nextInt(),a1=scn.nextInt(),a2=scn.nextInt(),a3=scn.nextInt();
//        if (a1*15+a2*20+a3*30<=n){
//            int d=n-(a1*15+a2*20+a3*30);
//            int d50=d/50 , d5=d%50/5 , d1=d%5;
//            System.out.println(d1);
//            System.out.println(d5);
//            System.out.println(d50);
//        }else {
//            System.out.println(0);
//        }
        //16判斷座標是否在範圍內
//        Scanner scn =new Scanner(System.in);
//        int x=scn.nextInt(), y=scn.nextInt();
//        double x1=Math.sqrt((x*x)+(y*y));
//        if (x1<=100){
//            System.out.println("inside");
//        }else {
//            System.out.println("outside");
//        }
        //17停車問題
//        Scanner scn =new Scanner(System.in);
//        int h1=scn.nextInt(),m1=scn.nextInt(),h2=scn.nextInt(),m2=scn.nextInt();
//        int allmin=Math.abs((h1*60+m1)-(h2*60+m2));
//        int min30=allmin/30;
//        if (min30<=4){
//            System.out.println(min30*30);
//        }else if (min30<=8){
//            System.out.println((min30-4)*40+120);
//        }else{
//            System.out.println((min30-8)*60+280);
//        }
        //18季節判定
//        Scanner scn =new Scanner(System.in);
//        int month = scn.nextInt();
//        if (month>=3 && month<=5){
//            System.out.println("Spring");
//        }else if (month>=6 && month<=8){
//            System.out.println("Summer");
//        }else if (month>=9 && month<=11){
//            System.out.println("Autumn");
//        }else {
//            System.out.println("Winter");
//        }
        //19星座
//        Scanner scn =new Scanner(System.in);
//        int month =scn.nextInt() , data=scn.nextInt();
//        if (month==2 && data<=18 || month==1&&data>=21){
//            System.out.println("Aquarius");
//        }else if (month==3&&data<=20 || month==2){
//            System.out.println("Pisces");
//        }else if (month==4&&data<=20 || month==3){
//            System.out.println("Aries");
//        }else if (month==5&&data<=21 || month==4){
//            System.out.println("Taurus");
//        }else if (month==6&&data<=21 || month==5){
//            System.out.println("Gemini");
//        }else if (month==7&&data<=22 || month==6){
//            System.out.println("Cancer");
//        }else if (month==8&&data<=23 || month==7){
//            System.out.println("Leo");
//        }else if (month==9&&data<=23 || month==8){
//            System.out.println("Virgo");
//        }else if (month==10&&data<=23 || month==9){
//            System.out.println("Libra");
//        }else if (month==11&&data<=22 || month==10){
//            System.out.println("Scorpio");
//        }else if (month==12&&data<=21 || month==11){
//            System.out.println("Sagittarius");
//        }else if (month==1 || month==12){
//            System.out.println("Capricorn");
//        }
        //20閏年
//        Scanner scn =new Scanner(System.in);
//        int y =scn.nextInt();
//        if (y%400==0){
//            System.out.println("Bissextile Year");
//        }else if (y%100==0){
//            System.out.println("Common Year");
//        }else if (y%4==0){
//            System.out.println("Bissextile Year");
//        }else {
//            System.out.println("Common Year");
//        }
        //21電費
        Scanner scn =new Scanner(System.in);
        int w=scn.nextInt();
        float v1,v2;
        if (w>=120) {
            v1=w*2.10f;
            v2=w*2.10f;
            w-=120;
            if (w<=210){
                System.out.println(w*3.02f+v1);
                System.out.println(w*2.68f+v2);
            }
//            v1=v1+w*3.02f;
//            v2=v1+w*2.68f;
//            w-=210;

        }else {
            System.out.println(w*2.10f);
            System.out.println(w*2.10f);
        }






    }
}
