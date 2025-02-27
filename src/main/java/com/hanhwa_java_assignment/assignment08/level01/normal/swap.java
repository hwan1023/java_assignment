package com.hanhwa_java_assignment.assignment08.level01.normal;

public class swap{
    public<T> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
