package Array;

public class ArrayExerciseMain {
    public static void main(String[] args) {

        ArrayExercise array1 = new ArrayExercise(3);
        ArrayExercise array2 = new ArrayExercise(3);
        ArrayExercise numbers = new ArrayExercise(6);


        //insert()
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);

        array1.insert(50);
        array1.insert(-20);
        array1.insert(-70);

        //removeAt()
        numbers.removeAt(2);
        System.out.println("After Insert & RemoveAt: ");
        numbers.print();

        //indexOf()
        System.out.println();
        System.out.println("Index: " + numbers.indexOf(40));

        //max()
        System.out.println("Max ele is: "+ numbers.max());

        //intersection()
        array2 = numbers.intersection(array1);
        System.out.println("Intersection Array: ");
        array2.print();

        //reverse()
        System.out.println();
        System.out.println("Reverse: ");
        numbers.reverse();

        //insertAt(index,item)
        numbers.insertAt(100,3);
        System.out.println();
        System.out.println("After InsertAt: ");
        numbers.print();

    }
}
