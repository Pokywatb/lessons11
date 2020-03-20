package lesson7;

public class Doctor extends BattleUnit {
    protected int medicineScore;

    public Doctor(int healthScore, int speed, int attackScore, int medicineScore) {
        super(healthScore, speed, attackScore);
        setMedicineScore(medicineScore);
    }

    public int getMedicineScore() {
        return medicineScore;
    }

    public void setMedicineScore(int medicineScore) {
        this.medicineScore = medicineScore;
    }

    @Override// либо пишем реализуцию метода интерфейса, либо переопределяем метод родительского класса.
//    без оверрайд программа будет работать, но это указатель компилятору на то, что метод переопределяется
    public void attack(BattleUnit friend) {
        System.out.println("Атака доктора");

    }
    @Override
    public void rest() {
        System.out.println("Атака доктора");

    }

}
