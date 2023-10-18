package fundamentals.GenericClasses;

// Bounded Type => <T extends Number>
public class MyGenericClass <T> {
    T x;

    MyGenericClass(T x){
        this.x = x;
    }

    public T getValue(){
        return x;
    }
}
