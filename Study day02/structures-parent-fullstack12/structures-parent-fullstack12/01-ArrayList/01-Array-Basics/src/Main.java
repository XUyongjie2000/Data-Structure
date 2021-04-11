/**
 * 使用顺序结构实现线性表
 * 顺序结构的底层是：数组
 */
public class Main {

    public static void main(String[] args) {
        //1 数组创建方式
        //方式一
        int[] arr1 = new int[10];
        //方式二
        int[] arr2 = new int[]{1,2,3};
        //方式三
        int[] arr3 = {1,2,3,4,5};

        //2 数组遍历方式
        // 基本的遍历
//        for (int i=0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }

        //增强for循环
        for(int num:arr1){
            System.out.println(num);
        }

        //3 获取index索引处的值
//        System.out.println(arr1[-1]);

        //4 删除index索引处的值
        //删除index=1的位置的值
        for(int i=1;i<arr1.length;i++){
            arr1[i]=arr1[i+1];
        }


    }

}
