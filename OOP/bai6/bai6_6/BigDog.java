package bai6.bai6_6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greets(Dog another){
        System.out.println("gau gau gau gau ");
    }
    //overloading ghi de phuong thuc khac du lieu dau vao
    public void greets(BigDog another){
        System.out.println("gau gau gau gau gau gau gau gau");
    }
    @Override
    public void greets(){
        System.out.println("gau gau");
    }


}

