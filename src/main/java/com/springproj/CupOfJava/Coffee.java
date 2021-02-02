package com.springproj.CupOfJava;

import com.springproj.CupOfJava.CLASSIFIERS.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Coffee {

    private @Id @GeneratedValue Long id;
    private BeverageType BEVERAGE_TYPE;
    private EspressoType ESPRESSO_TYPE;
    private MilkType MILK_TYPE;
    private ArrayList<Modifier> MODIFIER;
    private DrinkSize DRINK_SIZE;
    private SweetenerType SWEETENER_TYPE;
    private Syrup SYRUP;

    Coffee(Long id, BeverageType BEVERAGE_TYPE, EspressoType ESPRESSO_TYPE, MilkType MILK_TYPE,
           ArrayList<Modifier> MODIFIER, DrinkSize DrinkSIZE, SweetenerType SWEETENER_TYPE, Syrup SYRUP) {

    }

    // GETTERS
    public Long getId() { return this.id; }
    public BeverageType getBeverageType() { return this.BEVERAGE_TYPE; }
    public EspressoType getEspressoType() { return this.ESPRESSO_TYPE; }
    public MilkType getMilkType() { return this.MILK_TYPE; }
    public ArrayList<Modifier> getModifier() { return this.MODIFIER; }
    public DrinkSize getDrinkSize() { return this.DRINK_SIZE; }
    public SweetenerType getSweetenerType() { return this.SWEETENER_TYPE; }
    public Syrup getSyrup() { return this.SYRUP; }

    // SETTERS
    public void setId(Long id) { this.id = id; }
    public void setBeverageType(BeverageType BEVERAGE_TYPE) { this.BEVERAGE_TYPE = BEVERAGE_TYPE; }
    public void setEspressoType(EspressoType ESPRESSO_TYPE) { this.ESPRESSO_TYPE = ESPRESSO_TYPE; }
    public void setMilkType(MilkType MILK_TYPE) { this.MILK_TYPE = MILK_TYPE; }
    public void setModifier(ArrayList<Modifier> MODIFIER) { this.MODIFIER = MODIFIER; }
    public void setDrinkSize(DrinkSize DRINK_SIZE) { this.DRINK_SIZE = DRINK_SIZE; }
    public void setSweetenerType(SweetenerType SWEETENER_TYPE) { this.SWEETENER_TYPE = SWEETENER_TYPE; }
    public void setSyrup(Syrup SYRUP) { this.SYRUP = SYRUP; }

    // OPERATIONS
    @Override
    public String toString() {
        return "Coffee {" + "id = " + this.id + ", beverage type = " + this.BEVERAGE_TYPE
                + ", espresso type = " + this.ESPRESSO_TYPE + ", milk type = " + this.MILK_TYPE
                + ", modifier(s) = " + this.MODIFIER + ", drink size = " + this.DRINK_SIZE
                + ", sweetener type = " + this.SWEETENER_TYPE + ", syrup = " + this.SYRUP;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Coffee)) {
            return false;
        }

        Coffee coffee = (Coffee) o;

        return Objects.equals(this.BEVERAGE_TYPE, coffee.BEVERAGE_TYPE)
                && Objects.equals(this.ESPRESSO_TYPE, coffee.ESPRESSO_TYPE)
                && Objects.equals(this.MILK_TYPE, coffee.MILK_TYPE)
                && Objects.equals(this.MODIFIER, coffee.MODIFIER)
                && Objects.equals(this.DRINK_SIZE, coffee.DRINK_SIZE)
                && Objects.equals(this.SWEETENER_TYPE, coffee.SWEETENER_TYPE)
                && Objects.equals(this.SYRUP, coffee.SYRUP);
    }
}
