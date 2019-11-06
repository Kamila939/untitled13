public class homework5464522 {
    class Animal {
        private int width;
        private int height;
        private int lenght;

        Animal(Animal ob) {
            width = ob.width;
            height = ob.height;
            lenght = ob.lenght;
        }

        Animal(int w, int h, int l) {
            width = w;
            height = h;
            lenght = l;
        }
        Animal(int len) {
            width = height = lenght = len;
        }

        int getVolume() {
            return width * height * lenght;
        }
    }

    class Dog extends Animal {
        int weight;

        Dog(Dog ob) {
            super(ob);
            weight = ob.weight;
        }

        Dog(int w, int h, int l, int m) {
            super(w, h, l);
            weight = m;
        }
        Dog(int len, int m) {
            super(len);
            weight = m;
        }
    }

    class Labrador extends Dog {
        int age;
        Labrador(Labrador ob) {
            super(ob);
            age = ob.age;
        }
        Labrador(int w, int h, int d, int m, int a) {
            super(w, h, d, m);
            age = a;
        }
        Labrador(int len, int m, int a) {
            super(len, m);
            age = a;
        }
    }
}
