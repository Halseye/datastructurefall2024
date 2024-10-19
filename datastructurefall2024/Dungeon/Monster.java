public class Monster{
        private int hp;
        private int attack;
        private int defense;
        private int speed;



        private monster(int userHP, int userAttack, int userDefense, int userSpeed){
            hp = userHP;
            attack = userAttack;
            defense = userDefense;
            speed = userSpeed;
        }

        public int getHP(){
            return hp;
        }
        public void setHP(int inputHP){
            hp = inputHP;
        }
        public int getAttack(){
            return attack;
        }
        public void setAttack(int inputAttack){
            attack = inputAttack;
        }
        public int getDefense(){
            return defense;
        }
        public void setDefense(int inputDefense){
            defense = inputDefense;
        }
        public int getSpeed(){
            return speed:
        }
        public void setSpeed(int inputSpeed){
            speed = inputSpeed;
        }
}