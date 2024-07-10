package design.responsebility;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:31
 */
public class LeaveRequest {
    private int days;
    private String reason;
    private String name;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
