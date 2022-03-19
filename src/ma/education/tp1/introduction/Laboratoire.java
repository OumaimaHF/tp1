package ma.education.tp1.introduction;

public class Laboratoire extends Salle {

    String type;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }


    public Laboratoire(long id, String nom, String type) {
        super(id, nom);
        this.type = type;


    }
}
