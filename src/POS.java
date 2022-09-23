import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class POS {
    public static LinkedList<Product> pList = new LinkedList<Product>();
    public static LinkedList<Staff> sList=new LinkedList<Staff>();
    public static LinkedList<Sales> saList=new LinkedList<Sales>();

    public static void main(String[] args) {
        HashSet<String> staffUserName = new HashSet<String>();//Staff username
        staffUserName.add("Staff");//username added
        LinkedList<Integer> staffPassword = new LinkedList<Integer>();//Staff password
        staffPassword.add(1234);// password added

        System.out.println("--------------Welcome to POS System--------------");//Wellcome Message

        try {
            Scanner scan = new Scanner(System.in);//


            System.out.println("1-Customer(View Products)");
            System.out.println("2-Staff (Restricted Access)");

            int option=scan.nextInt();
            if (option==1){
                displayP();
                main(null);
            } else if (option==2) {
                Scanner valid = new Scanner(System.in);
                System.out.println("---Staff Dashboard---");
                System.out.println("User name :");
                String username = valid.nextLine();
                if (staffUserName.contains(username)) {
                    System.out.println("Password :");
                    int pass = valid.nextInt();
                    if (staffPassword.contains(pass)) {
                        //if admin username and password true
                        System.out.println("1-Products Details");
                        System.out.println("2-Staff Details");
                        System.out.println("3-Stock Details");

                        int cho = scan.nextInt();

                        if(cho==1){
                            Pmenu();
                            int cho1 = scan.nextInt();
                            if (cho1==1){

                                System.out.println("Enter Product ID:");
                                int id = scan.nextInt();

                                System.out.println("Enter Product Name:");
                                String pName= scan.next();

                                System.out.println("Enter Product's Price:");
                                int pPrice = scan.nextInt();

                                Product product = new Product(pName,pPrice);
                                addP(product);
                                main(null);
                            } else if (cho1==2) {
                                removeP();
                                main(null);
                            } else if (cho1==3) {
                                displayP();
                                main(null);
                            } else if (cho1==4) {
                                main(null);
                            }else {
                                System.out.println("------------\nInvalid Option\n------------");
                                main(null);
                            }

                        } else if (cho==2) {
                            Smenu();
                            int cho1=scan.nextInt();
                            if (cho1==1){

                                System.out.println("Enter Staff ID:");
                                int sId = scan.nextInt();

                                System.out.println("Enter Staff Name:");
                                String sName= scan.next();

                                Staff staff = new Staff(sId,sName);
                                addS(staff);
                                main(null);


                            }else if (cho1==2) {
                                removeS();
                                main(null);
                            } else if (cho1==3) {
                                displayS();
                                main(null);
                            } else if (cho1==4) {
                                main(null);
                            }else {
                                System.out.println("------------\nInvalid Option\n------------");
                                main(null);
                            }

                        } else if (cho==3) {
                            Samenu();
                            int cho1=scan.nextInt();
                            if (cho1==1){
                                System.out.println("Enter Product Name:");
                                String pName=scan.next();

                                System.out.println("Enter Product's Price:");
                                int pPrice = scan.nextInt();

                                System.out.println("Enter Product Quantity:");
                                int qnt = scan.nextInt();

                                System.out.println("Stock Date (DD-MM-YYY):");
                                String date = scan.next();

                                Sales sales = new  Product(pName,qnt,pPrice,date);
                                addSa(sales);
                                main(null);
                            } else if (cho1==2) {
                                removeSa();
                                main(null);
                            } else if (cho1==3) {
                                displaySa();
                                main(null);
                            } else if (cho1==4) {
                                main(null);
                            }else {
                                System.out.println("Ivalid option");
                                main(null);}
                        } else if (cho==4) {
                            System.exit(0);
                        }else {
                            System.out.println("---------------\nInvalid Option\n--------------");
                            main(null);
                        }
                    }else System.out.println("Invalid password");

                } else System.out.println("Invalid username");

            }

        }catch (Exception e){
            System.out.println("Something Went Wrong");
            main(null);
        }

    }
    public static void addP(Product name){
        pList.add(name);
    }
    public static void removeP(){
        try {
            pList.removeLast();
            System.out.println("Last Product has been Removed!");
        }catch(NoSuchElementException e){
            System.out.println("No Product found to Remove!");
        }
    }

    public static void displayP(){
        System.out.println("------Products---------");
        for(Product p : pList){
            System.out.print("Product Id :"+p.getId()+" ");
            System.out.print("| Product Name :"+p.getpName());
            System.out.println("|  Price:  "+p.getpPrice());

        }
        System.out.println();
    }
    public static void addS(Staff name){
        sList.add(name);
    }
    public static void removeS(){
        try {
            sList.removeLast();
            System.out.println("Last Staff has been Removed!");
        }catch(NoSuchElementException e){
            System.out.println("No Staff found to Remove!");
        }
    }
    public static void displayS(){
        System.out.println("------Staff---------");
        for(Staff s : sList){
            System.out.print("Staff Id :"+s.getsId()+" ");
            System.out.println("| Product Name :"+s.getsName());
        }
        System.out.println();
    }
    public static void addSa(Sales sales){
        saList.add(sales);
    }
    public static void removeSa(){
        try {
            saList.removeLast();
            System.out.println("Last Stock has been Removed!");
        }catch(NoSuchElementException e){
            System.out.println("No Stock found to Remove!");
        }
    }
    public static void displaySa(){
        System.out.println("------Stock---------");
        for(Sales sa : saList){
            System.out.print("Product Name : "+sa.getpName());
            System.out.print("| Price : "+sa.getpPrice());
            System.out.print("| Quantity : "+ sa.qnt);
            System.out.print("| Total : "+sa.total());
            System.out.println("|Date : "+sa.date);
        }
        System.out.println();
    }

    public static void Smenu(){
        System.out.println("------Staff---------");
        System.out.println("1-Add Staff");
        System.out.println("2-Remove Staff");
        System.out.println("3-Display Staff");
        System.out.println("4-Main Menu");
    }
    public static void Pmenu(){
        System.out.println("------Product---------");
        System.out.println("1-Add Product");
        System.out.println("2-Remove Product");
        System.out.println("3-Display Product");
        System.out.println("4-Main Menu");
    }

    public static void Samenu(){
        System.out.println("------Stock---------");
        System.out.println("1-Add Stock");
        System.out.println("2-Remove Stock");
        System.out.println("3-Display Stock");
        System.out.println("4-Main Menu");
    }
}