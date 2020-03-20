package lesson7;

public interface CanRest {
        void rest();
//        с 8 версии можно описать дефолтный метод с реализацией

        default void runFromField(){
            System.out.println("run");
        }
}
