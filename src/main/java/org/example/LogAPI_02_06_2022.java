package org.example;

public class LogAPI_02_06_2022 {
    private int capacity = 0;
    private int front = 0;
    private int size;
    private int rear = -1;
    private int[] log;
    LogAPI_02_06_2022(int N){
        this.capacity = N;
        log = new int[capacity];
    }
     void record(int order_id){
        if(size == capacity){
            System.out.println("Buffer is full");
        }
       int index = (rear+1)%capacity;
       log[index] = order_id;
       rear++;
    }
    int get_last(int i){
        if(size == 0){
            System.out.println("Buffer is Empty");
        }
        int index = rear-i+1;
        return log[index];
    }

    public static void main(String[] args) {
        LogAPI_02_06_2022 Log = new LogAPI_02_06_2022(5);
        Log.record(10);
        Log.record(20);Log.record(30);
        System.out.println(Log.get_last(2));
    }
}
