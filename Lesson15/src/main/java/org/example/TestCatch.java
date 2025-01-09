package org.example;

import java.util.EmptyStackException;

public class TestCatch {

    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    private static int getNumber() {
        try {
            //throw new EmptyStackException();
            return 1;
        } catch (EmptyStackException e) {
            //throw new Exception(e.getMessage());
            return 3;
        } catch (Exception e) {
            //throw new EmptyStackException(); // ??
            return 4;
        } catch (Throwable e) {
            return 5;
        } finally {
            return 6;
        }
    }
}
