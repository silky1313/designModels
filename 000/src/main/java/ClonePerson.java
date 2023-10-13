class OverloadingTypePromotion2 {
    void sum(long a, int b) {
        System.out.println("long int");
    }

    void sum(int a, long b) {
        System.out.println("int long");
    }

    public static void main(String args[]) {
        OverloadingTypePromotion2 obj = new OverloadingTypePromotion2();
        obj.sum(20, 20);
    }
}
