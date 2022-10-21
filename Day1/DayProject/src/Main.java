public class Main {
    public static void main(String[] args) {
        System.out.println("-1----------------------");
        System.out.println("Метод возвращающий название месяца по его номеру");
        int arrMont[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i = 0;i<arrMont.length;i++){
            System.out.println("["+ arrMont[i] + "] - " + returnNameMontag(arrMont[i]));
        }
        System.out.println("-2----------------------");
        System.out.println("Метод поиска заданного значения в массиве");
        int arrElement[] = {10,20,30,40,50,60,70,80,90,100,110,120};
        System.out.println("67 =>" + linSearch(arrElement, 67));
        System.out.println("40 =>" + linSearch(arrElement, 40));
        System.out.println("-3----------------------");
        System.out.println("Метод возвращающий «перевернутую» строку");
        System.out.println("HELLO => " +reverseString("HELLO"));
        System.out.println("-4----------------------");
        System.out.println("Метод перевода числа из DEC в HEX");
        System.out.println("Long.toHexString(11978)= " + Long.toHexString(11978));
        System.out.println("decimal2hex(11978)= " + decimal2hex(11978));
        System.out.println("-5----------------------");
        System.out.println("Метод сортировки массива «пузырьком»");
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        int[] sortArrRes = bubbleSort(sortArr);
        for(int i = 0; i < sortArrRes.length; i++){
            System.out.println(sortArr[i] + " >=< " + sortArrRes[i]);
        }
        System.out.println("-END--------------------");

    }

    public static String returnNameMontag(int montagNum) {
        String monName = new String();
        switch (montagNum) {
            case 1: monName = "Январь";
                break;
            case 2: monName = "Февраль";
                break;
            case 3: monName = "Март";
                break;
            case 4: monName = "Апрель";
                break;
            case 5: monName = "Май";
                break;
            case 6: monName = "Июнь";
                break;
            case 7: monName = "Июль";
                break;
            case 8: monName = "Август";
                break;
            case 9: monName = "Сентябрь";
                break;
            case 10: monName = "Октябрь";
                break;
            case 11: monName = "Ноябрь";
                break;
            case 12: monName = "Декабрь";
                break;
            default: monName = "Не месяц";
                break;
        }
        return  monName;
    }

    public static int linSearch(int arr[], int elementToSearch) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch)
                return i;
        }
        return -1;
    }

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static String decimal2hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d <= 0) return "0";
        int base = 16;
        String hex = "";
        while (d > 0) {
            int digit = d % base;
            hex = digits.charAt(digit) + hex;
            d = d / base;
        }
        return hex;
    }

    public static int[] bubbleSort(int[] sortA){
        int[] sortArrRes = sortA.clone();
        System.arraycopy(sortA, 0, sortArrRes, 0, sortA.length);
        for (int i = 0; i < sortArrRes.length - 1; i++) {
            for(int j = 0; j < sortArrRes.length - i - 1; j++) {
                if(sortArrRes[j + 1] < sortArrRes[j]) {
                    int swap = sortArrRes[j];
                    sortArrRes[j] = sortArrRes[j + 1];
                    sortArrRes[j + 1] = swap;
                }
            }
        }
        return sortArrRes;
    }
}