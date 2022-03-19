package ma.education.tp1.introduction;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {


        // TODO Auto-generated method stub
        //Salle o1 = new Salle ();
        Salle o2 = new Salle("Salle Informatique");

        Salle o3 = new Salle(2,"Salle des cours");

        //System.out.println(o1);
        System.out.println(o2.nom);
        System.out.println(o3.id +" " + o3.nom);


    }

}