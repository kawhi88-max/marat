package com.company;

public class Main {

    public static void main(String[] args) {
	 int temperature = 31;
	 boolean isRainy = false;
	 int age = 21;
	 int human = 19;
	 boolean isSunny = true;
	 int range = 0;
	 int tempe = 15;


        System.out.println(Home());
        System.out.println(Cinema());
        System.out.println(tempe());

	 if (age>20 && age<40 && temperature>-20 && temperature<30);{

        }
         if(human<20 && range > 0 && range < 28);


         switch (tempe){
             case 25:
                 System.out.println("Можно идти гулять");
                 break;
             case 45:
                 System.out.println("Идти домой");
                 break;

         }
    }

        }

    public static String Home (){
    return "Можно идти гулять";
    public static String Cinema(){
        return "Можно идти гулять";
    }
    public static String tempe (){
        return "Оставайтесь дома";
    }

}


