import praktikum.Bun;
import praktikum.Burger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {
    @Test
    public void getPriceTest() {
        Ingredient ketchup = new Ingredient(IngredientType.SAUCE, "Кенчуп", 99.99F);

        float expected = 99.99F;
        float actual = ketchup.getPrice();

        assertEquals(expected, actual, 0.0F);
    }

    @Test
    public void getNameTest() {
        Ingredient ketchup = new Ingredient(IngredientType.SAUCE, "Кенчуп", 99.99F);

        String expected = "Кенчуп";
        String actual = ketchup.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        Ingredient ketchup = new Ingredient(IngredientType.SAUCE, "Кенчуп", 99.99F);

        IngredientType expected = IngredientType.SAUCE;
        IngredientType actual = ketchup.getType();

        assertEquals(expected, actual);
    }
}