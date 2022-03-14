package tacos.tacocloud.data;

import org.springframework.data.repository.Repository;
import tacos.tacocloud.Ingredient;

import java.util.Optional;

public interface IngredientRepository{
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
