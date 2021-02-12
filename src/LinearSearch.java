public class LinearSearch {
    private LinearSearch() {
    };

    public static <E> int search(E[] date, E target) { //使用泛型
        for (int i = 0; i < date.length; i++)
            if (date[i].equals(target))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] dataSize = {1000000, 10000000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(100000);
            //LinearSearch ls = new LinearSearch();
            //int n = 1000000000;
            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++)
                LinearSearch.search(data, n);
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs ：" + time + " s");
        }
      /*  int res2 = LinearSearch.search(data, 888);
        System.out.println(res2);
        Student[] students = {new Student("aabbb"), new Student("bobo"), new Student("CCC")};
        Student BOBO = new Student("bobo");
        int res3 = LinearSearch.search(students, BOBO);
        System.out.println(res3);*/
    }
}
