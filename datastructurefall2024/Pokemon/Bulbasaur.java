public class Bulbasaur extends Pokemon
{
    public Bulbasaur(){
        super("BillyBob", 45, 49, 65, 49, 65, 45);
    }
    
    
    public Bulbasaur(String name, int inputHp, int inputAttack,int inputSpAttack,int inputDefense,int inputSpDefense,int inputSpeed){
        super("BillyBob", inputHp, inputAttack, inputSpAttack, inputDefense, inputSpDefense, inputSpeed);
    }
    
    
    public void vinewhip(Pokemon anyPoorPokemon){
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
    public void seedbomb(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
    public void takedown(Pokemon anyPoorPokemon){
    int damage = this.getAttack() - anyPoorPokemon.getDefense();
        if (damage < 0) {
            damage = 1; 
        }
    int resultingLife = anyPoorPokemon.getHp() - damage;
    anyPoorPokemon.setHp(resultingLife);
    }
}