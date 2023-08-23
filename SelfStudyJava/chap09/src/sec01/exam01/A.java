package sec01.exam01;

//🟡바깥 클래스
public class A {

    A() {
        System.out.println("A객체가 생성됨");
    }

    // 인스턴스 멤버 클래스
    class B {
        B() {
            System.out.println("B객체가 생성됨");
        }

        int field1;

        // static int field2;
        void method1() {
        	System.out.println("로컬 클래스 D-method1");
        }
        // static void method2() {}
    }

    // 정적 멤버 클래스
    static class C {
        C() {
            System.out.println("C 객체가 생성됨");
        }

        int field1;
        static int field2;

        void method1() {
        }

        static void method2() {
        }
    }

    void method() {
        // 로컬 클래스
//    	호출이 되어야지만 쓸수있고 밖에선 쓸수 없다.
        class D {
            D() {
                System.out.println("D객체가 생성됨");
            }

            int field1;

            // static int field2;
            void method1() {
            }
            // static void method2() {}
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
        System.out.println("바깥 클래스 A-method");
    }
}