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



    //向数组中新增元素
    //向index为2的位置新增元素e
    public void add(int index,int e){
        //0 极端情况：数组满了，能添加吗？
        if(size == data.length)
            //扩容
            throw  new RuntimeException("数组已满，请扩容");

        // index<0   || index > size
        if(index<0 || index > size)
            throw new RuntimeException("索引非法");

        //数组为空，index=0，size=0

        //1 挪：从size-1的位置挪到index位置
        for(int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        //2 赋值
        data[index] = e;
        //3 维护size
        size++;
    }

    //专门在数组的头部添加：头插法
    public  void addFirst(int e){
        add(0,e);
    }


    //专门在数组的尾部添加：尾插法
    public void addLast(int e){
        add(size,e);
    }

    //查找：给定索引，返回索引处的值
    public int get(int index){
        //index一定要在0  到  size-1的返回以内
        if (index<0||index>=size){
            throw new RuntimeException("索引非法");
        }
        //只要index合法，直接取值data[index]
        return data[index];
    }

    //查找：给定值，返回元素的索引index
    //找到返回index，找不到，返回-1   indexOf
    public int find(int e){
        //遍历-比较
        for (int i=0;i<size;i++){
            if(data[i]==e){
                return i;
            }
        }
        return -1;
    }



    //修改：给索引，给新值，修改位置的值
    public void set(int index,int e){
        //index一定要在0  到  size-1的返回以内
        if (index<0||index>=size){
            throw new RuntimeException("索引非法");
        }
        data[index] = e;

    }





    //控制打印数组[10,20,30,0,0,0,0,0,0]
    public String toString() {
        String str = "[";
        for (int i=0;i<data.length;i++){
            str += data[i];
            if (i!=data.length-1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
