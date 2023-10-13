package Product;

import Product.DiagramProduct;

/**
 * 工厂方法自己抽象工厂，抽象方法
 */
public class LineDiagram extends DiagramProduct {


    @Override
    public void createProduct() {
        System.out.println("success create a LineDiaGram");
    }
}
