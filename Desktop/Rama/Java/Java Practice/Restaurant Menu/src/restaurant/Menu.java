package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;


    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        this.lastUpdated = LocalDate.now();
    }


    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String toString() {
        String menu = "";
        for (MenuItem item : this.menuItems) {
            if (item.isNew()) {
                menu += "*";
            }
            menu += item.toString() + "\n";
        }
        menu += "\n* indicates item is new. \nLast updated: " + this.lastUpdated;
        return menu;
    }
}




/*

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> appetizers = new ArrayList<MenuItem>();
    private ArrayList<MenuItem> mainCourse = new ArrayList<MenuItem>();
    private ArrayList<MenuItem> desserts = new ArrayList<MenuItem>();
    private double date;

  public Menu () {
    populateMenu();
  }

    public ArrayList<MenuItem> getAppetizers() {
        return appetizers;
    }

    public void populateMenu(){
      appetizers.add(new MenuItem("Toasted Ravioli", 8.49,
        "Lightly fried ravioli filled with seasoned beef. Served with marinara sauce.", false));
      appetizers.add(new MenuItem("Fried Mozzarella", 7.29,
        "Fried mozzarella cheese with marinara sauce.", false));
      appetizers.add(new MenuItem("Dipping Sauces Includes Breadsticks (V)", 3.99,
        "Freshly prepared marinara, homemade alfredo or five cheese marinara, served warm. Served with freshly baked Breadsticks!", false));

      mainCourse.add(new MenuItem("Chicken Biryani", 16.00,
        "Layered chicken with fragrant biryani spices, basmati rice and caramelized onions cooked traditionally on open flame.", false));
      mainCourse.add(new MenuItem("DV Veg Navratan Pulao", 8.00,
        "Mix vegetables and rice cooked in cream and saffron", false));
      mainCourse.add(new MenuItem("Fried Rice", 11.59,
        "Rice cooked your favorite meat or vegetables.", false));

      desserts.add(new MenuItem("Tiramisu (V)", 7.29,
        "The classic Italian dessert. A layer of creamy custard set atop espresso-soaked ladyfingers.", false));
      desserts.add(new MenuItem("Warm Italian Doughnuts (V)", 6.99,
        "Fried doughnuts tossed in vanilla sugar. Served with raspberry or chocolate sauce.", false));
      desserts.add(new MenuItem("Dolcini (V)", 2.99,
        "layered with cake, mousse, pastry creams and berries.", false));

  }



    private String menuItem;
//    private String menuDate;

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

}


/*
public String toString() {
String menu = "";
for(MenuItem item: this.menuItem){
menu += item.toString() + "\n";
}
menu += "last updated :"  + this.lastUpdated;

return menu;
}
 */