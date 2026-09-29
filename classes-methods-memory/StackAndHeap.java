/*
 * ============================================================================
 * MEMORY MANAGEMENT IN JVM: STACK vs. HEAP
 * ============================================================================
 * 
 * 1. STACK MEMORY (LIFO Execution):
 *    - Each thread & method call gets its own stack frame.
 *    - Stores primitive local variables and object reference addresses.
 *    - Automatically cleared when method execution finishes.
 * 
 * 2. HEAP MEMORY (Object Storage):
 *    - Shared memory space storing all class instances (objects) and instance variables.
 *    - Reference variables in the Stack hold the memory address (e.g., 0x101) of Heap objects.
 *    - Methods execute on the Stack, but act upon state data stored in the Heap.
 * 
 * ----------------------------------------------------------------------------
 * MEMORY MAP AT RUNTIME: int r1 = calci.add(3, 4);
 * ----------------------------------------------------------------------------
 * 
 *       [ STACK MEMORY ]                            [ HEAP MEMORY ]
 * 
 *   +-----------------------+                    . - - - - - - - - - .
 *   | add() Stack Frame     |                . '                     ' .
 *   |-----------------------|              /                             \
 *   | n2   | 4              |             /    Calculator Object [0x101]   \
 *   | n1   | 3              |            |   +-----------------------+      |
 *   +-----------------------+            |   | num (instance var)    | 5    |
 *               |                        |   +-----------------------+      |
 *               v                         \                                /
 *   +-----------------------+               \                             /
 *   | main() Stack Frame    |                 ' .                     . '
 *   |-----------------------|                     ' - - - - - - - - - '
 *   | r1    | 7             |                               ^
 *   | calci | 0x101 ----------------------------------------| (Reference Pointer)
 *   | data  | 10            |
 *   +-----------------------+
 * 
 * ============================================================================
 */

class Calculator {
    int num = 5; // Instance variable (Stored in Heap)

    public int add(int n1, int n2) {
        return n1 + n2; // Execution happens in add() Stack Frame
    }
}

public class StackAndHeap {
    public static void main(String[] args) {
        int data = 10; // Local variable (Stored in main Stack Frame)

        Calculator calci = new Calculator(); // 'calci' ref on Stack -> object on Heap
        int r1 = calci.add(3, 4);           // Stack frame created for add()
        
        System.out.println("Result: " + r1);
    }
}