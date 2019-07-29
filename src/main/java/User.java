import javax.validation.constraints.*;

public class User {
    @CheckBrakets(message = "field")
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}