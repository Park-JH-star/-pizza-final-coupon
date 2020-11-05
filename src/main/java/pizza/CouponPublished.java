package pizza;

public class CouponPublished extends AbstractEvent {

    private Long id;

    public CouponPublished(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
