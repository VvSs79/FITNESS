package orm.repository;

import core.util.UserRole;
import core.util.UserStatus;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.data.util.Streamable;
import orm.entity.UserEntity;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface UserDAORepository  extends Repository<UserEntity, UUID> {
    List<UserEntity>  save(UserEntity user);
    boolean   existsByUuidOrMail(UUID uuid,String mail);
    Iterable<UserEntity> findAll();
    Optional<UserEntity> findByUuidIs( UUID uuid);
    List<UserEntity>  getUserEntityByUuid(UUID uuid, Sort sort);
    List<UserEntity>  getUserEntityByUuidOrderByDtCreate(UUID uuid);
//    List<UserEntity>  findByUuid(UUID uuid); ???
    List<UserEntity>  findByMailIgnoreCase(String mail);
    List<UserEntity>  findByMailIgnoreCaseAndUuid(String mail,UUID uuid);
    List<UserEntity>  findByStatusAndRole(UserStatus status, UserRole role);
    List<UserEntity>  findByUuidAndDtUpdate(UUID uuid, Instant dt_update);
    List<UserEntity>  deleteByUuidOrMail( UUID uuid, String mail);
    Streamable<UserEntity> findByMailIgnoreCaseLike(String yahoo);


}
