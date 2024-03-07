import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    private String name;

    Player(String name){
        this.name =name;
    }

}
