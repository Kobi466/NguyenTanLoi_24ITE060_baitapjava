package Week2_EXMultiThreading.Bai3;
import java.util.ArrayList;

public class Menu {
    private final int capacity = 5;
    public ArrayList<Integer> listFood;
    public Menu() {
        listFood = new ArrayList<>();
    }

    public synchronized void cheBien(String name, int num) throws InterruptedException {
        while (listFood.size() >= capacity) {
            System.out.println("Hien tai mon da day!!!");
            wait();
        }
        listFood.add(num);
        System.out.println(name+" da che bien: "+num);
        System.out.println("So luong hien tai: "+listFood.size());
        notify();
    }

    public synchronized void tieuThu(String name) throws InterruptedException {
        while (listFood.isEmpty()) {
            System.out.println("Hien tai chua co mon nao!!!");
            wait();
        }
        listFood.remove(0);
        System.out.println(name+" da tieu thu 1 mon an");
        System.out.println("So luong hien tai: "+listFood.size());
        notify();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        DauBep dauBep = new DauBep("A", menu);
        NguoiTieuThu nguoiTieuThu = new NguoiTieuThu("B", menu);
        dauBep.start();
        nguoiTieuThu.start();
    }

}
class DauBep extends Thread {
    String name;
    private Menu menu;

    public DauBep(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    @Override
    public void run() {
        int i=0;
        while(true) {
            try {
                this.sleep(2000);
                this.menu.cheBien(name, i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class NguoiTieuThu extends Thread {
    String name;
    private Menu menu;

    public NguoiTieuThu(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    @Override
    public void run() {
        while(true) {
            try {
                this.sleep(3000);
                this.menu.tieuThu(name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


