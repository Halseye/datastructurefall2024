public class Squirtle extends Pokemon
{
    public Squirtle(){
        super("TimmyBob", 39, 52, 60, 43, 50, 65);
    }
    
    
    public Squirtle(String name,int inputHp, int inputAttack,int inputSpAttack,int inputDefense,int inputSpDefense,int inputSpeed){
        super("TimmyBob", inputHp, inputAttack, inputSpAttack, inputDefense, inputSpDefense, inputSpeed);
    }
    
    
    public void watergun(Pokemon anyPoorPokemon){
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
    public void hydopump(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void bite(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
}