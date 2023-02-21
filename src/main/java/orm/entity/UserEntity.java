package orm.entity;

import core.util.UserRole;
import core.util.UserStatus;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "User", schema = "app")
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private UUID uuid;
    @Version
    @ Column(name = "")
    private Instant dtUpdate;
    @ Column(name = "")
    private Instant dtCreate;
    @ Column(name = "")
    private String mail;
    @ Column(name = "")
    private String fio;
    @ Column(name = "")
    private UserRole role;
    @ Column(name = "")
    private UserStatus status;
}
