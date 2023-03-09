package Mk.JD2_95_22.fitness.orm.repository;

import Mk.JD2_95_22.fitness.core.dto.page.PageDTO;
import Mk.JD2_95_22.fitness.core.dto.products.ProductDTO;
import Mk.JD2_95_22.fitness.orm.entity.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.UUID;

public interface IProductRepositpry extends JpaRepository<ProductEntity, UUID> {
    boolean existsByTitle(String title);

    ProductEntity getAllByDtUpdate(Instant dtUpdate);
    ProductEntity getAllByTitle(String title);
    ProductEntity getAllByTitleAndDtUpdate(String title, Instant dtUpdate);
    ProductEntity deleteAllByTitle(String title);


}
