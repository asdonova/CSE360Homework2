/**
 * @author Ricardo Valdovinos
 * Class ID: placeholder
 * Assignment #: 1
 *
 * <p>
 * This file consists of a class named OrderedIntList within the package cse360assign1.
 *
 * This class acts as a basic list of sorted numbers in ascending order. Two methods are provided, insert and print.
 * insert will insert a value in to the array while shifting elements to ensure that it stays in order. Any values
 * added after the array has been filled will lead to the highest value being overwritten. The print method prints the
 * array at five values per line, tab separated.
 * </p>
 *
 * */
package cse360assign1;

/**
 * <p>
 * The class contains two instance
 * variables: array and counter. Three methods are present, the constructor, an insert method and a print method.
 * A basic overview of these methods is as follows:
 * </p>
 * <ul>
 * <li>The constructor is called when initializing an object.</li>
 * <li>The insert method inserts a value into the array by placing the value in the correct position and moving the
 * other elements over.</li>
 * <li>The print method simply prints the array with five values per row.</li>
 * </ul>
 * <p>
 * A more detailed of the class is given below.
 * </p>
 *
 * @author Ricardo Valdovinos
 */
public class OrderedIntList {
    private int[] array;
    private int counter;

    /**
     * <p>
     * The constructor for the class. This initializes the array with a size of 10.
     * </p>
     */
    OrderedIntList() {
        array = new int[10];
    }

    /**
     * <p>
     * inserts a value into the array at a certain position which is determined when it encounters a value in the array
     * that is greater than itself. If the value to be inserted is less than all values in the array then it will be
     * inserted at the first index of the array. If there are elements in the array that already occupy the insert
     * position of the value then the array will move all elements at and after the insert position by one index. If the
     * array is full and a value is inserted than the last element in the array will be dropped off and the new value
     * will be inserted as described above. Duplicates are not inserted.
     * </p>
     *
     * @param value an integer value to be inserted into the OrderedIntList
     * */
    public void insert(int value) {
        int insertPosition = 0;
        boolean isDuplicate = false;

        // iterates until it finds a number that is greater than value.
        // it does so in order to maintain ascending order.
        if (counter > 0) {
            for (int index = 0; index < counter; index++) {
                if (value == array[index]) { // checks for duplicates
                    isDuplicate = true;
                }

                if (value > array[index]) {
                    insertPosition++;
                }
            }

            // if there is a duplicate return from the method
            if (isDuplicate) {
                return;
            }

            // This for loop all elements to make room for the new element to be inserted
            for (int index = counter - 1; index >= insertPosition; index--) {
                if (index + 1 < array.length) {
                    array[index + 1] = array[index];
                }
            }
        }

        // places value in correct position
        if (insertPosition >= array.length) {
            array[insertPosition - 1] = value;
        } else {
            array[insertPosition] = value;
        }

        // increment counter of inserted elements every time there is an insertion unless the array is full
        if (counter < array.length) {
            counter += 1;
        } else {
            counter = array.length;
        }
    }

    /**
     * <p>
     * This method prints values from the array depending on how many have values have already been inserted into the
     * array. The method makes sure to print only five values per row each separated by a tab. <br><br>
     *
     * For example:<br>
     * </p>
     *
     * <ul>
     *     <li>5    7    8    9    6</li>
     *     <li>4    2</li>
     * </ul>
     *
     * */
    public void print() {
        for (int index = 1; index <= counter; index++) {
            System.out.print(array[index - 1] + "\t");

            if (index % 5 == 0) {
                System.out.println();
            }
        }
    }
}