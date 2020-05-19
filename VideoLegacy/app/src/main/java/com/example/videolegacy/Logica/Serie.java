package com.example.videolegacy.Logica;

public class Serie {


        private String titulo;
        private String Descripcion;
        private int anio;

        public Serie(String titulo, String Descripcion, int anio) {
            this.titulo = titulo;
            this.Descripcion = Descripcion;
            this.anio = anio;
        }

        public Serie() {
            this.titulo = "";
            this.Descripcion = "";
            this.anio = 0;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescripcion() {
            return Descripcion;
        }

        public void setGenero(String genero) {
            this.Descripcion = genero;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        @Override
        public String toString() {
            return "Serie" + '\n'+
                    "titulo: " + titulo + '\n' +
                    "Descripcion: " + Descripcion + '\n' +
                    "anio: " + anio ;
        }
}
