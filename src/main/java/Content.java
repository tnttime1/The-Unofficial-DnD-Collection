import jakarta.persistence.*;

@Entity
@Table(name = "content")
public class Content {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JoinColumn(
            name = "player",
            nullable = false
    )
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    private Player player;
    private String name;
    private String description;
    Content(Player player, String name, String description){
        this.player=player;
        this.name=name;
        this.description=description;
    }
}
