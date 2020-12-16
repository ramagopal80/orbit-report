package restaurant;


public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void changeIsNew() {
        this.isNew = !this.isNew;
    }

    @Override
    public String toString(){
        return this.name + " Price: " + this.price + " " + this.description + " Category: "
                + this.category;
    }
}
/*
public class MenuItem {
    private String menuName;
    private double price;
    private String description;
    //    private String category;
    private Boolean isnewMenu;

    public MenuItem(String menuName, double price, String description, Boolean newMenu) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;

        this.isnewMenu = false;

    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public String getCategory() {
//        return category;
//    }

//    public void setCategory(String category) {
//        this.category = category;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNewMenu(Boolean newMenu) {
        this.isnewMenu = newMenu;
    }

}
//    public String toString(){
//        return this.menuName + "Price: " + this.price+ "Description:" +this.description;
//    }
//}

*/

