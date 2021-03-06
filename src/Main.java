import java.util.Arrays;

public class Main {



    public static void main(String[] args){

        taskOne();
        taskTwo();
        taskThree();
    }

    private static void taskThree() {
        System.out.println("---------------------------------------");
        System.out.println("taskThree");
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();
        boxInfo("Коробка с яблоками весит: ", boxWithApple.getWeight());
        boxInfo("Коробка с апельсинами весит: ", boxWithOranges.getWeight());
        compare(boxWithApple, boxWithOranges);
        System.out.println("Добавим еще одно яблоко в коробку.");
        boxWithApple.addFruit(new Apple());
        boxInfo("Коробка с яблоками весит: ", boxWithApple.getWeight());
        boxInfo("Коробка с апельсинами весит: ", boxWithOranges.getWeight());
        compare(boxWithApple, boxWithOranges);

        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox());
        System.out.println(anotherBoxWithOranges.getBox());
    }

    private static void compare(Box<Apple> boxWithApple, Box<Orange> boxWithOranges) {
        System.out.println("Вес коробок одинаковый -  " + boxWithApple.compare(boxWithOranges));
    }

    private static void boxInfo(String s, float weight) {
        System.out.println(s + weight);
    }


    private static void taskTwo() {
        System.out.println("---------------------------------------");
        System.out.println("taskTwo");
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"one", "two","three","four","five"};
        arrayToArrayList(intArr);
        arrayToArrayList(strArr);
        info(Arrays.toString(intArr));
        info(Arrays.toString(strArr));
    }

    private static void info(String s) {
        System.out.println(s);
    }


    private static void taskOne() {
        System.out.println("---------------------------------------");
        System.out.println("taskOne");
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"one", "two","three","four","five"};
        try {
            exchangeObjects(intArr, 0, 2);
            exchangeObjects(strArr, 0, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        info("Swap result in integer array: " + Arrays.toString(intArr));
        info("Swap result in string array: " + Arrays.toString(strArr));
    }


    private static void exchangeObjects(Object[] arr, int replaceIndex1, int replaceIndex2) throws Exception {
        if (replaceIndex1 < 0 || replaceIndex1 > arr.length ||
                replaceIndex2 < 0 || replaceIndex2 > arr.length || replaceIndex1 == replaceIndex2) {
           throw new Exception("Неправильно указаны позиции элементов для замены");
        }
        Object temp = arr[replaceIndex1];
        arr[replaceIndex1] = arr[replaceIndex2];
        arr[replaceIndex2] = temp;
    }

    private static <T> void arrayToArrayList(T[] arr){
    }


}
