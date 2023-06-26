public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) { // O(1) - время работы метода
        this.nums = nums;
    }

    public int sumRange(int left, int right) { // O(N)
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += nums[i]; // 5 + 0 = 5 , 5 + (-1) = 4 , 4 + 7 = 11
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, -1, 7, 19, 25};
        NumArray numArray = new NumArray(nums); // O(1)
        System.out.println(numArray.sumRange(1, 3));
        System.out.println(numArray.sumRange(2, 3));
        System.out.println(numArray.sumRange(0, 3));
        System.out.println(numArray.sumRange(2, 4));
        // O(1) + O(K * N) -> O(K * N)
        // частота процесса сколько гигогерц герц - сколько раз за секунду меняется картинка 1/сек 1 000 000 000 герц
        // 100 000 * 100 000 = 10 000 000 000
        // ожидаем что будет 11
    }

    // Относитльено какого параметра вычисляется сложность
    // от длины массива будет зависесть дольше
    // длина массива N, сколько раз мы вызываем метод K


}
