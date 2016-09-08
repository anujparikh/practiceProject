package src.com.self.projecteuler;

import src.com.self.datastructures.LinkedStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by anujparikh on 9/8/16.
 */
public class General<E> {

    public static Map<Character, Character> mapping = new HashMap<>();

    public static <E> E[] reverseArray(E[] input) {
        Stack<E> arrayStack = new Stack<E>();

        Stream.of(input).forEach(arrayStack::push);
        IntStream.range(0, input.length).forEach(i -> input[i] = arrayStack.pop());

        return input;
    }

    public static Boolean isValidParentheses(String input) {
        final String opening = "({["; // opening delimiters
        final String closing = ")}]"; // respective closing delimiters
        LinkedStack<Character> buffer = new LinkedStack<Character>();
        for (char c : input.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty()) return false;
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) return false;
            }
        }
        return buffer.isEmpty();
    }

    public static void main (String[] args) {
        String abc = "asdf";
        System.out.println(abc.indexOf('a', 2));
        System.out.println(General.isValidParentheses("{{([])}}"));
    }
}
