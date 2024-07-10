package design.responsebility;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:41
 */
public class Manager2 extends Handler{

    Manager2() {
        super(Handler.ONE, Handler.TWO);
    }
    @Override
    void handleLeaveRequest(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDays() + "天，批准！");
        System.out.println("流程结束");
    }
}
