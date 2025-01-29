package org.springframework.samples.petclinic.model;

import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetType;

import static org.assertj.core.api.Assertions.assertThat;

class OwnerTests {

    @Test
    void testHasPet() {
        Owner owner = new Owner();
        Pet fido = new Pet();
        fido.setName("Fido");
        assertThat(owner.getPet("Fido")).isNull();
        owner.addPet(fido);
        assertThat(owner.getPet("Fido")).isNotNull();
    }

    @Test
    void testUpdatePetDetails() {
        Owner owner = new Owner();
        Pet leo = new Pet();
        leo.setName("Leo");

        PetType catType = new PetType();
        catType.setName("cat");
        leo.setType(catType);
        owner.addPet(leo);

        // Update pet details
        leo.setName("Leonardo");

        PetType birdType = new PetType();
        birdType.setName("bird");
        leo.setType(birdType);
        owner.addPet(leo);

        // Verify that the updated details are reflected in the owner's pet list
        Pet updatedPet = owner.getPet("Leonardo");
        assertThat(updatedPet).isNotNull();
        assertThat(updatedPet.getType().getName()).isEqualTo("bird");

        // Verify that the original pet details are no longer present
        Pet originalPet = owner.getPet("Leo");
        assertThat(originalPet).isNull();
    }
}