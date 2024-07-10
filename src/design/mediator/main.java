package design.mediator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:02
 */
public class main {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Tenant tenant = new Tenant("张三", mediator);
        HouseOwner houseOwner = new HouseOwner("李四", mediator);
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        tenant.contact("我要租房");
        houseOwner.contact("我要卖房");

    }
}
