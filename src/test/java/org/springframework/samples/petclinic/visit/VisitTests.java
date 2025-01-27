package org.springframework.samples.petclinic.visit;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VisitTests {

    @Test
    void testVisitEntity() {
        Visit visit = new Visit();
        visit.setFollowUpRequired(true);
        visit.setFollowUpNotes("Follow-up required for vaccination.");

        assertThat(visit.isFollowUpRequired()).isTrue();
        assertThat(visit.getFollowUpNotes()).isEqualTo("Follow-up required for vaccination.");
    }
}
