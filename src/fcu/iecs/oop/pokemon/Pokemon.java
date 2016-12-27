
package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable  {
	public PokemonType type =null;
	public int cp;
	public  String nickName =null;
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public PokemonType getType() {
		return type;
	}
	public Pokemon(String nickName , final PokemonType  type, int cp) {
		super();
		this.type = type;
		this.cp = cp;
		this.nickName = nickName;
	}
	
	
 

}