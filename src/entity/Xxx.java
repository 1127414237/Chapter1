package entity;

import java.math.BigDecimal;
import java.util.Date;

public class Xxx {
   private Integer id;
    private  String numb;
    private BigDecimal price;
    private Date bornDate;

    public Integer getId() {
        return id;
    }

    public String getNumb() {
        return numb;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
}
