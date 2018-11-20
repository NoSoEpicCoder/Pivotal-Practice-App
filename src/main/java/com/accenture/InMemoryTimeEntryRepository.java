package com.accenture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private Map<Long, TimeEntry> timeEntries = new HashMap();
    private Long counter = 1L;

    @Override
    public TimeEntry find(long id) {
        return timeEntries.get(id);
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        TimeEntry newTimeEntry = new TimeEntry(counter, timeEntry.getProjectId(), timeEntry.getUserId(), timeEntry.getDate(), timeEntry.getHours());
        timeEntries.put(counter, newTimeEntry);
        counter++;
        return newTimeEntry;
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        if(timeEntries.containsKey(id)) {
            TimeEntry updatedTimeEntry = new TimeEntry(id, timeEntry.getProjectId(), timeEntry.getUserId(), timeEntry.getDate(), timeEntry.getHours());
            timeEntries.put(id, updatedTimeEntry);
            return updatedTimeEntry;
        } else {
            return null;
        }
    }

    @Override
    public void delete(long id) {
        timeEntries.remove(id);
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList(timeEntries.values());
    }
}
