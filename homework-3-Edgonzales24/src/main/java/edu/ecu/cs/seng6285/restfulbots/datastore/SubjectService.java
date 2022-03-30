package edu.ecu.cs.seng6285.restfulbots.datastore;

import com.google.cloud.datastore.*;
import edu.ecu.cs.seng6285.restfulbots.models.Subject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Service
public class SubjectService {
    private Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    private static final String ENTITY_KIND = "Subject";
    private final KeyFactory keyFactory = datastore.newKeyFactory().setKind(ENTITY_KIND);

    public Key createSubject(Subject subject) {
        // TODO: What code needs to be added here to create a subject?
        return null;
    }

    public List<Subject> getAllSubjects() {
        // TODO: What code needs to be added here to retrieve all subjects?

        // TODO: Remove this return statement once you have something valid to return
        return Collections.emptyList();
    }

    // TODO: What support methods are needed here?
    // Feel free to look at the other service classes for inspiration.
}
