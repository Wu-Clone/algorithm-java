package template;

public class binarySearchTemplate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,6,6,6,8};
        int num1 = binarySearch1(nums, 0);
        int num2 = binarySearch2(nums, 0);
        int num3 = binarySearch3(nums, 0);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

// 主要还是找到数据
    public static int binarySearch1(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    // 找到左侧插入位置
    public static int binarySearch2(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= target) {
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    public static int binarySearch3(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return l;
    }
}
