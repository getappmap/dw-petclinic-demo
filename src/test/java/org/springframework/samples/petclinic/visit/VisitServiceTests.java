package org.springframework.samples.petclinic.visit;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class VisitServiceTests {

    @Mock
    private VisitRepository visitRepository;

    @InjectMocks
    private VisitService visitService;

    public VisitServiceTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveVisit() {
        Visit visit = new Visit();
        visit.setFollowUpRequired(true);
        visit.setFollowUpNotes("Follow-up required for vaccination.");

        when(visitRepository.save(visit)).thenReturn(visit);

        Visit savedVisit = visitService.saveVisit(visit);

        assertThat(savedVisit.isFollowUpRequired()).isTrue();
        assertThat(savedVisit.getFollowUpNotes()).isEqualTo("Follow-up required for vaccination.");
    }
}
