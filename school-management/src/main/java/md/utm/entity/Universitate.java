package md.utm.entity;

public class Universitate {
    private Integer id;
    private String name;
    private String city;
    private String type;

    public Universitate(Integer id, String name, String city, String type) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Universitate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
