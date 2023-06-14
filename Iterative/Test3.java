public class Test3 {
    public static void main(String[] args) {
        int[] ids = { 101, 102, 103, 104 };
        String[] enames = new String[4];
        enames[0] = "Rahul";
        enames[1] = "Sonia";
        enames[2] = "Priya";
        for (String ename : enames) {
            System.out.println(ename);
        }
        /*
         * for (int id : ids) {
         * System.out.println(id);
         * }
         */
    }
}
