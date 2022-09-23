//This class extends the Sales class -(Inheritance)
public class Product extends Sales{

    //Private keyword used to each and every attribute and getters and setters methods have been used to avoid direct access-(Encapsulation)
    private int id;
    private String pName;
    private int pPrice;
    Product(String pName, int pPrice){//A method in the name of Product with 2 in the parameter and this method is overloaded below
        this.id=id;
        this.pName=pName;
        this.pPrice=pPrice;
    }
    //Overloaded method
    Product(String pName,int qnt,int pPrice,String date){//This method in the name of Product with 5 in the parameter and it is overloaded-(Polymorphism)
        this.pName=pName;
        this.pPrice=pPrice;
        this.qnt=qnt;
        this.date=date;
    }
    @Override
    int total() {//This method is override here which is undefined method belongs the Sales abstract class
        return qnt*pPrice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getpPrice() {
        return pPrice;
    }
    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

}