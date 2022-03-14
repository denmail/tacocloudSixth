package tacos.tacocloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.tacocloud.Ingredient;
import tacos.tacocloud.Ingredient.Type;
import tacos.tacocloud.data.IngredientRepository;

import java.util.HashMap;
import java.util.Map;


@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientR;
    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientR){
        this.ingredientR = ingredientR;
    }

    @Override
    public  Ingredient convert(String id){
        return ingredientR.findById(id).orElse(null);
    }
}
