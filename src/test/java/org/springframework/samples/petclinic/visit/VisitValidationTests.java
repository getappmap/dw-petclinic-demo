package org.springframework.samples.petclinic.visit;

import org.junit.jupiter.api.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import static org.assertj.core.api.Assertions.assertThat;

public class VisitValidationTests {

    @Test
    void testValidation() {
        Visit visit = new Visit();
        visit.setFollowUpRequired(true);
        visit.setFollowUpNotes("");

        VisitValidator validator = new VisitValidator();
        Errors errors = new BeanPropertyBindingResult(visit, "visit");
        validator.validate(visit, errors);

        assertThat(errors.hasErrors()).isTrue();
        assertThat(errors.getFieldError("followUpNotes").getCode()).isEqualTo("required");
    }
}
