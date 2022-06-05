package Hesaplamalar;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input=new Scanner(System.in);
        System.out.println("A degerini giriniz :");
        a=input.nextInt();

        System.out.println("B degerini giriniz :");
        b=input.nextInt();

        System.out.println("C degerini giriniz :");
        c=input.nextInt();

        if ((a<b) &&(a<c)){
            if (b<c){
                System.out.println("A<B<C");
            }else {
                System.out.println("A<C<B");
            }

        } else if ((b<a) && (b<c)) {
            if (a<c){
                System.out.println("B<A<C");
            }else {
                System.out.println("B<C<A");
            }
            if ((c<a) && (c<b)){
                if (a<b){
                    System.out.println("C<A<B");
                }else {
                    System.out.println("C<B<A");
                }
            }
        }

    }
}
