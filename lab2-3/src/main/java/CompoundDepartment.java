import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompoundDepartment implements BaseDepartment {
    private ArrayList<BaseDepartment> department;

    public CompoundDepartment() {
        department = new ArrayList<>();
    }

    public CompoundDepartment(BaseDepartment... childrens) {
        department = new ArrayList<>();
        add(childrens);
    }

    @Override
    public void send(int tabs) {
        for(int i = 0; i < tabs; i++){
            System.out.print("\t");
        }
        System.out.println("CompoundDepartment");
        for (BaseDepartment baseDepartment : department) {
            baseDepartment.send(tabs + 1);
        }
    }

    @Override
    public void add(BaseDepartment... childrens) {
        department.addAll(List.of(childrens));
    }

    @Override
    public void add(BaseDepartment children) {
        department.add(children);
    }

    @Override
    public void add(int index, BaseDepartment children) {
        department.get(index).add(children);
    }
    public boolean addRandom(BaseDepartment children){
        Random random = new Random();
        boolean nowAdd = random.nextBoolean();

        //TODO:nowAdd == true就add到当前结点，否则继续搜索子节点
        if(nowAdd){
            this.department.add(children);
            return true;
        }
        boolean success = false;

        //TODO:sonAdd == true就add到son结点，否则继续搜索
        for(BaseDepartment loop : department){
            if(loop instanceof CompoundDepartment addClass){
                boolean sonAdd = random.nextBoolean();
                if(sonAdd){
                    success = loop.addRandom(children);
                    if(success) break;
                }
                else{
                    success = loop.addRandom(children);
                    if(success) break;
                }
            }
        }
        if(!success){
            this.department.add(children);
        }
        return true;
    }
    @Override
    public boolean get(int index) {
        if (index >= department.size() || index < 0) {
            return false;
        }
        return department.get(index) instanceof CompoundDepartment;
    }
}
