package design.responsebility;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:43
 */
public class main {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setName("小明");
        leaveRequest.setDays(6);

        Handler manager1 = new Manager1();
        Handler manager2 = new Manager2();
        Handler manager3 = new Manager3();

        manager1.setNextHandler(manager2);
        manager2.setNextHandler(manager3);
        manager1.submit(leaveRequest);
    }
}
