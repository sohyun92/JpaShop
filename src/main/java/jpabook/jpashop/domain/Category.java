package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Category")
public class Category {
    @Id @GeneratedValue
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name="PARENT_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    //다대다
    //실전에서는 사용XX
    @ManyToMany
    @JoinTable(name="CATEGORY_ITEM",joinColumns = @JoinColumn(name="CATEGORY_ID"),
    inverseJoinColumns = @JoinColumn(name="ITEM_ID") )
    private List<Item> items = new ArrayList<>();
}
