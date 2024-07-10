package design.mediator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:00
 */
public class MediatorStructure extends Mediator{
    HouseOwner houseOwner;
    Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else if(person == tenant) {
            houseOwner.getMessage(message);
        }
    }
}
