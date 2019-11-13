package com.accenture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    Map<String, String> timeEntries = new HashMap();

    @Override
    public TimeEntry find(long id) {
        return null;
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        return null;
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public ArrayList<TimeEntry> list() {
        return null;
    }
}
