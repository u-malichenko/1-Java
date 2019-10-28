package malichenko.basicJava.lession5;

public class MainClass5 {
    public static void main(String[] args) {

//6. Создать массив котов и одну тарелку с едой,
        Bowl bowl1 = new Bowl("bowl1",10,11);

        NewCat[] arrayOfNewCat = new NewCat[5];

        arrayOfNewCat[0] = new NewCat("Barsik",1);
        arrayOfNewCat[1] = new NewCat("Ася", 5);
        arrayOfNewCat[2] = new NewCat("Васька!", 3);
        arrayOfNewCat[3] = new NewCat("Марсель", 14);
        arrayOfNewCat[4] = new NewCat("София", 3);

//        for (int i = 0; i < arrayOfNewCat.length; i++) {
//            arrayOfNewCat[i] = new NewCat(("# "+i), i);
//        }


//6. попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль;
        for(NewCat newCat : arrayOfNewCat){
            newCat.eat(bowl1);
            System.out.println();
        }
    }
}

/**1. Класс кота из прошлого ДЗ расширить функционалом потребления пищи.
//          У каждого кота есть аппетит, т.е. количество еды, которое он съедает за один раз;

//2. Кот должен есть из миски.
//          Создайте такую сущность, которая будет обладать
//                 объёмом и
//                 едой в ней, а также
//                 методами наполнения и
//                 получения информации о количестве еды;

//3. Метод из первого пункта ДЗ должен взаимодействовать с миской, т.е.,
//          конкретный кот ест из конкретной миски,
//              уменьшая объём еды в ней;

//4. Предусмотрите проверку, при которой
//          в миске не может получиться отрицательного количества еды
//          (например, в миске 10 единиц еды, а кот пытается съесть 15);

//5. Каждому коту нужно добавить поле
//          сытость
//              (когда создаем котов, они голодны).
//          Если коту удалось поесть (хватило еды),
//              сытость = true;
//    Считаем, что если коту мало еды в тарелке,
//          то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы);

//6. Создать массив котов и
//          одну тарелку с едой,
//          попросить всех котов покушать из этой тарелки и потом
//          вывести информацию о сытости котов в консоль;
//7. Когда еда в тарелке кончается, нужно
//          оповещать об этом и
//          наполнять её едой.
 */
