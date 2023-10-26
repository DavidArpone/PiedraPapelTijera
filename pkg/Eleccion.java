package parcial;

public class Eleccion {
	
	private Figura f;

	public Figura getF() {
		return f;
	}

	public void setF(Figura f) {
		this.f = f;
	}
	
	public Figura yoGanoA(){
		
		if(f == Figura.PIEDRA){
			return Figura.TIJERA;
		}else if(f == Figura.TIJERA){	
			return Figura.PAPEL;
		}else if(f == Figura.PAPEL){
			return Figura.PIEDRA;
		}else{
			System.out.println("Error en eleccion");
			return f;
		}
			
	}

}
