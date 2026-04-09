import domain.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product product = new Product();

    product.setName("Celular");
    product.setSku("NMOT-G54-128-PRT");
    product.setPrice(new BigDecimal("1000"));
    product.setPrice(new BigDecimal("999"));

    product.setName("Tablet");
    product.setSku("SAM-TAB-S9-11-256GB-P");
    product.setPrice(new BigDecimal("1500"));
    product.setPrice(new BigDecimal("1499"));

    product.setName("Notebook");
    product.setSku("NOTE-DELL-15-500GB-AZUL");
    product.setPrice(new BigDecimal("2000"));
    product.setPrice(new BigDecimal("1900"));

    System.out.println(product.toString());
}
