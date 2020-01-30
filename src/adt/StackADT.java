/*
 * Created by IntelliJ IDEA.
 * User: Kanishk
 * Date: 22/01/20
 * Time: 10:31 PM
 */
package adt;

public interface StackADT<E> {
    boolean isEmpty();

    E peek();

    E pop();

    void push(E data);
}