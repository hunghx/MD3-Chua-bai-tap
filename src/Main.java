import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String  str =new String("hùng");
        Scanner scanner = new Scanner(System.in);
        // Nhâp vào điểm của tối đa 30 sinh viên
        double[] listMark = new double[30];
        // Nhập số lượng snh viên muốn thêm điểm
        System.out.println("nhập số lượng sinh viên muốn thêm điểm (1-30)");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("nhập điểm của sinh viên thứ "+(i+1) +" : ");
            listMark[i] = Double.parseDouble(scanner.nextLine());
            boolean b = Boolean.parseBoolean(scanner.nextLine());
        }
        // duyệt điểm các sinh viên vừa nhập
        int dem = 0;
        for (int i = 0; i < count; i++) {
            if(listMark[i]>=5){
                dem++;
            }
        }
        // kết luận
        System.out.println("số lượng sinh viên thi đỗ là : "+dem);

    }
}