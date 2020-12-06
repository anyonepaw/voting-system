package ru.topjava.voting.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "restaurant")
public class Restaurant extends AbstractNamedEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")//, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @OrderBy("name ASC")
    private List<Dish> menu;

    public Restaurant() {
    }

    public Restaurant(Integer id, String name) {
        super(null, name);
    }

    public Restaurant(String name, List<Dish> menu) {
        super(null, name);
        this.menu = menu;
    }

    public Restaurant(Integer id, String name, ArrayList<Dish> menu) {
        super(id, name);
        this.menu = menu;
    }

    //region getters/setters
    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }
    //endregion
}
