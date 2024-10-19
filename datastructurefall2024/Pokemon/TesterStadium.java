
public class TesterStadium
{
    public static void main(String[] args){
        Pikachu Bob = new Pikachu();
        Charmander JimmyBob = new Charmander();
        System.out.println("Battle Music Initialized");
        //bob.thunderbolt(JimmyBob);
        //System.out.println("Bob attack JimmyBob with thunderbolt"); 
        //System.out.println("JimmmyBob hp:" + JimmyBob.getHp());       
        //JimmyBob.ember(bob);
        
        System.out.println("JimmyBob Hp: " + JimmyBob.getHp());
        System.out.println("Bob Hp: " + Bob.getHp());
        
        
        boolean isBattleActive = true;
        
        while (isBattleActive){
            Bob.thunderbolt(JimmyBob);
            System.out.println("Bob attack JimmyBob with thunderbolt"); 
            System.out.println("JimmyBob Hp: " + JimmyBob.getHp());
            
            if (JimmyBob.getHp() < 0){
                System.out.println("Jimmy has died. Bob wins");
                isBattleActive = false;
            } else{
                JimmyBob.ember(Bob);
                System.out.println("JimmyBob attacks Bob with ember.");
                System.out.println("Bob's HP: " + Bob.getHp());
                
                if(Bob.getHp() < 0) {
                    System.out.println("Bob has died. Jimmy wins");
                    isBattleActive = false;
                }
            }
        }
    }
}
