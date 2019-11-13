package com.accenture;

import java.util.ArrayList;

public interface TimeEntryRepository {
    TimeEntry find(long id);
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry update(long id, TimeEntry timeEntry);
    void delete(long id);
    ArrayList<TimeEntry> list();
}
