package design.visitor;

import design.mediator.HouseOwner;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:33
 */
public class main {
    public static void main(String[] args) {
        House house = new House();
        house.list.add(new Cat());
        house.list.add(new Dog());
        house.action(new Owner());
        house.action(new SomeOne());

    }
}
