
public class Cour {
    private String nom;
    private Integer volumeHoraire;
    private Enseignant responsable;

    public Cour(String nom, Integer volumeHoraire, Enseignant responsable) {
        this.setNom(nom);
        this.setVolumeHoraire(volumeHoraire);
        this.setResponsable(responsable);
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Integer getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(Integer volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
