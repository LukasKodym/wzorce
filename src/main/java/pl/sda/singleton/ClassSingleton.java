package pl.sda.singleton;

public class ClassSingleton {

    private static ClassSingleton uniqueInstance; // we can add volatile statement before static

    private ClassSingleton() {
    }

    public static ClassSingleton getUniqueInstance() {//synchronized - we use this statement to separate threads

        if(uniqueInstance == null){
            uniqueInstance = new ClassSingleton();
            System.out.println("Nowy obiekt utworzony");
        }else{
            System.out.println("Instancja już istnieje");
        }
        return uniqueInstance;
    }
}
