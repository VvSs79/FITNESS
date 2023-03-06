package Mk.JD2_95_22.fitness.converter.product;

import Mk.JD2_95_22.fitness.core.dto.model.ProductModel;
import Mk.JD2_95_22.fitness.orm.entity.ProductEntity;
import org.springframework.core.convert.converter.Converter;

import java.time.Instant;
import java.util.UUID;

public class ProductConverterPEntityToModel implements Converter<ProductEntity, ProductModel> {
    @Override
    public ProductModel convert(ProductEntity source) {
        UUID uuid=source.getUuid();
        Instant dt_created=source.getTimeCreated();
        Instant dt_update=source.getDt_update();
        String title=source.getTitle();
        Double weith=source.getWeight();
        Double calories= source.getCalories();
        Double proteinas=source.getProteins();
        Double fats=source.getFats();
        Double carbohydrates=source.getCarbohydrates();

        return new ProductModel(uuid, dt_created, dt_update,title,weith,calories,proteinas,fats,carbohydrates);
    }
}
