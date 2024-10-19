
public class Pikachu extends Pokemon
{
    public Pikachu(){
        super("Bob", 35, 55, 50, 40, 50, 90);
    }
    
    
    public Pikachu(String name, int inputHp, int inputAttack,int inputSpAttack,int inputDefense,int inputSpDefense,int inputSpeed){
        super("Bob", inputHp, inputAttack, inputSpAttack, inputDefense, inputSpDefense, inputSpeed);
    }
    
    
    public void thunderbolt(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void quickattack(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void thundershock(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void spark(Pokemon anyPoorPokemon){
     int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
}
