import java.util.Date;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * There is a LogEntry class for monitoring user activity on your site. The class has three fields:
 * <p>
 * created: Date is the date of creating log entry;
 * login: String is a user login;
 * url: String is a url that the user clicked.
 * and getter for url field: getUrl().
 * <p>
 * Write a collector that calculates how many times each url was clicked by users. The collector will be applied to a stream of log entries for creating a map: url -> click count.
 * <p>
 * The class LogEntry will be available during testing. You can create your own classes for local testing.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * <p>
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...).
 */
public class CountingClicks {
    public static Map<String, Long> getUrlToNumberOfVisited(List<LogEntry> logs) {
        return logs.stream()
                .collect(
                        groupingBy(LogEntry::getUrl, summingLong(p -> 1))
                );
    }

    static class LogEntry {

        private Date created;
        private String login;
        private String url;

        public LogEntry(Date created, String login, String url) {
            this.created = created;
            this.login = login;
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof LogEntry)) {
                return false;
            }

            LogEntry logEntry = (LogEntry) o;

            if (!login.equals(logEntry.login)) {
                return false;
            }
            return url.equals(logEntry.url);
        }

        @Override
        public int hashCode() {
            int result = login.hashCode();
            result = 31 * result + url.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "LogEntry{" +
                    ", created=" + created +
                    ", login='" + login + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}
