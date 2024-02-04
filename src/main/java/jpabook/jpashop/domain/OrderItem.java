package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name="ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ODER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    private int orderPrice;
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOder() {
        return order;
    }

    public void setOder(Order oder) {
        this.order = oder;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /*    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }*/

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
