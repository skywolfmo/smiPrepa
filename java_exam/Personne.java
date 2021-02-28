public abstract class Personne {
    private String nom;
    private Integer codeId;
    private String email;

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne(String nom, Integer codeId, String email) {
        this.nom = nom;
        this.codeId = codeId;
        this.setEmail(email);
    }
    
}