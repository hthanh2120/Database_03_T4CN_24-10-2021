package LaptopDB;

public class Statistic {
    private String maker;
    private Integer sold;
    private Long totalMoney;


    public Statistic(String maker, Integer sold, Long totalMoney) {
        this.maker = maker;
        this.sold = sold;
        this.totalMoney =totalMoney;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "\n Statistic{" +
                "maker='" + maker + '\'' +
                ", sold=" + sold +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
