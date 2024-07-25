class typeconversion {
    public static void main(String[] args) {
        
        byte c = 50;
        int d = c;
        System.out.println(d); // byte to int type conversion


        int a = 357;
        byte b = 20;
        b = (byte) a; // int to byte type conversion
        System.out.println(b);

        int x;
        float f = 10.5f;
        x = (int) f; // float to int type conversion
        System.out.println(x);

        int y = 100;
        float z = y; // int to float type conversion
        System.out.println(z);

        byte e = 10;
        byte g = 20;
        int h = e * g; // byte to int type promotion
        System.out.println(h);
    }
}