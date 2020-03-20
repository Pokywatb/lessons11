package lesson7;
// на основе интерфейса нельзя создать объект
//до 8 версии только методы без реализации без {}. по умолчанию все публичные

public interface CanAttack {
    void attack(BattleUnit enemy);
// если в двух интерфейсах одинаковые методы с реализацией, в классе необходимо метод переопределить

    default void runFromField() {
        System.out.println("run");}
    }