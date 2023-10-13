package Factory;

import Product.ColumnDiagram;
import Product.DiagramProduct;
import Product.LineDiagram;

public class LineDiagramFactory implements DiagramFactory{
    @Override
    public DiagramProduct createProduce() {
        return new LineDiagram();
    }
}