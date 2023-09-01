// static block 
// used for intializing the static variables at the time of class loading.
// as we know JVM will creates an object by taking the class as an input
// in order to create an object JVM first loads the class into the class loader 
// so the static block and everything will be executed
// next time as the class was already loaded no static block will be executed
// only constructor will be called at the time of object creation.
// with creating an object class will be loaded with forName(). 
class Mobile {
    String brand;
    int price;
    static String name;

    // syntax for intializing the static variables
    static {
        name = "Phone";
        System.out.println("in static block");
    }

    Mobile() {
        brand = "Nokia";
        price = 500;
        System.out.println("in constructor");
    }

    // public static void show(Mobile obj) {
    // System.out.println(obj.brand + " : " + obj.price + " : " + name);
    // }
}

class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "SmartPhone";
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;
        // Mobile.name = "Phone";
        // Mobile.show(obj1);
        // Mobile.show(obj2);
    }
}