import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static Human human = new Human("Nguyen Van A",1200000);
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static ArrayList<Integer> withdrawal = new ArrayList<>();
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("Nhan phim A de kiem tra tai khoan");
            System.out.println("Nhan phim D de nap tien");
            System.out.println("Nhan phim W de rut tien");
            System.out.println("Nhan phim H de xem lich su");
            System.out.println("Nhan phim X de thoat");
            do {
                System.out.println("Nhap lua chon cua ban:");
                choice = sc.nextLine();
            }while (!(choice.equals("A") || choice.equals("W") || choice.equals("H") || choice.equals("D")|| choice.equals("X")));

            switch (choice){
                case "A":
                    show();
                    break;
                case "D" :
                    recharge();
                    break;
                case "W":
                    withdrawMoney();
                    break;
                case "H" :
                    transactionHistory();
                    break;
                case "X" :
                    return;
            }
        }
    }

    public static void show(){
        System.out.println("So du tai khoan khach hang la:" + human.getAmount() + "vnd");
    }
    public static void recharge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap so tien :");
        int amount = sc.nextInt();
        human.recharge(amount);
        System.out.println("Giao dich thanh cong. Ban vua nap" + amount + "Vnd thanh cong.");
        arrayList.add(amount);
    }


    public static void withdrawMoney(){
        Scanner sc= new Scanner(System.in);
        int amount;
        do {
            System.out.println("Vui long nhap so tien :");
            amount = sc.nextInt();
        }while (amount > human.getAmount());
        if(human.getAmount() <= 0){
            System.out.println("Giao dich khong thanh cong");
            System.out.println("So du tai khoan khach hang la" + human.getAmount() + "Vnd");
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
        }else {
            human.withdrawMoney(amount);
            System.out.println("Ban vua rut" + amount + "Thanh cong");
            System.out.println("So du tai khoan khach hang la :" + human.getAmount() + "vnd");
        }
        withdrawal.add(amount);
    }

    public static void transactionHistory(){
        for(Integer amount : arrayList){
            System.out.println("Nap tien : " + amount);
        }
        for (Integer amount : withdrawal){
            System.out.println("Rut tien : " + amount);
        }
    }
}
