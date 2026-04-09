//需求：写一个工具类，计算数组平均值
public class ArrayUtil {
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 计算数组中元素的总和
    public static double average(int[] arr) {
        try {
            if (arr == null || arr.length == 0) {
            return 0;
        }
        return (double) sum(arr) / arr.length;
    }
    // 遍历数组的所有元素，将每个元素输出到控制台
    public static void printArray(int[] arr) {
        // 如果数组为null，直接返回，不进行打印
        if (arr == null) {
            return;
        }
        // 使用for循环遍历数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 打印当前索引对应的数组元素，后跟一个空格
            System.out.print(arr[i] + " ");
        }
        // 输出换行符，让数组全部元素打印后换行
        System.out.println();
    }


    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
