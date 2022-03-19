package ma.education.tp1.introduction;

    public class SalleCours extends Salle {


        int nombre_de_places;

        /**
         * @param args
         */
        public static void main(String[] args) {
            // TODO Auto-generated method stub

        }


        public SalleCours(long id, String nom, int nbPlaces) {
            super(id,nom);
            this.nombre_de_places=nbPlaces;

        }



    }
