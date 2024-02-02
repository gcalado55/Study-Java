package Models.Entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String ussername;
    private Date moment;

    public LogEntry(String ussername, Date moment) {
        this.ussername = ussername;
        this.moment = moment;
    }

    public String getUssername() {
        return ussername;
    }

    public void setUssername(String ussername) {
        this.ussername = ussername;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogEntry logEntry = (LogEntry) o;

        return Objects.equals(ussername, logEntry.ussername);
    }

    @Override
    public int hashCode() {
        return ussername != null ? ussername.hashCode() : 0;
    }
}
