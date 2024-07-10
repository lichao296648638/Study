package design.responsebility;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:32
 */
public abstract class Handler {
    protected static final int ONE = 1;
    protected static final int TWO = 3;
    protected static final int THREE = 7;
    private int start;
    private int end;

    Handler nextHandler;

    Handler(int start) {
        this.start = start;
    }

    Handler(int start, int end) {
        this.start = start;
        this.end = end;
    }

    abstract void handleLeaveRequest(LeaveRequest leaveRequest);

    public void submit(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() >= start && leaveRequest.getDays() <= end) {
            handleLeaveRequest(leaveRequest);
        }else{
            System.out.println("权限不够，转交上级！");
            nextHandler.submit(leaveRequest);
        }

    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
