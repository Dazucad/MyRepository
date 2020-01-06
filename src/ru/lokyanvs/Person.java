package ru.lokyanvs;

public class Person extends Human {
    public Person(boolean man, String name) {
        super(man, name);
    }

    @Override
    public boolean marry(Human human) {
        if ((human.man != this.man) && (this.spouse != human)) {
            if (this.spouse != null) this.divorce();
            this.spouse = human;
            if (human.spouse != this)
                human.marry(this);
            System.out.println(this.name + " и " + human.name + " поженились");
            return true;
        } else {
            System.out.println("Невозможно поженить " + this.name + " и " + human.name);
            return false;
        }
    }

    @Override
    public boolean divorce() {
        if (this.spouse != null) {
            System.out.println(this.name + " и " + this.spouse.name + " развелись");
            Human temp = this.spouse;
            this.spouse = null;
            temp.divorce();
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if (spouse != null)
            return "Имя:" + this.name + " Супруг(а):" + this.spouse.name;
        else return "Имя:" + this.name + " Супруг(а):Нет";
    }
}
