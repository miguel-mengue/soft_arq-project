import adapter.DatabaseStorage;
import domain.EntityInterface;
import domain.Product;
import service.ProductService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product product = new Product();
    DatabaseStorage database = new DatabaseStorage();
    ProductService productService = new ProductService();

    //usem essa database virtual para fazer todas operacoes, adicionar, listar, remover, buscar apenas 1

    // Produto 1
    Product p1 = new Product();
    p1.setName("Celular");
    p1.setSku("NMOT-G54-128-PRT");
    p1.setPrice(new BigDecimal("999"));
    p1.setPrice(new BigDecimal("1000"));
    database.save(p1);

    // Produto 2
    Product p2 = new Product();
    p2.setName("Tablet");
    p2.setSku("SAM-TAB-S9-11-256GB-P");
    p2.setPrice(new BigDecimal("1499"));
    p2.setPrice(new BigDecimal("1500"));
    database.save(p2);

    // Produto 3
    Product p3 = new Product();
    p3.setName("Notebook");
    p3.setSku("NOTE-DELL-15-500GB-AZUL");
    p3.setPrice(new BigDecimal("1900"));
    p3.setPrice(new BigDecimal("2000"));
    database.save(p3);

    ArrayList<EntityInterface> registros = database.listAll();

    for (int i = 0; i < registros.size(); i++) {
        System.out.println(registros.get(i));
    }

    productService.create(new Product(productService.generateUUID(), "SKU", "Asas", new BigDecimal(2)));

    product.listAll();

    System.out.println(product.toString());
}
