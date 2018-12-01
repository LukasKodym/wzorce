package pl.sda.singleton;

public class ClassSingleton {

    private static ClassSingleton uniqueInstatnce;

    private ClassSingleton() {
    }

    public static ClassSingleton getUniqueInstatnce() {

        if(uniqueInstatnce == null){
            uniqueInstatnce = new ClassSingleton();
            System.out.println("Nowy obiekt utworzony");
        }else{
            System.out.println("Instancja już istnieje");
        }
        return uniqueInstatnce;
    }
}
