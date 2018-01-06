package doan;

import java.util.*;

class student {

    public int id;
    public String name;
    public long phonenumber;
    public float point;

    student() {
        this.id = 0;
        this.name = " ";
        this.phonenumber = 0;
    }

    public float point() {
        return 0;
    }

    void input() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("nhap ID: ");
        this.id = s1.nextInt();
        s1.nextLine();
        System.out.println("nhap name: ");
        this.name = s1.nextLine();
        System.out.println("nhap phone number: ");
        this.phonenumber = s1.nextLong();
    }

    void output() {
        System.out.println("\tID: " + this.id);
        System.out.println("\tname: " + this.name);
        System.out.println("\tphone number: " + this.phonenumber);
    }

}

class classA extends student {

    public float math, physical, chemistry;

    classA() {
        this.math = 0;
        this.physical = 0;
        this.chemistry = 0;
    }

    public float point() {
        point = (float) (math + physical + chemistry) / 3;
        System.out.println("diem TB 3 mon: " + this.point);
        return point;
    }

    void input() {
        Scanner s2 = new Scanner(System.in);
        super.input();
        System.out.println("nhap diem mon toan: ");
        this.math = s2.nextInt();
        System.out.println("nhap diem mon ly: ");
        this.physical = s2.nextFloat();
        System.out.println("nhap diem mon hoa: ");
        this.chemistry = s2.nextFloat();
    }

    void output() {
        super.output();
        System.out.print("\tMATH: " + this.math);
        System.out.print("\tPHYSICAL: " + this.physical);
        System.out.print("\tCHEMISTRY: " + this.chemistry);
        System.out.println("");
    }
}

class classC extends student {

    public float literature, history, geography;

    classC() {
        this.literature = 0;
        this.history = 0;
        this.geography = 0;
    }

    public float point() {
        point = (float) (literature + history + geography) / 3;
        System.out.println("diem TB 3 mon: " + this.point);
        return point;
    }

    void input() {
        Scanner s3 = new Scanner(System.in);
        super.input();
        System.out.println("nhap diem mon van: ");
        this.literature = s3.nextFloat();
        s3.nextLine();
        System.out.println("nhap diem mon su: ");
        this.history = s3.nextFloat();
        System.out.println("nhap diem mon dia: ");
        this.geography = s3.nextFloat();
    }

    void output() {
        super.output();
        System.out.print("\tLITERATURE: " + this.literature);
        System.out.print("\tHISTORY: " + this.history);
        System.out.print("\tGEOGRAPHY: " + this.geography);
        System.out.println("");
    }
}

class hocsinhlist {

    int N = 3;
    classC a1[] = new classC[N];
    classA a2[] = new classA[N];

    void inputoutputhslist() {
        for (int i = 0; i < N; i++) {
            a1[i] = new classC();
            a1[i].input();
        }
        for (int i = 0; i < N; i++) {
            a2[i] = new classA();
            a2[i].input();
        }
        for (int i = 0; i < N; i++) {
            System.out.println(" class C:");
            a1[i].output();
            a1[i].point();
        }
        for (int i = 0; i < N; i++) {
            System.out.println(" class A:");
            a2[i].output();
            a2[i].point();
        }
    }

    void sapxep() {
        float tmp;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a1[i].point > a1[j].point) {
                    tmp = a1[i].point;
                    a1[i].point = a1[j].point;
                    a1[j].point = tmp;
                }
            }
        }
        System.out.println("sap xep diem CLASS C theo tang dan:");
        for (int i = 0; i < N; i++) {
            System.out.print("\t" + a1[i].point);
        }
        System.out.println("");
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a2[i].point > a2[j].point) {
                    tmp = a2[i].point;
                    a2[i].point = a2[j].point;
                    a2[j].point = tmp;
                }
            }
        }
        System.out.println("sap xep diem CLASS A theo tang dan:");
        for (int i = 0; i < N; i++) {
            System.out.print("\t" + a2[i].point);
        }
    }

    void diemcao() {
        float max = 0;
        for (int i = 0; i < N; i++) {
            if (a2[i].point > max) {
                max = a2[i].point;
            }
        }
        System.out.println("\ndiem cao nhat CLASS A la:" + max);
        float maximum = 0;
        for (int i = 0; i < N; i++) {
            if (a1[i].point > maximum) {
                maximum = a1[i].point;
            }
        }
        System.out.println("\ndiem cao nhat CLASS c la:" + maximum);
    }
}

public class Doan {
    public static void main(String[] args) {
        hocsinhlist s6 = new hocsinhlist();
        s6.inputoutputhslist();        
        s6.sapxep();
        s6.diemcao();
    }

}
