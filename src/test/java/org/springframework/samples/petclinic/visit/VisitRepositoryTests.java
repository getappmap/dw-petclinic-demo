package org.springframework.samples.petclinic.visit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class VisitRepositoryTests {

    @Autowired
    private VisitRepository visitRepository;

    @Test
    void testSaveVisit() {
        Visit visit = new Visit();
        visit.setFollowUpRequired(true);
        visit.setFollowUpNotes("Follow-up required for vaccination.");

        Visit savedVisit = visitRepository.save(visit);

        assertThat(savedVisit.isFollowUpRequired()).isTrue();
        assertThat(savedVisit.getFollowUpNotes()).isEqualTo("Follow-up required for vaccination.");
    }
}
