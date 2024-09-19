import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.AlreadyExistsException;
import ru.netology.NotFoundException;
import ru.netology.Product;
import ru.netology.ShopRepository;

public class ShopRepositoryTest {

    @Test
    public void shouldRemoveProductIfExists() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Продукт 1", 100);
        Product product2 = new Product(2, "Продукт 2", 200);
        repo.add(product1);
        repo.add(product2);

        repo.remove(1);

        Product[] expected = { product2 };
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionIfNotFound() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Продукт 1", 100);
        Product product2 = new Product(2, "Продукт 2", 200);
        repo.add(product1);
        repo.add(product2);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(3);
        });
    }


        @Test
        public void shouldAddProductSuccessfully() {
            ShopRepository repo = new ShopRepository();
            Product product1 = new Product(1, "Продукт 1", 100);

            repo.add(product1);

            Product[] expected = {product1};
            Product[] actual = repo.findAll();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldThrowAlreadyExistsException() {
            ShopRepository repo = new ShopRepository();
            Product product1 = new Product(1, "Продукт 1", 100);
            Product product2 = new Product(1, "Продукт 2", 200);
            repo.add(product1);

            Assertions.assertThrows(AlreadyExistsException.class, () -> {
                repo.add(product2);
            });
        }
    }

