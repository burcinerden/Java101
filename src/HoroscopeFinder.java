import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int day,month;
    String horoscope="";
    boolean isError=false;

        System.out.println("Birth month:");
        month=input.nextInt();
        System.out.println("Birth day:");
        day= input.nextInt();
        if(month>=1&&month<=12) {
            if ((month == 1)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 22)) {
                        horoscope = "Oğlak";
                    } else {
                        horoscope = "Kova";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 2)) {
                if (day >= 1 && day <= 28) {
                    if ((day <= 20)) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 3)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 20)) {
                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 4)) {
                if (day >= 1 && day <= 30) {
                    if ((day <= 20)) {
                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 5)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 21)) {
                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 6)) {
                if (day >= 1 && day <= 30) {
                    if ((day <= 22)){
                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 7)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 20)) {
                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 8)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 20)) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 9)) {
                if (day >= 1 && day <= 30) {
                    if ((day <= 20)) {
                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 10)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 20)) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 11)) {
                if (day >= 1 && day <= 30) {
                    if ((day <= 20)) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                }else {
                    isError = true;
                }
            }
            if ((month == 12)) {
                if (day >= 1 && day <= 31) {
                    if ((day <= 20)) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                }else {
                    isError = true;
                }
            }

        }else{
            System.out.println("Enter a valid number of month!");
        }


             if (isError){
            System.out.print("Hatalı!"+isError);
                }
                else{
            System.out.print("Burcunuz:"+horoscope);
                }


    }
}


