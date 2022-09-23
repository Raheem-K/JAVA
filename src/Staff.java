public class Staff {
    //Private keyword used to each and every attribute and getters and setters methods have been used to avoid direct access-(Encapsulation)
    private int sId;
    private String sName;

    Staff(int sId, String sName){
        this.sId=sId;
        this.sName=sName;
    }
    public int getsId() {
        return sId;
    }
    public void setsId(int sId) {
        this.sId = sId;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
}