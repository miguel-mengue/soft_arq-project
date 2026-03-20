import domain.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product product = new Product();

    product.setName("Celular");
    product.setSku("NMOT-G54-128-PRT");
    product.setPrice(new BigDecimal("1000"));
    product.setPrice(new BigDecimal("999"));

    System.out.println(product.toString());
}
