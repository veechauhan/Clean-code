package com.company;

/**
 *
 */
public final class FindMinMAx {

    private FindMinMAx() {

    }

    static class VariableList {

        /**
         *
         */
        private int min;
        /**
         *
         */
        private int max;
    }

     static VariableList minMaxFunc(final int[] array, final int arrayLength) {
        VariableList variableListObj = new VariableList();
        int i;

        if (arrayLength == 1) {
            variableListObj.max = array[0];
            variableListObj.min = array[0];
            return variableListObj;
        }

        if (array[0] > array[1]) {
            variableListObj.max = array[0];
            variableListObj.min = array[1];
        } else {
            variableListObj.max = array[1];
            variableListObj.min = array[0];
        }

        for (i = 2; i < arrayLength; i++) {
            if (array[i] > variableListObj.max) {
                variableListObj.max = array[i];
            } else if (array[i] < variableListObj.min) {
                variableListObj.min = array[i];
            }
        }

        return variableListObj;
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        int[] array = {6, 5, 4, 1, 2, 3};


        VariableList obj = minMaxFunc(array, array.length);
        System.out.println("MIN: " + obj.min);
        System.out.println("MAX: " + obj.max);

    }
}
