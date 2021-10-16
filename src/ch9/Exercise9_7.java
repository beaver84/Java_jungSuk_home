package ch9;


class Exercise9_7 {
    public static void main(String[] args) {



        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }

    private static boolean contains(String src, String target) {

        return src.indexOf(target) != -1;
    }
}