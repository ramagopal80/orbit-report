package restaurant;


public class Restaurant {
    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("Pizza", 13.99, "Yummy pie from Italy", "Main");
        MenuItem menuItem2 = new MenuItem("Toasted Ravioli", 2.99, "St. Louis Treat", "App");
        MenuItem menuItem3 = new MenuItem("Crab Cakes", 4.99, "Made in Baltimore", "Main");
        MenuItem menuItem4 = new MenuItem("Key Lime Pie", 5.89, "Delicious pie!", "Dessert");

        Menu theMenu = new Menu();

        theMenu.addMenuItem(menuItem1);
        theMenu.addMenuItem(menuItem2);
        theMenu.addMenuItem(menuItem3);
        theMenu.addMenuItem(menuItem4);
        menuItem3.changeIsNew();


        System.out.println(theMenu);
    }
}
/*
public class Restaurant {
    public static void main(String[] args){
    Menu menu = new Menu();
    MenuItem myItem = menu.getAppetizers().get(2);
        System.out.println(myItem.getMenuName()+ "    - "+ myItem.getPrice()+'\n' +myItem.getDescription());

    }
}
*/