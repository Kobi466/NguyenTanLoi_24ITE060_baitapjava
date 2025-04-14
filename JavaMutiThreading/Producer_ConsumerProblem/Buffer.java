package JavaMutiThreading.Producer_ConsumerProblem;

import java.util.ArrayList;

public class Buffer {
    private ArrayList<Integer> list;
    private int capacity;
    public Buffer(int capacity){
        this.capacity=capacity;
        this.list=new ArrayList<>();
    }
    public synchronized void addProduct(String name,int producID) throws InterruptedException {
        while(this.getCapacity()==list.size()){
            System.out.println("Kho day");
            wait();
        }
        this.list.add(producID);
        System.out.println(name+" da [them] san pham: "+producID+" ,so luong hien tai: "+list.size());
        notify();
    }
    public synchronized void removeProduct(String name) throws InterruptedException {
        while(this.list.isEmpty()){
            System.out.println("Kho rong");
            wait();
        }
        this.list.remove(0);
        System.out.println(name+" da [mua] 1 san pham thanh cong, so luong hien tai: "+list.size());
        notify();
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
