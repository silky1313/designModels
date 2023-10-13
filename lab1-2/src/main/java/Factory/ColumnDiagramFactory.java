package Factory;

import Product.ColumnDiagram;
import Product.DiagramProduct;

public class ColumnDiagramFactory implements DiagramFactory{
    @Override
    public DiagramProduct createProduce() {
        return new ColumnDiagram();
    }
}
