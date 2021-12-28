package md.utm.entity;

public class Student {
    private String idnp;
    private String firstName;
    private String lastName;
    private String grupa;
    private double media;
    private String email;
    private int univId;

    public Student(String idnp, String firstName, String lastName, String grupa, double media, String email, int univId) {
        this.idnp = idnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grupa = grupa;
        this.media = media;
        this.email = email;
        this.univId = univId;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUnivId() {
        return univId;
    }

    public void setUnivId(int univId) {
        this.univId = univId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idnp='" + idnp + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grupa='" + grupa + '\'' +
                ", media=" + media +
                ", email='" + email + '\'' +
                ", univId=" + univId +
                '}';
    }
}
