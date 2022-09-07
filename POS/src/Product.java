public class Product extends Sales{
    private int id;
    private String pName;
    private int pPrice;
    Product(String pName, int pPrice){
     this.id=id;
     this.pName=pName;
     this.pPrice=pPrice;
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
    Product(String pName,int qnt,int pPrice,String date){
        this.pName=pName;
        this.pPrice=pPrice;
        this.qnt=qnt;
        this.date=date;
    }
    @Override
    int total() {
     return qnt*pPrice;
    }
}
