public class Main {
    public static void main(String[] args) {
        //向Array中添加User
        Array<User> list = new Array<>(5);

        list.addLast(new User("tom","123"));
        list.addLast(new User("jack","456"));


        list.addLast(new User("tom","123"));
        list.addLast(new User("jack","456"));



        list.addLast(new User("tom","123"));

        System.out.println(list.toString());
        list.addLast(new User("jack","456"));

        System.out.println(list.toString());
    }

}
