package parcial;

public class Main {
	
	static Jugador jugador1 = new Jugador("Jugador 1");
	static Jugador jugador2 = new Jugador("Jugador 2");
	static Ronda rondas = Ronda.UNO;

	public static void main(String[] args) {
		
		iniciarRondas();

	}

	private static void iniciarRondas() {
		
		if(rondas == Ronda.UNO){
			
			for(int i = 0; i < 1; i++){
				
				jugadorElige(jugador1);
				jugadorElige(jugador2);
				jugarRonda(jugador1, jugador2);
				
			}
			
		}else if(rondas == Ronda.TRES){
			
			for(int i = 0; i < 3; i++){
				
				jugadorElige(jugador1);
				jugadorElige(jugador2);
				jugarRonda(jugador1, jugador2);
				
				
			}
			
		}else if(rondas == Ronda.CINCO){
			
			for(int i = 0; i < 5; i++){
				
				jugadorElige(jugador1);
				jugadorElige(jugador2);
				jugarRonda(jugador1, jugador2);
				
				
			}
			
		}else{
			
		}
		
	}

	private static void jugarRonda(Jugador jugador1, Jugador jugador2) {

		System.out.println("Jugador 1 eligio: " + jugador1.getEleccion().getF());
		System.out.println("Jugador 2 eligio: " + jugador2.getEleccion().getF());
		
		if(jugador1.getEleccion().yoGanoA() == jugador2.getEleccion().getF()){
			
			System.out.println("Jugador 1 gana!");
			
		}else if(jugador2.getEleccion().yoGanoA() == jugador1.getEleccion().getF()){
			
			System.out.println("Jugador 2 gana!");
			
		}else{
			
			System.out.println("Empate!");
			
		}
		
		
	}

	private static void jugadorElige(Jugador jugador) {
		
		int r = ((int) (10*Math.random())) % 3;
		
		if(r == 0){
			
			jugador.setEleccion(Figura.PIEDRA);
			
		}else if(r == 1){
			
			jugador.setEleccion(Figura.PAPEL);
			
		}else if(r == 2){
			
			jugador.setEleccion(Figura.TIJERA);
			
		}else{
			
		}
		
	}

}
