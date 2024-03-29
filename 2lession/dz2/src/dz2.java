import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
//1
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0");
        int[] arr1 = new int[10];         //инициируем массив
        Util.getArr(2, arr1); // заполняем массив рандомными числами первый параметр интервал рандомных чисел, туто от 0-1
        Util.printArr(arr1,"- исходный массив.");        //печатаем первый массив с рандомными числами
        arrChange(arr1);        //меняем значения в массиве
        Util.printArr(arr1, "- измененный массив.");        //печатаем измененный массив:
        System.out.println("========== конец 1го задания ==========");
        System.out.println();
//2
        System.out.println("2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21");
        int[] arr2 = new int[8];         //инициируем массив
        getArr2(arr2); // заполняем массив значениями 0 3 6 9 12 15 18 21
        Util.printArr(arr2,"- с помощью цикла созданн массив для второго адания");        //печатаем массива
        System.out.println("========== конец 2го задания ==========");
        System.out.println();
//3
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по нему циклом, и числа, меньшие 6, умножить на 2");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };         //инициируем и заполняем массив значениями 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        Util.printArr(arr3,"- исходный массив.");        //печатаем исходный массив
        arrChange3(arr3);        //меняем значения в массиве
        Util.printArr(arr3,"- новый массив с увеличенными значениями");        //печатаем новый массив
        System.out.println("========== конец 3го задания ==========");
        System.out.println();
//4
        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами");
        int x = 5; //задаем размер массива
        int[][] arr4 = new int[x][x];         //инициируем массив
        arrChange4(arr4);        //меняем значения в массиве
        Util.printArr(arr4);        //печатаем квадрптный массив
        System.out.println("========== конец 4го задания ==========");
        System.out.println();
//5
        System.out.println("5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)");
        int[] arr5 = new int[10];         //инициируем массив
        Util.getArr(100, arr5); // заполняем массив рандомными числами первый параметр интервал рандомных чисел, туто от 0-100
        Util.printArr(arr5,"- исходный массив.");        //печатаем исходный массив
        arrGetMaxMin5(arr5);        //метод для поиска в массиве max и min
        System.out.println("========== конец 5го задания ==========");
        System.out.println();
//6
        System.out.println("6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;");
    //int[] arr6 = new int[10];         //инициируем массив
    //getArr(10, arr6); // заполняем массив рандомными числами первый параметр интервал рандомных чисел, туто от 0-100
    //далее следует упрощенный вариант, массив введен руками, для безпристрастности, можно нижнюю строку закоментить, а верхние две разкоментить.
        int[] arr6 = {1,1,2,4,0,0,0,8,0,0}; //инициируем массив заполняя ее в ручном режиме
        Util.printArr(arr6,"- исходный массив.");        //печатаем исходный массив
        System.out.println("суммы частей массива = в точке: "+ ((arrSum6(arr6) > 0) ? ((arrSum6(arr6) +1)) : " не равны("));        //метод для поиска в массиве max и min
        System.out.println("========== конец 6го задания ==========");
        System.out.println();
//7
        System.out.println("7. *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами.\n");
        System.out.println();
        int n = Util.readArg("ВВЕДИТЕ ЧИСЛО n: "); //просим пользователя ввести число n
    // int[] arr7 = new int[10];         //инициируем массив
    // getArr(100, arr7); // заполняем массив рандомными числами первый параметр интервал рандомных чисел, туто от 0-100
    //далее следует упрощенный вариант, массив введен руками, для безпристрастности, можно нижнюю строку закоментить, а верхние две разкоментить.
        int[] arr7 = {1,0,0,0,0,0,0,0,0,0}; // для наглядности простой массив с явно заданным 1 элементом =1
        Util.printArr(arr7,"- исходный массив.");        //печатаем исходный массив
        arrChange7(arr7, n);        //метод для сдвига занчений в массиве на n позиций
        Util.printArr(arr7,"- итоговый массив.");        //печатаем исходный массив
        System.out.println("========== конец 7го задания ==========");
        System.out.println();
    }

//1 задание, метод для замены 0-1 и 1 -0:
    public static void arrChange(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]>0) ? 0:1;
        }
    }

//2е задание, метод для заполнения одномерного массива значениями 0 3 6 9 12 15 18 21:
    public static void getArr2(int[] arr) {
// закоментил 2й вариант
//        for(int i = 0, j = 0; i < arr.length; i++, j += 3) {
//            arr[i] = j;
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*3;
        }
    }

//3 задание, метод для умножения  чисел < 6 в массиве:
    public static void arrChange3(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? (arr[i]*2) : arr[i];
        }
    }

//4е задание, метод для заполения 1ми диагоналей квадратного массива:
    public static void arrChange4(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-i-1] = 1;
// закоментил более простой вариант
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j || ((arr.length-1) == (i + j)))
//                    arr[i][j] = 1;
//            }
        }
    }

//5е задание, метод для поиска макс. и мин. элемента:
    public static void arrGetMaxMin5(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i = arr.length-1; i > 0; i--) {
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
// второе решение при помощи if:
//            if(arr[i] >= max){
//                max = arr[i];
//            }else if(arr[i]<min){
//                min = arr[i];
//            }
        }
        System.out.println("Максимальное число в массиве  = " + max + ", минимальное = " + min);
    }

//6е задание, метод для поиска одинаковых сумм интервалов в массиве:
    public static int arrSum6(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) { //считаем сумму первого интервала
                sum1 += arr[j];
            }
            for (int k = i+1; k < arr.length; k++) { //считаем сумму второго интервала
                if(sum1 < arr[i+1] || sum1 < sum2) break; //проверка а вдруг вторая сумма уже больше первой? тогда выходим в главный цикл
                sum2 += arr[k];
            }
            if(sum1 == sum2) return i; //проверка равенкста двух интервалов
        }
        return -1;
    }

//7 задание, метод для сдвига значений в массиве:
    public static void arrChange7(int arr[], int n){
        if (n==0) return; //если n = 0 то ни чего не двигаем
        else if(n>0) { // если n положительное то двигаем масссив вправо
            for (int j = n; j>0 ; j--) { // цикл для итераций = числу n
                for (int i = arr.length-1; i > 0; i--) { //цикл для перебора всех элементов массива
                    int x = arr[i]; // буфер для хранения перемещаемой переменной
                    arr[i] = arr[i-1];
                    arr[i-1] = x;
                }
                Util.printArr(arr,"- массив на шаге "+ j); //строку можно закоментить чтоб не смотреть шаги перемещения элементов
            }
        } else if(n<0) { // если n отрицательное то двигаем масссив влево
            for (int j = n; j<0 ; j++) { // цикл для итераций = числу n
                for (int i = 0; i < arr.length-1; i++) { //цикл для перебора всех элементов массива
                    int x = arr[i]; // буфер для хранения перемещаемой переменной
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
                Util.printArr(arr,"- массив на шаге "+ j); //строку можно закоментить чтоб не смотреть шаги перемещения элементов
            }
        }
    }
}
