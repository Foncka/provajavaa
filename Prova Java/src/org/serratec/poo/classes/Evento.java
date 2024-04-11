package org.serratec.poo.classes;

public class Evento {
		private String artista;
		private String palco;
		private String data;
		private String hora;
		
		public Evento(String artistas, String palcos, String datashow, String hora) {
			super();
			this.artista = artistas;
			this.palco = palcos;
			this.data = datashow;
			this.hora = hora;
		}

		

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public String getArtista() {
			return artista;
		}

		public String getPalco() {
			return palco;
		}

		@Override
		public String toString() {
			return artista + " no " + palco + " dia " + data + " as " + hora;
		}


		
		
		
}
