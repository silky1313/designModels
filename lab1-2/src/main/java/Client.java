import Factory.ColumnDiagramFactory;
import Factory.DiagramFactory;
import Factory.LineDiagramFactory;
import Product.DiagramProduct;

public class Client {

    public static void main(String[] args) {
        DiagramFactory diagramFactory = new LineDiagramFactory();

        DiagramProduct diagramProduct = diagramFactory.createProduce();
        diagramProduct.createProduct();
    }
}
