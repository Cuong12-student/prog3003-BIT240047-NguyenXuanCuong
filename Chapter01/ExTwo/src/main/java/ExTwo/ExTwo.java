/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ExTwo;

/**
 *
 * @author VICTUS
 */
public class ExTwo {
    public static <E> void printArray(E[] e){
        for(E item:e){
            System.out.println(item);
        }
    }
    public static void main(String[] args){
        Integer[] ma={1,2,4,6};
        String[] mh={"Java","Python","C++","C#"};
        System.out.println("Danh sach cac ma mon hoc");
        printArray(ma);
        System.out.println("Danh sach ten cac mon hoc");
        printArray(mh);
    }
}
