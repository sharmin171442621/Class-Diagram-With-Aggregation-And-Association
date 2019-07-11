public class Association {
    
       public static void main (String args[]){
            
           customer cust1 = new customer("Sharmin", "Sharmin123", "4321");
           address addr1 = new address("Modanpur", "Sreepur", "Magura");
           
           System.out.println(cust1.customer() + " " + addr1.address());
           
           
           admin admin1 = new admin("Administrator", "admin", "Admin@123");
           address addr2 = new address("Modanputr", "Sreepur", "Magura");
           
           
           System.out.println(admin1.admin() + " " + addr2.address());
           
           
        }
    
    
}