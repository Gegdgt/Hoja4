public interface IList<T> {
    /*
    * The insert at start method of Lists.
    * @params T value that will be added.
    */
    void InsertAtStart(T value);

    /*
    * The inser at end method of lists
    @params T value that will be added
    */
    void InsertAtEnd(T value);

    /*
    The insert at any point method of list
    @params T value to be added
    */
    void Insert(T value, int index);

    /*
    Method that deletes an element in any point
    @params int index of the element
    @returns T value of the element
    */
    T Delete(int index);

    /*
    Method that deletes an element at start
    @returns T value of the element
    */
    T DeleteAtStart();

    /*
    Method that deletes an element at the end
    @returns T value of the element
    */
    T DeleteAtEnd();

    /*
    Method that returns an element
    @params int index of the element
    @returns T value of the element
    */
    T Get(int index);

    /*
    Method to check if list is empty
    @returns boolean if is or not empty
    */
    boolean IsEmpty();
    
    /*
    Method that returns the number of elements in the list
    @returns int number of elements
    */
    int Count();
}
