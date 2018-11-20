package com.accenture;

import java.util.ArrayList;
import java.util.Collection;

public interface TimeEntryRepository {
    TimeEntry find(long id);
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry update(long id, TimeEntry timeEntry);
    void delete(long id);
    Collection<TimeEntry> list();
}
