
public class Password {
	int longitud = 8;
	String contrasenia;
	
	public Password(String pass) {
		if(pass.length()<=this.longitud) {
			this.contrasenia = pass;
		}
	}
	
	public Password(String pass, int len) {
		this.longitud = len;
		if(pass.length()<=this.longitud) {
			this.contrasenia = pass;
		}
	}
	
	
	public int getLongitud() {
		return this.longitud;
	}
	
	public String getPassword() {
		return this.contrasenia;
	}
	
	public void setLongitud(int len) {
		this.longitud = len;
	}
	
	
	public boolean esFuerte() {
		int mayus = 0,minus = 0,num = 0;
		for(char ch:contrasenia.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				if(Character.isUpperCase(ch)) {
					mayus++;
				}else {
					minus++;
				}
			}else if(Character.isDigit(ch)) {
				num++;
			}
		}
		
		if(mayus>2&&minus>1&&num>5) {
			return true;
		}else {
			return false;
		}
	}
	
	public void generarPassword(String pass) {
		if(pass.length()<=longitud) {
			this.contrasenia = pass;
		}
	}
}