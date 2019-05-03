package com.menudejeuner;


public class Order {


    public void displayAvailableMenus() {
    	System.out.println("Bonjour,");
    	System.out.println("Voici les menus du jour :");
    	System.out.println("1 - Poulet");
    	System.out.println("2 - Boeuf");
    	System.out.println("3 - Végétarien");
    	System.out.println("Que souhaitez-vous déjeuner ?");
    }


    public void displaySelectedMenu(int nbMenu) {
    	System.out.println("Très bien, vous avez choisi le menu" + nbMenu);

    }
}
