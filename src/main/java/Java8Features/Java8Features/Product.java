package Java8Features.Java8Features;

public class Product implements Comparable<Product> {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        return o.id.compareTo(this.id);
    }
}
