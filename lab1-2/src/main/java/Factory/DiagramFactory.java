package Factory;

import Product.DiagramProduct;

public interface DiagramFactory {
    //生成图形接口
    DiagramProduct createProduce();

}
