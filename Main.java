public class Main {
    public static void main(String[] args) {
        int nbr_de_carton_dans_lancien_local = 32;
        int nbr_de_carton_le_camion = 0;
        int nbr_de_carton_dans_le_nouveau_local = 0;

        System.out.println("Début du demenagement");
        System.out.println("Il y a " +nbr_de_carton_dans_lancien_local+" cartons dans l'ancien local");

        while(nbr_de_carton_dans_lancien_local>0){
            while (nbr_de_carton_le_camion<9 && nbr_de_carton_dans_lancien_local>0){
                nbr_de_carton_dans_lancien_local--;
                System.out.println("Je prend 1 carton dans l'ancien locale, il reste " +nbr_de_carton_dans_lancien_local+ " cartons dans l'ancien local.");
                nbr_de_carton_le_camion++;
                System.out.println("Je le met dans le chargement du camion, il y a "+nbr_de_carton_le_camion+" carton dans le chargement du camion");
            }
            while(nbr_de_carton_le_camion>0){
                nbr_de_carton_le_camion--;
                System.out.println("je prend 1 carton dans le chargement du camion, il reste "+nbr_de_carton_le_camion+" cartons dans le chargement du camion.");
                nbr_de_carton_dans_le_nouveau_local++;
                System.out.println("je le pause dans le nouveau local, il y a "+nbr_de_carton_dans_le_nouveau_local+" carton dans le nouveau local.");
            }
        }
        System.out.println("fin du demenagement");
    }



}