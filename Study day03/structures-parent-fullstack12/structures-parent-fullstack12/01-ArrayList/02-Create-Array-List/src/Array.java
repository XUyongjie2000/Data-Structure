/**
 * 使用顺序结构实现线性表：
 * 使用数组实现线性表
 * 换种说法：手写ArrayList
 *
 * 本类中需要有哪些属性？有哪些方法？
 * 1 数组：存放元素
 * 2 size：元素的个数：
 *
 * 3 构造方法：空参构造
 *             带参构造
 * 4 容量getCapacity：教室里面可以做100个学生，这100就是容量
 * 5 元素个数getSize()：教室里面实际做了50个学生，这50就是个数
 * 6 判断是否为空：size==0
 *
 */
public class Array {

    //1 数组
    private int[] data;
    //2 元素个数
    private int size;

    public Array(){
        //初始化大小为10的容器
        //this代表当前类的实例，可以访问当前类的方法，this访问当前类的空参构造this();如果是访问带参构造,那就是this(xx,yy,zz)
        this(10);
    }

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    //获取容量
    public int getCapacity(){
        return data.length;
    }

    //获取元素个数
    public int getSize(){
        return size;
    }

    //为空吗?
    public boolean isEmpty(){
        return size == 0;
    }


}
