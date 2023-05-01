*****Assignment 3*****

****MyLinkedListStack****


The stack supports the following operations:

`push method`: adds an element to the top of the stack.

`pop method`: removes and returns the element at the top of the stack. If the stack is empty, an EmptyStackException is thrown.

`peek method`: returns the element at the top of the stack without removing it. If the stack is empty, an EmptyStackException is thrown.

`isEmpty method`: returns true if the stack is empty, false otherwise.

`size method`: returns the number of elements in the stack.

**The stack is implemented using a LinkedList object called arr, which is a member variable of the MyLinkedListStack class.**   



*****MyLinkedListQueue*****

The queue supports the following operations:

`enqueue method`: adds an element to the end of the queue.

`dequeue method`: removes and returns the element at the front of the queue. If the queue is empty, a NoSuchElementException is thrown.

`peek method`: returns the element at the front of the queue without removing it. If the queue is empty, a NoSuchElementException is thrown.

`isEmpty method`: returns true if the queue is empty, false otherwise.

`size method`: returns the number of elements in the queue.


**The queue is implemented using a LinkedList object called arr, which is a member variable of the MyLinkedListQueue class.**


*****MyArrayListStack*****

The `push` method adds an element to the top of the stack using the add method of ArrayList.

The `pop method` removes and returns the top element of the stack using the remove method of ArrayList. We have also checked if the stack is empty, and if so, thrown an EmptyStackException.

The `peek method` returns the top element of the stack without removing it using the get method of ArrayList. We have also checked if the stack is empty, and if so, thrown an EmptyStackException.

The `isEmpty` method returns true if the stack is empty or false if it is not using the isEmpty method of ArrayList.

The `size` method returns the number of elements in the stack using the size method of ArrayList.


*****MyArrayListQueue*****
`Constructor`: Initializes the instance variable list to a new ArrayList.

`enqueue`: Adds the specified element to the end of the list using the add method of ArrayList.

`dequeue`: Removes and returns the first element of the list using the remove method of ArrayList with the index 0. Throws a NoSuchElementException if the list is empty.

`peek`: Returns the first element of the list using the get method of ArrayList with the index 0. Throws a NoSuchElementException if the list is empty.

`isEmpty`: Returns true if the list is empty or false otherwise, using the isEmpty method of ArrayList.

`size`: Returns the number of elements in the list using the size method of ArrayList.


