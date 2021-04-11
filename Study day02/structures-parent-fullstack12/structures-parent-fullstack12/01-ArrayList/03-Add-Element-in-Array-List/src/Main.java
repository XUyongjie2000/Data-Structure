public class Main {
    public static void main(String[] args) {
        //new一个Array
        Array array = new Array(10);

        array.add(0,10);//[10,0,0,0,0]
        System.out.println(array.toString());

        array.add(0,1);//[1,10,0,0,0]
        System.out.println(array.toString());

        array.add(0,0);


        array.add(1,25);
        System.out.println(array.toString());

        array.add(2,35);
        System.out.println(array.toString());


//        array.add(0,100);

        /**************/
        //[0,25,35,1,10,0,0,0,0,0]
        array.addFirst(110);//[110,0,25,35,1,10,0,0,0,0]
        System.out.println(array.toString());


        array.addLast(119);//[110,0,25,35,1,10,119,0,0,0]
        System.out.println(array.toString());

    }
}
