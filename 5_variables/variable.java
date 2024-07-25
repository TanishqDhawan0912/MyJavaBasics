class variable {
    public static void main(String []args) {
        int a = 20;
        int b = a++ % --a *a;
        int c = --b + b--;
        int x = a+b+c%2;
        System.out.println(x);
    }
}