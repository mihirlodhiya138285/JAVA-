class A {
    void hello() {
        System.out.println("Hello");
    }
}

class B extends A {
    void namaste() {
        System.out.println("Namaste");
    }
}

class C extends B {
    void ciao() {
        System.out.println("Bella Ciao");
    }
}

class D extends C {
    void hhm() {
        System.out.println("Har Har Mahadev");
    }

    public static void main(String[] args) {
        D d = new D();
        d.hello();    
        d.namaste();  
        d.ciao();     
        d.hhm();  
    }
}
