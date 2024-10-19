
public class Pokemon
{
        private String name = "name";
        private int hp;
        private int attack;
        private int spAttack;
        private int defense;
        private int spDefense;
        private int speed;
        public Pokemon(String name, int userHp, int userAttack,int userSpAttack,int userDefense,int userSpDefense,int userSpeed){
            hp = userHp;
            attack = userAttack;
            spAttack = userSpAttack;
            defense = userDefense;
            spDefense = userSpDefense;
            speed = userSpeed;
        }
        public int getHp(){
            return hp;
        }
        public void setHp(int inputHp){
            hp = inputHp;
        }
        
        public int getAttack(){
            return attack;
        }
        public void setAttack(int inputAttack){
            attack = inputAttack;
        }
        
        public int getSpAttack(){
            return spAttack;
        }
        public void setSpAttack(int inputSpAttack){
            spAttack = inputSpAttack;
        }
        
        public int getDefense(){
            return defense;
        }
        public void setDefense(int inputDefense){
            defense = inputDefense;
        }
        
        public int getSpDefense(){
            return spDefense;
        }
        public void setSpDefense(int inputSpDefense){
            spDefense = inputSpDefense;
        }
        
        public int getSpeed(){
            return speed;
        }
        public void setSpeed(int inputSpeed){
            speed = inputSpeed;
        }
}
