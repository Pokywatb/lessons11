package lesson7;

abstract class BattleUnit extends Unit implements  CanAttack {// extends Unit - наследует все от класса Unit/ множественное наследование через extends запрещено
    protected int attackScore;// implements реализует методы интерфейса
    // спользуя имплементирование класс заключает контракт. значит он обязан реализовать все не реализованные методы интерфейса.
// имплементировать можно несколько интрфейсов через запятую

//    абстрактный клас - не можем создать объект на его основе
//    у абстрактных классов могут быть методы с реализацией и без реализации

    public BattleUnit(int healthScore, int speed, int attackScore) {
        super(healthScore, speed);// вызов конструктора родительского класса.
        setAttackScore(attackScore);//прописать недостающие в родительсом классе характеристики
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public void runFromField() {
        System.out.println("run");
    }
    // knight / doctor / infantry
    public static BattleUnit getBattleUnit(String type){
        BattleUnit battleUnit = null;

        if ("knight".equals(type)){
            battleUnit = new Knight((int) (Math.random() * 12 + 2), (int) (Math.random() * 7 + 1), (int) (Math.random() * 8 + 1), (int) (Math.random() * 13 + 3));
        }

        else if ("doctor".equals(type)){
            battleUnit = new Doctor((int) (Math.random() * 12 + 2), (int) (Math.random() * 7 + 1), (int) (Math.random() * 8 + 1), (int) (Math.random() * 13 + 3));
        }

        else if ("infantry".equals(type)){
            battleUnit = new Infantry((int) (Math.random() * 12 + 2), (int) (Math.random() * 7 + 1), (int) (Math.random() * 8 + 1), (int) (Math.random() * 13 + 3));
        }

        return battleUnit;
    }
}
