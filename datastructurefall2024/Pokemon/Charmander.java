public class Charmander extends Pokemon
{
    public Charmander(){
        super("JimmyBob", 39, 52, 60, 43, 50, 65);
    }
    
    
    public Charmander(String name,int inputHp, int inputAttack,int inputSpAttack,int inputDefense,int inputSpDefense,int inputSpeed){
        super("JimmyBob", inputHp, inputAttack, inputSpAttack, inputDefense, inputSpDefense, inputSpeed);
    }
    
    
    public void ember(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void tackle(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void flamethrower(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void dragonbreath(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
}