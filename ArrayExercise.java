package Array;

public class ArrayExercise {
    private int[] items;
    private int count;

    public ArrayExercise(int length){
        items = new int[length];
    }

    public void insert(int item){
        resizeIfRequired();

        //Add the new item at the end
        items[count++] =  item;
    }

    public void removeAt(int index){
        //Validate the index
        if(index < 0 || index >= count){
            //count represents the no. ele that present in the array currently.
            throw new IllegalArgumentException();
        }
        //Shift the items to the left to fill the hole
            for (int i = index; i < count; i++) {
                try {
                    items[i] = items[i + 1];
                }
                catch (ArrayIndexOutOfBoundsException e){
                    continue;
                } //add try catch to avoid Error on length 3,6 etc.. bcz at that time items[i] == items[i+1] will give ArrayIndexOutofBound error
            }
        count--; //to decreament the no of ele by 1 bcz we removed 1 item.
    }

//method for searching an element
    public int indexOf(int item){
        //Runtime Complexity => Best Case: O(1)   Worst Case: O(n)
        for(int i=0;i<count;i++){
            if(items[i] == item)
                return i;
        }

        return -1;
    }

    public int max(){
        int max=items[0];
        for (int i=1;i<count;i++){
            if(items[i]>max)
                max=items[i];
        }
       return max;
    }

    public void print(){
        for (int i=0;i<count;i++){
            System.out.print(items[i] + " ");
        }

    }

    public ArrayExercise intersection(ArrayExercise other){
        var intersection = new ArrayExercise(count);
        for(int item:items){
            if(other.indexOf(item)>=0){
                intersection.insert(item);
            }
        }
        return intersection;
    }

    public void reverse(){
        ArrayExercise reveredarray  = new ArrayExercise(count);
//        System.out.println("Count is : "+ count);
        for (int i=count-1;i>=0;i--){
            reveredarray.insert(items[i]);
        }
        reveredarray.print();
    }

    public void insertAt(int item,int index){
        if(index<0 || index>count){
            System.out.println("Please Enter Valid Index");
            System.exit(0);
        }
        resizeIfRequired();

        for (int i=count-1;i>=index;i--){
            items[i + 1] = items[i];
        }
//        System.out.println(items.length);
        items[index]=item;
        count++;
    }

    public void resizeIfRequired(){
        //If the array is full then resize it.
        if(items.length == count){
            //Create the new array(Twice the size)
            int[] newItems = new int[count * 2];
            //Copy all the existing items
            for (int i =0; i < count;i++)
                newItems[i] = items[i];
            //set "items" to this new array
            items = newItems;
          //System.out.println("Length is : " + items.length);
        }
    }
}


