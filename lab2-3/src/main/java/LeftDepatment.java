public class LeftDepatment implements BaseDepartment {
    private String msg;

    public LeftDepatment(String msg) {
        this.msg = msg;
    }

    @Override
    public void send(int tabs) {
        for(int i = 0; i < tabs; i++){
            System.out.print("\t");
        }
        System.out.println("msg is: " + msg);
    }
}
