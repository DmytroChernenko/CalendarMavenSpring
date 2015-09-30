package com.diosoft.traine.calendar.common;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Event {
    private final UUID id;
    private final String title;
    private final String description;
    private final Date startDate;
    private final Date endDate;
    private final List<String> attenders;

    private Event(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.attenders = builder.attenders;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<String> getAttenders() {
        return attenders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", attenders=").append(attenders);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (id != null ? !id.equals(event.id) : event.id != null) return false;
        if (title != null ? !title.equals(event.title) : event.title != null) return false;
        if (description != null ? !description.equals(event.description) : event.description != null) return false;
        if (startDate != null ? !startDate.equals(event.startDate) : event.startDate != null) return false;
        return !(endDate != null ? !endDate.equals(event.endDate) : event.endDate != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

    public static class Builder {
        private UUID id;
        private String title;
        private String description;
        private Date startDate;
        private Date endDate;
        private List<String> attenders;

        public Builder() {
            id = UUID.randomUUID();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder startDate(Date date) {
            this.startDate = date;
            return this;
        }

        public Builder endDate(Date date) {
            this.endDate = date;
            return this;
        }

        public Builder attenders(List<String> attenders) {
            this.attenders = attenders;
            return this;
        }


        public Event build() {
            return new Event(this);
        }
    }
}
